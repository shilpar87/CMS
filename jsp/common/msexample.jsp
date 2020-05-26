<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>

<!-- Search.jsp BEGIN -->
<style type="text/css">
.page-control {
	cursor:pointer;
	font-size:75%;
}
tr.highlighted td span, tr.result td span {
	white-space:nowrap;
}
#no-results {
	font-weight:bold;
	font-size:120%;
	color:#FFF;
	background-color:orange;
	position:absolute;
	display:none;
	z-index:1;
}
#CalFrame {
	position:absolute;
	left:0;
	top:0;
	height:0;
	width:0;
	display:block;
	visibility:hidden;
	z-index:2;
}
</style>

<script type="text/javascript">
function initPage() {
	if (userProfile.isReadOnly) {
		document.getElementById("reassignButton").disabled = true;
		document.getElementById("reassignSelector").disabled = true;
	}

	<%--
	 If page instructed to search on startup, hide criteria and do
	 automatic search
	 --%>
	if (<bean:write name="actionForm" property="doSearch"/>) {
		toggleTableDisplay(document.getElementById("criteria"));
		submitForm(document.forms[0]);
	}
}

/*
 * Force all fields to blank, regardless of default value
 */
function resetForm(form) {
	for (var i = 0; i < form.elements.length; i++) {
		var elem = form.elements[i];
		if (elem.id == "multiSelector") break;
		if (elem.nodeName == "SELECT") {
			for (var j = 0; j < elem.options.length; j++) {
				elem.options[j].selected = false;
			}
		}
		else if (elem.type == "checkbox") elem.checked = false;
		else if (elem.type == "text") elem.value = "";
	}
	initInputFormats();
}

var columnSetMapping = new Array();
columnSetMapping[0] = ""; // checkbox
columnSetMapping[1] = "ticketUid";
columnSetMapping[2] = "ticketTypeValue";
columnSetMapping[3] = "createDate";
columnSetMapping[4] = "sdrCuid";
columnSetMapping[5] = "accountNameValue";
columnSetMapping[6] = "productValue";
columnSetMapping[7] = "subProductValue";
columnSetMapping[8] = "followupDate";

var resultSet = new Array;
var rsIndex = 0;
function submitForm(form) {
	setStatusMessage("Searching...");

	validateForm(form);

	submitAjax(form, true,
		function(dom) {
			var submitResult = dom.attributes.getNamedItem("submitResult");
			document.getElementById("exceeded").innerHTML = submitResult.value;
			if (submitResult.value != "") {
				alert(submitResult.value);
			}

			resultSet = new Array();
			var tickets = dom.getElementsByTagName("ticket");
			for (var i = 0; i < tickets.length; i++) {
				resultSet[i] = { checked:false, attributes:new Array() };
				/*
				 * Create hash of attribute name / value
				 */
				for (var j = 0; j < tickets[i].attributes.length; j++) {
					resultSet[i].attributes[tickets[i].attributes[j].name] = tickets[i].attributes[j].value;
				}
			}
			document.getElementById("multiSelector").checked = false;
			rsIndex = 0;
			updateViewSize();

			var noResults = document.getElementById("no-results");
			var table = document.getElementById("resultsTable");
			noResults.style.top = getCoords(table).y;
			noResults.style.left = (document.body.clientWidth / 2) - (noResults.style.width / 2);

			noResults.style.display = resultSet.length == 0 ? "inline" : "none";
		}
	);
}

/*
 * Toggles the selection for the row in the result set and display
 * @param displayIndex - index of the row within display (relative index)
 */
function toggleRow(displayIndex) {
	/*
	 * Display
	 */
	var row = document.getElementById("resultsBody").rows[displayIndex];
	var selector = row.firstChild.firstChild;
	row.className = selector.checked ? "highlighted" : "result";
	row.firstChild.firstChild.checked = selector.checked;

	resultSet[displayIndex + rsIndex].checked = selector.checked;
}

