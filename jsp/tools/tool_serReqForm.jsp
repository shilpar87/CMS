
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.util.*" %> 
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script type="text/javascript" >

function sendReq(){	
	if ( validate()){
		document.forms[0].action="CMSToolAction.do?methodToCall=sendReq";
		document.forms[0].submit();
	}
	else
		return false;
}

function validate(){
		
		if( document.forms[0].appName.value=="" ){
			alert("Please choose an Application.");
			return false;
		}
		else if( document.forms[0].appServer.value=="" ){
			alert("Please enter the Application Server Name.");
			return false;
		}
		else if( document.forms[0].aipName.value=="" ){
			alert("Please enter the AIP's CUID for the application.");
			return false;
		}		
		else
			return true;
	}

</script>

<html:html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> KeyPair Generate </title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css" />
</head>

<%System.out.println("in tool_seReqForm jspppppppppp ");%>

<body>
<html:form action="/CMSToolAction.do?methodToCall=reqform"> 
<table border="0" align="center" cellpadding="0" cellspacing="0" width="45%"  bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><b><font size="3" color="336699"><I> Application Specific Certificate Search Request Form </I> </font></b></td> 
    </tr>
</table> 	
 	<br>
 	
 	<table align="center"  width="80%">
		<tr><td><html:messages message="true" id="mess">
		 			<table width="100%" cellpadding="1" align="center" border="1" bordercolor="336699" >
						<tr><td align="center"><font size="2" color="CC1155"><b><bean:write name="mess"/></b></font></td></tr>
					</table>
				</html:messages>
		</td></tr>		
	</table>
 	
	
	
 	<div style="width:700px; height:9px" >
	<table  width ="70%" cellspacing="1" cellpadding="1" border="0">


	<tr bgcolor="C8DFFF" >  
		<td align="right"><font size="2" color=" 00638B" >Application Name :</td>	
		<td align="left" width="" height="30">  
		<html:select name="CMSToolForm" property="appName"  size="1" style="font-size: 1.05em;"  style="WIDTH: 300px; HEIGHT: 22px" >
			<html:option value="">Select...</html:option>
			<%if(session.getAttribute("tool_appList")!=null){
			  ArrayList appList=(ArrayList)session.getAttribute("tool_appList");
			  if(appList.size()>0){
			  for(int i=0;i<appList.size();i++){
			  com.qwest.cms.BO.CMSBO bo=(com.qwest.cms.BO.CMSBO)appList.get(i);
			  String appName=bo.getAppName();
			%><html:option value="<%=appName%>"><%=appName%></html:option>
			<%}}}%>
			</html:select>
		</td>
	</tr>	
	<tr bgcolor="C8DFFF" >  
		<td align="right"><font size="2" color=" 00638B" >App Server Name:<font size="1" color="red">(comma seperated)</font></td>	
		<td align="left"  height="30"> 
			<html:textarea rows="2" cols="46" name="CMSToolForm" property="appServer"  />
		</td>
	</tr>
	<tr bgcolor="C8DFFF" >  
		<td align="right"><font size="2" color=" 00638B" >AIP CUID (TO) :</td>	
		<td align="left" width="" height="30"> 
			<html:text name="CMSToolForm" property="aipName" />
		</td>
	</tr>
	<tr bgcolor="C8DFFF">  
		<td align="right"><font size="2" color=" 00638B" >Message (optional):</td>	
		<td align="left" width="" height="30"> 
			<html:textarea property="notes" name="CMSToolForm" cols="50" rows="3"></html:textarea>
		</td>
	</tr>
 	</table>	
	<table>
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
				<td>&nbsp</td>
		
		<td> <input type="button"  value="Send Request Mail" style="font-size: 1.02em; padding: 0.02em;" onclick="sendReq()"/></td>
		
		<td> &nbsp</td>
		<td> <html:reset value="Reset" style="font-size: 1.02em; padding: 0.02em;"></html:reset></td>
	</tr>
	</table>
	<br>
	
</html:form> 	

<%ArrayList info=new ArrayList();
 if(session.getAttribute("info")!=null)
 {info=(ArrayList)session.getAttribute("info");
 if(info.size()>0){ %>
 <%=(String)(info.get(0).toString())%>
 <%}info.clear();}
  %>
</body>
</html:html>