
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.*,com.qwest.cms.BO.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >
	function loadCerts(){	
		if (document.forms[0].appUserName.value==""){
			alert("Please choose the Application User Name for which the certificate is required");
			return false;
		}else{
			document.forms[0].action ="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=checkAppUserName";
			document.forms[0].submit();
		}						
	}

</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>  </title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>
<html:form action="/CMSToolAction.do?methodToCall=checkAppUserName"> 
<br>
<br>
	<table align="center"  width="80%">
		<tr>
		<td align="center" bgcolor="FFFFCC"><FONT size="4" color="CC0033"><b><html:errors/></b></FONT>
		</td>
		</tr>		
	</table>
	
	<table border="0" align="center" cellpadding="0" cellspacing="0" width="45%"  bordercolor="#000000">
		<tr>
		<td align="center" valign="top" ><b><font size="3" color="336699"><I> Application Specific Certificate Search Request Form </I> </font></b></td> 
   		 </tr>
 	</table>
 	<br>
 	
	<table align="center" width ="60%" cellspacing="1" cellpadding="1" border="0">

	<tr bgcolor="C8DFFF" >  
		<td align="right"><font size="2" color=" 00638B" >App Server Name :</font></td>	
		<td align="left" width="" height="30"> 
			<html:text name="CMSToolForm" property="appServer" size="30" style="font-size: 1.05em; padding: 0.05em;" />
		</td>
	</tr>
	<tr bgcolor="C8DFFF" >  
		<td align="right"><font size="2" color=" 00638B" >Application User Names :</font></td>	
		<td>		
			<html:select style="font-family : ariel; font-size: 12px;" name="CMSToolForm" property="appUserName" >
				<html:option  value="">Select</html:option>
				
				<html:options collection="appsUserList" name="CMSToolForm" property="appUserName"></html:options>
			</html:select>								
		</td>		
	</tr>	
 	</table>	
	<table align="center">
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
				<td>&nbsp</td>
		
		<td> <input type="button" style="font-size: 1.05em; padding: 0.05em;" name="loadCert" value="Load Certificates" onclick='loadCerts()' > </td>
		
		<td> &nbsp</td>
		<td> <html:reset value="Reset" style="font-size: 1.05em; padding: 0.05em;"></html:reset></td>
	</tr>
	</table>
 	
</html:form> 	

<%ArrayList info=new ArrayList();
 if(session.getAttribute("info")!=null)
 {info=(ArrayList)session.getAttribute("info");
 if(info.size()>0){ %>
 <%=(String)(info.get(0).toString())%>
 <%}info.clear();}
  %>
</body>
</html:html>