/*
 * Toggles the result selection list
 */
function toggleListSelection() {
	var input = document.getElementById("multiSelector");
	for (var i = 0; i < resultSet.length; i++) {
		resultSet[i].checked = input.checked && resultSet[i].attributes['completeDate'] == "";
	}

	/*
	 * Toggle display
	 */
	var displayedRows = document.getElementById("resultsBody").rows;
	for (var i = 0; i < displayedRows.length; i++) {
		var checkbox = displayedRows[i].firstChild.firstChild;
		if (!checkbox.disabled) {
			checkbox.checked = input.checked;
			toggleRow(i);
		}
	}
}

function sort(evt, desc) {
	var column = getTarget(evt);
	var form = document.forms[0];
	var sortColumn = form.sortColumn;
	form.sortDesc.value = Boolean(desc);

	/*
	 * Find index of target within peers to get column-to-set mapping
	 */
	var parentNode = column.parentNode;
	for (var i = 0; i < parentNode.childNodes.length; i++) {
		if (column == parentNode.childNodes[i]) {
			sortColumn.value = columnSetMapping[i];
			break;
		}
	}

	submitForm(form);
}

function __sort(evt, desc) { // client sort - NOT WORKING ATM
	var column = getTarget(evt);
	quickSort(resultSet, 0, resultSet.length - 1,
		function(a, b) {
			if (!(a.attributes && b.attributes)) return 0;
			else if (column.innerText == "id") {
				var vala = a.attributes['ticketUid'];
				var valb = b.attributes['ticketUid'];
				return vala - valb
			}
			else if (column.innerText == "received") {
				var datea = Date.parse(a.attributes['createDate']);
				var dateb = Date.parse(b.attributes['createDate']);
				return datea - dateb;
			}
			else return 0;
		}
	);
	drawTable();
}

var visibleRows = 0;
/*
 * Set to automatically draw table based on window size
 * Note: this function doesn''t account for variable table row heights.  It samples the second
 * row in the header (the one with the column labels) and uses that to guess the height of the
 * data rows.  Table data that wraps and causes the surrounding row to increase will throw off
 * the sizing and allow the table to be larger than what the screen will fit without scrolling.
 */
function autoDrawTable() {
	var width, height;
	if (browser.isIE) {
		width = document.body.offsetWidth;
		height = document.body.offsetHeight;
	}
	else if (browser.isNS) {
		width = window.innerWidth;
		height = window.innerHeight;
	}
	var display = document.getElementById("resultsBody");
	var tableStart = getCoords(display).y;
	var reassign = document.getElementById("reassignControls");
	var reassignEnd = getCoords(reassign).y + reassign.clientHeight;
	var footer = getElementsWithClass("*", "footer")[0];
	var padding = getCoords(footer).y - reassignEnd;
	var remainTableHeight = height - tableStart
		- reassign.clientHeight
		- padding
		- footer.clientHeight;

	var rowHeight = getTableElements(display, "thead")[0].childNodes[1].clientHeight + 2;
	visibleRows = parseInt(remainTableHeight / rowHeight);
	if (visibleRows < 1) visibleRows = 1;

	/*
	 * Debugging line
	 *
	var line = document.createElement("div");
	line.style.position = "absolute";
	line.style.top = tableStart;
	line.style.left = 0;
	line.style.height = document.body.offsetHeight - tableStart;
	line.style.width = 5;
	line.style.backgroundColor = "#F00";
	document.body.appendChild(line);
	*/

	drawTable();
}

/*
 * Recalculates the viewable size (if "auto" selected) and redraws table
 */
function updateViewSize() {
	var rpp = document.getElementById("rowsPerPage");
	var rows = rpp[rpp.selectedIndex].value;
	if (rows == "auto") {
		autoDrawTable();
		document.body.onresize = autoDrawTable;
	}
	else {
		if (rows == "all") {
			rsIndex = 0;
			visibleRows = resultSet.length;
		}
		else visibleRows = parseInt(rows);
		document.body.onresize = null;
		drawTable();
	}
}

