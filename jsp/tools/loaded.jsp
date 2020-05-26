<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@page import="com.qwest.cms.utils.*" %> 
<%@page import="java.util.ArrayList" %> 
<html>
<head>
<title>Tool_loadSuc</title>
</head>
<body>
<%System.out.println("hi inload Scu");%>
	<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%"  bgcolor="336699">
	<br><br>
	<tr>
		<td align="center" valign="top" ><b><font size="4" color="FFFFFF">Load Status</font><b/> 
		  
		</td> 
    </tr>
 	</table><br>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr></tr>

	
	<table align="center">
		<%if(((java.util.HashMap)session.getAttribute("map")).size()==1){%>
		    <tr>
		    <td><FONT size="3" color="123660"><b><%=((java.util.HashMap)session.getAttribute("map")).size()%></b><FONT></td>
		    <td><FONT size="3" color="123660"><b>Certificate is Added To Your Account</b></FONT></td>
		    </tr>
		<%}else{%>
		<tr>
		    <td><FONT size="3" color="123660"><b><%=((java.util.HashMap)session.getAttribute("map")).size()%></b><FONT></td>
		    <td><FONT size="3" color="123660"><b>Certificates Are Added To Your Account</b></FONT></td>
		    </tr>
		<%}%>
	</table><br>
<table><tr><td> &nbsp;
<a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=autoDisc"><b><u>Click here to Go Back</u></b></a>  </td></tr>   
</table>
</body>
</html>