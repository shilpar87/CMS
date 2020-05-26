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

</head>

<script language="Javascript">
               function postRequest(strURL,nameOfFormToPost){
               // strURL=strURL+getFormAsString(nameOfFormToPost);
                    var xmlHttp;
                    if(window.XMLHttpRequest){ // For Mozilla, Safari, ...
                         var xmlHttp = new XMLHttpRequest();
                    }
                    else if(window.ActiveXObject){ // For Internet Explorer
                         var xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
                    }
                    xmlHttp.open('POST', strURL, true);
                    xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                    xmlHttp.onreadystatechange = function(){
                         if (xmlHttp.readyState == 4){
                              updatepage(xmlHttp.responseText);
                         }
                    }
                   // alert(" uri == "+strURL);
                    xmlHttp.send(strURL);
               }
     function getFormAsString(formName){
 	
 	//Setup the return String
 	returnString ="";
 	
  	//Get the form values
 	formElements=document.forms[formName].elements;
 	
 	//loop through the array , building up the url
 	//in the form /strutsaction.do&name=value
 	
 	for ( var i=formElements.length-1; i>=0; --i ){
 		//we escape (encode) each value
 		returnString=returnString+"&"+escape(formElements[i].name)+"="+escape(formElements[i].value);
 	}
 	
 	//return the values
 	return returnString; 
 }
               
               function updatepage(str){
                              //  document.getElementById("result1").value=str;;
                               }
               
               function callMultiply(){
              // alert("inside ajax== " + document.getElementById("selectCert").value)
               
                  // var a = parseInt(document.f1.a.value);
                   
                    var url = "CMSAction.do?methodToCall=ajax&selectCert="+get_radio_value();
                    postRequest(url,'f1');                   
                    //reload();
                                      
               }
               
         


