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
<%if(session.getAttribute("totalCert")!=null)
{
 totalCert= session.getAttribute("totalCert").toString();%>
<td width="450">Total Certificates: <font color="blue" <b><%=totalCert%></b></font></td>
<%}else{%>
<td width="450">Total Certificates: <font color="blue" <b>0</b></font></td>
<%}%>
<td >User Cuid: <font color="blue" <b><%=cuid%></b></font></td>
</tr>
<tr>


<%if(session.getAttribute("is_searching") != null){

String display_search=session.getAttribute("display_search").toString();

%>

<td width="500">Total Certificates found: <font color="blue" <b><%=display_search%></b></font></td>

<% session.setAttribute("is_searching",null);}


else{ %>

<td></td>

<%}%>





<td   align="center"> 
<a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=msCertsHome"><u>All Certs</u></a>
<a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=report"><u>Reports</u></a>
<a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=search"><u>Search</u></a>
<a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=certInAccount"><u>Home</u></a>
<a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=tool"><u>Tools</u></a>
<!-- <a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=edit_profile"><u>Create/Update Group</u></a> -->
<a href="./Logout.do"><u>Sign Out</u></a>
</td>

</tr>

</table>
<div class="bottomLine"></div>
</body>
</html>