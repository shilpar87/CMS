

<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<script type="text/javascript">

function loadCert(noCerts){		
		if(noCerts.value=="Certificates"){
			//alert("alert"+noCerts.value);
			document.location.href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=autoDisc";
			//document.forms[0].action="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=autoDisc";
			//document.forms[0].submit();			
		}
		else if(noCerts.value=="noCertificates"){
			alert("No Certificates in your account");
			document.forms[0].action="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=tool";
			//alert("action is "+document.forms[0].action.value);
			document.forms[0].submit();			
		}
}

</script>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tools Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />
</head>
<body>

<br><br><br><br>
<p align="left">
 <div class="sdmenu">
     <span class="title" id="top"  > <font color="black">Menu</font></span>
      <div class="submenu">
     	<%String noCerts = (String)session.getAttribute("noCerts");
     	  System.out.println("nocerts in Tools Menu ......"+noCerts);%>
        <input type="hidden" name="noCerts" value="<%=noCerts%>">
        <a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=csrform">Create CSR</a>  
        <a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=creatCrt">Create Certificate</a>  
        <a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=creatNewCsrFromOld">Create New CSR with CERT as a Model</a>  
        <a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=creatNewCsrtFromOld">Create New CERT with CERT as a Model</a>  
     <!--    <a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=reqform">Request To Search</a> -->
        <a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=autoDisc">Load Certificates</a>
        <a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=addCertToAcc">Add Certificate To My account</a> 
        <a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=loadCertFromExcel">Load Certificates from Excel</a>
                 
        	      
      </div>
</body>
</html>