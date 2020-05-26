<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.*" %> 
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >

function saveDetails(){	
	if ( validate()){
		//alert("val is true so continue........");
		
			document.forms[0].action="CMSToolAction.do?methodToCall=loadEditSave";
			document.forms[0].submit();
		window.opener = self; 
		window.close(); 

		
	}
	else
		return false;
}

function validate() {
	//alert("in val......");
	if(document.forms[0].appName.value==""){	
		alert("Please choose the Application");
		return false;
	}
	else if(document.forms[0].certNickName.value==""){
		alert("Please enter a Nick Name for the Certificate");
		return false;
	}
	else if(document.forms[0].hostID.value==""){
		alert("Please enter the Host ID");
		return false;
	}
	else if(document.forms[0].hostIP.value==""){
		alert("Please enter the Host IP");
		return false;
	}
	else if(document.forms[0].certType.value==""){
		alert("Please choose the Cert Type.");
		return false;
	}
	else 
		return verifyIP();
}
///ipvalidation 
function verifyIP(valhip,num) {

IPvalue=document.forms[0].hostIP.value;
errorString = "";
theName = "Host IPaddress";

var ipPattern = /^(\d{1,3})\.(\d{1,3})\.(\d{1,3})\.(\d{1,3})$/;
var ipArray = IPvalue.match(ipPattern);

if (IPvalue == "0.0.0.0")
errorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used ';
else if (IPvalue == "255.255.255.255")
errorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used ';
if (ipArray == null)
errorString = errorString + theName + ': '+IPvalue+' is not a valid IP address ';
else {
for (i = 0; i < 4; i++) {
thisSegment = ipArray[i];
if (thisSegment > 255) {
errorString = errorString + theName + ': '+IPvalue+' is not a valid IP address ';
i = 4;
}
if ((i == 0) && (thisSegment > 255)) {
errorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used ';
i = 4;
      }
   }
}
extensionLength = 3;
if (errorString == ""){
//alert ("That is a valid IP address.");
return true;
}
else{
alert (errorString);
//document.crtList.dummy.value='stop';
return false;
}

}
</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Edit Certificate Details </title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>
<html:form action="/CMSToolAction.do?methodToCall=loadEditSave">  
<br>
	<table border="0" align="center" cellpadding="0" cellspacing="0" width="45%"  bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><b><font size="3" color="336699"><I> Certificate Information </I> </font></b></td> 
    </tr>
	</table> 
	<br><br>
	
	<table align="center" width="40%" >
     <%System.out.println("check value "+request.getParameter("count"));%>
	
	<tr bgcolor="DFECFF" >  
		<td align="left"><font size="2" color=" 336699" >Certficate Name :</td>	
		<td align="left" width="" height="30"> 
			<html:text name="CMSToolForm" property="certName" />
		</td>
	</tr>
	<tr bgcolor="DFECFF" >  
		<td align="left"><font size="2" color=" 336699" >Application Name :</td>	
		<td align="left" width="" height="30">  
		<html:select name="CMSToolForm" property="appName"  size="1" style="font-size: 1.05em;"  style="WIDTH: 375px; HEIGHT: 22px" >
			<html:option value="">Select...</html:option>
			<%if(session.getAttribute("tool_appList")!=null){
			  ArrayList appList=(ArrayList)session.getAttribute("tool_appList");
			  if(appList.size()>0){
			  for(int i=0;i<appList.size();i++){
			  com.qwest.cms.BO.CMSBO bo=(com.qwest.cms.BO.CMSBO)appList.get(i);
			  String appName=bo.getAppName();
			%><html:option value="<%=appName%>"><%=appName%></html:option>
			<%}}}%>
			</html:select>
		</td>
	</tr>	
	<tr bgcolor="DFECFF" >  
		<td align="left"><font size="2" color=" 336699" >Certficate Nick Name :</td>	
		<td align="left" width="" height="30"> 
			<html:text name="CMSToolForm" property="certNickName" />
		</td>
	</tr>
	<tr bgcolor="DFECFF" >  
		<td align="left"><font size="2" color=" 336699" >Host Id :</td>	
		<td align="left" width="" height="30"> 
			<html:text name="CMSToolForm" property="hostID" />
		</td>
	</tr>
	<tr bgcolor="DFECFF" >  
		<td align="left"><font size="2" color=" 336699" >Host IP :</td>	
		<td align="left" width="" height="30"> 
			<html:text name="CMSToolForm" property="hostIP" />
		</td>
	</tr>
	<tr bgcolor="DFECFF" >  
		<td align="left"><font size="2" color=" 336699" >Cert Type :</td>	
		<td align="left" width="" height="30"> 
		<html:select name="CMSToolForm" property="certType" size="1" >
			<html:option value="">Select...</html:option>
			<html:option value="Internal">Internal</html:option>
			<html:option value="External">External</html:option>
		</html:select>
		</td>
	</tr>
	
	<tr bgcolor="DFECFF">  
		<td align="left"><font size="2" color=" 336699" >Notes (optional):</td>	
		<td align="left" width="" height="30"> 
			<html:textarea property="loadNotes" name="CMSToolForm" cols="40" rows="3"></html:textarea>
		</td>
	</tr>
 	</table>	
	<table align="center">
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
				<td>&nbsp</td>
		
		<td> <input type="button"  value="Save" style="font-size: 1.02em; padding: 0.02em;" onclick="saveDetails()"/></td>
		
		<td> &nbsp</td>
		<td> <html:reset value="Reset" style="font-size: 1.02em; padding: 0.02em;"></html:reset></td>
	</tr>
	</table>
	<br>
	
</html:form> 	


</body>
</html:html>