/*
 * Draws the current resultset from the current index up to visibleRows
 */
function drawTable() {
	var table = document.getElementById("resultsTable");
	var oldbody = document.getElementById("resultsBody");
	var newbody = oldbody.cloneNode(false);

	for (var i = 0; i < visibleRows; i++) {
		var rsRow = resultSet[rsIndex + i];
		if (!rsRow) break;

		var tableRow = document.createElement("tr");

		tableRow.className = rsRow.checked ? "highlighted" : "result";
		var ticketUid = rsRow.attributes['ticketUid'];

		/*
		 * Use document.createElement() instead.  About 6x faster than insertCell()
		 */
		var td = document.createElement("td");
		td.innerHTML = "<input type='checkbox' value='" + ticketUid + "'" +
			(rsRow.attributes['completeDate'] != "" ? " disabled" : "") +
			(rsRow.checked ? " checked" : "") +
			" onclick='toggleRow(" + i + ")'/>";
		tableRow.appendChild(td);

		td = document.createElement("td");
		td.innerHTML = "<a style='font-weight:bold; text-decoration:underline'" +
			 " href='QSCR.do?method=ticketUpdate&ticketNumber=" +
			 ticketUid + "'>" + ticketUid + "</a>";
		tableRow.appendChild(td);

		for (var c = 2; c < columnSetMapping.length; c++) {
			/*
			 * HACK: IE doesn''t recognize "white-space" for TD elements.
			 * Wrap text data inside SPAN first
			 */
			td = document.createElement("td");
			var span = document.createElement("span");
			span.innerHTML = rsRow.attributes[columnSetMapping[c]];
			td.appendChild(span);
			tableRow.appendChild(td);
		}

		newbody.appendChild(tableRow);
	}
	table.replaceChild(newbody, oldbody);

	/*
	 * Counter
	 */
	var indexStart = resultSet.length > 0 ? rsIndex + 1 : 0;
	var indexEnd = rsIndex + newbody.rows.length;
	document.getElementById("counter").innerHTML = "<b>" + indexStart + "</b> - <b>" +
		indexEnd + "</b> of <b>" + resultSet.length + "</b>";
}

function navNext() {
	if (rsIndex + visibleRows < resultSet.length) {
		rsIndex += visibleRows;
	}
	updateViewSize();
}

function navPrev() {
	rsIndex -= visibleRows;
	if (rsIndex < 0) rsIndex = 0;
	updateViewSize();
}

function navFirst() {
	rsIndex = 0;
	updateViewSize();
}

function navLast() {
	rsIndex = resultSet.length - visibleRows;
	if (rsIndex < 1) rsIndex = 0;
	updateViewSize();
}

function reassign() {
	var selector = document.getElementById("reassignSelector");
	var selections = new Array();
	for (var i = 0; i < resultSet.length; i++) {
		if (resultSet[i].checked) {
			selections[selections.length] = resultSet[i].attributes["ticketUid"];
		}
	}
	if (selections.length > 0) {
		if (confirm("Reassign " + selections.length + " ticket(s) to " + selector.value + "?")) {
			var form = document.forms[0];
			for (var i = 0; i < selections.length; i++) {
				addHiddenField(form, "selectedTickets", selections[i]);
			}
			getFormElementsByName(form, "method")[0].value = "ticketReAssign";
			form.onsubmit = null;
			form.submit();
		}
	}
	else {
		alert("Please select ticket(s) to be reassigned");
	}
}
</script>

<input type="hidden" name="sortColumn" value="followupDateDef"/>
<input type="hidden" name="sortDesc" value="false"/>  

