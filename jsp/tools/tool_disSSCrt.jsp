<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@page import="com.qwest.cms.utils.*" %> 
<%@page import="java.util.ArrayList" %> 

<html>
 <HEAD>
 <script>
 
 function saveCsr(){
    // alert(document.forms[0].pubkey.value);
     document.forms[0].pubkey.value;
     document.forms[0].action = "CMSToolAction.do?methodToCall=createCsrFile";
     document.forms[0].submit();
 }
 
 function cancel(){	   		
		document.forms[0].action ="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=tool";
		document.forms[0].submit();	  			
}
 
 </script>
  <TITLE> New Document </TITLE>
  <META NAME="Generator" CONTENT="EditPlus">
  <META NAME="Author" CONTENT="">
  <META NAME="Keywords" CONTENT="">
  <META NAME="Description" CONTENT="">
  <link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
 </HEAD>

 <BODY>
 <html:form action="/CMSToolAction.do?methodToCall=creatSSCrt">

 <b><u><font size="2" color="336699"> Certificate </font></u></b>
  <table><tr><td>
   <%ArrayList tempcrt=new ArrayList();
 if(session.getAttribute("tempcrt")!=null)
 {tempcrt=(ArrayList)session.getAttribute("tempcrt");
 if(tempcrt.size()>0){String cuid=(String)session.getAttribute("login"); %><TEXTAREA title=crt style="WIDTH: 430px; HEIGHT: 250px" name=pubkey rows=11 readOnly cols=46>
 <%=ExportUtil.readCrt(cuid)%></textarea>
 <%}tempcrt.clear();} 
%>
</td></tr>
	
	<tr> 
	<td align="center">
	<input type="button" name="Back" value="Back" style="font-size: 1.05em; padding: 0.05em;" onclick="history.go(-1)">
	<input type="button" name="Save" value="Save" style="font-size: 1.05em; padding: 0.05em;" onclick="saveCsr()"></td> 
	</tr>
	
	
	</table>
</html:form>
</BODY>
</HTML>
