
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.* " %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script language="javascript" type="text/javascript"><!--

	function Cancel(){
	document.forms[0].action="CMSAction.do?methodToCall=edit_profile";
	document.forms[0].submit();
	return true;
}

function Save(){
	if(validate()==true){
		var ans=false; 
		ans=window.confirm('Do you wish to edit the Group Details ?');
		if(ans == true)	{	
			document.forms[0].action="CMSAction.do?methodToCall=editGroupSave";
			//alert("saving details......");
			document.forms[0].submit();	
			return true;
		}else{
			return false;
		}
		
	}
	else 
		return false;
}

function refresh(){
	//document.forms[0].action="CMSAction.do?methodToCall=editProfileGroup";
	//alert("refresh......");
	window.location.reload( true );	
	//document.forms[0].submit();	return true;
}

function validate(){
	if(document.forms[0].alarmTime.value==""){
		alert("Please choose the Alarming Time");
		return false;
	}
	else if(document.forms[0].rcbsMgrCuid.value==""){
		alert("Please enter the RCBS Manager Cuid");
		return false;
	}
	else 
		return true;	
}


function disp_prompt()
{
var name=prompt("Please enter your name","CUID");
//var auth=prompt("Please enter the authentication type","A");
if (name!=null && name!="" )
  {
  	if (name.length > 7)
 	 {	
  		alert("Please enter a valid cuid"+name.length);
  	}
  	else{
  		//alert("in else...");
 		 //document.write("Hello " + name + "! How are you today?");
 		 document.forms[0].hidden.value=name;
 		 //document.forms[0].authType.value=auth;
 		 //alert(document.forms[0].hidden.value=name+document.forms[0].authType.value=auth);
 		 document.forms[0].action="CMSAction.do?methodToCall=editProfileGroup";
 		 document.forms[0].submit();
 	 }
  }
  else
  alert("Please enter the cuid");
}


function get_radio_value()
{
	//alert("in get radio value...."+document.forms[0].selectCuid.value);
	var arr = new Array(document.forms[0].selectCuid.length);
	var lenth=arr.length;
	if(lenth > 1)
	{
		var temp="";
		for (var i=0; i < document.forms[0].selectCuid.length; i++)
   		{
 	  		if (document.forms[0].selectCuid[i].checked)
   	 		 {
   	   			//alert(document.forms[0].selectCuid[i].checked);	
   	 			  var rad_val = document.forms[0].selectCuid[i].value;
      			 //alert("selected id:  "+rad_val);      	 
      			 temp=rad_val+","+temp;	 
      	 			//alert(temp);
      	 			document.forms[0].selCuid.value=temp;  
      			// alert("sel cuid"+temp);
      	 			//alert(document.forms[0].selCuid.value);
      	 			//return temp;
      	
      			}           
   		  }   
  		  if (document.forms[0].selCuid.value == ""){
   	 			alert("Please choose a CUID");
   				return false;
   			}return true;
  	}
   	else 
  	 {
  	 	if (document.forms[0].selectCuid.checked){
  	 	
 			 document.forms[0].selCuid.value=document.forms[0].selectCuid.value;
 		 	// return document.forms[0].selectCuid.value;
  		 	return true;
  		 }
  		 else{
  		 	alert("Please choose a CUID");
  		 	return false;
   		 }
  	  }
 }

function popUpMember(urlToOpen){
	
	//alert("URL"+urlToOpen);
	var window_width = screen.availWidth/3;
	var window_height = screen.availHeight/3;
	var window_left = (screen.availWidth/2)-(window_width/2);
	var window_top = (screen.availHeight/2)-(window_height/2);
	var winParms = "Status=yes" + ",resizable=yes" + ",height="+window_height+",width="+window_width + ",left="+window_left+",top="+window_top;

	var newwindow = window.open(urlToOpen,'_blank',winParms);
	newwindow.focus()	
}

function addMember(){
	//document.forms[0].memList.value='';
	var x=0;
    var mem='';
    var size=document.forms[0].selectCuid.length;
    //alert(" size "+size);
    if(size>1)
	{
    for (x=0;x<size;x++){      
    mem=mem+document.forms[0].selectCuid[x].value+',';    
    }    
	//alert(mem);
	document.forms[0].memList.value=mem;
	document.forms[0].action="CMSAction.do?methodToCall=editProfGroupCuid";
 	document.forms[0].submit();
 	}else{
 	//alert(document.forms[0].selectCuid.value);
 	document.forms[0].memList.value=document.forms[0].selectCuid.value;
 	document.forms[0].action="CMSAction.do?methodToCall=editProfGroupCuid";
 	document.forms[0].submit();
 	}
}

function deleteMem(){
	//alert("Delete mem");
	if (get_radio_value()){
	document.forms[0].action="CMSAction.do?methodToCall=editProfMemDelete";
 	document.forms[0].submit();
 	}
}


</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit/Create Group</title>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>


<body>

