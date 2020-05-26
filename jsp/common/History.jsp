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

String nickName="";
String raw_cert="";
String certName=null;

if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");

	nickName=cmsbo.getCertNickname();
	certName = cmsbo.getRaw_certificate();
	//certName = raw_cert.substring(raw_cert.lastIndexOf('\\')+1,raw_cert.indexOf('.'));
		
}

%>
<body>
<br>
<br>Certficate File name: <font color="003388"> <b><%=certName%></b></font>
<br>
<br>Certficate Nick name: <font color="003388"> <b><%=nickName%></b></font>
<table   border="0"  cellpadding="5" cellspacing="1"   bgcolor="white" width="60%" algin="center">
	 <tr>
			<td align="center" colspan="4"><font face="Verdana" size="2"><b>History Table</b></font>
			</td>
		</tr>
	 
          <tr bgcolor="gainsboro">
          
          <th><font face="Verdana" size="1">Time Stamp</font></th>
          <th><font face="Verdana" size="1">User(cuid)</font></th>
          <th><font face="Verdana" size="1">Activity</font></th>
          
          </tr>

          <logic:iterate id="historyList"  name="historyList">
          <tr>
          
		    
		    
		    <td width="2%" align="center">
	          	<font face="Verdana" size="1">
					<bean:write name="historyList" property="modifiedDate"/>		          
		         </font>
		       </td>

	          <td width="2%" align="center">
	          	<font face="Verdana" size="1">
					<bean:write name="historyList" property="modifiedCuid"/>		          
		         </font>
		       </td>
		       
		       <td width="2%" align="center">
	          	<font face="Verdana" size="1">
					<bean:write name="historyList" property="modifiedAction"/>		          
		         </font>
		       </td>
		       
	           		    
	          </tr>
          </logic:iterate>
	  </table>
	

</body>


</html>

