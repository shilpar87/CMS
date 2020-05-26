<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<script language="Javascript">

function submitServer(){
	if (validate()){
		document.forms[0].action ="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=checkCert";
		document.forms[0].submit();
	}
	else
		return false;
}

function validate(){
	if( document.forms[0].appServer.value=="" ){
			alert("Please enter the Application Server Name.");
			return false;
		}
	else
		return true;
}



               //testing for ajax
               function postRequest(strURL,nameOfFormToPost){
               strURL=strURL+getFormAsString(nameOfFormToPost);
              // alert(" uri == "+strURL);
                var http_request;
                try{
				request_send = new XMLHttpRequest();                 // This is for browsers like Opera and Mozilla
			}
			catch(trymicrosoft){
				try{
					http_request = new ActiveXObject("Msxml2.XMLHTTP");      // This is for IE
				}
				catch(othermicrosoft){
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
            		//alert(total_result);
            		updatepage(total_result);
            		}
				}
			}
			http_request.send(strURL);
               }
               }
               ///////
               
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
               
               function updatepage(str){
               //alert("response is => "+str)
               if(str==0){
               //alert("No Certifcates on your accont \n please Rise Request for the process to Admin 1st \n if you already done Admin has not yet done the process \n please do After some time");
               }else{
             //alert("respponse "+str);
               var hid=document.getElementById('hid').value;
              // alert("hid value "+hid);                        
                //  var newCount = -1;
             //  alert(document.getElementById('keySize').value);
                var theSel=document.getElementById('keySize');             
                var arr=new Array();
                arr=str.split(",");              
               for(i=0; i<arr.length; i++){
               //newCount++;
              if(i==0){
              if(arr.length==1){	
                theSel.options[i+1]=new Option(" "+arr[i].substring(1,arr[i].length-1), arr[i].substring(1,arr[i].length-1));
              }else{
               theSel.options[i+1]=new Option(" "+arr[i].substring(1), arr[i].substring(1));
               }
              }else{
              if(i==arr.length-1){
              theSel.options[i+1]=new Option(arr[i].substring(0,arr[i].length-1), arr[i].substring(0,arr[i].length-1));
              }else{theSel.options[i+1]=new Option(arr[i], arr[i]);
              }}
             
             
               
             }
    
                   //document.getElementById('result').value = str;
                 //  str="<jsp:include page="/jsp/tools/tool_viewCsr.jsp"/>";
                 // document.getElementById("result1").value=str;;
                  // document.getElementById("result1").innerHTML=<jsp:include page="/jsp/fun.jsp"/>;;  
                  document.getElementById('hid').value=1;
               }
               }
               function reload(){
               window.location.reload();
               
                      }
                
               function callMultiply(){ 
               var hid=document.getElementById('hid').value;           
                         //alert("hid ==> "+hid);   
                    var url = "CMSToolAction.do?methodToCall=dirList";
                    if(hid==0)
                    postRequest(url,'f1');                              
                   }
               function loadCrt(){ 
               		if((document.getElementById("keySize").value)=="null"){
               		alert("Please select File Name");                   
               		}else{
                    var url = "CMSToolAction.do?methodToCall=loadCrt";
                   // postRequest(url,'f1'); 
                 document.forms[0].action="CMSToolAction.do?methodToCall=disCrtList";
					document.forms[0].submit();
                    }           
                   }      
               
               
               function setDefaultTotxt(tempVar){

        		if(tempVar == "file"){
        			document.getElementById("Crtfile").disabled = false;
        			document.getElementById("crttest").disabled = true;
        		}
        		else{
        			document.getElementById("Crtfile").disabled = true;
        			document.getElementById("crttest").disabled = false;
        		}

        	}
               
               
          </script>
          
          




</head>

<body>
<br>
<br>
<br>
<br>
<table border="0" align="center" cellpadding="1" cellspacing="0" width="60%" bgcolor="336699" bordercolor="#000000">
<%if(request.getAttribute("error")!=null){%>
   <tr>
		<td align="center" valign="top" ><b><font size="3" color="red"><%=(String)request.getAttribute("error")%></font> </b></td> 
    </tr><tr><td></td></tr><%}%>
	<tr>
		<td align="center" valign="top" ><b><font size="3" color="FFFFFF"> LOAD CERTIFICATE </font> </b></td> 
    </tr>
 	</table><br>

<html:form action="CMSToolAction.do?methodToCall=checkCert" >
	<table>
		<tr>
		<td><font color="336699"><b>Application Server name :</b></font></td>
		<td><html:text name="CMSToolForm" property="appServer" size="35" style="font-size: 1.05em; padding: 0.05em;" /> </td>
				
		</tr>		
	</table>
	<center>
		<input type="button" style="font-size: 1.05em; padding: 0.05em;" name="sub" value="Submit" onclick="submitServer()"/>
	</center>
	<br>
	<table width="70%">
		<center><font size="1" color=" 00638B" >Note:  Please ensure that you provide the exact name of the Application Server where the Certificates are hosted.</font></center>
 	
	</table>
	
</html:form>
</body>
</html>


