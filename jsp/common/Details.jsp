<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<html>


<%
String serialNo = session.getAttribute("checkedRadioValue").toString();

%>
<body>
<br>Inside Details page...
<br>cert sequence no. selected: <font> color="blue" <b><%=serialNo%></b></font>

</body>


</html>