<table>
	<thead>
		<tr>
			<th colspan="3">
			<span id="criteria" class="table-control"></span>
			<span>search criteria</span>
			</th>
		</tr>
	</thead>
	<tr>
		<td class="input-group">
			<table>
				<tr>
					<td class="label">sdr cuid</td>
					<td class="input">
						<html:select property="sdrCuids" size="5" multiple="" style='width: 150px;'>
							<html:optionsCollection property="searchSdrCuidMap" value="key" label="value"/>
						</html:select>
					</td>
				</tr>
			</table>
		</td>
		<td class="input-group">
			<table>
				<tr>
					<td class="label">account name</td>
					<td class="input">
						<html:select property="accountUids" size="5" multiple="" style='width: 150px;'>
							<html:optionsCollection property="searchAccountNameMap" value="key" label="value"/>
						</html:select>
					</td>
				</tr>
			</table>
		</td>
		<td class="input-group">
			<table>
				<tr>
					<td class="label">Account No</td>
					<td class="input">
						<html:select property="accountnos" size="5" multiple="" style='width: 150px;'>
						<html:optionsCollection property="searchaccountnoMap" value="key" label="value"/>
						</html:select>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
	<td class="input-group">
			<table>
				<tr>
					<td class="label">Tracking type</td>
					<td class="input">
						<html:select property="trackingTypeUids" size="5" multiple="" style='width: 150px;'>
						<html:optionsCollection property="searchTrackingTypeMap" value="key" label="value"/>
						</html:select>
					</td>
				</tr>
			</table>
		</td>
   		  	
	<td class="input-group">
			<table>
				<tr>
					<td class="label">
					<label for="searchTrackingId">Tracking ID</label>
			   </td>
					<td class="input"> <html:text property="searchTrackingId" maxlength="15" /></td>
				</tr>
			</table>
		</td>
		
		
		
		
		


		<td class="input-group">
			<table>
				<tr>
					<td class="label">
					<label for="searchAccountNo">Account#</label>
			   </td>
					<td class="input"> <html:text property="searchAccountNo" maxlength="25" /></td>
				</tr>
			</table>
		</td>
		</tr>
	<tr>


		<td class="input-group" colspan="2">
			<input type="hidden" name="ICFocus"/>
			<iframe name="CalFrame" id="CalFrame" marginheight="0" marginwidth="0" noresize="noresize" frameborder="0" scrolling="no" src="/QSCR/htdocs/calendar-static.html">Calendar not supported</iframe>
			<table>
				<tr>
					<td class="label">from date</td>
					<td class="input">
						<html:text property="searchFromDT"
							size="10" styleId="searchFromDT" styleClass="date-format"/>
						<a tabindex="-1" 
							href="javascript:openDate('searchFromDT', 'searchFromDT', 'MDY/450', false)">
							<img height="17" alt="Select Date from Calendar"
							src="/QSCR/images/sm_cal.gif" width="17" border="0"> 
						</a>
					</td>
					<td class="label">to date</td>
					<td class="input">
						<html:text property="searchToDT"
							size="10" styleId="searchToDT" styleClass="date-format"/>
						<a tabindex="-1" 
							href="javascript:openDate('searchToDT', 'searchToDT', 'MDY/450', false)">
							<img height="17" alt="Select Date from Calendar"
							src="/QSCR/images/sm_cal.gif" width="17" border="0"> 
						</a>
					</td>
					<td class="label" colspan="2" stlye="position:relative">
						<label for="searchExpedited">
							expedited<html:checkbox property="searchExpedite" styleId="searchExpedited"/>
						</label>
						<label for="searchOpen">
							open<html:checkbox property="searchOpen" styleId="searchOpen"/>
						</label>
						<label for="searchCompleted">
							completed<html:checkbox property="searchCompleted" styleId="searchCompleted"/>
						</label>
					</td>
				</tr>
			</table>
		</td>
	</tr>
