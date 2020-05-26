
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
}else if(document.getElementById('cert_validity').value=='null'){
alert(" Please select Validity  ");
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

function check(){
if (document.getElementById('key').checked) {
document.getElementById('pubKey').disabled=false;
document.getElementById('priKey').disabled=false;
}else{
document.getElementById('pubKey').disabled=true;
document.getElementById('priKey').disabled=true;
}
}

</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body >
	<html:form action="/CMSToolAction.do?methodToCall=creatSSCrt"> 
	<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%"  bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><b><font size="3" color="004488"> CREATE NEW CERTIFICATE </font></b></td> 
    </tr>
 	</table><br>
	<div style="width:700px; height:9px" >
	<table  width ="70%" cellspacing="1" cellpadding="1" border="0">
  <% com.qwest.cms.utils.ParseX509Certificate parsedCrt=(com.qwest.cms.utils.ParseX509Certificate) session.getAttribute("parsedCrt");%>
	<tr bgcolor="DFECFF" >  
		<td align="right"><font size="2" color=" 004488" >Signature Algorithm * :</td>	
		<td align="left" width="" height="30"> 
			<select name="sigAlgorithm" size="1" style="font-size: 1.05em;">
			<option value="null" selected>Select...</option>
			<option value="RSA">RSA</option>
			<option value="DSA">DSA</option>
			
			</select> 
		</td>
	</tr>	
	<tr bgcolor="D2E8FF" >  
		<td align="right"><font size="2" color=" 004488" >Validity (days) * :</td>	
		<td align="left" width="" height="30"> 
			<select name="cert_validity" size="1" style="font-size: 1.05em;">
			<option value="null" selected>Select...</option>
			<option value="365">365</option>
			<option value="730">730</option>
			</select> 
		</td>
	</tr>
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 004488" >Common Name (CN) : </td>
		<td align="left" width="" height="30"> <input type="text" size="42"  name="comName" value="<%=parsedCrt.getSubjectCN()%>"> </td>
	</tr>
	<tr bgcolor="D2E8FF">
		<td align="right" ><font size="2" color=" 004488" >Organizational Unit (OU) : </td>
		<td align="left" width="" height="30"> <input type="text" size="42" wrap="off"  name="orgUnit" value="<%=parsedCrt.getSubjectOU()%>"> </td>
	</tr>
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 004488" >Organizational Name (ON) : </td>
		<td align="left" width="" height="30"> <input type="text" size="42" name="orgName" value="<%=parsedCrt.getSubjectO()%>"> </td>
	</tr>
		<tr bgcolor="D2E8FF">
		<td align="right" ><font size="2" color=" 004488" >Locality Name (LN) : </td>
		<td align="left" width="" height="30"> <input type="text" size="42" name="locName" value="<%=parsedCrt.getSubjectL()%>"> </td>
	</tr>
		<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 004488" >State Name (SN) : </td>
		<td align="left" width="" height="30"> <input type="text" size="42" name="state" value="<%=parsedCrt.getSubjectST()%>"> </td>
	</tr>
		<tr bgcolor="D2E8FF">
		<td align="right" ><font size="2" color=" 004488" >Country (C) : </td>
		<td align="left" width="" height="30"> <input type="text" size="42" name="country" value="<%=parsedCrt.getSubjectC()%>"> </td>
	</tr>
	
		<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 004488" >Email (E) : </td>
		<td align="left" width="" height="30"> <input type="text" size="42" name="email" value="<%=parsedCrt.getSubjectEmail()%>"> </td>
	</tr>
	
 	</table>
	<table>
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
				<td>&nbsp</td>
		
		<td> 
		<input type="submit" value="Create"  style="font-size: 1.05em; padding: 0.05em;" onClick="return validate();" name="Create"></td>
		<td> &nbsp</td>
		<td> <html:reset value="Reset" style="font-size: 1.05em; padding: 0.05em;"></html:reset></td>
	</tr>
	</table>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	</html:form>
</body>
</html:html>