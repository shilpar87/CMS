
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >
function validate(){
//alert(document.forms[0].appName.value);
document.forms[0].appName.value;
document.forms[0].netPin.value;
document.forms[0].acroNym.value;
document.forms[0].hostID.value;
document.forms[0].certNickName.value;
document.forms[0].notes.value;
//document.forms[0].certPathServer.value;


if(document.forms[0].appName.value==""){
    alert("Please Select Application Name.");
    return false;
}
if(document.forms[0].netPin.value==""){
    alert("Please Enter NetPin");
    return false;
}

if(document.forms[0].hostID.value==""){
    alert("Please Enter HostID");
    return false;
}

if(document.forms[0].certNickName.value==""){
    alert("Please Enter Certificate NickName");
    return false;
}

if(document.forms[0].notes.value==""){
    alert("Please Enter Notes");
    return false;
}

/*if(document.forms[0].certPathServer.value==""){
    alert("Please Enter Certificate Path Server");
    return false;
}*/

document.forms[0].action = "CMSToolAction.do?methodToCall=addCertToHome";	  	
document.forms[0].submit();
return true;

}

function getAcroNym(){
//  alert(document.forms[0].appName.value);
	document.forms[0].appName.value;
	document.forms[0].action="CMSToolAction.do?methodToCall=getAcroNym";
	document.forms[0].submit();
	return true;
}

function reset(){
    //alert("inside reset... ");
    document.forms[0].appName.value="";
    document.forms[0].netPin.value="";
    document.forms[0].acroNym.value="";
    document.forms[0].hostID.value="";
    document.forms[0].certNickName.value="";
    document.forms[0].notes.value="";
    document.forms[0].certPathServer.value="";
}

</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create CSR</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>

	<html:form action="/CMSToolAction.do?methodToCall=addCertToHome"> 
	<table border="0" align="center" cellpadding="2" cellspacing="0" width="30%" bgcolor="336699" >
	<tr>
		<td align="center" valign="top" ><b><font size="3" color="FFFFFF"> Add Certificate To My Account </font></b></td> 
	</tr>
 	</table><br>
 	
 	
	<div style="width:700px; height:9px" >
	<table  width ="96%" cellspacing="1" cellpadding="1" border="0">

	
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color="004488">Application Name :  </font>
		<td><html:select name="CMSToolForm" property="appName" size="1" style="font-size: 0.80em;" onchange="getAcroNym()" >
		<html:option value="">   ----- Select -----</html:option>
		<html:options collection="appList" name="CMSToolForm" property="appName" ></html:options>
		</td></tr></tr>
		</html:select>
	</tr>
	
	<tr bgcolor="DFECFF">
	<td align="right" ><font size="2" color="004488">Acronym :   </td>
		<td align="left" width="" height="30">
		<%if(session.getAttribute("acroName")!=null){%>
		<input type="text" readonly="true" class="text" size="42" name="acroNym" wrap="off" value="<%=(String)session.getAttribute("acroName")%>" /></td>
		<%}else{%>
		<input type="text" readonly="true" class="text" size="42" name="acroNym" wrap="off"/></td>
		<%}%>
	</tr>
	
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 004488" > NetPin :</td>
		<td align="left" width="" height="30"> 
		<input type="text" class="text" size="42" wrap="off"  name="netPin" > </td>
	</tr>
	
	<tr bgcolor="DFECFF">
	<td align="right" ><font size="2" color=" 004488" >HostID :</td>
	<td align="left" width="" height="30">
	<input type="text" class="text" size="42" wrap="off"  name="hostID" > </td>
	</tr>
	
	<%if(session.getAttribute("noFile")!=null){%>	
	<tr bgcolor="DFECFF">
	<td align="right" ><font size="2" color=" 004488" >fileName :</td>
	<td align="left" width="" height="30">
	<input type="text" class="text" size="42" wrap="off"  name="fileName" > </td>
	</tr>
	<%}%>
		
		
	<tr bgcolor="DFECFF">
	<td align="right" ><font size="2" color=" 004488" > NickName : </td>
	<td align="left" width="" height="30">
	<input type="text" class="text" size="42" wrap="off"  name="certNickName" > </td>
	</tr>
		
	<tr bgcolor="DFECFF">
	<td align="right" ><font size="2" color=" 004488" >Notes :</td>
	<td align="left" width="" height="30">
	<input type="text" class="text" size="42" wrap="off"  name="notes" > </td>
	</tr>
	
	<!-- <tr bgcolor="DFECFF">
	<td align="right" ><font size="2" color=" 004488" >Certificate PathServer : </td>
	<td align="left" width="" height="30"> 
	<input type="text" class="text" size="42" wrap="off"  name="certPathServer" > </td>
	</tr> -->
	
	
 	</table>
 	</html:form>
 	
	<table>
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
				<td>&nbsp</td>
		
		<td> <input type="submit" value="Add"  style="font-size: 1.05em; padding: 0.05em;" name="Add" value ="Submit" onclick='validate()'></td>
		<td> &nbsp</td>
		<td> <html:reset value="Reset" style="font-size: 1.05em; padding: 0.05em;" onclick='reset()'></html:reset></td>
	</tr>
	</table>
	
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	
</body>
</html:html>