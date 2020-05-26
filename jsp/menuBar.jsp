<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />
<script>
function showListPage(){
  document.forms[0].action = "<%=request.getContextPath()%>/PAFAction.do?methodToCall=list";	  	
 document.forms[0].submit();
}
</script>
</head>
<body>
<%

String login = session.getAttribute("login").toString();

String role = session.getAttribute("role").toString();
System.out.println("role in jsp------->"+role);
System.out.println("login in jsp------>"+login);
//request.setAttribute("login","approver");

%>
<%
 if(login!=null && !role.equalsIgnoreCase("approver")){
%>
<p align="left"><!--webbot bot="HTMLMarkup" startspan -->    <div class="sdmenu">
      <span class="title" id="top" ><img src="<%=request.getContextPath() %>/images/expanded.gif" class="arrow" alt="-" /><font color="black"> Menu</font></span>
      <div class="submenu">
        <a href="<%=request.getContextPath()%>/PAFAction.do?methodToCall=list">Home</a>
        <a href="<%=request.getContextPath()%>/PAFAction.do?methodToCall=setUp">Create PAF</a>  
        <a href="<%=request.getContextPath()%>/PAFAction.do?methodToCall=search">Search PAF</a>      
      </div>
 </div>
 <%}else{ %>
 <div class="sdmenu">
      <span class="title" id="top" ><img src="<%=request.getContextPath() %>/images/expanded.gif" class="arrow" alt="-" /><font color="black"> Menu</font></span>
      <div class="submenu">
        <a href="<%=request.getContextPath()%>/PAFAction.do?methodToCall=approver">Home</a>
        <a href="<%=request.getContextPath()%>/PAFAction.do?methodToCall=search">Search PAF</a>        
      </div>
 </div>
 <%} %>
</body>
</html>