<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="com.qwest.cms.BO.CMSBO, java.util.Calendar, java.text.* "%>


<script>
function submit1(){
	
	document.forms[0].action="<%=request.getContextPath()%>/CMSAction.do?methodToCall=certSerdetails";		
	document.forms[0].submit();	
}

</script>

<%String serverName = (String)session.getAttribute("serverName");
String appName1 = (String)session.getAttribute("appName");
String appId = ((String)session.getAttribute("appId"));%>

<html:html>

<html:form action="CMSAction.do?methodToCall=certSerdetails">
<table align="center"  width="85%" >
		<tr bordercolor="#D6E1EE">
		<td align="center" bgcolor="f1f1f1">
		<FONT size="2" color="123660">Certificate Management System doesn't have any Certificate Information for  <b>"<%=appName1%>"</b> Application (UserID - <b>"<%=appId%>"</b>) Hosted on Server <b>"<%=serverName%>".  </b></FONT></td>
		</tr>
		<br>
		<br>
		<tr>
		
			
		<td align="center" bgcolor="f1f1f1" >
			<FONT size="2" color="123660">
			<br>Please Follow the Instructions sent in a mail to Load Certificates to <br>Certificate Management System.</br>
			</FONT>
		</td>
		</tr>	
		<tr><tr><tr><td align="center"><input type="button"  value="Back" style="font-size: 1.05em; padding: 0.03em;" name="Back" onclick="return submit1();"/></td></tr>
	</table>
	</html:form>	
</html:html>