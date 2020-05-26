<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.*,com.qwest.cms.BO.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<html>

<header>

</header>
<%
CMSBO cmsbo= new CMSBO();
String notes="";
String nickName="";
String raw_cert="";
String certName=null;

if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");
	notes= cmsbo.getNotes();
	nickName=cmsbo.getCertNickname();
	certName = cmsbo.getRaw_certificate();
	//certName = raw_cert.substring(raw_cert.lastIndexOf('\\')+1,raw_cert.indexOf('.'));
	
	 System.out.println("notes-->"+notes );
	
	
}

%>
<body>
<br>
<br>Certificate File Name: <font color="003388"><b> <%=certName%></b></font>
<br>
<br>Certificate Nick Name: <font color="003388"><b> <%=nickName%></b></font>
<br>
<br><b><u>Notes:</u></b> 
<br>
<br> <font color="003388"> <%=notes%></font>

</body>


</html>

