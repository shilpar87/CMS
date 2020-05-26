<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/WEB-INF/struts-tiles.tld" prefix="tiles" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<tiles:insert attribute="styles" />
<title>Certificate Management System </title>
</head>
<body>
<center>
<div style="width:850px; height:10px" >
<table  border="0" cellpadding="0" cellspacing="0" height="2%" width="100%" bordercolor="#000000" >
<tr><td></td><td  align="left" valign="top"><tiles:insert	attribute="header" />
    </td>
	</tr>
</table>

</div>
<div style="width:850px; height:70px; >
<table border="0" cellpadding="0" cellspacing="0" width="100%" bordercolor="#000000">
	<tr>
		<td align="left" valign="top" class="rightLinesOnly" id="menu">
		  <tiles:insert	attribute="menu" />
    	</td> 
    </tr>
 </table>
</div>

<div style="width:850px; height:365px;" >
<table border="0" cellpadding="0" cellspacing="0" width="100%" bordercolor="#5b89bd">
    	<tr>
     <td width="7%" align="left" valign="top"><tiles:insert attribute="tool_menu"/></td>
		<td width="93%" align="center" valign="top"><tiles:insert attribute="body"/></td>
	</tr>
</table>
</div>
<div style="width:850px; height:20px;  >
<table  frame="below" border="0" cellpadding="0" cellspacing="0" height="10%"	width="100%" bordercolor="#000000">
	<tr >
		<td align="left" valign="top">
		  <tiles:insert	attribute="footer" />
    </td>
	</tr>
	
</table>
</div>
</center>
</body>
</html>