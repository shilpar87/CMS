<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script>
function submit1(){
	
	document.forms[0].action="<%=request.getContextPath()%>/CMSAction.do?methodToCall=search";		
	document.forms[0].submit();	
}

</script>
<html:html>
	
	<html:form action="CMSAction.do?methodToCall=searchResult">
	<head>
	</head>
	<body>
	<%System.out.println("in searchError jsp"); %>
	<table align="center">
	<tr><td>&nbsp</td></tr>
	<tr><td><FONT size="4" color="123660"><b><html:errors/></b></FONT></td></tr>
	<tr><td>&nbsp</td></tr>
	<tr><td align="center"><input type="button"  value="Back to Search" style="font-size: 1.05em; padding: 0.03em;" name="BackToSearch" onclick="return submit1();"/></td></tr>
	
	</table>
	</body>
	</html:form>
</html:html>