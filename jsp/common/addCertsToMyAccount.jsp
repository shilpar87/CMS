<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.*,com.qwest.cms.BO.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<script>
function add(){
    document.forms[0].action = "CMSAction.do?methodToCall=addCert";	  	
    document.forms[0].submit();
    return true;
}
</script>

<html>
<html:form action="CMSAction.do?methodToCall=addCert">
<header>

</header>
<%
CMSBO cmsbo= new CMSBO();
String serialNo="";
String pub_key="";
String nickName="";
String raw_cert="";
String certName=null;
if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");
	
	nickName= cmsbo.getCertNickname();
	certName = cmsbo.getRaw_certificate();
}

if(session.getAttribute("checkedRadioValue")!= null)
{
 serialNo = session.getAttribute("checkedRadioValue").toString();
 
}

%>
<body>
<br>
<b><u><font color="003388">Certificate Details:</font></u><b>
<br>
<br>Certificate File Name: <b><font color="003388"> <%=certName%></font></b>
<br>
<br>Certificate Nick Name: <b><font color="003388"> <%=nickName%></font><br></b>
<br>
</body>

<table align="center" >
<tr>
<td><td align="center"><input type= "submit" style="font-size: 1.05em; padding: 0.03em; width:50px" name = "Add" value ="Add" onclick='add()'/></td>
</tr>
</table>

</html:form>
</html>

