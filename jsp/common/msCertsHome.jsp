<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@page import="com.qwest.cms.BO.CMSBO, java.util.Calendar, java.text.* "%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />
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
</head>

<script language="Javascript">

var menu1=new Array()
menu1[0]='<table width="250" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>ACTIVE CERTIFICATES</b></div></td></tr></table>'
var menu2=new Array()
menu2[0]='<table width="250" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>RENEWAL CERTIFICATES</b></div></td></tr></table>'
var menu3=new Array()
menu3[0]='<table width="250" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>INACTIVE CERTIFICATES</b></div></td></tr></table>'
var menu4=new Array()
menu4[0]='<table width="200" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify">&nbsp;<b>EXPIRED CERTIFICATES</b></div></td></tr></table>'
var menu5=new Array()
menu5[0]='<table width="200" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>ALL CERTIFICATES</b></div></td></tr></table>'

		
var menuwidth='200px' //default menu width
var menubgcolor='#ffffff'  //menu bgcolor
var disappeardelay=250  //menu disappear speed onMouseout (in miliseconds)
var hidemenu_onclick="yes" //hide menu when user clicks within menu?

var ie4=document.all
var ns6=document.getElementById&&!document.all

if (ie4||ns6)
document.write('<div id="dropmenudiv" style="visibility:hidden;width:'+menuwidth+';background-color:'+menubgcolor+'" onMouseover="clearhidemenu()" onMouseout="dynamichide(event)"></div>')

function getposOffset(what, offsettype){
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
}

function clearbrowseredge(obj, whichedge){
	//alert("obj"+obj);
	//alert("whichedge   "+whichedge);
var edgeoffset=0
if (whichedge=="rightedge"){
var windowedge=ie4 && !window.opera? iecompattest().scrollLeft+iecompattest().clientWidth-15 : window.pageXOffset+window.innerWidth-15
		//alert("windowedge"+windowedge);//1116
//alert("dropmenuobj.offsetWidth"+dropmenuobj.offsetWidth);//93
dropmenuobj.contentmeasure=dropmenuobj.offsetWidth
if (windowedge-dropmenuobj.x < dropmenuobj.contentmeasure)
edgeoffset=dropmenuobj.contentmeasure-obj.offsetWidth
//alert("edgeoffset"+edgeoffset);//0
}
else{
var topedge=ie4 && !window.opera? iecompattest().scrollTop : window.pageYOffset
		//alert("topedge"+topedge);//0
var windowedge=ie4 && !window.opera? iecompattest().scrollTop+iecompattest().clientHeight-15 : window.pageYOffset+window.innerHeight-18
		//alert("windowedge"+windowedge);//640
dropmenuobj.contentmeasure=dropmenuobj.offsetHeight
if (windowedge-dropmenuobj.y < dropmenuobj.contentmeasure){ //move up?
edgeoffset=dropmenuobj.contentmeasure+obj.offsetHeight
edgeoffset=dropmenuobj.contentmeasure+obj.offsetHeight
//alert("edgeoffset in else"+edgeoffset);
if ((dropmenuobj.y-topedge)<dropmenuobj.contentmeasure) //up no good either?
edgeoffset=dropmenuobj.y+obj.offsetHeight-topedge

}
}
return edgeoffset
}

