
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.qwest.cms.BO.CMSBO"%>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >


function submitdetail(){
var agree=confirm("Are you sure you wish to continue?");
    if(agree){    		
			document.forms[0].subject.value;
			document.forms[0].action ="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=generateCSR";
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

function editSub(){
    //alert(document.getElementById('subject').disabled);
    document.getElementById('subject').disabled=false;
    return true;
}

</script>

<%@page import="java.util.ArrayList"%>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Renewal of Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>


<body>
	<html:form action="/CMSFunctionAction.do?methodToCall=renewCert"> 

	<table border="0" align="center" cellpadding="0" cellspacing="0" width="60%" bgcolor="336699" bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><u><font size="3" color="FFFFFF"> <b>Renewal of Certificate  </b></font></u> 
		  <!--<tiles:insert	attribute="menu" />-->
		</td> 
    </tr>
 	</table>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>	
	<tr></tr>
	<table>
	
	<tr><td align="center" width="590px" bgcolor="C8DFFF"> <font size="2" color="094E87" ><b> Certificate details for Renewal </b></font></td></tr>
	<tr><td align="center" width="590px" > <font size="1" color="094E87" > Please generate a CSR using the following details </font></td></tr>
	</table>
	
	<div style="width:850px; height:10px" >
	<table  width ="100%" cellpadding="2" cellspacing="1"  bgcolor="white">
	 
	
	<tr bgcolor="DFECFF" width ="500px">  
	<td align="right" ><font size="2" color="094E87" >Application Name :</td>	
		<td align="left" width="" height="30"> <html:textarea rows="2" cols="35"  name="CMSFunctionForm" property="applicationName" readonly="true"/> <font size="3" color="003366" ></font></td>
		
		<td align="right" ><font size="2" color=" 00638B" >Cert Status : </td>
		<td align="left" width="" height="30"> <html:text size="35"   name="CMSFunctionForm" property="cert_status" readonly="true"/><font size="3" color="003366" ></font> </td>
	</tr>
	
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 054477" >Subject * : </td>
		<td align="left" width="" height="30"> <html:textarea rows="3" cols="35" name="CMSFunctionForm" property="subject" disabled="true"/> <font size="3" color="003366" ></font>
		
		<input type="button" value="Edit" style="font-size: 1.05em; padding: 0.03em;" onclick="editSub()">  
		</td>
		
		<td align="right" ><font size="2" color=" 00638B" >Issuer : </td>
		<td align="left" width="" height="30"> <html:textarea rows="3" cols="35" name="CMSFunctionForm" property="issuer" readonly="true"/> <font size="3" color="003366" ></font></td>
	</tr>	
	
	<tr bgcolor="DFECFF" width ="500px">  
		<td align="right"><font size="2" color="054477" >Serial No. :</td>	
		<td align="left" width="" height="30"> <html:textarea rows="2" cols="35"  name="CMSFunctionForm" property="serialNo" readonly="true"/> <font size="3" color="003366" ></font> </td>
		
		<td align="right" ><font size="2" color=" 00638B" >Signature : </td>
		<td align="left" width="" height="30"> <html:textarea rows="3" cols="35" name="CMSFunctionForm" property="signature" readonly="true"/><font size="3" color="003366" ></font></td>
	</tr>

	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color="094E87" >Certificate Version :</td>	
		<td align="left" width="" height="30"> <html:text size="35"  name="CMSFunctionForm" property="cert_version" readonly="true"/><font size="3" color="003366" ></font> </td>
		
		<td align="right" ><font size="2" color=" 00638B" >Signature Algor : </td>
		<td align="left" width="" height="30"> <html:text size="35"   name="CMSFunctionForm" property="signature_algo" readonly="true"/><font size="3" color="003366" ></font> </td>
		
	</tr>
	
	<tr bgcolor="DFECFF">
		<td align="right" ><font size="2" color=" 00638B" >Valid From : </td>
		<td align="left" width="" height="30"> <html:text size="35" name="CMSFunctionForm" property="from_dt" readonly="true"/><font size="3" color="003366" ></font> </td>
		
		<td align="right" ><font size="2" color=" 00638B" >Valid To : </td>
		<td align="left" width="" height="30"> <html:text size="35"  name="CMSFunctionForm" property="expiry_dt" readonly="true"/><font size="3" color="003366" ></font> </td>
	</tr>
	
 	</table>
 	
	<table>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	</table>
	<tr>
		<td>&nbsp</td><!--
		<td> <html:submit value="Send Mail" onclick="sendMail()"> <font size="12"></font></html:submit></td>
		-->
		<!--<td> <html:submit value="Generate CSR" style="font-size: 1.05em; padding: 0.03em;"></html:submit></td>-->
		<td><input type="button" value="Generate CSR" style="font-size: 1.05em; padding: 0.03em; width: 120px"onclick="submitdetail()"></td>
		<td> &nbsp</td>
		<td> <html:cancel value="Cancel" style="font-size: 1.05em; padding: 0.03em; width: 80px" onclick="cancel()"></html:cancel></td>
	</tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	</html:form>
</body>
