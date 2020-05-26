<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<html>
	
	
	<table bordercolor="004488" cellpadding="1" >
	<tr>
	<br><br><br><br>
	
	</tr>
	</table>

	<table width="45%" align="center" border="1" bordercolor="004488" cellpadding="0" >
		<tr>		
		<%if(session.getAttribute("loadAck")!=null){%>
		<td align="center"><font size="2" color="004488"><b><%=(String)session.getAttribute("loadAck")%></b></font></td>
		<%session.removeAttribute("loadAck");}else{%>
		<td align="center"><font size="2" color="004488"><b>Welcome to the Tools Section.  </b></font>
		<tr>
		<td align="center"><font size="2" color="004488">Please select the features from the Menu.</font></td>
		</tr>
		<%}%>
		</tr>
		</table>
		<table align="center">
		
		</table>
		
	
		
</html>

