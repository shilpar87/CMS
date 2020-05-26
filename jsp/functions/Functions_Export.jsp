<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.*,java.io.*"%>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >
function cancel(){
	document.functionForm.close();
}
function event(){
	document.functionForm.close();
}
</script>
<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tools Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />
</head>
<body>
<html:form action="/CMSFunctionAction.do?methodToCall=doDownload">
<font align=center><b><u>Certificate Export page<BR><BR></font></b></u>
In the form:<BR><BR>
<html:radio name="CMSFunctionForm" property="selectCertType" value="binary"/>DER encoded binary X.509(.cer)
<BR><BR>
<html:radio name="CMSFunctionForm" property="selectCertType"  value="Base-64"/>Base-64 encoded X.509(.cer)
<BR><BR>
<html:radio name="CMSFunctionForm" property="selectCertType"  value="Cryptographic"/>Cryptographic Message Syntax Standard-PKCS # 7 Certificates(.P7B) 
  
<BR>

<table>

<div>
<tr>
<td>

<html:submit value="save"/>  
<font size="12" align="center"><html:cancel value="Cancel" />
</td>
</tr>
</table>
</html:form>
</p>
</body>
</html:html>