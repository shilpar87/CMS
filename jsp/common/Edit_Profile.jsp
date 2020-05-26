
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.* " %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">


<script language="javascript" type="text/javascript">

	function vali_resource(){
	document.forms[0].action="CMSAction.do?methodToCall=editProfGroupNew";
	document.forms[0].submit();
	return true;
	}
	
	function submitGroup(){
		document.forms[0].action="/CMSAction.do?methodToCall=editProfile";
		document.forms[0].submit();
		return true;
	}
	
function Display(){
	var agree=confirm("Are you sure you wish to continue?");
    if(agree){    		
			document.forms[0].action ="CMSAction.do?methodToCall=editProfile";
			document.forms[0].submit();	    		
			return true;
    		}      			
}

function DelGroup()
{
		if(checkRadio() == false)
	    {
	     alert ("Please select a Group to be Deleted !!")
	     return 	
	     }	          
         document.forms[0].action ="CMSAction.do?methodToCall=deleteGroup";
	  	 document.forms[0].submit();	 		  
	  	
 }

function callMultiply(){
              alert("inside call multiply " + document.getElementById("selectGroup").value);
              get_radio_value();
              checkRadio();
              document.forms[0].action ="CMSAction.do?methodToCall=editProfileGroup";
               document.forms[0].submit();	
                                      
               }
               
function get_radio_value()
{
	if(document.forms[0].selectGroup.length > 1)
	{
	for (var i=0; i < document.forms[0].selectGroup.length; i++)
   	{
  	 //alert(document.forms[0].selectCert.length)
 	  if (document.forms[0].selectGroup[i].checked)    
   	   {
   	   var rad_val = document.forms[0].selectGroup[i].value;
       //alert("selected id:  "+rad_val);
       var temp=rad_val;
     //  alert(rad_val);
      document.forms[0].selAppName.value=rad_val;
	   var acronym=temp+'ac'+i;
	    //   alert(" acrnom==> "+document.getElementById(acronym).value);
	   document.forms[0].selAcronym.value=document.getElementById(acronym).value;
	  // alert(document.forms[0].selAcronym.value);	   
       return rad_val;
      }
      
   }
   }
   else 
   {
   var app=document.forms[0].selectGroup.value;
   var acronym=app+'ac'+0;
   document.forms[0].selAppName.value=document.forms[0].selectGroup.value;
   document.forms[0].selAcronym.value=document.getElementById(acronym).value;
   return document.forms[0].selectGroup.value;
   
   }
}



function EditGroup(act)
{
		if(checkRadio() == false)
	    {
	     alert ("Please select  a Group !!")
	     return 	
	     }else{
	     //alert("Edit --- act"+act);
	     document.forms[0].actbut.value=act;
	     var url = "CMSAction.do?methodToCall=checkAuth";
	     postRequest(url,'editform');	     	
	     }
 }
/////////Ajax call//////////
	function postRequest(strURL,nameOfFormToPost){
               strURL=strURL+getFormAsString(nameOfFormToPost);
               
             	//alert(" uri == "+strURL);
                var http_request;
                try{
				request_send = new XMLHttpRequest();                 // This is for browsers like Opera and Mozilla
			    }
			    catch(trymicrosoft){
				  try{
					http_request = new ActiveXObject("Msxml2.XMLHTTP");      // This is for IE
				  }catch(othermicrosoft){
					  try{
						http_request = new ActiveXObject("Microsoft.XMLHTTP");  // This is for IE also
					  }catch(failed){
						      http_request = null;
					  }
				   }
			    }
				if(http_request == null){
					alert("Error in creating the request object");
				}
				else
				{
				http_request.open('POST', strURL, true);
				http_request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
			
				http_request.onreadystatechange = function(){
				var ready_status=http_request.readyState;
				if (ready_status == 4) 
        		{
	   				var status_response=http_request.status;
            		if(status_response == 200 ){
            		
            			var total_result=http_request.responseText;
            			 updatepage(total_result);
            		}
				}
				}
				http_request.send(strURL);
              }
              }
        ////gen url////
    function getFormAsString(formName){ 	
 	//Setup the return String
 	returnString ="";
 	
  	//Get the form values
 	formElements=document.forms[formName].elements;
 	
 	//loop through the array , building up the url
 	//in the form /strutsaction.do&name=value
 	
 	for ( var i=formElements.length-1; i>=0; --i ){
 		//we escape (encode) each value
 		returnString=returnString+"&"+escape(formElements[i].name)+"="+escape(formElements[i].value);
 	}
 	
 	//return the values
 	return returnString; 
 }
 //////wrint resp of Ajax//////
 	function updatepage(str){ 	
       if(str==''){
          alert("You Are Not A Member Of This Group To Edit/Remove ");
          //return false;
        }
        else if(str=='B'){
           alert("You Are Not Authorized To Edit/Remove This Group");
           //return false;
        }
        else if(str=='exp'){
           alert("Please try after some time Database having Problem");
           //return false;
        }
        else{
            var act=document.forms[0].actbut.value;
            if(act=='edit'){
            	//alert("act"+act);
            	document.forms[0].action ="CMSAction.do?methodToCall=editProfileGroup";
	  		 	document.forms[0].submit();
             }
             else if(act=='delete'){
               	//alert(" call for Remove gropu");
             	document.forms[0].action ="CMSAction.do?methodToCall=deleteGroup";
	  			document.forms[0].submit();
             }
          }
       }
