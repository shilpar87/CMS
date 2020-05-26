
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.* " %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit/Create Group</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>


<body>
<html:form action="/CMSAction.do?methodToCall=editProfGroupNew">	
<input type="hidden" name="hidden" />	
		<table align="center"  width="80%">
		<tr>
		<td align="center" bgcolor="FFFFCC"><FONT size="4" color="CC0033"><b><html:errors/></b></FONT></td>
		</tr>		
		</table>
		
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%" bgcolor="336699" bordercolor="#000000">
		<tr bgcolor="FFFFFF"><td>&nbsp</td></tr> 
		<tr>
			<td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Create/Edit Group </font></u> 
		 	</td> 
    	</tr>
 		</table>
		
		<br>			
		
		<table border="0" width="85%" align = "center" CELLSPACING="0" height="15%">
								
				<tr>	
				<tr bgcolor="DFECFF">
				<td width="27%" class="q" height="23" >
				<font size="2" color=" 00638B" >Application Name</font></td>
				<td width="73%" height="23" >: 
				<html:select property="appName" style="" onchange="getAcronym()">
				<html:option value="">Select</html:option>
				<html:options collection="appList" name="CMSFormBean" property="appName" />
				</html:select>

				</td>
				</tr>
			   
				<tr bgcolor="C8DFFF">
				<td width="27%" class="q" height="23">
				<font size="2" color=" 00638B" >Application Acronym</font></td>
				<td width="73%" height="23">:
					<html:text name="CMSFormBean" property="acronym"/>
					<html:hidden name="CMSFormBean" property="errMess"/>					
				</td>			
			    </tr>

			    <tr bgcolor="DFECFF">
			    <td width="27%" class="q" height="23">
			    <font size="2" color=" 00638B" >AUTH_TYPE</font></td>
				<td width="73%" height="23">:
				<html:select name="CMSFormBean" property="auth_type" size="1" style="font-size: 1.05em;">
					<html:option value="A">ADMIN</html:option>
					<html:option value="M">MEMBER</html:option>
				</html:select>
			    </tr>
			    
			    <tr bgcolor="C8DFFF">
				<td width="27%" class="q" height="23">
				<font size="2" color=" 00638B" >RCBS Code(*)</font></td>
				<td width="73%" height="23">: 
				<html:text name="CMSFormBean" property="rcbsCode" onblur="return rcbscode01(document.forms[0].rcbsCode);"/>
				</td>
			    </tr>
			    
			    <tr bgcolor="DFECFF">
				<td width="27%" class="q" height="23">
				<font size="2" color=" 00638B" >RCBS Manager Cuid(*)</font></td>
				<td width="73%" height="23">: 
				<html:text name="CMSFormBean" property="rcbsMgrCuid" onblur="return managercuid(document.forms[0].rcbsMgrCuid);"/></td>
			    </tr>
			    
			    <tr bgcolor="C8DFFF">
				<td width="27%" class="q" height="23">
				<font size="2" color=" 00638B" >Application User Names</font><font size="1" color="red">(comma seperated)</font></td>
				<td width="73%" height="23"> :
				<html:textarea property="appUserName" name="CMSFormBean" cols="32" rows="2"></html:textarea></td>
			    </tr>	   			    
			    
			  	<tr><td>&nbsp</td></tr> 
			   					    
			</table>
			   
			   
		  <table border="0" align="center" cellpadding="0" cellspacing="0" width="85%" bgcolor="lightblue" bordercolor="#000000">
			<tr>
			<td align="center" valign="top"><u><b> <font size="2">Notification Information</font></b> </u> </td>
 			</table>
 			<table border="0" align="center" cellpadding="0" cellspacing="0" width="85%"  bordercolor="#000000">
 			
			    		     
			    <tr> 
			    <tr bgcolor="DFECFF">
			    <td width="27%" class="q" height="23">
			    <font size="2" color=" 00638B" >Alarming Time(in days)</font></td>
				<td width="73%" height="23">:
				<html:select name="CMSFormBean" property="alarmFreq" size="1" style="font-size: 1.05em;">
					<html:option value="">Select...</html:option>
					<html:option value="30">30 days</html:option>
					<html:option value="40">40 days</html:option>
					<html:option value="60">60 days</html:option>
					<html:option value="70">70 days</html:option>		
					<html:option value="90">90 days</html:option>		
				</html:select>			
				
      			
      			<tr><td>&nbsp</td></tr>      						     
			 </table>
			 
			 <center><input type="button" name="save" style="font-size: 1.05em; padding: 0.05em;" value="Save" onclick='Save()'>
			 <input type="button" name="cancel" style="font-size: 1.05em; padding: 0.05em;"  value="Cancel" onClick ='Cancel()'>
			 </center>			    		    
	
