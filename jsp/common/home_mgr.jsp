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

</script>
<body>
<table width="95%" border="0" cellspacing="1" cellpadding="3" bgcolor="FFFFFF" 
	style="border-top: 10px; border-top-color: 000000" bordercolor="26466D">

<tr bgcolor="#D6E1EE" ><th width="26%"><font color = "000000" size = "2">Application Name</font></th>
<th width="26%"><font color = "000000" size = "2">No. of Certificates</font></th>
<th width="26%"><font color = "000000" size = "2">Creater CUID</font></th></tr>
</table>

<div style="overflow-y: scroll; width:97%; height:180px; table-layout:fixed;">
<table width="100%" border="0" cellspacing="1" cellpadding="2" bgcolor="FFFFFF">
<logic:iterate id="mgrhome"  name="mgrhome">
<tr bgcolor="f1f1f1">
				<td style="width: 18%"  align="center">
	          	<font face="Verdana" size="1">
					<a href='<%=request.getContextPath() %>/CMSAction.do?methodToCall=mgrAppCrt&appName=<bean:write name="mgrhome" property="appName"/>'><u><bean:write name="mgrhome" property="appName"/></u> </a>		         
		         </font>
		       </td>
		       <td style="width:18%" align="center">
	          	<font face="Verdana" size="1">
					<bean:write name="mgrhome" property="noCrtOfApp"/>		          
		         </font>
		       </td>
    <td style="width:18%" align="center">
	          <font face="Verdana" size="1">
					<bean:write name="mgrhome" property="creatorCuid"/>		          
		         </font>
		       </td>
		       </tr>
</logic:iterate>
</table>
</div>
</body>

</html>