//////////////////////
	function checkRadio()
	{
	
	 var GroupList = new Array()
		  obj=document.forms[0].selectGroup
		  var len = document.forms[0].length;
		 // alert(len)
		    var k=0
			var cnt = 0;
			//alert('length= '+len);
			for(i=0;i<len;i++)
			{
				if(document.forms[0].elements[i].type=='radio')
				{
					if(document.forms[0].elements[i].name=='selectGroup')
					{
						if(document.forms[0].elements[i].checked==true)
						{
						
						//alert(document.forms[0].elements[i+1].value)
						  
						  if(document.forms[0].elements[i+1].value >= 1 )
						   {
						   		//alert(document.forms[0].elements[i+1].value)
						   		//alert("You can't delete approved PAF")
						   		 return false
						    }
							//document.forms[0].checklevel.checked=true;
							//alert('value of check box '+ document.forms[0].checklevel[i].value);
							cnt= cnt+1;
							
						}
					}
				}
			}
			
			if(cnt==0)
			{
 				return false
			}
	}
	
	function checkRadioRadio()
	{   
		var flag=false;
		if(document.forms[0].selectGroup.length > 1)
  		 {
			for (var i=0; i < document.forms[0].selectGroup.length; i++)
			{
				//alert(document.forms[0].selectGroup[i]);
				if (document.forms[0].selectGroup[i].checked)
				{
					//alert(document.forms[0].selectGroup[i].value);
     				flag=true;
    				 alert(flag)
    			 }
  			}
  		}
  		else{
   		 if(document.forms[0].selectGroup.checked)
   		 {
   			  flag=true;
     	  }
  		}
  		if(flag==false)
  		{
  			 alert("select a row")
   		 	 //alert(flag)
		 	return flag;
		 }
		 return flag;
	}
</script>



<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Renewal of Certificate</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>


