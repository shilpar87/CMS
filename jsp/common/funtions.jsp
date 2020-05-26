<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >
var menu6=new Array()
menu6[0]='<table width="200" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Export Certificate</b></div></td></tr></table>'
var menu7=new Array()
menu7[0]='<table width="200" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Renewal of a Certificate</b></div></td></tr></table>'
var menu8=new Array()
menu8[0]='<table width="200" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Update Certificate</b></div></td></tr></table>'
var menu9=new Array()
menu9[0]='<table width="200" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Change Status of Certificate</b></div></td></tr></table>'
var menu10=new Array()
menu10[0]='<table width="200" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Delete Certificate</b></div></td></tr></table>'
var menu11=new Array()
menu11[0]='<table width="200" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Add Certificate</b></div></td></tr></table>'
		
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
//alert("dropmenuobj.offsetHeight "+dropmenuobj.offsetHeight)
//alert(dropmenuobj.y);//405
//alert("dropmenuobj.contentmeasure"+dropmenuobj.contentmeasure);//56
//alert("windowedge-dropmenuobj.y"+windowedge-dropmenuobj.y);//235
//alert("obj.offsetHeight  "+obj.offsetHeight);
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
//alert("dropmenuobj.y in func"+dropmenuobj.y);//405
//alert("dropmenuobj.x-clearbrowseredge"+dropmenuobj.x-clearbrowseredge(obj, "rightedge"))
var a = (dropmenuobj.y-clearbrowseredge(obj, "bottomedge")+obj.offsetHeight)-300;
dropmenuobj.style.left= dropmenuobj.x-clearbrowseredge(obj, "rightedge")+100+"px"
//alert("dropmenuobj.y "+dropmenuobj.y);
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

function DeleteCert()
{
				
        var ans=false; 
        ans=window.confirm('Do you want to Delete the Certificate.....?'); 
        //alert (ans); 
		return ans;
	  	
	  }
	  
function ExportCert()
{
				
        var ans=false; ans=window.confirm('Do you want to download the Certificate!!?'); //alert (ans); 
		return ans;
	  	
	  }
	  
function valChangeStatus(certStatus){

	//alert("in validate...34532.");
	//alert(certStatus.value);
	status=certStatus.value;
	if(status=="EXPIRED"){
		alert("The certificate status is 'Expired' and cannot be changed. ");
		return false;
	}
	else if(status=="Renew"){
		alert("The certificate is being renewed and status cannot be changed. ");
		return false;
	}			
	else{
		//alert("returning true");
		return true;
	}
}

function valUpdateStatus(status){
	if(status.value=="ACTIVE"){
		alert("The certificate is Active and has not been renewed.  The certificate cannot be updated before it is sent for renewal. ");
		return false;
	}
	else if(status.value=="INACTIVE"){
		alert("The certificate is Inactive and has not been renewed.  The certificate cannot be updated before it is sent for renewal. ");
		return false;
	}	
	else if(status.value=="EXPIRED"){
		alert("The certificate is Expired and has not been renewed.  The certificate cannot be updated before it is sent for renewal. ");
		return false;
	}		
	else{
		return true;
	}
}
</script>


<%@page import="com.qwest.cms.BO.CMSBO"%>
<%
String addCertTrue=(String)session.getAttribute("addCertTrue");
System.out.println(" addCertTrue value in functions JSP == >"+addCertTrue);%>

<html:html>
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
</head>
<body>
	<html:form action="/CMSAction.do?methodToCall=Functions">
		 
		<p align="left">
		<% CMSBO cmsbo=new CMSBO();
			String status="";
			if(session.getAttribute("DetailInfo") != null)
			{
				cmsbo =(CMSBO)session.getAttribute("DetailInfo");
				status=(String)session.getAttribute("certStatus");
				System.out.println("status is ....."+status);
			}
		%>
		<table width="100%" cellspacing="2" cellpadding="7">
		<tr bgcolor="lightyellow">
	
	<%if(session.getAttribute("addCertTrue")!=null){%>
	
	<td><input type=hidden name="certStatus" value="<%=status%>" />
	<a onmouseover="dropdownmenu(this, event, menu6, '200px')"  onclick=" return ExportCert();" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=doDownload">Export Certificate</a> <br>
	<a onmouseover="dropdownmenu(this, event, menu11, '200px')" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=addCert">Add Certificate To My Account</a> <br>
	<a onmouseover="dropdownmenu(this, event, menu7, '200px')" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=renewCert">Renewal of a Certificate </a> <br>
        <a onmouseover="dropdownmenu(this, event, menu8, '200px')" onclick="return valUpdateStatus(certStatus);" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=updateCert">Update Certificate</a> <br>
       	<a onmouseover="dropdownmenu(this, event, menu9, '200px')" onclick="return valChangeStatus(certStatus);" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=changeCertStatus">Change Status of Certificate </a> <br>
       	<a onmouseover="dropdownmenu(this, event, menu10, '200px')" onclick=" return DeleteCert();" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=deleteCertificate">Delete Certificate</a>  <br>
        <FONT size="4" color="CC0033"><b><html:errors/></b></FONT></td>
        
	<%session.removeAttribute("addCertTrue");}else{%>
	
	<td><input type=hidden name="certStatus" value="<%=status%>" />
	<a onmouseover="dropdownmenu(this, event, menu6, '200px')"  onclick=" return ExportCert();" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=doDownload">Export Certificate</a> <br>
	<a onmouseover="dropdownmenu(this, event, menu7, '200px')" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=renewCert">Renewal of a Certificate </a> <br>
        <a onmouseover="dropdownmenu(this, event, menu8, '200px')" onclick="return valUpdateStatus(certStatus);" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=updateCert">Update Certificate</a> <br>
       	<a onmouseover="dropdownmenu(this, event, menu9, '200px')" onclick="return valChangeStatus(certStatus);" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=changeCertStatus">Change Status of Certificate </a> <br>
       	<a onmouseover="dropdownmenu(this, event, menu10, '200px')" onclick=" return DeleteCert();" href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=deleteCertificate">Delete Certificate</a>  <br>
        <FONT size="4" color="CC0033"><b><html:errors/></b></FONT></td>
	
	<%}%>
	
        </tr>
	</table>
    	</html:form>
</body>
</html:html>