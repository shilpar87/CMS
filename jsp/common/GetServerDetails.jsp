<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.*, com.qwest.cms.BO.* " %>



<script type="text/javascript">

function initNodes(){
	//alert("jsdbsjdg");
var uls = document.getElementsByTagName("ul");
var i;
    for(i = 0; i < uls.length; i++)    	
        if(uls[i].id != "hostId")
            uls[i].style.display = "none";
}

function clickNode(id){
var node = document.getElementById(id);
    if(node.style.display == "none"){
         node.style.display = "block";
    }
    else{
        node.style.display = "none";
        }
    return false;
}

</script>

<html:html>
<body onload="initNodes()">
<table border="0"  cellpadding="5" cellspacing="1"   bgcolor="FFFFFF"   width="60%" align="center">
<tr bgcolor="#D6E1EE">
		<td align="center" colspan="4"><font face="Verdana" size="2" color="123660"><b>Search Account - Host Details</b></font>
		</td>
	</tr>
</table>

<%String appName = (String)session.getAttribute("appName");
System.out.println("appname ^^^^^^^^^^^^^ in jsp "+appName);%>


<table border="0" cellpadding="5" cellspacing="1" bgcolor="FFFFFF" align="center">
<tr bgcolor="white">
<td align="center" width="150%" colspan="4"><font face="Verdana" size="2" color="123660"><b><%=appName%></b></font>
</td>
</tr>
<ul id="hostId">
<tr></tr><tr>
<td align = "center">
	
      	<% ArrayList hostList = (ArrayList)session.getAttribute("hostList1");
    	for (int k=0;k<hostList.size();k++){
    	    CMSBO bo = (CMSBO)hostList.get(k);
    	    String serverName = bo.getHostId();
    	    System.out.println("serverName    "+bo.getHostId());%>
    	    <li>
    	    <a href = 'CMSAction.do?methodToCall=getCertDetails&serverName=<%=serverName%>'
    	    <li><u><%=serverName%></u></li></a>
 <%}%>
 
 </li>   
</ul>

</td>
</tr>
</ul>
</table>
</body>
</html:html>