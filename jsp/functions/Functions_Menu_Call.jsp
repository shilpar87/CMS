<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>


<title>Functions Tab</title>
</head>
<body>
<p align="left">
  
 
        <a href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=export">Export Certificate </a><br>
        <a href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=renewCert">Renewal of a Certiicate </a><br>  
		<a href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=updateCert">Update Certificate</a><br>
        <a href=""WEB-INF/struts-config.xml"<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=changeCertStatus">Change Status </a>  <br>   
        <a href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=deleteCert">Delete  </a>  <br>
   
</body>
</html>