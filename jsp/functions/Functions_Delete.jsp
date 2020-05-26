<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page language="java"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Renewal of Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>
<html:form action="/CMSFunctionAction.do?methodToCall=deleteCertificate">
<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%" bgcolor="336699" bordercolor="#000000">
<tr>
<td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Delete Certificate </font></u> 
</td> 
</tr>

</table>
<br>
<table>
<tr>
<td><font size="2" align ="center"/>Click on Delete Button if you want to delete the Certificate, else click on Cancel to go back to main page
</tr> 
</table>
<br>
<br>
<br>
<br>
<div align="center">
<table>
<div>
<tr>
<td>

<font size="3" align="center"/><html:submit value="Delete" onclick="alert('Hi');" /> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<font size="3" align="center"/><input type="button" value="Cancel" onClick="showAlert()">
</td>
</tr>
</table>
</div>
</html:form>
</body>
<script language="JavaScript" type="text/JavaScript">
function showAlert(){	   
			document.forms[0].action ="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=deleteCertificate";
			document.forms[0].submit();	
			return true;  			
}

</script>
</html:html>