<html:form action="/CMSAction.do?methodToCall=editProfileGroup">	
		<input type="hidden" name="hidden" />	
		<input type="hidden" name="selAcronym" />	
		<input type="hidden" name="selCuid" />
		<input type="hidden" name="authType" />
		<input type="hidden" name="memList" value=''/>
		<table align="center"  width="80%" >
		<tr bordercolor="CC0033">
		<td align="center" bgcolor="FFFFCC"><FONT size="4" color="CC0033"><b><html:errors/></b></FONT>
		</td>
		</tr>		
		</table>
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%" bgcolor="336699" bordercolor="#000000">

		<tr>
			<td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Create/Edit Group </font></u> </td> 
    	</tr>
 		</table>
		
		<br>			
				
		<table border="0" width="70%" align = "center" CELLSPACING="0" height="15%">
			
				<tr>	
				<tr bgcolor="C8DFFF">
				<td width="30%" >
				<font size="2" color=" 00638B" >Application Name</font></td>
				<td width="70%" bgcolor="C8DFFF">: 
				<html:text name="CMSFormBean" property="appName" size="60" readonly="true"/>
				</td>
				</tr>
			   
				<tr>
				<tr bgcolor="DFECFF">
				<td width="30%" >
				<font size="2" color=" 00638B" >Acronym</font></td>
				<td width="70%">: 				
				<html:text name="CMSFormBean" property="acronym" readonly="true"/>	
								
				
				</td>
			    </tr>
			    <tr>
			    <tr bgcolor="C8DFFF">
				<td width="30%" >
				<font size="2" color=" 00638B" >Creator</font></td>
				<td width="70%">: 
				<html:text name="CMSFormBean" property="creatorCuid" readonly="true"/></td>
			    </tr>
			    <tr>
				<tr bgcolor="DFECFF">
				<td width="30%" class="q" height="23">
				<font size="2" color=" 00638B" >Application User Names</font><font size="1" color="red">(comma seperated)</font></td>
				<td width="70%" height="23"> :
				<html:textarea property="appUserName" name="CMSFormBean" cols="32" rows="2"></html:textarea>				
				</td>
			    </tr>
			    <tr>
			    <tr bgcolor="DFECFF">
				<td width="30%" >
				<font size="2" color=" 00638B" >RCBS Code</font></td>
				<td width="70%">: 
				<html:text name="CMSFormBean" property="rcbsCode" /></td>
			    </tr>
			     
			    <tr>
			    <tr bgcolor="C8DFFF">
				<td width="30%" >
				<font size="2" color=" 00638B" >RCBS Manager CUID</font></td>
				<td width="70%">: 
				<html:text name="CMSFormBean" property="rcbsMgrCuid" maxlength="8" size="9"/></td>
			    </tr>
		</table>
			    
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="70%" bgcolor="lightblue" bordercolor="#000000">
				<tr>
				<td align="center" valign="top" ><u><b> Notification Information</b> </u> </td> </tr>
 		</table>
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="70%" bgcolor="336699" bordercolor="#000000">
 			
			    <tr bgcolor="DFECFF">
			    <td width="30%" class="q" >
			    <font size="2" color=" 00638B" >Alarming Time</font></td>
				<td width="70%" >:
				<html:select name="CMSFormBean" property="alarmTime" size="1" style="font-size: 1.05em;">
					<html:option value="">Select...</html:option>
					<html:option value="30">30 days</html:option>
					<html:option value="40">40 days</html:option>
					<html:option value="60">60 days</html:option>
					<html:option value="70">70 days</html:option>		
					<html:option value="90">90 days</html:option>		
				 </html:select>		      			
      			 </td></tr>				     
		 </table>
			    <center>
			    <input type="button" name="print" style="font-size: 1.05em; padding: 0.05em;" id="print" value="Save" onclick='Save()'>
				 <input type="button" name="print" style="font-size: 1.05em; padding: 0.05em;" id="print" value="Cancel" onclick ='Cancel()'>
			 	</center>
			 	
			<table border="0" align="center" cellpadding="0" cellspacing="0" width="70%" bgcolor="lightblue" bordercolor="#000000">
			    <tr><td align="center" valign="top" ><u><b>Group Member Information </b> </u></td></tr>
			</table>
			    
			<table border="0" align="center" cellpadding="0" cellspacing="1" width="70%">			   
			    <tr bgcolor="DFECFF">
				<td width="150" class="q" height="23"><font size="2" color=" 00638B" >Group Member CUID</font></td>
				<td width="325" height="23">&nbsp;&nbsp;
					<div style="overflow:auto;width:200px; height:90px; table-layout:fixed;">
					<table align="center">					
					<logic:iterate name="cuidList"  id="cuidList">
					<tr>
					<td align="center">
					<input type="checkbox" id="cuidList" name="selectCuid" value="<bean:write name="cuidList" property="memberCuid"/>"   />
					</td>
					<td align="center">
	          		<font face="Verdana" size="1"> <bean:write name="cuidList" property="memberCuid"/></font>		       
  			 		</td>
  			 		</tr>
					</logic:iterate>					
					</table>	
					</div>
				</td>		    
				</tr>		    		  
                	  
      		    <tr bgcolor="DFECFF">
    			<td width="29%" align="center" bgcolor="C8DFFF"><input type="button"  style="font-size: 1.05em; padding: 0.05em;" value="Add Member" onclick="addMember()"/></td>
    			<td width="29%" align="center" bgcolor="C8DFFF"><input type="button" name="print" style="font-size: 1.05em; padding: 0.05em;" id="print" value="Delete Member" onclick="deleteMem()" /></td>

    			</tr>
      		</table>	   			 
			 
			    		    
</html:form>
</body>
</html:html>
			    
     