<body>
<form action="CMSAction.do?methodToCall=editProfile" method='post' name='editform'>
	<table border="0" align="center" width="37%" >
	
		
		<tr>		
		<td align="center" valign="top" bgcolor="336699"><u><font size="4" color="FFFFFF"><b> Create/Update Profile </b></font></u> </td> 
    	</tr>
		<tr><td>&nbsp</td></tr>
	</table>
	<table align="center" width="50%"  >	
		<tr bgcolor="DFECFF">		
			<input type="hidden" name="selAcronym" />
			<input type="hidden" name="selAppName" />
			<input type="hidden" name="actbut" value=''/>
		<td align="center" ><font size="2" color="1C50A2" ><b>Group Name</b></font></td>
		<td align="center">
		<html:select name="CMSFormBean" property="selectGroupName" size="1" style="font-size: 1.05em;">				
      		<html:option value="Starts With">Starts With</html:option>
      		<html:option value="Is Exactly">Is Exactly</html:option>
      		<html:option value="Contains">Contains</html:option>
      	</html:select>
      	<html:text name="CMSFormBean" property="groupString" />	
      	</td>
      	</tr>
      	
      	<tr bgcolor="DFECFF">
      	<td >&nbsp;</td>      	
      	<td align="center"><input type= "button" style="font-size: 1.05em; padding: 0.03em; width:90px" name = "find_grp" value ="Find Group" onclick='Display()'/></td>
		</tr>
		<tr bgcolor="FFFFFF"><td>&nbsp</td><td>&nbsp</td></tr>
	</table>
		 
	<table width="50%" align="center" >
		 <tr><td><html:messages message="true" id="mess">
		 			<table width="50%" cellpadding="1" align="center" border="1" bordercolor="336699" >
						<tr><td align="center"><font size="3" color="336699"><b><bean:write name="mess"/></b></font></td></tr>
					</table>
				</html:messages>
		</td></tr>
		<tr bordercolor="CC0033">
		<td align="center" bgcolor="FFFFCC"><FONT size="4" color="CC0033"><b><html:errors/></b></FONT>
		</td>
	</table>
			
			<%  ArrayList al=new ArrayList();
				int groupSize = 0;
			    //System.out.println(session.getAttribute("groupList"));
			    if(session.getAttribute("groupList")!=null)
 				{al=(ArrayList)session.getAttribute("groupList"); 
 				System.out.println("size is -->"+ al.size());
 				}	
			    if (session.getAttribute("groupListSize") != null){
			  		String groupListSize= session.getAttribute("groupListSize").toString();				
					groupSize = Integer.parseInt(groupListSize);				
			  		System.out.println("inside update page---Group Size ...>"+groupSize);
				}
			    if( groupSize > 0 ){			    	
			    
				%>
				
		<table width="50%" align="center" border="1" bordercolor="3377CC" bgcolor="DFECFF" cellspacing="1">		
		<tr >
			<td align="center"><font size="2" color="1C50A2" ><b>Groups </b></font></td>
				
 			<td width="50%" align="center" > 
 			<div style="overflow:auto;width:300px; height:100px; table-layout:fixed;">
 			
 			<table>
			<%int x=0;%>
 			<logic:iterate id="groupList"  name="groupList">
			<tr>
					   
		    <td align="center">
		    <input type="radio" id="groupId" name="selectGroup" value="<bean:write name="groupList" property="appName"/>" onclick="get_radio_value()"  />
		   
		    
		    <td id="<bean:write name="groupList" property="appName"/>" ><input type="hidden" value="<bean:write name="groupList" property="appName"/>" name="<bean:write name="groupList" property="appName"/>">
	          	<font face="Verdana" size="1">
					<bean:write name="groupList" property="appName"/>		          
		         </font>		        
  			 </td>
  			 <td>&nbsp;</td>  			 
		    <td id="<bean:write name="groupList" property="acronym"/>" ><input type="hidden" value="<bean:write name="groupList" property="acronym"/>" name="<bean:write name="groupList" property="appName"/>ac<%=x%>">
	          	<font face="Verdana" size="1">
					<bean:write name="groupList" property="acronym"/>		          
		         </font>
		         
		      </td>
 			</tr> <%x=x+1;%>
 			</logic:iterate>

		     </table>
 			</div>
 			<%session.removeAttribute("groupListSize");
 				}
			    else{
 			%>
 					<table><tr bgcolor="C8DFFF" ><td>
				<%
					}
			    %>
			</td>
		</tr>
       
			
        
        </table>
	  	
		<table align="center" width="50%">	  	
	  		<tr><td>&nbsp</td><td>&nbsp</td></tr>
	  		<tr>	  	
	  		<td><input type = "button"  name = "create_new_grp" style="font-size: 1.04em; padding: 0.03em; width:122px" value = "Create New Group" onclick='vali_resource()'></td>
	  		<td><input type = "button" name = "edit_sel_grp"  style="font-size: 1.04em; padding: 0.03em; width:142px" value = "Edit Selected Group" onclick='EditGroup("edit")' ></td>
	  		<td><input type = "button" name = "removeselgrp" style="font-size: 1.04em; padding: 0.03em; width:162px" value = "Remove Selected Group" onclick='EditGroup("delete")'></td>
	  		</tr>
	  	</table>
	</td>	
	</tr>
	</table>
</form>  		  	  	

</body>	
</html:html>