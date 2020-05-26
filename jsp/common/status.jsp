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
String nickName="";
String status="";
String issuer="";
String issuer_CN="";
String issued_to="";
String issued_by="";
String  valid_from="";
String valid_to="";
String raw_cert="";
String certName=null;

if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");	
	nickName= cmsbo.getCertNickname();
	status=(String)session.getAttribute("certStatus");
	System.out.println("Status in JSP ---------- "+status);
	issuer=(String)cmsbo.getIssuer();
	issued_by=(String)cmsbo.getIssuer_CN();
	issued_to=(String)cmsbo.getSubject_CN();	
	valid_from=(String)cmsbo.getFrom_dt();
	valid_to=(String)cmsbo.getExpiry_dt();
	certName = cmsbo.getRaw_certificate();
	//certName = raw_cert.substring(raw_cert.lastIndexOf('\\')+1,raw_cert.indexOf('.'));
	}
if(session.getAttribute("checkedRadioValue")!= null)
{
 serialNo = session.getAttribute("checkedRadioValue").toString();
}
%>
<body>
<br><b>Certificate File Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <font color="003388"><%=certName%></font></b>
<br>
<br><b>Certificate Nick Name&nbsp;&nbsp;&nbsp;&nbsp;: <font color="003388"><%=nickName%></font></b>
<br>
<%
if(status.equalsIgnoreCase("active"))
{
%>
<br><b>Status</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <font color="green"><b><%=status%></b></font>
<%
}
else if ((status.equalsIgnoreCase("expired")))
{
%>
<br><b>Status</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <font color="red"><b><%=status%></b></font>
<%
}
else if ((status.equalsIgnoreCase("inactive")))
{
%>
<br><b>Status</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <font color="#00FFFF"><b><%=status%></b></font>
<%
}
else if ((status.equalsIgnoreCase("renew")))
{
	%>
	<br><b>Status</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <font color="003388"><b><%=status%></b></font>
	<%
	}
else
{
%>
<br>

<br><b>Status</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <font color="003366"><%=status%></font>
<%
}
%>
<br>
<br><b>Issuer Name:</b> <font color="003366"><%=issuer%></font>
<br>
<br><b>Issued To: </b><font color="003366"> <%=issued_to%></font>
<br>
<br><b>Issued By:</b> <font color="003388"><%=issued_by%></font>
<br>
<br><b>Valid from:</b> <font color="003388"> <%=valid_from%></b></font>
<b>&nbsp;&nbsp;&nbsp;&nbsp;Valid to &nbsp;&nbsp;&nbsp;&nbsp;:</b><font color="003388"> <%=valid_to%></font>

<br>
</body>


</html>

