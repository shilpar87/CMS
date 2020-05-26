<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script type="text/javascript" >

function submitdetail(){
	//validate();
	if(validate()==true){
		var agree=confirm("Are you sure you wish to continue?");
   	    if(agree){    		
			document.forms[0].action ="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=updateCertStatus";
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
	//alert(document.forms[0].certStatus.value);
	if(document.forms[0].changeCertStatus.value==""){
		alert("Please choose the Status for updation");
		return false;
	}
	else if(document.forms[0].certStatus.value=="EXPIRED"){
		alert("The certificate status is Expired and cannot be changed. ");
		return false;
	}
	else if(document.forms[0].certStatus.value=="Renew"){
		alert("The certificate is being renewed and status cannot be changed. ");
		return false;
	}			
	else{
		//alert(document.forms[0].changeCertStatus.value);
		return true;
	}

}

</script>
<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Renewal of Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<body>
	<html:form action="/CMSFunctionAction.do?methodToCall=changeCertStatus">
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%" bgcolor="336699" bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Change Status of Certificate </font></u> </td> 
		 </tr>
		
   
 	</table> 
 	<tr><td>&nbsp</td><td>&nbsp</td></tr>
 	
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<table width="600px">
		
		<tr bgcolor="DFECFF" >
			<td align="right" width="18%"><font size="2" color=" 00638B">Application Name </td>
			<td align="left" width="45%" height="30"><html:text size="60" name="CMSFunctionForm" property="applicationName" readonly="true"/></td>
		</tr>
		<tr bgcolor="DFECFF" >
			<td align="right" width="18%"><font size="2" color=" 00638B">Certificate Serial No</td>
			<td align="left" width="45%" height="30"><html:textarea cols="60" name="CMSFunctionForm" property="serialNo" readonly="true"/></td>
		</tr>
		<tr bgcolor="DFECFF" >
			<td align="right" width="18%"><font size="2" color=" 00638B">Current Status </td>
			<td align="left" width="45%" height="30"><html:text size="30" name="CMSFunctionForm" property="certStatus" readonly="true"/></td>
		</tr>
		<tr bgcolor="DFECFF">
			<td align="right" width="18%"><font size="2" color=" 00638B">Change Status to </td>
			<td align="left" width="45%" height="30">
			<html:select name="CMSFunctionForm" property="changeCertStatus" size="1" style="font-size: 1.05em; background:EEEEEE;">
				<html:option value="">Select...</html:option>
				<html:option value="ACTIVE">ACTIVE</html:option>
				<html:option value="INACTIVE">INACTIVE</html:option>	
			</html:select>									
			</td>
	</tr>
	
	</table>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	

	<tr>
		<td>&nbsp</td><b>
		<td>&nbsp</td>
		<td><input type="button" value="Submit" style="font-size: 1.05em; padding: 0.05em;" onclick="submitdetail()"></td>
		<td> &nbsp</td>
		<td> <html:cancel value="Cancel" onclick="cancel()" style="font-size: 1.05em; padding: 0.05em;"></html:cancel></td>
	</tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	</html:form>
</html:html>