</table>
<table>
	<thead>
		<th colspan="6">
			<span class="table-control"></span>
			<span>additional criteria</span>
		</th>
	</thead>
	<tbody style="display:none">
		<tr>
			<td class="label">ticket type</td>
			<td class="input">
				<html:select property="ticketTypes" size="4" multiple="">
					<html:optionsCollection property="searchTicketTypeMap" value="key" label="value"/>
				</html:select>
			</td>
			<td class="label">product</td>
			<td class="input">
				<html:select property="productUids" size="4" multiple="">
					<html:optionsCollection property="searchProductMap" value="key" label="value"/>
				</html:select>
			</td>
			<td class="label">sub product</td>
			<td class="input">
				<html:select property="subProductUids" size="4" multiple="">
					<html:optionsCollection property="searchSubProductMap" value="key" label="value"/>
				</html:select>
			</td>
		</tr>
	</tbody>
</table>

<table>
	<tr><th colspan="2">criteria actions</th></tr>
	<tr>
		<td class="input">
			<input type="reset" value="Clear"/>
			<input type="submit" value="Find Tickets"/>
		</td>
	</tr>
</table>

<hr width="100%"/>

<div style="width:100%;">
	<span id="no-results">No results found</span>
	<table style="width:100%" id="resultsTable">
		<colgroup>
			<col width="5"/> <!-- checkbox -->
			<col width="60"/> <!-- id -->
			<col width="110"/> <!-- type -->
			<col width="200"/> <!-- received -->
			<col width="90"/> <!-- sdr cuid -->
			<col width="220"/> <!-- account -->
			<col width="175"/> <!-- product -->
			<col width="175"/> <!-- sub product -->
		</colgroup>
		<thead>
			<tr>
				<th colspan="9">
					<span style="float:right">
						rows per page
						<select id="rowsPerPage" onchange="updateViewSize()">
							<option value="auto">auto</option>
							<option value="25">25</option>
							<option value="50">50</option>
							<option value="all">all</option>
						</select>
					</span>
					<span>search results</span>
				</th>
			</tr>
			<tr>
				<th>
					<input type="checkbox" id="multiSelector" onclick="toggleListSelection()"/>
				</th>
				<th class="sortable">id</th>
				<th class="sortable">type</th>
				<th class="sortable">received</th>
				<th class="sortable">sdr cuid</th>
				<th class="sortable">account</th>
				<th class="sortable">product</th>
				<th class="sortable">sub product</th>
				<th class="sortable sorted">Follow-up Date</th>
			</tr>
		</thead>
		<tbody id="resultsBody">
			<!-- HACK: IE needs this blank row to correctly figure starting position -->
			<tr></tr>
		</tbody>
	</table>
	<span style="width:100%; position:relative">
		<span style="float:left;">
			<table id="reassignControls">
				<tr><th colspan="3">reassign</th></tr>
				<tr>
					<td><input id="reassignButton" type="button" value="Reassign" onclick="reassign()"/></td>
					<td>
						<html:select property="reAssignToCuid" size="1" styleId="reassignSelector">
							<html:optionsCollection property="sdrCuidMap" value="key" label="value"/>
						</html:select>
					</td>
				</tr>
			</table>
		</span>
		<span style="float:right;">
			<center>
			<span class="page-control" onclick="navFirst()">
				first
				<br/>
				<img src="/QSCR/images/arrow-up.gif"/>
			</span>
			<br/>
			<span class="page-control" onclick="navPrev()">
				prev
				<img align="center" src="/QSCR/images/arrow-left.gif"/>
			</span>
			<span class="page-control" onclick="navNext()">
				<img align="center" src="/QSCR/images/arrow-right.gif"/>
				next
			</span>
			<br/>
			<span class="page-control" onclick="navLast()">
				<img src="/QSCR/images/arrow-down.gif"/>
				<br/>
				last
			</span>
			</center>
		</span>
		<center>
			<div id="counter" style="z-index:-1"></div>
			<div id="exceeded"></div>
		</center>
	</span>
</div>
<!-- Search.jsp END -->
