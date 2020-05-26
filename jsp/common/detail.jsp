<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.*,com.qwest.cms.BO.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<html>

<header></header>

<%System.out.println("inside detail jsp **************");
ArrayList rcbsList = new ArrayList();
rcbsList = (ArrayList)session.getAttribute("rcbsList");
ArrayList certDetails = (ArrayList)session.getAttribute("certDetails");
System.out.println("certDetails in jsp "+certDetails.size());
%>

<%String serialNo="";%>

<%
if(session.getAttribute("checkedRadioValue")!= null)
{
  serialNo = session.getAttribute("checkedRadioValue").toString();
 
}%>

<%for(int i=0;i<certDetails.size();i++){
	CMSBO cms = (CMSBO)certDetails.get(i);
	String algorithm = (String)cms.getSignature_algo();
	String nickName = (String)cms.getCertNickname();
	String certName = (String)cms.getRaw_certificate();
	String pki_extn=(String)cms.getRaw_certificate();
	 if(pki_extn != null)
	 {
		 pki_extn= pki_extn.substring(pki_extn.lastIndexOf("."));
		 System.out.println("pki_extn  "+pki_extn);
	 }
	 System.out.println("inside details page: certName-->"+ certName);
	 System.out.println("inside details page: nickName-->"+ nickName);
	 System.out.println("inside details page: nickName-->"+ algorithm);
	 System.out.println("inside details page: pki_extn-->"+ pki_extn);
	%>

<br><u><b>Certificate Information</b></u>
<br>
<br>Certificate File Name: <b><font color="003388"> <%=certName%></font></b>
<br>
<br>Certificate Nick Name: <b><font color="003388"> <%=nickName%></font></b>
<br>
<br>PKI Extension: <b><font color="003388"> <%=pki_extn%></font></b>
<br>
<br>Algorithm used: <b><font color="003388"> <%=algorithm%></font></b>
<br>
<%}%>
<%for(int j=0;j<rcbsList.size();j++){
	 CMSBO cmsbo = (CMSBO)rcbsList.get(j);
	 String suppDir=(String)cmsbo.getSuppDir();
	 String suppMgr = (String)cmsbo.getSuppMgr();
	 String suppPrjMgr = (String)cmsbo.getSuppProjMgr();
	 String devDir = (String)cmsbo.getDevDirector();
	 String devMgr = (String)cmsbo.getDevMnanger();
	 String devPrjMgr = (String)cmsbo.getDevProjMgr();
	 if(suppPrjMgr==null){
	     suppPrjMgr="NONE";
	 }
	 if(devPrjMgr==null){
	     devPrjMgr="NONE";
	 }
	 if(suppDir==null){
	     suppDir="NONE";
	 }
	 if(suppMgr==null){
	     suppMgr="NONE";
	 }
	 if(devDir==null){
	     devDir="NONE";
	 }
	 if(devMgr==null){
	     devMgr="NONE";
	 }
	 System.out.println("inside details page: suppDir-->"+ suppDir);
	 System.out.println("inside details page: suppMgr-->"+ suppMgr);
	 System.out.println("inside details page: suppPrjMgr-->"+ suppPrjMgr);
	 System.out.println("inside details page: devDir-->"+ devDir);
	 System.out.println("inside details page: devMgr-->"+ devMgr);
	 System.out.println("inside details page: devPrjMgr-->"+ devPrjMgr);
	 
	
%>
<br>
<br><u><b>Other information:</b></u>
<br>
<br>Support Director: <b><font color="003388"> <%=suppDir%></font></b>
<br>
<br>Support Manager : <b><font color="003388"> <%=suppMgr%></font></b>
<br>
<br>Supp. Project Manager : <b><font color="003388"> <%=suppPrjMgr%></font></b>
<br>
<br>Dev. Director : <b><font color="003388"> <%=devDir%></font></b>
<br>
<br>Dev. Manager : <b><font color="003388"> <%=devMgr%></font></b>
<br>
<br>Dev Project Manager : <b><font color="003388"> <%=devPrjMgr%></font></b>

<%}%>
</html>

