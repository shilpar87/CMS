<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script>
function submit1(){
	
	document.forms[0].action="<%=request.getContextPath()%>/Logout.do";		
	document.forms[0].submit();	
}

</script>
<html:html>
	
	<html:form action="/Logout.do">
	<head>
	</head>
	<body>
	<table align="center" width="70%">
	<tr><tr><tr><tr><tr>
	<br><br>
	<tr align="center"><td><FONT size="3" color="123660">
	<b><html:errors/></b></FONT></td></tr>
	<%System.out.println("Session is Expired ........"); %>
	<tr><tr><td align="center"><input type="button"  value="Login Again" style="font-size: 1.05em; padding: 0.03em;" name="BackToHome" onclick="return submit1();"/></td></tr>
	</table>
	</body>
	</html:form>
</html:html>