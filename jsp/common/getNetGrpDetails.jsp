<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.*, com.qwest.cms.BO.CMSBO " %>

<META http-equiv=Content-Type content="text/html; charset=iso-8859-1">
<!---  lookup_top.tmpl --->

<!-- saved from url=(0022)http://internet.e-mail -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 3.2//EN">
<HTML>

<HEAD>
	<META HTTP-EQUIV="Content-Type" CONTENT="text/html;CHARSET=iso-8859-1">
<META HTTP-EQUIV="Content-Type" CONTENT="text/html">
<META NAME="Description" CONTENT="">
<META NAME="Keywords" CONTENT="">
<SCRIPT language="JavaScript"> 
function next(){

		//document.getElementbyId("appSearch1").value
		//document.getElementById('appSearch1').value=appName;
		document.netform.action = "CMSAction.do?methodToCall=certSerdetails";	  	
   	 	document.netform.submit();
    	return true;
}
function edit(){

		//alert("asdghswdguiqwyd");
    
    		//alert(document.netform.app_name.value)
    		document.netform.app_name.value;
		document.netform.action = "CMSAction.do?methodToCall=getContactDetails&appName=app_name";	  	
   	 	document.netform.submit();
    	return true;
}
</script>

	<META NAME="GENERATOR" Content="Visual Page 2.0 for Windows">
	<TITLE>The CSC Database</TITLE>
</HEAD>

<BODY BGCOLOR="white">

<P></P>

<P><SCRIPT language="JavaScript"> 
    document.write(theqMenu()); 
    resizeMenu(); 
</SCRIPT> <SCRIPT  SRC="/csc/javascript/header.js"
language="JavaScript" type="text/javascript"></SCRIPT> 
<TABLE BORDER="0" CELLPADDING="0" CELLSPACING="0" WIDTH="853">
	<TR>
		<TD WIDTH="154" ALIGN="LEFT" VALIGN="TOP">



		</TD>
		<TD VALIGN="TOP">
			<TABLE BORDER="0" CELLPADDING="5" CELLSPACING="0" WIDTH="596">
				<TR>
					<TD>
						<P>
						<TABLE BORDER="0" WIDTH="100%">
							<TR>
 

<BODY BGCOLOR="white">
<%String appName = (String)session.getAttribute("appName");
HashMap map=(HashMap)session.getAttribute("netmap");
System.out.println(appName+" appname ^^^^^^^^^^^^^ in jsp "+map.size());
%>

<%if(request.getAttribute("error")!=null){%>
<tr>
<td align="center" valign="top" ><b><font size="3" color="red"><%=(String)request.getAttribute("error")%></font> </b></td>
</tr><tr><td></td></tr><%}%>
</table><br>

	
 <TABLE BORDER=5 CELLPADDING=5 CELLSPACING=0 WIDTH=596>
	  
  <TR>
   
   <TD ALIGN="CENTER" COLSPAN="4" BGCOLOR="#D6E1EE">
   
   <B><FONT SIZE="3"  FACE="Arial, Helvetica"><%=(String)session.getAttribute("appName")%></FONT>
   
     <FONT SIZE="2"  FACE="Arial, Helvetica"> ( <I>Application</I> )</FONT></B></P></TD>
   
  </TR>
  
<!-- application -->
<form name='netform' action="/CMSAction.do?methodToCall=getContactDetails" method='post'>

<input type='hidden' name='appSearch1'/>
<TR>
 <TD WIDTH="25%" VALIGN="TOP"><B>
  <FONT SIZE="2" FACE="Arial, Helvetica">Application UserId:</FONT></B></TD>
 <TD WIDTH="25%" VALIGN="TOP">
  
   <b><%=(String)session.getAttribute("appId")%></b>
  
 <TD VALIGN="TOP"><B>
  <FONT SIZE="2" FACE="Arial, Helvetica">NET-PIN:</FONT></B></TD>
 <TD VALIGN="TOP">
  <FONT SIZE="2" FACE="Arial, Helvetica" color=black>
    <%=(String)session.getAttribute("netPin")%></FONT></TD>
</TR>
<TR>
 <TD VALIGN="TOP" WIDTH="25%"><B>
  
  <FONT SIZE="2" FACE="Arial, Helvetica">Application <%="GroupName"%><br>  
