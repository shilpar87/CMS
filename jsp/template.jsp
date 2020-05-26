<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>
<%@ taglib uri="/WEB-INF/app.tld" prefix="app" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment Approval Form</title>
</head>
<body>
<table border="0" cellpadding="0" cellspacing="0" width="100%" bgcolor="#FFFFFF">
	<tr>
		<td width="100%" colspan="2" valign="top"><tiles:insert attribute="header"/></td>
	</tr>
	<tr>
		<td width="7%" align="left" valign="top"><tiles:insert attribute="menu"/></td>
		<td width="93%" align="center" valign="top"><tiles:insert attribute="body"/></td>
	</tr>
	<tr>
		<td width="100%" colspan="2" valign="top"><tiles:insert attribute="bottom"/></td>
	</tr>
</table>
</body>
</html>