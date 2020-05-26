<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@page import="com.qwest.cms.BO.CMSBO, java.util.Calendar, java.text.* "%>

<html>


<script language="Javascript">

 function submit(){
 // alert(document.forms[0].reqString.value);
  document.forms[0].selName.value;
  document.forms[0].reqString.value;
  document.forms[0].issuedCommonName.value;
  document.forms[0].selCN.value;
  document.forms[0].expAfterDate.value;
  document.forms[0].expBefDate.value;
  
  if(document.forms[0].reqString.value=="" && document.forms[0].issuedCommonName.value=="" && document.forms[0].expAfterDate.value=="" && document.forms[0].expBefDate.value=="" ){
      alert("Please Enter Atleast One Data To Filter");
      return false;
  }
  
  document.forms[0].action = "CMSAction.do?methodToCall=popUpFilterData";	  	
  document.forms[0].submit();
  return true;
}

 function Cancel(){
     document.forms[0].action = "CMSAction.do?methodToCall=msCertsHome";	  	
     document.forms[0].submit(); 
 }
 
</script>

<head>
<link rel="stylesheet" type="text/css" media="all" href="<%=request.getContextPath()%>/css/calendar-win2k-cold-1.css" title="win2k-cold-1" /> 
<script type="text/javascript" src="<%=request.getContextPath()%>/config/calendar.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/config/lang/calendar-en.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/config/calendar-setup.js"></script>
<meta http-equiv="Content-Language" content="en-us">
<title>CMS</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<script language="JavaScript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script language="JavaScript" src="<%=request.getContextPath()%>/js/calFunc.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/validation.js"></script>
</head>

<html:form action="/CMSAction.do?methodToCall=popUpFilterData" enctype="multipart/form-data">

<table align="center" border="0"  cellpadding="5" cellspacing="1"   bgcolor="FFFFFF"  width="80%" align="center">

<tr bgcolor="f1f1f1">   
<td align="Right" ><font size="1"><b>Requester Name</b></font></td>
<td align="left">
<html:select name="CMSFormBean" property="selName" size="1" style="font-size: 1.05em;">				
	<html:option value="Starts With">Starts With</html:option>
	<html:option value="Is Exactly">Is Exactly</html:option>
	<html:option value="Contains">Contains</html:option>
</html:select>
<html:text styleClass='text' size='20' name="CMSFormBean" property="reqString"/>
</td>
</tr>

<tr bgcolor="f1f1f1">   
<td align="Right" ><font size="1"><b>Issued CommonName</b></font></td>
<td align="left">
<html:select name="CMSFormBean" property="selCN" size="1" style="font-size: 1.05em;">				
	<html:option value="Starts With">Starts With</html:option>
	<html:option value="Is Exactly">Is Exactly</html:option>
	<html:option value="Contains">Contains</html:option>
</html:select>
<html:text styleClass='text' size='20' name="CMSFormBean" property="issuedCommonName"/>
</td>
</tr>


<tr bgcolor="f1f1f1">
<td align="right" ><font size="1"><b>Expiry Date After </b></font>
<td><b>:</b> 
<input type="text" name="expAfterDate" size="20" value="" readonly="readonly">
<button type="reset" id="f_trigger_b1_after">...</button> 
</td></tr>

<tr bgcolor="f1f1f1">
<td align="right" ><font size="1"><b>Expiry Date On <br> or Before </b></font>
<td><b>:</b> 
<input type="text" name="expBefDate" size="20" value="" readonly="readonly">
<button type="reset" id="f_trigger_b1">...</button> </td></tr>

</table>

</div>

</html:form>

<table align="center">
<tr>
<td align="center">
<input type= "submit" style="font-size: 1.05em; padding: 0.03em; width:80px" name = "Filter" value ="Filter" onclick="submit();">
<input type= "submit" style="font-size: 1.05em; padding: 0.03em; width:80px" name = "Back" value ="Back" onclick="Cancel();">
</td>
</tr>
</table>


</body>

</html>


<script type="text/javascript">
Calendar.setup({
    inputField     :    "expBefDate",      // id of the input field
    ifFormat       :    "%m/%d/%Y ",       // format of the input field
              // will display a time selector
    daFormat		:    "%d/%b/%Y ",      
    button         :    "f_trigger_b1",   // trigger for the calendar (button ID)
    singleClick    :    false,           // double-click mode
    step           :    1                // show all years in drop-down boxes (instead of every other year as default)
});
</script>

<script type="text/javascript">
Calendar.setup({
    inputField     :    "expAfterDate",      // id of the input field
    ifFormat       :    "%m/%d/%Y ",       // format of the input field
              // will display a time selector
    daFormat		:    "%d/%b/%Y ",      
    button         :    "f_trigger_b1_after",   // trigger for the calendar (button ID)
    singleClick    :    false,           // double-click mode
    step           :    1                // show all years in drop-down boxes (instead of every other year as default)
});
</script>