function populatemenu(what){
	//alert(what);
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
//alert("dropmenuobj.x in func"+dropmenuobj.x);//158
dropmenuobj.y=getposOffset(obj, "top")
var a = (dropmenuobj.y-clearbrowseredge(obj, "bottomedge")+obj.offsetHeight) - 200
//alert(a);
var c = dropmenuobj.style.left
//alert(c);
//alert("dropmenuobj.x " +dropmenuobj.x);
dropmenuobj.style.left= dropmenuobj.x-clearbrowseredge(obj, "rightedge")+ 100 +"px"
//alert("dropmenuobj.y "+a);
dropmenuobj.style.top= (dropmenuobj.y-clearbrowseredge(obj, "bottomedge")+obj.offsetHeight) +"px"
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

function add(status){
    //alert(status);
    //alert(document.getElementById('selectCert').value)
    //alert(document.getElementById('selectCert').checked)
    flagh=checkRadio();
    //System.out.println(flag is +flagh);    
    if(flagh==true){
	document.forms[0].action = "CMSAction.do?methodToCall=getCertUserDetails&status="+status;	  	
	document.forms[0].submit();
	return true;
    }
    else{
	
	return false;
    }
}

function checkRadio()
{   
	var flag=false;
	if(document.forms[0].selectCert.length > 1)
   {
	for (var i=0; i < document.forms[0].selectCert.length; i++)
	{
	if (document.forms[0].selectCert[i].checked)
	{
     flag=true;
    // alert(flag)
     }
  }
  }
  else{
    if(document.forms[0].selectCert.checked)
    {
     flag=true;
    
     }
      
   }
  if(flag==false)
  {
   alert("Please select a Certificate before you proceed...")
     //alert(flag)
	 return flag;
	 
	 }
	 return flag;
}

function filter(){
 // alert("filter");
  document.forms[0].action = "CMSAction.do?methodToCall=popUpFilter";	  	
  document.forms[0].submit();
  return true;
}

function clearFilter(){
    document.forms[0].action = "CMSAction.do?methodToCall=msCertsHome";	  	
    document.forms[0].submit();
    return true;
}


</script>

<head>
<title>Functions Tab</title>
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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<%String filterValue = (String)session.getAttribute("PopUpFilter");
System.out.println("filterValue in Jspppppppppppp //////////// "+filterValue);%>

<html:form action="/CMSAction.do?methodToCall=getCertUserDetails" enctype="multipart/form-data">

<table width="850" border="0" cellspacing="1" cellpadding="3" bgcolor="FFFFFF" style="border-top: 10px; border-top-color: 000000" bordercolor="26466D">
<tr bgcolor="#D6E1EE" ><th width="3%"></th><th width="20%"><font color="123660">Requester Name</font></th><th width="17%"><font color="123660">Issued CommonName</font></th>
<th width="17%"><font color="123660">Issued Organization</font></th><th width="14%"><font color="123660">Effective Date</font></th><th width="15%"><font color="123660">Expiry Date</font></th></th>
<th width="25%"><font color="123660">Status</font><br>
<a href = 'CMSAction.do?methodToCall=msStatusFilter&status=ACTIVE' onmouseover = "dropdownmenu(this, event, menu1, '200px')"><font color="red" size="0.01px"><u><b>AC</b></u></font></a>
<a href = 'CMSAction.do?methodToCall=msStatusFilter&status=EXPIRED' onmouseover = "dropdownmenu(this, event, menu4, '100px')"><font color="red" size="0.01px"><u><b>EX</b></u></font></a>
<a href = 'CMSAction.do?methodToCall=msStatusFilter&status=ALL' onmouseover = "dropdownmenu(this, event, menu5, '100px')"><font color="red" size="0.01px"><u><b>AL</b></u></font></a>
</br>

</th></tr>
</table>

</div>

<div style="overflow-y: scroll; width:850px; height:300px; table-layout:fixed;">
<table style="table-layout: fixed;" width="850" border="0" cellspacing="1" cellpadding="0" bgcolor="FFFFFF">

<logic:iterate id="excelData"  name="excelData">
<tr bgcolor="f1f1f1">

<td style="width:3%" align="center" > 

<input type="radio" id="serialId" name="selectCert" value="<bean:write name="excelData" property="reqID"/>" />
 </td> 
 
<td style="width:20%" align="center">
<bean:define id="res" name="excelData" property="status" type="java.lang.String" /> 
 

<%if(res.equalsIgnoreCase("active"))
 {
 %> 	<font color="black" face="Verdana" size="1">
 	<bean:write name="excelData" property="reqName"/>	          
 	</font>
         
      <% } 
 else if(res.equalsIgnoreCase("expired")) {
      %>
      	<font color="CC0044" face="Verdana" size="1">
      	<bean:write name="excelData" property="reqName"/>		          
       </font>
      <% } 
else if(res.equalsIgnoreCase("inactive")) {
      %>
      <font color="#00FFFF" face="Verdana" size="1">
      <bean:write name="excelData" property="reqName"/>		          
       </font>
      <% } 
 else  {
      %>
       <font color="blue" face="Verdana" size="1">
       <bean:write name="excelData" property="reqName"/>		          
       </font>
      <% } %>
	
</td>
<td style="width:17%" align="center">

<bean:define id="res1" name="excelData" property="status" type="java.lang.String" />


	<%if(res1.equalsIgnoreCase("active"))
	{
	    %> <font color="black" face="Verdana" size="1">
	    <bean:write name="excelData" property="issuedCommonName"/>		          
	    </font>
        
	<% } 
	else if(res1.equalsIgnoreCase("expired")) {
	    %>
      		<font color="CC0044" face="Verdana" size="1">
		<bean:write name="excelData" property="issuedCommonName"/>	          
		</font>
	<% } 
	else if(res1.equalsIgnoreCase("inactive")) {
	    %>
	    <font color="#00FFFF" face="Verdana" size="1">
	    <bean:write name="excelData" property="issuedCommonName"/>		          
	    </font>
      <% } 
	else  {
	    %>
	    <font color="blue" face="Verdana" size="1">
	    <bean:write name="excelData" property="issuedCommonName"/>		          
	    </font>
      <% } %>

</td>

<td style="width:17%" align="center">
	<bean:define id="res2" name="excelData" property="status" type="java.lang.String" />


<%if(res2.equalsIgnoreCase("active"))
 {
 %> <font color="black" face="Verdana" size="1">
 	<bean:write name="excelData" property="issuedOrg"/>	          
     </font>
     
      <% } 
 else if(res2.equalsIgnoreCase("expired")) {
      %>
      	<font color="CC0044" face="Verdana" size="1">
		<bean:write name="excelData" property="issuedOrg"/>	          
       </font>
      <% } 
else if(res2.equalsIgnoreCase("inactive")) {
      %>
      <font color="#00FFFF" face="Verdana" size="1">
		<bean:write name="excelData" property="issuedOrg"/>		          
       </font>
      <% } 
 else  {
      %>
       <font color="blue" face="Verdana" size="1">
		<bean:write name="excelData" property="issuedOrg"/>		          
       </font>
      <% } %>
</td>
<td style="width:14%" align="center">
	<bean:define id="res3" name="excelData" property="status" type="java.lang.String" />


<%if(res3.equalsIgnoreCase("active"))
 {
 %> <font color="black" face="Verdana" size="1">
 	<bean:write name="excelData" property="certEffDate"/>		          
     </font>
        
      <% } 
 else if(res3.equalsIgnoreCase("expired")) {
      %>
      	<font color="CC0044" face="Verdana" size="1">
      		<bean:write name="excelData" property="certEffDate"/>		          
       </font>
      <% } 
else if(res3.equalsIgnoreCase("inactive")) {
      %>
      <font color="#00FFFF" face="Verdana" size="1">
		<bean:write name="excelData" property="certEffDate"/>		          
       </font>
      <% } 
 else  {
      %>
       <font color="blue" face="Verdana" size="1">
		<bean:write name="excelData" property="certEffDate"/>		          
       </font>
      <% } %>
</td>         		       
<td style="width:15%" align="center">
<bean:define id="res4" name="excelData" property="status" type="java.lang.String" />


<%if(res4.equalsIgnoreCase("active"))
 {
 %> 	<font color="black" face="Verdana" size="1">
 	<bean:write name="excelData" property="certExpDate"/>		          
 	</font>
         
      <% } 
 else if(res4.equalsIgnoreCase("expired")) {
      %>
      	<font color="CC0044" face="Verdana" size="1">
      		<bean:write name="excelData" property="certExpDate"/>		          
       </font>
      <% } 
else if(res4.equalsIgnoreCase("inactive")) {
      %>
      <font color="#00FFFF" face="Verdana" size="1">
      <bean:write name="excelData" property="certExpDate"/>		          
      </font>
      <% } 
 else  {
      %>
       <font color="blue" face="Verdana" size="1">
	<bean:write name="excelData" property="certExpDate"/>		          
       </font>
      <% } %>
</td>


<td style="width:25%" align="center" color="CC0044">
<bean:define id="res5" name="excelData" property="status" type="java.lang.String" />

<%if(res5.equalsIgnoreCase("active"))
 {
 %> 	<font color="green" face="Verdana" size="1">
 	<b><bean:write name="excelData" property="status"/></b>		          
 	</font>
  <% } 
 else if(res5.equalsIgnoreCase("expired")) {
      %>
      	<font color="CC0044" face="Verdana" size="1">
	<b><bean:write name="excelData" property="status"/></b>		          
       </font>
      <% } 
 else if(res5.equalsIgnoreCase("inactive")) {
      %>
      	<font color="#00FFFF" face="Verdana" size="1">
	<bean:write name="excelData" property="status"/>		          
	</font>
      <% } 
 else  {
      %>
       <font color="blue" face="Verdana" size="1">
	<bean:write name="excelData" property="status"/>		          
       </font>
      <% } %>


</logic:iterate>
</table>

</div>

<%session.removeAttribute("excelData");%>

</html:form>


<br><br>


<table align="center"  colspan="2" >
<tr>
<td><td align="center">
<input type= "submit" style="font-size: 1.05em; padding: 0.03em;" name = "Add To My Account" value ="Add To My Account" onclick="add('<bean:write name="excelData" property="status"/>')"/></td>
<td align="center"><input type= "submit" style="font-size: 1.05em; padding: 0.03em;" name = "Filter" value ="Filter" onClick="filter()">

<%if((String)session.getAttribute("PopUpFilter")!=null){%>
	<td align="center">
	<input type= "submit" style="font-size: 1.05em; padding: 0.03em;" name = "Clear Filter" value ="Clear Filter" onClick="clearFilter()">
	</td>
<%session.removeAttribute("PopUpFilter");}%>
</tr>
</table>

</body>

</html>