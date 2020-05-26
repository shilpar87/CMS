
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.*" %> 
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >


</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> KeyPair Generate </title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>
<html:form action="/CMSToolAction.do?methodToCall=genKeypair"> 
<table border="0" align="center" cellpadding="0" cellspacing="0" width="30%"  bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><b><u><font size="3" color="336699"> Generate KeyPair </font></u> </b></td> 
    </tr>
 	</table><br>
 	<div style="width:700px; height:9px" >
	<table  width ="60%" cellspacing="1" cellpadding="1" border="0">

	<tr bgcolor="C8DFFF" width ="500px">  
		<td align="right"><font size="2" color=" 00638B" >Key Nick Name :</td>	
		<td align="left" width="" height="30"> 
			<input type="text" name="keyName" />
		</td>
	</tr>
	<tr bgcolor="C8DFFF" width ="500px">  
		<td align="right"><font size="2" color=" 00638B" >Key Algorithm :</td>	
		<td align="left" width="" height="30">  
		<select name="keyAlg" size="1" style="font-size: 1.05em;">
			<option value="select_validity" selected>Select...</option>
			<option value="RSA">RSA</option>
			<option value="DSA">DSA</option>
			</select>
		</td>
	</tr>	
	<tr bgcolor="C8DFFF" width ="500px">  
		<td align="right"><font size="2" color=" 00638B" >Size :</td>	
		<td align="left" width="" height="30"> 
		<select name="keySize" size="1" style="font-size: 1.05em;">
			<option value="select_validity" selected>Select...</option>
			<option value="1024">1024</option>
			<option value="2048">2048</option>
			</select>		
		</td>
	</tr>
 	</table>
	<table>
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
				<td>&nbsp</td>
		
		<td> <html:submit value="Create" style="font-size: 1.05em; padding: 0.05em;"></html:submit></td>
		
		<td> &nbsp</td>
		<td> <html:reset value="Reset" style="font-size: 1.05em; padding: 0.05em;"></html:reset></td>
	</tr>
	</table>
 	
</html:form> 	

<%ArrayList info=new ArrayList();
 if(session.getAttribute("info")!=null)
 {info=(ArrayList)session.getAttribute("info");
 if(info.size()>0){ %>
 <%=(String)(info.get(0).toString())%>
 <%}info.clear();}
  %>
</body>
</html:html>