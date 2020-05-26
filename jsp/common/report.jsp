<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.*, com.qwest.cms.BO.CMSBO " %>

<META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
<html:html>
<head>
<link rel="stylesheet" type="text/css" media="all" href="<%=request.getContextPath()%>/css/calendar-win2k-cold-1.css" title="win2k-cold-1" /> 
<script type="text/javascript" src="<%=request.getContextPath()%>/config/calendar.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/config/lang/calendar-en.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/config/calendar-setup.js"></script>
<meta http-equiv="Content-Language" content="en-us">
<title>CMS</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<script language="JavaScript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script language="JavaScript" src="<%=request.getContextPath()%>/js/calFunc.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/validation.js"></script>

</head>

<body>
<html:form action="/CMSAction.do?methodToCall=report">

<%ArrayList mgrList = (ArrayList)session.getAttribute("mgrList");
System.out.println("mgrList in jsp =========== "+mgrList.size());
%>

<table valign = "center" border="0" cellpadding="5" cellspacing="1" bgcolor="FFFFFF" width="100%">
<tr>
<td align="right"><a href='CMSAction.do?methodToCall=getDoc'><b><u><i>Click Here To Get List <br> Of All Certificates</i></u></b></a></td>
</tr>
</table>

<%if(request.getAttribute("error")!=null){%>
<table border="0"  cellpadding="5" cellspacing="1"   bgcolor="FFFFFF"   width="60%" align="center">
<tr>
<td align="center"><font size="3" color="red"><b><%=request.getAttribute("error")%></b></font></td>
</tr>
</table>
<%}%>
	
<table border="0"  cellpadding="5" cellspacing="1"   bgcolor="FFFFFF"   width="60%" align="center">
<tr bgcolor="#D6E1EE">
<td align="center"><font face="Verdana" size="2" color="123660"><b>Report Form</b></font></td>
</tr>
</table>

<table align="center" border="0" cellpadding="5" cellspacing="1" bgcolor="FFFFFF" width="60%" align="center">
<tr bgcolor="f1f1f1">
<input type="hidden" name="selMgrName" />
<td align="right" ><font size="1"><b>Manager Name </b> </font>
<td width="60%" height="23" ><b>:</b> 
<html:select name="CMSFormBean" property="mgrName" size="1" style="font-size: 1.05em;" onchange="getAppName()" >
<html:option value="">   ----- Select -----</html:option>
<html:options collection="mgrList" name="CMSFormBean" property="mgrName" ></html:options>
</td></tr></tr>
</html:select>

<tr bgcolor="f1f1f1">
<td align="right" ><font size="1"><b>Application Name </b></font>
<td width="60%" height="23" ><b>:</b> 
<html:select name="CMSFormBean" property="appName" size="1" style="font-size: 1.05em;">
<html:option value="">   ----- Select -----</html:option>
<html:options collection="appList" name="CMSFormBean" property="appName"></html:options>
</td></tr>
</html:select>				


<tr bgcolor="f1f1f1">
<td align="right" ><font size="1"><b>Expiry Date After </b></font>
<td width="60%" height="23" ><b>:</b> 
<input type="text" name="expAfterDate" size="20" value="" readonly="readonly">
<button type="reset" id="f_trigger_b1_after">...</button> 
</td></tr>

<tr bgcolor="f1f1f1">
<td align="right" ><font size="1"><b>Expiry Date On <br> or Before </b></font>
<td width="60%" height="23" ><b>:</b> 
<input type="text" name="expBefDate" size="20" value="" readonly="readonly">
<button type="reset" id="f_trigger_b1">...</button> </td></tr>

</table>

<script language="javascript" type="text/javascript">

function getReport(){
    var appName=document.forms[0].appName.value;
    var mgrName=document.forms[0].mgrName.value;
    var expBefDate=document.forms[0].expBefDate.value;
    var expAfterDate=document.forms[0].expAfterDate.value;
    if((expAfterDate=='') && !(expBefDate=='')){
	alert(" Please Select Expiry Date After ");
	return false;
    }else if(!(expAfterDate=='') && (expBefDate=='')){
	alert(" Please Select Expiry Date On or Before ");
	return false;
    }
    if (Date.parse(expAfterDate) > Date.parse(expBefDate)) {
	alert(" Invalid Date Range!\n Start Date cannot be after End Date!")
	return false;
    }
    if(appName=='' && mgrName=='' && expBefDate=='' && expAfterDate=='' ){
	alert(" Please Enter Atleast One Data ");
	return false;
    }
   
    document.forms[0].action = "CMSAction.do?methodToCall=getReport";	  	
    document.forms[0].submit();
}

function getAppName(){
    	//alert(document.forms[0].mgrName.value);
    	document.forms[0].mgrName.value;
	document.forms[0].action="CMSAction.do?methodToCall=getAppName";
	document.forms[0].submit();
	return true;
}
function getDoc(){
    document.forms[0].action = "CMSAction.do?methodToCall=getDoc";	  	
    document.forms[0].submit();
}

</script>


</html:form>
<br>
<table align = "center" width="80%">
<tr>
<td align="center"><input type = "button"  name = "getReport" style="font-size: 1.04em; padding: 0.03em; width:122px" value = "Get Report" onclick='getReport();'></td>
</tr>
</table>


</body>
</html:html>

<script type="text/javascript">
Calendar.setup({
    inputField     :    "expBefDate",      // id of the input field
    ifFormat       :    "%m/%d/%Y ",       // format of the input field
              // will display a time selector
    daFormat		:    "%d/%b/%Y ",      
    button         :    "f_trigger_b1",   // trigger for the calendar (button ID)
    singleClick    :    false,           // double-click mode
    step           :    1                // show all years in drop-down boxes (instead of every other year as default)
});
</script>

<script type="text/javascript">
Calendar.setup({
    inputField     :    "expAfterDate",      // id of the input field
    ifFormat       :    "%m/%d/%Y ",       // format of the input field
              // will display a time selector
    daFormat		:    "%d/%b/%Y ",      
    button         :    "f_trigger_b1_after",   // trigger for the calendar (button ID)
    singleClick    :    false,           // double-click mode
    step           :    1                // show all years in drop-down boxes (instead of every other year as default)
});
</script>
