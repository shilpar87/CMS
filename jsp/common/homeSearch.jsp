<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@page import="com.qwest.cms.BO.CMSBO, java.util.Calendar, java.text.* "%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />

</head>

<script language="Javascript">
               function postRequest(strURL,nameOfFormToPost){
               // strURL=strURL+getFormAsString(nameOfFormToPost);
                    var xmlHttp;
                    if(window.XMLHttpRequest){ // For Mozilla, Safari, ...
                         var xmlHttp = new XMLHttpRequest();
                    }
                    else if(window.ActiveXObject){ // For Internet Explorer
                         var xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
                    }
                    xmlHttp.open('POST', strURL, true);
                    xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
                    xmlHttp.onreadystatechange = function(){
                         if (xmlHttp.readyState == 4){
                              updatepage(xmlHttp.responseText);
                         }
                    }
                   // alert(" uri == "+strURL);
                    xmlHttp.send(strURL);
               }
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
                              //  document.getElementById("result1").value=str;;
                               }
               
               function callMultiply(){
              // alert("inside ajax== " + document.getElementById("selectCert").value)
               
                  // var a = parseInt(document.f1.a.value);
                   
                    var url = "CMSAction.do?methodToCall=ajax&selectCert="+get_radio_value();
                    postRequest(url,'f1');                   
                    //reload();
                                      
               }
               
         


var certificateid = 0;
function get_radio_value()
{
if(document.forms[0].selectCert.length > 1)
{
for (var i=0; i < document.forms[0].selectCert.length; i++)
   {
   //alert(document.forms[0].selectCert.length)
   if (document.forms[0].selectCert[i].checked)
    //alert(document.forms[0].selectCert[i].checked)
      {
      var rad_val = document.forms[0].selectCert[i].value;
      //certificateid = rad_val;
       //alert("selected id:  "+rad_val)
       return rad_val;
      }
      
   }
   }
   else 
   {
   return document.forms[0].selectCert.value;
   }
}
function checkRadio()
{   
	var flag=false;
	if(document.forms[0].selectCert.length > 1)
   {
	for (var i=0; i < document.forms[0].selectCert.length; i++)
	{
	if (document.forms[0].selectCert[i].checked)
	{
     flag=true;
    // alert(flag)
     }
  }
  }
  else{
    if(document.forms[0].selectCert.checked)
    {
     flag=true;
    
     }
      
   }
  if(flag==false)
  {
   alert("Please select a Certificate before you proceed...")
     //alert(flag)
	 return flag;
	 
	 }
	 return flag;
}
function status()
{

var res = checkRadio();
alert(res)
if(res==true)
{
  str="ksdkksdkdksdk";
 
  
  //document.getElementById("respage").innerHTML=str;;
  
  //document.getElementById("respage").innerHTML = "<jsp:include page='../status.jsp' flush='true' />";;
  //document.getElementById("respage").innerHTML=str;;
  alert("after innerHTML");
  
}

}
function reload(){
               window.location.reload();               
                      }
function fun(v)
{

if(document.forms[0].selectCert.length > 1)
{
for (var i=0; i < document.forms[0].selectCert.length; i++)
    { //alert(" in fun fun  "+document.forms[0].selectCert[i].value +" "+v);
    if (document.forms[0].selectCert[i].value==v){
   document.forms[0].selectCert[i].checked=true;
   //alert("hi == "+document.forms[0].selectCert[i].value)
   }
   }
   }
else {
 if (document.forms[0].selectCert.value==v){
   document.forms[0].selectCert.checked=true;
   //alert("hi == "+document.forms[0].selectCert[i].value)
   }
 }
}

</script>
<%
String checkedRadioValue=(String)session.getAttribute("checkedRadioValue");
System.out.println(" in homeSearch jsp ============ == >"+checkedRadioValue);
if(checkedRadioValue!=null){
%>
<body onload="fun(<%=checkedRadioValue%>)">
<%}else{ %><body ><%} %>
<form name="f1" action="/CMSAction.do?methodToCall=getCertDetails" enctype="multipart/form-data">
<div style="font-size:small;font-family:monospace;">
<% ArrayList al=new ArrayList();
String totlCert= session.getAttribute("totalCert").toString();
int totalCert = Integer.parseInt(totlCert);
//System.out.println("inside homepage****&&&&--->" + totalCert);
String expDateStr = null;


<table width="832" border="0" cellspacing="1" cellpadding="3" bgcolor="FFFFFF" style="border-top: 10px; border-top-color: 000000" bordercolor="26466D">


<tr bgcolor="#D6E1EE" ><th width="3%"></th><th width="28%"><font color="123660">Certificate Name</font></th><th width="17%"><font color="123660">Application Name</font></th><th width="11%"><font color="123660">Acronym</font></th><th width="14%"><font color="123660">Nick 
Name</font></th><th width="9%"><font color="123660">Type</font></th><th width="10%"><font color="123660">Expiry Date</font></th><th width="8%"><font color="123660">	Status</font></th></tr>
</table>

</div>
<div style="overflow-y: scroll; width:850px; height:180px; table-layout:fixed;">

