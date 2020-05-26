
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.*" %> 
    <%@page import="com.qwest.cms.utils.*" %> 
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >
function setDefaultTotxt(tempVar){

	if(tempVar == "file"){
		document.getElementById("Crtfile").disabled = false;
		document.getElementById("crttest").disabled = true;
	}
	else{
		document.getElementById("Crtfile").disabled = true;
		document.getElementById("crttest").disabled = false;
	}

}


</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> New CSR From Cirtificate </title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>


<html:form  action="/CMSToolAction.do?methodToCall=creatNewCsr" enctype="multipart/form-data"> 
<table border="0" align="center" cellpadding="1" cellspacing="0" width="60%" bgcolor="336699" bordercolor="#000000">
<%if(request.getAttribute("error")!=null){%>
   <tr>
		<td align="center" valign="top" ><b><font size="3" color="red"><%=(String)request.getAttribute("error")%></font> </b></td> 
    </tr><tr><td></td></tr><%}%>
	<tr>
		<td align="center" valign="top" ><b><font size="3" color="FFFFFF"> CREATE CSR FROM CERTIFICATE </font> </b></td> 
    </tr>
 	</table><br>
 	<table  width ="65%" cellspacing="0" cellpadding="1" border="0">

	<tr bgcolor="DFECFF" width ="500px">  
		<td align="right"><font size="2" color=" 00638B" >From the Location :</td>	
		<td align="left" width="" height="30"> 
		<html:file property="crtfile"  size="40"   onclick="setDefaultTotxt('file')"/>
		</td>
	</tr>
	</table>	
   <table width="55%" align="center">
   		<tr><td align="center"><font size="1" color="337799">OR copy and paste the contents between </font></td></tr>
   		<tr><td align="center"><font size="1" color="337799">'-----BEGIN CERTIFICATE-----' and '-----END CERTIFICATE-----'</font></td></tr>
   </table>
   
   <table>
	<tr><td>&nbsp</td>
		<td><TEXTAREA title=csr style="WIDTH: 445px; HEIGHT: 180px"  name="crttest" id="crttest" rows=11 cols=46 onclick="setDefaultTotxt('text')"></TEXTAREA></td>
		
	</tr>
	</table>
		<table>
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
				<td>&nbsp</td>
		
		<td> <html:submit value="Create" style="font-size: 1.05em; padding: 0.05em;"></html:submit></td>
		
		<td> &nbsp</td>
		<td> <html:reset value="Reset" style="font-size: 1.05em; padding: 0.05em;"></html:reset></td>
	</tr>
	</table>
 </html:form>

 </body>
 </html:html>