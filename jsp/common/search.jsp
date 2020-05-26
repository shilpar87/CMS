<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html>
<head>
<link rel="stylesheet" type="text/css" media="all" href="<%=request.getContextPath()%>/css/calendar-win2k-cold-1.css" title="win2k-cold-1" /> 
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/config/calendar.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/config/lang/calendar-en.js"></script>

<script type="text/javascript" src="<%=request.getContextPath()%>/config/calendar-setup.js"></script>

<script>

function CheckForm(){

    	 var nameLength = document.forms[0].appList.value;
    	 var acroNameLength = document.forms[0].acronymList.value;
    	 //alert(acroNameLength.length);
    	 
    	 if(nameLength.length == 0 && acroNameLength.length > 0 ){
    	     document.forms[0].action = "CMSAction.do?methodToCall=searchResult";	  	
    	     document.forms[0].submit();
    	     return true;
    	 }
    	 
    	if(nameLength.length > 2 && acroNameLength.length == 0 ){
   	     document.forms[0].action = "CMSAction.do?methodToCall=searchResult";	  	
   	     document.forms[0].submit();
   	     return true;
   	 }
    	 
    	if(nameLength.length > 2 && acroNameLength.length > 0 ){
  	     document.forms[0].action = "CMSAction.do?methodToCall=searchResult";	  	
  	     document.forms[0].submit();
  	     return true;
  	 }
    	
	 if(nameLength.length == 0 && nameLength.length == 0){
    	     alert("Please Enter Either Application Name or Acronym ");
    	     return false;
    	 }
    	 
     	if(nameLength.length < 3){
  	     alert("Application Name should be atleast 3 characters");
  	     return false;
  	 }
  	
  	
}

function validDate()

{
 
var a = document.forms[0].fromDate.value.length;

var b = document.forms[0].toDate.value.length;
	
	if ( b > 0 && a == 0  )
	document.forms[0].fromDate.focus()
	alert ("Enter the from Date")
}
function checkNumber(str)
{
var string=str.value
var quote="0123456789"
for (i = 0; i < string.length ; i++)
  {
   strChar = string.charAt(i);
       if (quote.indexOf(strChar) == -1)
         {
         alert("Please enter numbers[0-9]")
         str.focus();
         str.value=""
      	 return false
      	 
      	       	 
         }
       }
	}
	
function checkCuid(str)
{
	var cuid=str.value
	//alert(cuid)
	var temp = new Array();
	temp = cuid.split(" ");
	//alert(temp[0]);
	//alert(temp[1]);
	//alert(temp.length);
	for(k=0;k < temp.length; k++)
		{
			alert(temp[k].length);
			if(temp[k].length > 10)
				{
				alert("cuid should be less than 10 characters")
				str.focus();
				return false
				}
		}
}


function checkquote(str)
{
//alert(str)
var string=str.value


//alert(string)
var quote="'"
//alert(string.length)
for (i = 0; i < string.length ; i++)
  {
   strChar = string.charAt(i);
   //alert(string.charAt(i))
      if (quote.indexOf(strChar) !== -1)
         {
         alert("single quote is not allowed!")
         str.focus();
      	 return false
      	 
      	       	 
         }
       
   
  }

}

</script>


<meta http-equiv="Content-Language" content="en-us">

<title>CMS</title>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<script language="JavaScript" src="<%=request.getContextPath()%>/js/calendar.js"></script>
<script language="JavaScript" src="<%=request.getContextPath()%>/js/calFunc.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/validation.js"></script>
</head>


<body text=#000000 bgColor=#ffffff leftMargin=0  topMargin=0 rightmargin=0 >
      <%
      session.removeAttribute("totalCert");
      System.out.println("hi I m here");
       if(session.getAttribute("searchRecord")!=null)
   {
            String srhCnt = "";
			srhCnt = session.getAttribute("searchRecord").toString();
			
			int searchCnt = Integer.parseInt(srhCnt);
			System.out.println("inside homepage int value for search--->");
			if(searchCnt==0)
			{
 			%>
 			<table border=0 width=800>	
 			<tr>
			<td>&nbsp</td>
			<td>&nbsp</td>
			<td align="center"><font color="red"> <h3> No Match Found...</h3></font></td>
		
			<td>&nbsp </td>
		
			<td> &nbsp</td>
		
			</tr>
			</table>
 		
 				<%
 				}
 				session.setAttribute("searchRecord",null);
 	}
 
      %>
      <html:form action="/CMSAction.do?methodToCall=searchResult" enctype="multipart/form-data">
      
      <table border="0"  cellpadding="5" cellspacing="1"   bgcolor="FFFFFF"   width="80%" align="center">
      <tr bgcolor="#D6E1EE">
			<td align="center" colspan="4"><font face="Verdana" size="2" color="123660"><b>Certificate Viewer</b></font>
			</td>
		</tr>
	<tr bgcolor="f1f1f1">   
		<input type="hidden" name="selAcronym" />
		<input type="hidden" name="selAppName" />
		<input type="hidden" name="actbut" value=''/>
	<td align="Right" ><font size="1"><b>Application Name</b></font></td>
	<td align="left">
	<html:select name="CMSFormBean" property="appName" size="1" style="font-size: 1.05em;">				
  		<html:option value="Starts With">Starts With</html:option>
  		<html:option value="Is Exactly">Is Exactly</html:option>
  		<html:option value="Contains">Contains</html:option>
  	</html:select>
  	<html:text styleClass='text' size='20' name="CMSFormBean" property="appList" />	
  	</td>
  	</tr>
  	
  	
		<tr bgcolor="f1f1f1">   
		<input type="hidden" name="selAcronym" />
		<input type="hidden" name="selAppName" />
		<input type="hidden" name="actbut" value=''/>
	<td align="Right" ><font size="1"><b>Acronym</b></font></td>
	<td align="left">
	<html:select name="CMSFormBean" property="acronym"  size="1" style="font-size: 1.05em;" >				
  		<html:option value="Starts With">Starts With</html:option>
  		<html:option value="Is Exactly">Is Exactly</html:option>
  		<html:option value="Contains">Contains</html:option>
  	</html:select>
  	<html:text styleClass='text' name="CMSFormBean" property="acronymList" />	
  	</td>
  	</tr>
  	
	      <table border="0"  cellpadding="5" cellspacing="1"  width="80%" align="center">
	
				        <tr >
						<td align="center" colspan="2">	
						<input style="font-size: 1.05em; padding: 0.03em; width:90px" type="button" value="Search" onclick="CheckForm()"/>&nbsp;	
						<html:reset style="font-size: 1.05em; padding: 0.03em; width:90px"/></td>
				  </tr>		
					  		
		 </table>
		 
		 		 
		 
      </html:form>
	</body>
</html>


 