<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@ page import="java.util.ArrayList " %>
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
<% 
String cuid = "";
if(session.getAttribute("login")!=null)
{
cuid = session.getAttribute("login").toString();
}
String totalCert="";
if(session.getAttribute("totalCert")!=null)
{
 totalCert= session.getAttribute("totalCert").toString();
}
%>
<body><table>
<tr > 
<td width="500">Total Number of Applications:<font color="blue" <b><%=((ArrayList)session.getAttribute("mgrhome")).size()%></b></font></td>
<td >User Cuid: <font color="blue" <b><%=cuid%></b></font></td>
</tr>
<tr>
<td ></td>
<td   align="center"> 
<a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=certInAccount"><u>Home</u></a>
<a href="./Logout.do"><u>Sign Out</u></a>
</td>

</tr>

</table>
<div class="bottomLine"></div>
</body>
</html>