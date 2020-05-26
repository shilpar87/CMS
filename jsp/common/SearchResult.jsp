<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.*, com.qwest.cms.BO.CMSBO " %>

<META http-equiv=Content-Type content="text/html; charset=iso-8859-1">

<SCRIPT type=text/javascript>

var menu1=new Array()
menu1[0]='<table width="340" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Application Name</b><br>Click on the link to get hostname.</div></td></tr></table>'
		
var menuwidth='260px' //default menu width
var menubgcolor='#ffffff'  //menu bgcolor
var disappeardelay=250  //menu disappear speed onMouseout (in miliseconds)
var hidemenu_onclick="yes" //hide menu when user clicks within menu?

var ie4=document.all
var ns6=document.getElementById&&!document.all

if (ie4||ns6)
document.write('<div id="dropmenudiv" style="visibility:hidden;width:'+menuwidth+';background-color:'+menubgcolor+'" onMouseover="clearhidemenu()" onMouseout="dynamichide(event)"></div>')

function getposOffset(what, offsettype){
	//alert("waht "+what)
var totaloffset=(offsettype=="left")? what.offsetLeft : what.offsetTop;
var parentEl=what.offsetParent;
while (parentEl!=null){
totaloffset=(offsettype=="left")? totaloffset+parentEl.offsetLeft : totaloffset+parentEl.offsetTop;
parentEl=parentEl.offsetParent;
}
return totaloffset;
}


function showhide(obj, e, visible, hidden, menuwidth){
if (ie4||ns6)
dropmenuobj.style.left=dropmenuobj.style.top="-500px"
if (menuwidth!=""){
dropmenuobj.widthobj=dropmenuobj.style
dropmenuobj.widthobj.width=menuwidth
}
if (e.type=="click" && obj.visibility==hidden || e.type=="mouseover")
obj.visibility=visible
else if (e.type=="click")
obj.visibility=hidden
}

function iecompattest(){
return (document.compatMode && document.compatMode!="BackCompat")? document.documentElement : document.body
		alert("document.documentElement "+document.documentElement);
}

function clearbrowseredge(obj, whichedge){
var edgeoffset=0
if (whichedge=="rightedge"){
var windowedge=ie4 && !window.opera? iecompattest().scrollLeft+iecompattest().clientWidth-15 : window.pageXOffset+window.innerWidth-15
dropmenuobj.contentmeasure=dropmenuobj.offsetWidth
if (windowedge-dropmenuobj.x < dropmenuobj.contentmeasure)
edgeoffset=dropmenuobj.contentmeasure-obj.offsetWidth
}
else{
var topedge=ie4 && !window.opera? iecompattest().scrollTop : window.pageYOffset
var windowedge=ie4 && !window.opera? iecompattest().scrollTop+iecompattest().clientHeight-15 : window.pageYOffset+window.innerHeight-18
dropmenuobj.contentmeasure=dropmenuobj.offsetHeight
if (windowedge-dropmenuobj.y < dropmenuobj.contentmeasure){ //move up?
edgeoffset=dropmenuobj.contentmeasure+obj.offsetHeight
edgeoffset=dropmenuobj.contentmeasure+obj.offsetHeight
if ((dropmenuobj.y-topedge)<dropmenuobj.contentmeasure) //up no good either?
edgeoffset=dropmenuobj.y+obj.offsetHeight-topedge
}
}
return edgeoffset
}

function populatemenu(what){
if (ie4||ns6)
dropmenuobj.innerHTML=what.join("")
}


function dropdownmenu(obj, e, menucontents, menuwidth){
if (window.event) event.cancelBubble=true
else if (e.stopPropagation) e.stopPropagation()
clearhidemenu()
dropmenuobj=document.getElementById? document.getElementById("dropmenudiv") : dropmenudiv
populatemenu(menucontents)

if (ie4||ns6){
showhide(dropmenuobj.style, e, "visible", "hidden", menuwidth)
dropmenuobj.x=getposOffset(obj, "left")
dropmenuobj.y=getposOffset(obj, "top")
var a = dropmenuobj.y-clearbrowseredge(obj, "bottomedge")+obj.offsetHeight
//alert("dropmenuobj "+a);
dropmenuobj.style.left=dropmenuobj.x-clearbrowseredge(obj, "rightedge")+"px"
dropmenuobj.style.top=dropmenuobj.y-clearbrowseredge(obj, "bottomedge")+obj.offsetHeight+"px"
//alert("dropmenuobj.y "+dropmenuobj.y);
//alert("obj.offsetHeight "+obj.offsetHeight);
}


return clickreturnvalue()
}