</FONT></B></TD>
 <TD VALIGN="TOP" COLSPAN="3">
  <FONT SIZE="2" FACE="Arial, Helvetica" color=black>
    <%=map.get("GroupName")%></FONT></TD>
</TR>
<TR>
 <TD VALIGN="TOP" WIDTH="25%"><B>
  
  <FONT SIZE="2" FACE="Arial, Helvetica">Application <%="GroupType"%><br>  
</FONT></B></TD>
 <TD VALIGN="TOP" COLSPAN="3">
  <FONT SIZE="2" FACE="Arial, Helvetica" color=black>
    <%=map.get("GroupType")%></FONT></TD>
</TR>
<TR>
 <TD VALIGN="TOP" WIDTH="25%"><B>
  
  <FONT SIZE="2" FACE="Arial, Helvetica">Application <%="GroupOwner"%><br>  
</FONT></B></TD>
 <TD VALIGN="TOP" COLSPAN="3">
  <FONT SIZE="2" FACE="Arial, Helvetica" color=black>
    <%=map.get("GroupOwner")%></FONT></TD>
</TR>
<TR>
 <TD VALIGN="TOP" WIDTH="25%"><B>
  
  <FONT SIZE="2" FACE="Arial, Helvetica">Application <%="PrimaryOncall"%><br>  
</FONT></B></TD>
 <TD VALIGN="TOP" COLSPAN="3">
  <FONT SIZE="2" FACE="Arial, Helvetica" color=black>
    <%=map.get("PrimaryOncall")%></FONT></TD>
</TR>
<TR>
 <TD VALIGN="TOP" WIDTH="25%"><B>
  
  <FONT SIZE="2" FACE="Arial, Helvetica">Application <%="BackupOncall"%><br>  
</FONT></B></TD>
 <TD VALIGN="TOP" COLSPAN="3">
  <FONT SIZE="2" FACE="Arial, Helvetica" color=black>
    <%=map.get("BackupOncall")%></FONT></TD>
</TR>
<TR>
 <TD VALIGN="TOP" WIDTH="25%"><B>
  
  <FONT SIZE="2" FACE="Arial, Helvetica">Application <%="FirstEscalation"%><br>  
</FONT></B></TD>
 <TD VALIGN="TOP" COLSPAN="3">
  <FONT SIZE="2" FACE="Arial, Helvetica" color=black>
    <%=map.get("FirstEscalation")%></FONT></TD>
</TR>
<TR>
 <TD VALIGN="TOP" WIDTH="25%"><B>
  
  <FONT SIZE="2" FACE="Arial, Helvetica">Application <%="SecondEscalation"%><br>  
</FONT></B></TD>
 <TD VALIGN="TOP" COLSPAN="3">
  <FONT SIZE="2" FACE="Arial, Helvetica" color=black>
    <%=map.get("SecondEscalation")%></FONT></TD>
</TR>
<TR>
  <TD>
   <FONT SIZE="2" FACE="Arial, Helvetica"><B>Application <%="GroupMembers"%>:
   </B>
  </TD>
  <TD COLSPAN=3>
  <%String []str=(String[])map.get("GroupMembers");
  for(int i=0;i<str.length-1;i++){;%>
  <%=str[i]%>, <%=str[++i]%><br>
  <%}%> </FONT>
  </TD>
  </TR>
  <INPUT TYPE=HIDDEN NAME=app_name VALUE='<%=(String)session.getAttribute("appName")%>'>
  </form>
<TABLE BORDER="0" WIDTH="100%">
<TR>
<TD>
<INPUT TYPE="button" style="font-size: 1.05em; padding: 0.03em; width:90px" NAME="action" VALUE="Edit" onclick='edit()' >
<INPUT TYPE=HIDDEN NAME=app_id VALUE=8913>

</TD>
<td align="center"><input type= "button" style="font-size: 1.05em; padding: 0.03em; width:90px" name = "find_grp" value ="NEXT" onclick='next()' /></td>
</TR>
</TABLE>
<!-- lookup_bot -->

<H1>
</TD>
</TR>
</TABLE>
</TD>
</TR>
</TABLE>

<br><br>
<hr>
<!-- footer --> <SCRIPT  SRC="/csc/javascript/footer.js" language="JavaScript" type="text/javascript"></SCRIPT> <!-- end footer -->

</BODY>
</HTML>
