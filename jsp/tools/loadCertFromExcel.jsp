
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.*" %> 
    <%@page import="com.qwest.cms.utils.*" %> 
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >
function setDefaultTotxt(tempVar){
	if(tempVar == "file"){
		document.getElementById("Crtfile").disabled = false;
		document.getElementById("crttest").disabled = true;
	}
	else{
		document.getElementById("Crtfile").disabled = true;
		document.getElementById("crttest").disabled = false;
	}

}

function submit(){
    alert("sdhfgfws");
    alert(document.forms[0].path.value);
}

</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> New CSR From Cirtificate </title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>


<html:form  action="/CMSToolAction.do?methodToCall=loadFromExcel" enctype="multipart/form-data"> 
<table border="0" align="center" cellpadding="1" cellspacing="0" width="60%" bgcolor="336699" bordercolor="#000000">
	<tr><td align="center" valign="top" ><b><font size="3" color="FFFFFF"> LOAD CERTIFICATE </font> </b></td> 
	</tr>
</table><br><br>
 	
 <table>
	<tr>
	<td align="center"><font size="2" color=" 336699" >Load Certificates from Excel :</td>	
	<td align="left" width="" height="30" > 
	<html:file property="xlFile" size="40" onclick="setDefaultTotxt('file')"/>
	</td>
	
	</tr>		
</table>

	
	<table>
	<tr>
	<td>&nbsp</td>
	<td>&nbsp</td>
			<td>&nbsp</td>
	
	 <td> <html:submit value="Submit" style="font-size: 1.05em; padding: 0.05em;"></html:submit></td>
	
	 <!-- <td align="center"><input type="button"  value="Back to Home" style="font-size: 1.05em; padding: 0.03em;" name="BackToHome" onclick="return submit();"/></td> -->
	<td> &nbsp</td>
	<td> <html:reset value="Reset" style="font-size: 1.05em; padding: 0.05em;"></html:reset></td>
	</tr>
	</table>

	<br>
	<table width="70%">
		<center><font size="1" color=" 00638B" ><b>Note:</b>  Please ensure that you provide a valid comma separated value(CSV) file.</font></center>
 	
	</table>
	
</html:form>	
 	


 </body>
 </html:html>