<table style="table-layout: fixed;" width="100%" border="0" cellspacing="1" cellpadding="0" bgcolor="FFFFFF">
<logic:iterate id="certDetails"  name="certDetails">
<tr bgcolor="f1f1f1">
<bean:define id="dd" name="certDetails" property="daysDiff" type="java.lang.String" />

<td style="width:3%" align="center" align="center" > 
		   
		   <input type="radio" id="serialId" name="selectCert" value="<bean:write name="certDetails" property="serialNo"/>" onclick="callMultiply()"  />
		    </td> 
 	<td style="width:17%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
					<b><bean:write name="certDetails" property="appName"/></b>		          
		         </font>
		       </td>
    <td style="width:11%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
					<b><bean:write name="certDetails" property="acronym"/>		</b>          
		         </font>
		       </td>
		    
		    <td style="width:14%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
					<b><bean:write name="certDetails" property="nickName"/></b>		          
		         </font>
		       </td>
         	 <td style="width:9%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
					<b><bean:write name="certDetails" property="type"/>	</b>	          
		         </font>
		       </td>         		       
		       <td style="width:10%" align="center">
	          	<font face="Verdana" size="1" color="CC0044">
					<b><bean:write name="certDetails" property="expDate"/>	</b>	          
		         </font>
		       </td>
		       
	         	       		       
	         <td style="width:8%" align="center" color="CC0044">
	          <bean:define id="res" name="certDetails" property="status" type="java.lang.String" />

	          
	          <%
	           if(res.equalsIgnoreCase("active"))
	           {
	           %>
	           
	           
	          	<font color="green" face="Verdana" size="1">
					<bean:write name="certDetails" property="status"/>		          
		         </font>
		        <% } 
	           else if(res.equalsIgnoreCase("expired")) {
		        %>
		        	<font color="red" face="Verdana" size="1">
					<bean:write name="certDetails" property="status"/>		          
		         </font>
		        <% } 
	           else if(res.equalsIgnoreCase("inactive")) {
		        %>
		        <font color="#00FFFF" face="Verdana" size="1">
					<bean:write name="certDetails" property="status"/>		          
		         </font>
		        <% } 
	           else  {
		        %>
		         <font color="blue" face="Verdana" size="1">
					<bean:write name="certDetails" property="status"/>		          
		         </font>
		        <% } %>
	           
		        
		         </td>
		          
 
</tr>

</logic:iterate>


</table>

</div>




<%
//System.out.println("size is ***** -->"+ al.size());
if(al.size()!= 0)
{
//System.out.println("size is not zero...");
%>

<div style="width:850px; height:10px;" >
<table width="100%" border = "1" cellspacing="0" cellpadding="7" >
<tr bgcolor="D6E1EE" style = "font-family: Verdana;color:#123660;"     >
<%if(session.getAttribute("pageToCall")!=null){
		String pageName=(String)session.getAttribute("pageToCall");
		if(pageName.equals("status"))
			{%>
<td id="status" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<%}else if(pageName.equals("details"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<%}else if(pageName.equals("summary"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<%}else if(pageName.equals("functions"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<%}else	if(pageName.equals("history"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<%}else if(pageName.equals("notes"))
			{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b>Status</b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b>Details</b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b>Summary</b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b>Functions</b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b>History</b></a></td>
<td id="notes" align="center" width="80" bgcolor="#9e9fb1" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b>Notes</b></a></td>
<%}}else{%>
<td id="status" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a   href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=status"><b><font color = "123660">Status</font></b></a></td>
<td  id="details" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=details"><b><font color = "123660">Details</font></b></a></td>
<td id="summary" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=summary"><b><font color = "123660">Summary</font></b></a></td>
<td  id="Functions" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=Functions"><b><font color = "123660">Functions</font></b></a></td>
<td  id="history"  align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=history"><b><font color = "123660">History</font></b></a></td>
<td id="notes" align="center" width="80" bgcolor="#D6E1EE" onclick="return checkRadio()"><a href="<%=request.getContextPath()%>/CMSAction.do?methodToCall=notes"><b><font color = "123660">Notes</font></b></a></td>
<%}%>
</tr>

</table>
</div>
</form>
<div style="width:850px; height:130px;overflow:scroll" >
<table width="100%" cellspacing="2" cellpadding="7">
<tr>
<%if(session.getAttribute("pageToCall")!=null){
		String pageName=(String)session.getAttribute("pageToCall");
		if(pageName.equals("status"))
			{%>
				<td>
				<jsp:include page ="/jsp/common/status.jsp"/>
				</td>
			<%}
		else if(pageName.equals("details"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/detail.jsp"/>
				</td>	
			<%}
		else if(pageName.equals("summary"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/summary.jsp"/>
				</td>
			<%}
			else if(pageName.equals("history"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/History.jsp"/>
				</td>
			<%}
			else if(pageName.equals("notes"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/Notes.jsp"/>
				</td>
			<%}
			else if(pageName.equals("history"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/History.jsp"/>
				</td>
			<%}
			else if(pageName.equals("functions"))
			{%>
  				<td>
				<jsp:include page ="/jsp/common/funtions.jsp"/>
				</td>
			<%}
	}%>
</tr>
</table>
</div>
<%
}
%>





</body>

</html>
