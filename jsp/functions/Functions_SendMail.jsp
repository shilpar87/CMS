
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >

function goToHome(){
var agree=confirm("Are you sure you wish to continue?");
    if(agree){    		
			document.forms[0].action ="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=home";
			document.forms[0].submit();	    		
			return true;
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

	<div style="width:850px; height:10px" >
	<table  width ="70%" cellspacing="2" cellpadding="0" border="1" bordercolor="336699">
	<tr>  
				<td align="center" width="590px" > <font size="2" color=" 00638B" > The CSR has been generated and the mail has been sent to the RCBS Manager for Renewal. After renewal, the Certificate Details will be sent.  On receiving the same, Please use the Update Certificate link (Functions tab) to paste the Certificate information and Update the Certificate. </font></td>

	</tr>
	</table>
	
	<table align="center">
	<tr><td>&nbsp</td></tr>
	<tr><td>&nbsp</td></tr>
	<tr><td><input type="button" value="Back to Functions home" onclick="goToHome()"></td></tr>
	</table>
	
	</html:form>
</body>
</html:html>