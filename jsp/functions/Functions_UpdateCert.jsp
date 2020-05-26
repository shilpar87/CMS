

<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >

function submitdetail(){
	if(validate()==true){
		var agree=confirm("Are you sure you wish to continue?");
    	if(agree){    		
			document.forms[0].action ="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=updateCertDetails";
			document.forms[0].submit();	    		
			return true;
    		}   
	}
	   			
}

function cancel(){	   		
			document.forms[0].action ="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=home";
			document.forms[0].submit();	  			
}

function validate(){
	var certInfo=document.forms[0].certInfo.value;	
	//alert(document.forms[0].certStatus.value);
	if(document.forms[0].certStatus.value=='ACTIVE'){
		alert("The certificate is Active and has not been renewed.  The certificate cannot be updated before it is sent for renewal. ");
		return false;
	}
	else if(document.forms[0].certStatus.value=="INACTIVE"){
		alert("The certificate is Inactive and has not been renewed.  The certificate cannot be updated before it is sent for renewal. ");
		return false;
	}	
	else if(document.forms[0].certStatus.value=="EXPIRED"){
		alert("The certificate is Expired and has not been renewed.  The certificate cannot be updated before it is sent for renewal. ");
		return false;
	}			
	else if(certInfo==""){
		alert("Please paste the certificate information.");
		return false;
	}
	else{
		return true;
	}
}

</script>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>
<BODY>
<html:form action="/CMSFunctionAction.do?methodToCall=updateCert"> 

	<table border="0" align="center" cellpadding="0" cellspacing="0" width="58%" bgcolor="336699" bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><u><font size="3" color="FFFFFF"> <b>Update Certificate on Renewal </b></font></u></td> 
		  <!--<tiles:insert	attribute="menu" />-->		 
    </tr>
    <tr><td>&nbsp</td><td>&nbsp</td></tr>
 	</table>
	<table>
	<tr><td>&nbsp</td></tr>
	<tr><td>&nbsp</td></tr>
	<tr><td><html:hidden name="CMSFunctionForm" property="certStatus" />  </td></tr>
	</table>	

	<table width="60%" border="0" align="center" cellpadding="0" cellspacing="1">	
	<tr bgcolor="DFECFF"><td>&nbsp</td>
	<td > <font size="2" color="094E87" > Please paste the data from the renewal mail here. </font> </td></tr>
	
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 00638B" ><b>Certificate Info : </b></td>
		<td align="left" width="" height="20"> <html:textarea rows="20" cols="80" name="CMSFunctionForm" property="certInfo"/>  </td>
	</tr>
	</table>
	<table width="58%" align = "center">
	<tr><td align = "center"><font size="1" color="094E87" >Note: Only paste the contents between the "-----BEGIN CERTIFICATE----- and -----END CERTIFICATE-----" here </font></td></tr>
	<tr><td  width="590px" > <font size="2" color="094E87" > The Certificate will be updated on clicking the UpdateCert button </font></td></tr>
	<tr><td align = "center"> 
	<input type="button" value="UpdateCsr" onclick="submitdetail()"> <font size="12"></font>
    <input type="submit" name="Cancel" value="Cancel" onclick="cancel()"/>
    </td></tr>
 	</table>

</html:form>
</BODY>