function clickreturnvalue(){
if (ie4||ns6) return false
else return true
}

function contains_ns6(a, b) {
while (b.parentNode)
if ((b = b.parentNode) == a)
return true;
return false;
}

function dynamichide(e){
if (ie4&&!dropmenuobj.contains(e.toElement))
delayhidemenu()
else if (ns6&&e.currentTarget!= e.relatedTarget&& !contains_ns6(e.currentTarget, e.relatedTarget))
delayhidemenu()
}

function hidemenu(e){
if (typeof dropmenuobj!="undefined"){
if (ie4||ns6)
dropmenuobj.style.visibility="hidden"
}
}

function delayhidemenu(){
if (ie4||ns6)
delayhide=setTimeout("hidemenu()",disappeardelay)
}

function clearhidemenu(){
if (typeof delayhide!="undefined")
clearTimeout(delayhide)
}

if (hidemenu_onclick=="yes")
document.onclick=hidemenu



function getDetails(appSearch){
    	alert("jsdfuiefrweui");
	var net = document.forms[0].net.value;
	var appId = document.forms[0].appId.value;
	var 1cont = document.forms[0].1cont.value;
	var 2cont = document.forms[0].2cont.value;
	document.forms[0].action="<%=request.getContextPath()%>/CMSAction.do?methodToCall=certdetails";
	document.forms[0].submit();
	return true;
}


</script>

<html:html>
<head>
<STYLE type=text/css>.Pageheads {
	FONT-WEIGHT: bold; FONT-SIZE: 12pt; COLOR: #336699; FONT-FAMILY: Arial, Helvetica, sans-serif
}
.bodytext {
	FONT-SIZE: 8pt; COLOR: #666666; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif
}
#dropmenudiv {
	BORDER-RIGHT: #70caf9 1px solid; BORDER-TOP: #70caf9 1px solid; Z-INDEX: 100; BORDER-LEFT: #70caf9 1px solid; BORDER-BOTTOM: #70caf9 1px solid; POSITION: absolute
}
#dropmenudiv A {
	
}
#dropmenudiv A:active {
	COLOR: #0065b0; TEXT-DECORATION: none
}
A:link {
	COLOR: #0065b0; TEXT-DECORATION: underline
}
A:hover {
	COLOR: #ff9900; TEXT-DECORATION: underline
}
</STYLE>
</head>
<body>

<form action="/CMSAction.do?methodToCall=getContactDetails" method='post' name='getContactDetails'>

<% ArrayList list = new ArrayList();
list = (ArrayList)session.getAttribute("AppList");
System.out.println("size of arraylist--------- in searchresult  "+list.size());

%>
	<table border="0"  cellpadding="5" cellspacing="1"   bgcolor="FFFFFF"   width="20%" align="center">
    <tr bgcolor="#D6E1EE">
			<td align="center" colspan="4"><font face="Verdana" size="2" color="123660"><b>Certificate Viewer</b></font>
			</td>
		</tr>
	</table>
		
	<table border="0" cellpadding="5" cellspacing="1" bgcolor="FFFFFF" width="100%" align="center">
	<tr bgcolor="#D6E1EE">
	<td align="center" width="40%" colspan="1"><font face="Verdana" size="2" color="123660"><b>Application Name</b></font>
	</td>
	<td align="center" width="30%" colspan="1"><font face="Verdana" size="2" color="123660"><b>Acronym Name</b></font>
	</td>
	
	</tr>
	
	<%
	
	 for(int j=0;j< list.size();j++){
		 CMSBO cmsbo = (CMSBO)list.get(j);
		 String appSearch=(String)cmsbo.getAppName();
		 String acroNym = (String)cmsbo.getAcronym();
	%>
	
	<tr>
	<td align = "left">
	<a  href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=getContactDetails&appSearch=<%=appSearch%>" onmouseover="dropdownmenu(this, event,'menu1', '200px')" >
	<u><%=appSearch%></u></a></td>
	
	<td align = "left" colspan = "1">
	<%=acroNym%></td>
	</tr>
	<%}%>
	

	</table>
	
</form>
	
</html:html>