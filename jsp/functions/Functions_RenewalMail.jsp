
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >

function sendMail(){
	if(validate()==true){
		var agree=confirm("Are you sure you wish to continue?");
   		if(agree){    		
			document.forms[0].action ="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=approvalMail";
			document.forms[0].submit();	    		
			return true;
    		}    
	}
  			
}
function load(file,target) {
    if (target != ''){
        target.window.location.reload(true);
        }
    else
        window.location.href = file;
      self.close();
}

function cancel(){	   		
			document.forms[0].action ="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=home";
			document.forms[0].submit();	  			
}

function validate(){
	if(document.forms[0].toList.value==""){
		alert("The RCBS Manager CUID is not available.  Please use the Create/Update Group link to update the RCBS Manager name and then continue");
		return false;
	}
	else
		return true;
}

</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Renewal of Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>
	<html:form action="/CMSFunctionAction.do?methodToCall=renewCert"> 
	<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%" bgcolor="336699" bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Renewal of Certificate </font></u> 
		  <!--<tiles:insert	attribute="menu" />-->
		</td> 
    </tr>
 	</table>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr></tr>
	<table border="2" cellspacing="0" cellpadding="0" bordercolor="336699">
	<tr>
		<td align="center" width="590px" bgcolor="EEEEEE" > <font size="2" color=" 00638B" > A mail will be sent to the RCBS Manager with the following CSR information for Renewal.  </font></td>
	<tr>
	</table>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>	

	<div style="width:850px; height:10px" >
	<table  width ="70%" cellpadding="2" cellspacing="1"  bgcolor="white">
	<tr bgcolor="DFECFF" width ="500px">  
		<td align="right"><font size="2" color=" 00638B" ><b>To :</b></td>	
		<td align="left" width="" height="20"> <html:text size="9"  maxlength="8" style="background:EEEEEE" name="CMSFunctionForm" property="toList" /> <font size="3" color="3" ></font> </td>
	</tr>
	
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 00638B" ><b>Cc :</b><font size="1" color="red">Comma Separated</font></td>	
		<td align="left" width="" height="20"> <html:textarea rows="2" cols="80"  style="background:EEEEEE" name="CMSFunctionForm" property="ccList" /></td>
	</tr>
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 00638B" ><b>Subject : </b></td>
		<td align="left" width="" height="20"> <html:textarea rows="2" cols="80" style="background:EEEEEE" name="CMSFunctionForm" property="mail_subject" readonly="true"/> </td>
	</tr>
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 00638B" ><b>Message : </b></td>
		<td align="left" width="" height="20"> <html:textarea rows="15" cols="80" style="background:EEEEEE" name="CMSFunctionForm" property="message" readonly="true"/>  </td>
	</tr>
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 00638B" ><b>Notes : </b></td>
		<td align="left" width="" height="20"> <html:textarea rows="2" cols="80" name="CMSFunctionForm" property="notes"/> </td>
	</tr>
 	</table>
	<tr><td><font size="1" color="888888"> [Please add any notes if required.] </font></td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>

	<tr>
		<td>&nbsp</td><!--
		<td> <html:submit value="Send Mail" onclick="sendMail()"> <font size="12"></font></html:submit></td>
		-->
		<td><input type="button" style="font-size: 1.05em; padding: 0.05em;" value="Send Mail" onclick="sendMail()"></td>		
		
		<td> &nbsp</td>
		<td> <html:cancel value="Cancel" style="font-size: 1.05em; padding: 0.05em;" onclick="cancel()"></html:cancel></td>
	</tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	</html:form>
</body>
</html:html>