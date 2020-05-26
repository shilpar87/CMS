

<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tools Menu Bar</title>

</head>
<body>
<p align="left">
 <div class="sdmenu">
      <font color="black">Menu</font>
      <div class="submenu">
        <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=test">Create Private Key </a>
        <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=test">Create CSR</a>  
        <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=test">View CSR</a>  
        <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=test">View Public Key</a>  
        <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=test">Convert Formats</a>  
        <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=test">Create a New Cert using selected cert as a Model</a>  
        <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=test">Import Private Key </a>  
        <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=test">Automated Discovery</a>        
      </div>sdfsaf


</body>
</html>