<script language="javascript" type="text/javascript">

	function getAcronym(){
	    alert("hsdhs");
		document.forms[0].action="CMSAction.do?methodToCall=editProfAcronym";
		document.forms[0].submit();
		return true;
	}
	
	function Cancel(){
	document.forms[0].action="CMSAction.do?methodToCall=edit_profile";
	document.forms[0].submit();
	return true;
	}

	function Save(){
					
	  if( validate()==true ){		  	
		var ans=false; 
		ans=window.confirm('Do you wish to create the group...?');
		if(ans == true)
		{	
			document.forms[0].action="CMSAction.do?methodToCall=groupExists";
			document.forms[0].submit();	
			//var error = document.forms[0].errMess.value;
			//alert("message is "+document.forms[0].errMess.value);
			/*if( (document.forms[0].errMess.value=="")||error==null ){
				alert("err mess is null"+document.forms[0].errMess.value);	
				document.forms[0].action="CMSAction.do?methodToCall=createNewGroup";
				document.forms[0].submit();
			}else{
				return false;
			}		*/
			
		}
		else
			return false;
	  }
	  else
	  return false;		  
	}
	
	function validate(){
		
		if( document.forms[0].appName.value=="" ){
			alert("Please choose an Application.");
			return false;
		}
		else if( document.forms[0].rcbsCode.value=="" ){
			alert("Please enter the RCBS CODE for the application.");
			return false;
		}
		else if( document.forms[0].rcbsMgrCuid.value=="" ){
			alert("Please enter the RCBS Manager's CUID for the application.");
			return false;
		}
		else if( document.forms[0].alarmFreq.value=="" ){
			alert("Please choose the Alarming Frequency required for the certificates of the application.");
			return false;
		}
		else if( document.forms[0].appUserName.value=="" ){
			alert("Please enter the Application Usernames.");
			return false;
		}
		else
			return true;
	}

	function showAlert(){	   
			document.forms[0].action ="<%=request.getContextPath()%>/CMSAction.do?methodToCall=editProfile";
			document.forms[0].submit();	
			return true;  			
	}
function checkCuid(str)
{
	var cuid=str.value
	//alert(cuid)
	var temp = new Array();
	temp = cuid.split(",");
	//alert(temp[0]);
	//alert(temp[1]);
	//alert(temp.length);
	for(k=0;k < temp.length; k++)
		{
			//alert(temp[k].length);
			if(temp[k].length > 10)
				{
				alert("CUID can not exceed 8 characters")
				str.focus();
				return false
				}
		}
}
function checkquote(str)
{
var string=str.value
//alert(string)
var quote="'"
var quote2=","
var space = " "
//alert(string.length)
var length = string.length;

for (i = 0; i < string.length ; i++)
  {
   strChar = string.charAt(i);
   //alert(string.charAt(i))
      if (quote.indexOf(strChar) !== -1)
         {
	         alert("Single quote is not allowed!")
	         str.focus();
	      	 return false
	      }
	     
       

 }
}
function rcbscode01(str)
{
   var valid1 = str.value;
   var flag = true;
    if (valid1  !==  "" )
    {
    	flag=true;
    	
     }
     else{
      flag= false;
      alert("RCBS code can not be empty");
         
     }
    return flag;
}

function managercuid(string)
{
	var mgnrcuid = string.value;
    var flag = false;
    if (mgnrcuid  !==  "" )
    {
    	flag=true;
    	
     }
     else{
      flag= false;
      alert("RCBS Manager CUID can not be empty");
      //document.forms[0].rcbsMgrCuid.focus();
      
     }
     return flag;
}
 
</script>
</html:form>

</body>
</html:html>
