<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.*, com.qwest.cms.BO.CMSBO " %>

<META http-equiv=Content-Type content="text/html; charset=iso-8859-1">



<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create CSR</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<script type="text/javascript">
function EditNet()
{
		
	     var netpin=document.getElementById('netPin');
	     var url = "CMSAction.do?methodToCall=checkAuthNet";
	    // alert("Edit --- act "+url);
	     postRequest(url,'CMSFormBean');	  
	     	    
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
       if(str=='false'){
          alert("You Are Not A Member Of This NET-PIN Group To Edit \n Plz Add Your name in "+document.getElementById('netPin').value);
          //return false;
        }else if(str=='true'){
           var appid=document.getElementById('appId').disabled=false;
			var netpin=document.getElementById('netPin').disabled=false;
        }
       }
//////////////////////



function edit(){
    	//alert("edit"+document.getElementById('netPin').value);
	//document.getElementById('firstContact').disabled=false;
	//document.getElementById('secondContact').disabled=false;
	var appid=document.getElementById('appId').disabled=false;
	var netpin=document.getElementById('netPin').disabled=true;
	//alert(appid);
	// document.forms[0].action = "/CMSAction.do?methodToCall=getContactDetails";	  	
	// document.forms[0].submit();
	// return true;
}

function Display(){
    //alert(document.getElementById('netPin').value);
    var nets = document.getElementById('netPin').value
    //alert(nets);
   if(isNaN(nets)){
     	alert("NET-PIN Should be Number Plz Enter Correct PIN");
		return false;
		}else{
		document.forms[0].action = "CMSAction.do?methodToCall=certdetails";	  	
   	 	document.forms[0].submit();
    	return true;
		
		} 
	
   // alert(typeof(s))  
   // if(typeof(s)=="string"){
	//alert("NetPin should be Number");
	//return false;
   // }
    
}
function Cancel(){
    document.forms[0].action = "CMSAction.do?methodToCall=search";	  	
    document.forms[0].submit();
    return true;
}

</script>

<body>
<html:form action="/CMSAction.do?methodToCall=certdetails" >



<%String appName = (String)session.getAttribute("appName");
System.out.println("appname in jsp &&&&&&&&&&&&&&&&&&&&&&& "+appName);
ArrayList cscDetails = (ArrayList)session.getAttribute("cscDetails");
System.out.println("============= cscDetails in jsp "+cscDetails.size());

for(int i=0;i<cscDetails.size();i++){
    CMSBO bo = (CMSBO)cscDetails.get(i);
    String netPin = bo.getNetPin();
    String Contact1 = bo.getFirstContact();
    String Contact2 = bo.getSecondContact();
    String appId = bo.getAppID();
   System.out.println("JSPPPPPPPPPPPPPPPP  "+netPin+" "+ appId);
   
if(!(netPin == null) || !(Contact1 == null)|| !(Contact2 == null)||!(appId == null) ){
 %>
 
 <%if((request.getAttribute("invalid")!=null) && !(netPin == null)){%>
 <table = "center" align="center" valign="top">
 <tr>
 <td align="center" valign="top" ><b><font size="3" color="red"><%=(String)request.getAttribute("invalid")%></font> </b></td>
 </tr><tr><td></td></tr><%}else if(request.getAttribute("invalidNet")!=null){%>
     <table = "center" align="center" valign="top">
     <tr>
     <td align="center" valign="top" ><b><font size="3" color="red"><%=(String)request.getAttribute("invalidNet")%></font> </b></td>
     </tr><tr><td></td></tr>
     <%}%>
 </table><br>

 <table border="0"  cellpadding="5" cellspacing="1"   bgcolor="FFFFFF"   width="40%" align="center">
 <tr bgcolor="#D6E1EE">
 	<td align="center" colspan="4">
 	<font face="Verdana" size="2" color="123660"><b><%=appName%></b></font>
     </td></tr>
 </table>

 
 <table border="0" cellpadding="5" cellspacing="1" bgcolor="FFFFFF" width="60%" align="center">
 <tr bgcolor="f1f1f1">
 <td align="right" ><font size="2" color="004488" >Net Pin : </td>
 <td align="left" width="" height="30"><input type="text" class="text"  value = '<%=netPin%>' size="42"  name="netPin" >
 
 </td>
 
 </tr>

 <tr bgcolor="f1f1f1">
 <td align="right" ><font size="2" color=" 004488" >Application UserName : </td>
  <td align="left" width="" height="30"> <input type="text" class="text"  value = '<%=appId%>' size="42"  name="appId">
 </td>
 </tr>



 </table>

 
 
 <table border="0" align="center">
 <tr>     	
 <td align="center"><input type= "button" style="font-size: 1.05em; padding: 0.03em; width:90px" name = "find_grp" value ="Go" onclick='Display()'/></td>
 
 </tr>
 </table>
 
 

 <%}else if((netPin == null) || (appId == null) ){ %>
 
 <%if((request.getAttribute("invalidNet")!=null)){%>
 <table = "center" align="center" valign="top">
 <tr>
 <td align="center" valign="top" ><b><font size="3" color="red"><%=(String)request.getAttribute("invalidNet")%></font> </b></td>
 </tr><tr><td></td></tr><%}%>
   </table><br>
 
 
<table border="0"  cellpadding="5" cellspacing="1"   bgcolor="FFFFFF"   width="40%" align="center">

	<td align="center" colspan="4"><font face="Verdana" size="2" color="123660"><b><%=appName%></b></font>
   </td></tr>
</table>

<table border="0" cellpadding="5" cellspacing="1" bgcolor="FFFFFF" width="60%" align="center">
<tr bgcolor="#D6E1EE">
<td align="right" ><font size="2" color=" 004488" >Net Pin : </td>
<td align="left" width="" height="30"> <input type="text" class="text"   name="netPin" > </td>
</tr>

<tr bgcolor="#D6E1EE">
<td align="right" ><font size="2" color=" 004488" >Application UserName : </td>
 <td align="left" width="" height="30"> <input type="text" class="text"   name="appId">
</td>
</tr>



</table>
<table border="0" align="center">
<tr>
<td align="center"><input type= "button" style="font-size: 1.05em; padding: 0.03em; width:90px" name = "find_grp" value ="Submit" onclick='Display()'/>
<input type= "button" style="font-size: 1.05em; padding: 0.03em; width:90px" name = "Back" value ="Back" onclick='Cancel()'/></td>
</tr>
</table>
<%}}%>


</html:form>


</body>
</html>

