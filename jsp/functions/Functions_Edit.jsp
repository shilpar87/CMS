<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Renewal of Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>
	<html:form action="/CMSFunctionAction.do?methodToCall=editCert">
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%" bgcolor="336699" bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Edit Details </font></u> 
		  <!--<tiles:insert	attribute="menu" />-->
		</td> 
    </tr>
 	</table> 
 	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<table>
	<tr bgcolor="C8DFFF" width ="500px">  
		<td align="right"><font size="2" color=" 00638B" ><b>Certificate Name </td>	
		<td align="left" width="" height="30"> <input type="text" size="60"  name="certificateName" > </td>
	</tr>
	<tr bgcolor="C8DFFF" width ="500px">  
		<td align="right"><font size="2" color=" 00638B" ><b>Current Users </td>	
		<td align="left" width="" height="30"> <input type="text" size="60"  name="certStatus" > </td>
	</tr>
	
	</table>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>

	<tr>
		<td>&nbsp</td>
		<td> <html:submit value="Submit" style="font-size: 1.05em; padding: 0.05em;"> <font size="12"></font></html:submit></td>
		
		<td> &nbsp</td>
		<td> <html:cancel value="Cancel" style="font-size: 1.05em; padding: 0.05em;"></html:cancel></td>
	</tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	</html:form>
</html:html>