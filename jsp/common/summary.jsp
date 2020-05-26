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
String serialNo="";
String pub_key="";
String nickName="";
String raw_cert="";
String certName=null;
if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");
	
	pub_key=(String)cmsbo.getPublic_key();
	nickName= cmsbo.getCertNickname();
	certName = cmsbo.getRaw_certificate();
	//certName = raw_cert.substring(raw_cert.lastIndexOf('\\')+1,raw_cert.indexOf('.'));
}

if(session.getAttribute("checkedRadioValue")!= null)
{
 serialNo = session.getAttribute("checkedRadioValue").toString();
 
}

%>
<body>
<br>
<br>Certificate File Name: <b><font color="003388"> <%=certName%></font></b>
<br>
<br>Certificate Nick Name: <b><font color="003388"> <%=nickName%></font><br></b>
<br><b>Public key :</b>
<br>
<br><font color="003388"> <%=pub_key%></font>


</body>


</html>