var certificateid = 0;
function get_radio_value()
{
if(document.forms[0].selectCert.length > 1)
{
for (var i=0; i < document.forms[0].selectCert.length; i++)
   {
   //alert(document.forms[0].selectCert.length)
   if (document.forms[0].selectCert[i].checked)
    //alert(document.forms[0].selectCert[i].checked)
      {
      var rad_val = document.forms[0].selectCert[i].value;
      //certificateid = rad_val;
       //alert("selected id:  "+rad_val)
       return rad_val;
      }
      
   }
   }
   else 
   {
   return document.forms[0].selectCert.value;
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
function status()
{

var res = checkRadio();
alert(res)
if(res==true)
{
  str="ksdkksdkdksdk";
 
  
  //document.getElementById("respage").innerHTML=str;;
  
  //document.getElementById("respage").innerHTML = "<jsp:include page='../status.jsp' flush='true' />";;
  //document.getElementById("respage").innerHTML=str;;
  alert("after innerHTML");
  
}

}
function reload(){
               window.location.reload();               
                      }
function fun(v)
{

if(document.forms[0].selectCert.length > 1)
{
for (var i=0; i < document.forms[0].selectCert.length; i++)
    { //alert(" in fun fun  "+document.forms[0].selectCert[i].value +" "+v);
    if (document.forms[0].selectCert[i].value==v){
   document.forms[0].selectCert[i].checked=true;
   //alert("hi == "+document.forms[0].selectCert[i].value)
   }
   }
   }
else {
 if (document.forms[0].selectCert.value==v){
   document.forms[0].selectCert.checked=true;
   //alert("hi == "+document.forms[0].selectCert[i].value)
   }
 }
}


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

function onchange1(){
    alert("onchange")
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


<%
String checkedRadioValue=(String)session.getAttribute("checkedRadioValue");
System.out.println(" in fi condition checkig == >"+checkedRadioValue);

if(checkedRadioValue!=null){
%>
<body onload="fun(<%=checkedRadioValue%>)">
<%}else{ %><body ><%} %>
<form name="f1" action="/CMSAction.do?methodToCall=certInAccount" enctype="multipart/form-data">
<div style="font-size:small;font-family:monospace;">
<% ArrayList al=new ArrayList();
String totlCert= session.getAttribute("totalCert").toString();
int totalCert = Integer.parseInt(totlCert);
System.out.println("inside homepage****&&&&--->" + totalCert);
String expDateStr = null;


if(session.getAttribute("accountList")!=null)
 {	
	al=(ArrayList)session.getAttribute("accountList");
 	//System.out.println("inside homepage--->");
 	//System.out.println("size is -->"+ al.size());
 	CMSBO cmsBO = new CMSBO();
 	for( int i=0;i<al.size();i++){
 		try{
 			
 			cmsBO=(CMSBO)al.get(i);
			expDateStr = cmsBO.getExpDate();
			Date expDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS").parse(expDateStr);
			//System.out.println("Expiry Date is " + expDate);
			
			Calendar expDateCal = Calendar.getInstance();
			expDateCal.setTime(expDate);
			Calendar todaysDate = Calendar.getInstance();
			//System.out.println("Today's Date is " + todaysDate.getTime());
			int daysBetween = 0;
			while (todaysDate.before(expDateCal)) {
				todaysDate.add(Calendar.DAY_OF_MONTH, 1);
				daysBetween++;
			}					
			
			//System.out.println("Number of Days = " + daysBetween);
			String days_diff =Integer.toString(daysBetween);
			
			cmsBO.setDaysDiff(days_diff);			
		}
			catch (ParseException e) {
				e.printStackTrace();	
			}
 	}
 	
 }
 
 if(totalCert==0)
 {
 %>
 	<table align="center"  width="85%" >
 	
		<tr bordercolor="CC0033">
		<td align="center" bgcolor="f1f1f1"><FONT size="4" color="123660">
		<b>There are currently no Certificates in your Account.  </b></FONT></td>
		</tr>
		<br>
		<br>
		<tr>
		<td align="left" bgcolor="FFFFEE" >
			<FONT size="2" color="333366">
			<br><b>To Load Certificates to your Account, follow these steps:</b>
			<br>
			<FONT size="2" color="333366">
			<br><b>[i]</b>&nbsp;&nbsp;&nbsp;  Search for the Application using the <a href="CMSAction.do?methodToCall=search"><b><b>Search</b></b></a> link.</Font>
			<br><b>[ii]</b>&nbsp;&nbsp;  Enter the Application NetPin and Name, if you are searching that Application for the first time.
			<br><b>[iii]</b>&nbsp;  Click on Next to get the Host Details for the Respective Application.
			<br><b>[iv]</b>&nbsp;   If Certificate Management System doesn't have any Information for the Chosen Server,  <br>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; then a mail will be triggered with the script as the attachment.
                       <!-- <br><b>[v]</b>&nbsp;&nbsp;   Please Follow the instructions provided in the mail to Load Certificate. -->
                        <br><b>[v]</b>&nbsp; Go to <a href="CMSToolAction.do?methodToCall=tool"><b><b>Tools Section </b></b></a> -  <b>'Load Certificate'</b> link to load Certificates into your Account 
			<!-- <br>[iii] In the <a href="CMSToolAction.do?methodToCall=tool"><b><b>Tools Section </b>></b></a>, click on <b><i>'Request to Search'</i></b> to request the AIP to get the Application Specific Certificates. -->
			<!-- <br>[iv] On receiving confirmation from the AIP, in the <a href="CMSToolAction.do?methodToCall=tool"><b><b>Tools Section </b></b></a> use the <b><i>'Load Certificate'</i></b> link to load Certificates into your Account -->
			</FONT>
		</td>
		</tr>		
	</table>
           
 <%
 
 }
 
else {
%>

<%if(session.getAttribute("dupData")!=null){%>
<table align="center" valign="top" >
  	<tr>
	<td align="center" valign="top" ><b><font size="3" color="123660"><%=(String)session.getAttribute("dupData")%></font> </b></td>
	</tr>
</table>
  <%session.removeAttribute("dupData");}%>


<%if(session.getAttribute("addAck")!=null){%>
<table align="center" valign="top" >
  	<tr>
	<td align="center" valign="top" ><b><font size="3" color="123660"><%=(String)session.getAttribute("addAck")%></font> </b></td>
	</tr>
</table>
  <%session.removeAttribute("addAck");}%>
  
<br>

<table width="850" border="0" cellspacing="1" cellpadding="3" bgcolor="FFFFFF" style="border-top: 10px; border-top-color: 000000" bordercolor="26466D">
<tr bgcolor="#D6E1EE" ><th width="3%"></th><th width="20%"><font color="123660">Certificate Name</font></th><th width="17%"><font color="123660">Application Name</font></th><th width="11%"><font color="123660">Acronym</font></th><th width="14%"><font color="123660">Nick 
Name</font></th><th width="9%"><font color="123660">Type</font></th><th width="10%"><font color="123660">Expiry Date</font></th>
<th width="25%"><font color="123660">	Status</font><br>
<a href = 'CMSAction.do?methodToCall=statusFilter&status=ACTIVE' onmouseover = "dropdownmenu(this, event, menu1, '200px')"><font color="red" size="0.01px"><u><b>AC</b></u></font></a>
<a href = 'CMSAction.do?methodToCall=statusFilter&status=Renew' onmouseover = "dropdownmenu(this, event, menu2, '100px')"><font color="red" size="0.01px"><u><b>RE</b></u></font></a>
<a href = 'CMSAction.do?methodToCall=statusFilter&status=INACTIVE' onmouseover = "dropdownmenu(this, event, menu3, '100px')"><font color="red" size="0.01px"><u><b>IA</b></u></font></a>
<a href = 'CMSAction.do?methodToCall=statusFilter&status=EXPIRED' onmouseover = "dropdownmenu(this, event, menu4, '100px')"><font color="red" size="0.01px"><u><b>EX</b></u></font></a>
<a href = 'CMSAction.do?methodToCall=statusFilter&status=ALL' onmouseover = "dropdownmenu(this, event, menu5, '100px')"><font color="red" size="0.01px"><u><b>AL</b></u></font></a>
</br>

</th></tr>
</table>

<%
}
%>
</div>
<div style="overflow-y: scroll; width:850px; height:180px; table-layout:fixed;">

<table style="table-layout: fixed;" width="850" border="0" cellspacing="1" cellpadding="0" bgcolor="FFFFFF">
<logic:iterate id="accountList"  name="accountList">
<tr bgcolor="f1f1f1">
<bean:define id="dd" name="accountList" property="daysDiff" type="java.lang.String" />
<%
int noDays = Integer.parseInt(dd);
if (noDays <= 30)
{%>

<td style="width:3%" align="center" align="center" > 
		   
		   <input type="radio" id="serialId" name="selectCert" value="<bean:write name="accountList" property="serialNo"/>" onclick="callMultiply()"  />
		   
		    </td> 
		    <td style="width: 20%"  align="center">
	          	<font face="Verdana" size="1" color="CC0044">
				<bean:write name="accountList" property="raw_certificate"/>		</b>          
		         </font>
		       </td>
 	<td style="width:17%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
				<bean:write name="accountList" property="appName"/>	          
		         </font>
		       </td>
    <td style="width:11%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
				<bean:write name="accountList" property="acronym"/>		          
		         </font>
		       </td>
		    
		    <td style="width:14%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
				<bean:write name="accountList" property="nickName"/>		          
		         </font>
		       </td>
         	 <td style="width:9%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
				<bean:write name="accountList" property="type"/>		          
		         </font>
		       </td>         		       
		       <td style="width:10%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
				<bean:write name="accountList" property="expDate"/>		          
		         </font>
		       </td>
		       
	         	       		       
	         <td style="width:50%" align="center" color="CC0044">
	          <bean:define id="res" name="accountList" property="status" type="java.lang.String" />

	          
	          <%
	           if(res.equalsIgnoreCase("active"))
	           {
	           %> <font color="green" face="Verdana" size="1">
	           	<b><bean:write name="accountList" property="status"/>	</b>	          
		       </font>
		        <% } 
	           else if(res.equalsIgnoreCase("expired")) {
		        %>
		        	<font color="CC0044" face="Verdana" size="1">
					<b><bean:write name="accountList" property="status"/></b>		          
		         </font>
		        <% } 
	           else if(res.equalsIgnoreCase("inactive")) {
		        %>
		        <font color="#00FFFF" face="Verdana" size="1">
					<b><bean:write name="accountList" property="status"/></b>		          
		         </font>
		        <% } 
	           else  {
		        %>
		         <font color="blue" face="Verdana" size="1">
					<b><bean:write name="accountList" property="status"/></b>		          
		         </font>
		        <% } %>
	           
		        
		         </td>
		         <% } 
	else {
	%>
	<td style="width:3%" align="center" > 
		   
		   <input type="radio" id="serialId" name="selectCert" value="<bean:write name="accountList" property="serialNo"/>" onclick="callMultiply()"  />
		    </td> 
		    <td style="width: 20%" align="center">
	          	<font face="Verdana" size="1">
			<bean:write name="accountList" property="raw_certificate"/>         
		         </font>
		       </td>
		       
 <td style="width:17%" align="center">
	          	<font face="Verdana" size="1" >	          	
				<bean:write name="accountList" property="appName"/>							          
		         </font>
		       </td>
    <td style="width:11%" align="center">
	          	<font face="Verdana" size="1" >	          	
	          		<bean:write name="accountList" property="acronym"/>
							          
		         </font>
		       </td>
		    
		    <td style="width:14%" align="center">
	          	<font face="Verdana" size="1" >	          	
				<bean:write name="accountList" property="nickName"/>
							          
		         </font>
		       </td>   	         	 
		       
		       
	          <td style="width:9%" align="center">
	          	<font face="Verdana" size="1" >	          	
				<bean:write name="accountList" property="type"/>
							          
		         </font>
		       </td>	
		       <td style="width:10%" align="center">
	          	<font face="Verdana" size="1" >	          	
				<bean:write name="accountList" property="expDate"/>
							          
		         </font>
		       </td>       		       
	         <td style="width:20%" align="center">
	          <bean:define id="res2" name="accountList" property="status" type="java.lang.String" />
			  
	          
	          <%
	           if(res2.equalsIgnoreCase("active"))
	           {
	           %>
	           
	           
	          	<font color="green" face="Verdana" size="1">	          	
				<b><bean:write name="accountList" property="status"/></b>	
						          
		         </font>
		        <% } 
	           else if(res2.equalsIgnoreCase("expired")) {
		        %>
		        	<font color="CC0044" face="Verdana" size="1">		        	
					<b><bean:write name="accountList" property="status"/></b>
							          
		         </font>
		        <% } 
	           else if(res2.equalsIgnoreCase("inactive")) {
		        %>
		        <font color="#00FFFF" face="Verdana" size="1">		        
					<b><bean:write name="accountList" property="status"/></b>
							          
		         </font>
		        <% } 
	           else  {
		        %>
		         <font color="blue" face="Verdana" size="1">		         
					<b><bean:write name="accountList" property="status"/></b>
							          
		         </font>
		        <% } %>
		         </td>
		 
	  <% } %>  
</tr>

</logic:iterate>


</table>

</div>




<%
//System.out.println("size is ***** -->"+ al.size());
if(al.size()!= 0)
{
//System.out.println("size is not zero...");
%>



<div style="width:850px; height:10px;" >
<table width="850" border = "1" cellspacing="0" cellpadding="7" >
<tr bgcolor="D6E1EE" style = "font-family: Verdana;color:#123660;"     >

  <%if((session.getAttribute("pageToCall")!=null)){
    	String pageName=(String)session.getAttribute("pageToCall");
	if(pageName.equals("status"))
			{%>
<td id="status" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<!-- <td id="addCertsToMyAccount" align="center" width="100" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=addCertsToMyAccount"><b>Add Certificate To My Account</b></a></td> -->
<%}else if(pageName.equals("details"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<!-- <td id="addCertsToMyAccount" align="center" width="100" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=addCertsToMyAccount"><b>Add Certificate To My Account</b></a></td> -->
<%}else if(pageName.equals("summary"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<!-- <td id="addCertsToMyAccount" align="center" width="100" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=addCertsToMyAccount"><b>Add Certificate To My Account</b></a></td> -->
<%}else if(pageName.equals("functions"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<!-- <td id="addCertsToMyAccount" align="center" width="100" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=addCertsToMyAccount"><b>Add Certificate To My Account</b></a></td> -->
<%}else	if(pageName.equals("history"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<!-- <td id="addCertsToMyAccount" align="center" width="100" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=addCertsToMyAccount"><b>Add Certificate To My Account</b></a></td> -->
<%}else if(pageName.equals("addCertsToMyAccount"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<!-- <td id="addCertsToMyAccount" align="center" width="100" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=addCertsToMyAccount"><b>Add Certificate To My Account</b></a></td> -->
<%}else if(pageName.equals("notes"))
			{%>
    <td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
    <td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
    <td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
    <td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
    <td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
    <td id="notes" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
 <!--   <td id="addCertsToMyAccount" align="center" width="100" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=addCertsToMyAccount"><b>Add Certificate To My Account</b></a></td> -->

<%}}else{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b><font color = "123660">Status</font></b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b><font color = "123660">Details</font></b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b><font color = "123660">Summary</font></b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b><font color = "123660">Functions</font></b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b><font color = "123660">History</font></b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b><font color = "123660">Notes</font></b></a></td>
<!-- <td id="addCertsToMyAccount" align="center" width="100" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=addCertsToMyAccount"><b><font color = "123660">Add Certificate To My Account</font></b></a></td> -->
<%}%>
</tr>
</table>
</div>

</form>
<div style="width:850px; height:130px;overflow:scroll" >
<table width="850" cellspacing="2" cellpadding="7">
<tr>
<%if(session.getAttribute("pageToCall")!=null){
		String pageName=(String)session.getAttribute("pageToCall");
		if(pageName.equals("status"))
			{%>
				<td>
				<jsp:include page ="/jsp/common/status.jsp"/>
				</td>
			<%}
		else if(pageName.equals("details"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/detail.jsp"/>
				</td>	
			<%}
		else if(pageName.equals("summary"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/summary.jsp"/>
				</td>
			<%}
			else if(pageName.equals("history"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/History.jsp"/>
				</td>
			<%}
			else if(pageName.equals("notes"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/Notes.jsp"/>
				</td>
			<%}
			else if(pageName.equals("history"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/History.jsp"/>
				</td>
			<%}
			else if(pageName.equals("functions"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/funtions.jsp"/>
				</td>
			<%}
			else if(pageName.equals("addCertsToMyAccount"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/addCertsToMyAccount.jsp"/>
				</td>
			<%}
	}%>
</tr>
</table>
</div>
<%
}
%>





</body>

</html>
