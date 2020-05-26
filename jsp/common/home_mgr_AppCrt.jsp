<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@page import="com.qwest.cms.BO.CMSBO, java.util.Calendar, java.text.* "%>
<html>
<head></head>
<script language="Javascript">

function Back(){
	//alert("Hi");
	document.forms[0].action ="<%=request.getContextPath()%>/CMSAction.do?methodToCall=certInAccount";
	document.forms[0].submit();	
	return true;
}

</script>
<body>
<b><font color = "9900FF">
Application Name: <%=request.getParameter("appName")%>
</font></b>
<br>
<br>
<form name="f1" >
<table width="95%" border="0" cellspacing="1" cellpadding="3" bgcolor="FFFFFF" 
	style="border-top: 10px; border-top-color: 000000" bordercolor="26466D">
<tr bgcolor="#D6E1EE"><th width="46%"><font color = "000000">Certificate Name</font></th>
<th width="18%"><font color = "000000">Host Name</font></th>
<th width="18%"><font color = "000000">Expiry Date</font></th>
<th width="20%"><font color = "000000">Status</font></th>
</tr>
</table>

<div style="overflow-y: scroll; width:97%; height:180px; table-layout:fixed;">
<table width="100%" border="0" cellspacing="1" cellpadding="0" bgcolor="FFFFFF">
<%ArrayList mgrList=(ArrayList)session.getAttribute("mgrList");
for(int i=0;i<mgrList.size();i++){
CMSBO bo=(CMSBO)mgrList.get(i);
if(bo.getAppName().equals(request.getParameter("appName"))){%>
<tr bgcolor="f1f1f1">
<td style="width: 20%"  align="center">
	          	<font face="Verdana" size="2">
					<%=bo.getCertNickname()%>	         
		         </font>
		       </td>
		       <td style="width:20%" align="center">
	          	<font face="Verdana" size="2">
					<%=bo.getHostId()%>		          
		         </font>
		       </td>
    <td style="width:20%" align="center">
	          <font face="Verdana" size="2">
					<%=bo.getExpDate()%>          
		         </font>
		       </td>
		       <td style="width:20%" align="center">
	          <font face="Verdana" size="2">
					<%=bo.getCert_status()%>         
		         </font>
		       </td>
		       </tr>
		       <%}}%>
</table>

<br><br>

<center><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=certInAccount"><u><b>back</b></u></a></center>
</div>
</form>
</body>

</html>