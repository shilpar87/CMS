
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >
function validate(){
var flg=true;
if(document.getElementById('sigAlgorithm').value=='null'){
alert(" Please select Signature Algorithm ");
flg=false;
}else if(!echeck(document.getElementById('email').value)){
flg=false;
}
return flg;
}

function echeck(str) {

		var at="@"
		var dot="."
		var lat=str.indexOf(at)
		var lstr=str.length
		var ldot=str.indexOf(dot)
		if (str.indexOf(at)==-1){
		   alert("Invalid E-mail ID")
		   return false
		}

		if (str.indexOf(at)==-1 || str.indexOf(at)==0 || str.indexOf(at)==lstr){
		   alert("Invalid E-mail ID")
		   return false
		}

		if (str.indexOf(dot)==-1 || str.indexOf(dot)==0 || str.indexOf(dot)==lstr){
		    alert("Invalid E-mail ID")
		    return false
		}

		 if (str.indexOf(at,(lat+1))!=-1){
		    alert("Invalid E-mail ID")
		    return false
		 }

		 if (str.substring(lat-1,lat)==dot || str.substring(lat+1,lat+2)==dot){
		    alert("Invalid E-mail ID")
		    return false
		 }

		 if (str.indexOf(dot,(lat+2))==-1){
		    alert("Invalid E-mail ID")
		    return false
		 }

		 if (str.indexOf(" ")!=-1){
		    alert("Invalid E-mail ID")
		    return false
		 }

 		 return true
	}



var menu1=new Array()
menu1[0]='<table width="300" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Signature Algorithm</b><br><br>The Cryptographic algorithm that should be used.</div></td></tr></table>'
var menu2=new Array()
menu2[0]='<table width="300" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Common Name </b><br><br>Fully-qualified domain name for the Web site you will be using the certificate. For Eg: Qwest Microsoft .NET Services</div></td></tr></table>'
var menu3=new Array()
menu3[0]='<table width="300" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Organizational Unit</b><br><br>Name of your division, department, or other operational unit of your organization. For Eg: IPKI Infrastructure Team</div></td></tr></table>'
var menu4=new Array()
menu4[0]='<table width="300" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Organizational Name</b><br><br>Name of your organization. The certificate authority may require any host names entered in this attribute belong to a domain registered to this organization. For Eg: Application Security Team</div></td></tr></table>'
var menu5=new Array()
menu5[0]='<table width="300" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Locality Name</b><br><br>Name of your city or town. If you operate with a license granted by a city, this attribute is required; you must enter the name of the city that granted your license. For Eg. Denver</div></td></tr></table>'
var menu6=new Array()
menu6[0]='<table width="300" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>State Name </b><br><br>Name of the state or province in which your organization operates if your organization is in the United States or Canada, respectively. Do not abbreviate. For Eg. Colorado</div></td></tr></table>'
var menu7=new Array()
menu7[0]='<table width="300" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Country</b><br><br>Two-letter ISO code for your country. The code for the United States is US. For Eg: US</div></td></tr></table>'
var menu8=new Array()
menu8[0]='<table width="300" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#999999"><tr><td bgcolor="#FFFFFF" class="Bluetxt" style="padding-left:10px;padding-right:10px;padding-top:5px;padding-bottom:5px"><div align="justify"><b>Email</b><br><br>E-mail address of the administrator. The digital certificate is mailed to this e-mail address. For Eg: certinfo@qwest.com</div></td></tr></table>'
		
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

function onchange1(){
    alert("onchange")
}

</script>

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

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create CSR</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>
	<html:form action="/CMSToolAction.do?methodToCall=creatCsr"> 
	<table border="0" align="center" cellpadding="2" cellspacing="0" width="30%" bgcolor="336699" >
	<tr>
		<td align="center" valign="top" ><b><font size="3" color="FFFFFF"> Create new CSR </font></b></td> 
    </tr>
 	</table><br>
	<div style="width:700px; height:9px" >
	<table  width ="70%" cellspacing="1" cellpadding="1" border="0">

	<tr bgcolor="DFECFF" >  
		<td align="right"><font size="2" color="004488" >Signature Algorithm * :</td>	
		<td align="left" width="" height="30"> 
			<select name="sigAlgorithm" size="1" style="font-size: 1.05em;" onmouseover = "dropdownmenu(this, event, menu1, '200px')">
			<option value="null" selected>Select...</option>
			<option value="RSA">RSA</option>
			
			<option value="DSA">DSA</option>
			</select> 
		</td>
	</tr>	
<!--	<tr bgcolor="C8DFFF" width ="500px">  
		<td align="right"><font size="2" color=" 00638B" >Validity (days) :</td>	
		<td align="left" width="" height="30" onmouseover = "dropdownmenu(this, event, menu8, '200px')"> 
			<select name="cert_validity" size="1" style="font-size: 1.05em;">
			<option value="select_validity" selected>Select...</option>
			<option value="365">365</option>
			<option value="730">730</option>
			</select> 
		</td>
	</tr>-->
	<tr bgcolor="D2E8FF" >
		<td align="right" ><font size="2" color=" 004488" >Common Name (CN) : </td>
		<td align="left" width="" height="30"> <input type="text" class=text size="42"  name="comName" onmouseover = "dropdownmenu(this, event, menu2, '200px')"> </td>
	</tr>
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 004488" >Organizational Unit (OU) : </td>
		<td align="left" width="" height="30"> <input type="text" class=text size="42" wrap="off"  name="orgUnit" onmouseover = "dropdownmenu(this, event, menu3, '200px')" > </td>
	</tr>
	<tr bgcolor="D2E8FF">
		<td align="right" ><font size="2" color=" 004488" >Organizational Name (ON) : </td>
		<td align="left" width="" height="30"> <input type="text" class=text size="42" name="orgName" onmouseover = "dropdownmenu(this, event, menu4, '200px')"> </td>
	</tr>
		<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 004488" >Locality Name (LN) : </td>
		<td align="left" width="" height="30"> <input type="text" class=text size="42" name="locName" onmouseover = "dropdownmenu(this, event, menu5, '200px')"> </td>
	</tr>
		<tr bgcolor="D2E8FF">
		<td align="right" ><font size="2" color=" 004488" >State Name (SN) : </td>
		<td align="left" width="" height="30"> <input type="text" class=text size="42" name="state" onmouseover = "dropdownmenu(this, event, menu6, '200px')"> </td>
	</tr>
		<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 004488" >Country (C) : </td>
		<td align="left" width="" height="30"> <input type="text" class=text size="42" name="country" onmouseover = "dropdownmenu(this, event, menu7, '200px')"> </td>
	</tr>
	
		<tr bgcolor="D2E8FF">
		<td align="right" ><font size="2" color=" 004488" >Email (E) * : </td>
		<td align="left" width="" height="30"> <input type="text" class=text size="42" name="email" onmouseover = "dropdownmenu(this, event, menu8, '200px')"> </td>
	</tr>
 	</table>
	<table>
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
				<td>&nbsp</td>
		
		<td> <input type="submit" value="Create"  style="font-size: 1.05em; padding: 0.05em;" onClick="return validate();" name="Create"></td>
		
		<td> &nbsp</td>
		<td> <html:reset value="Reset" style="font-size: 1.05em; padding: 0.05em;"></html:reset></td>
	</tr>
	</table>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	</html:form>
</body>
</html:html>