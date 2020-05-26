<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page import="java.util.* " %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script>

function submitDetails(){
	if(validation()==true){
		document.forms[0].action="CMSAction.do?methodToCall=editProfCuidInsert";
 		document.forms[0].submit();
	}
	else
	return false;	
}

function cancel(){	   		
			document.forms[0].action ="<%=request.getContextPath()%>/CMSAction.do?methodToCall=home";
			document.forms[0].submit();	  			
}

function validation(){	
       
	if(document.forms[0].memberCuid.value==""){		
		alert("Please enter a valid CUID");
		return false;
	}
	else if(document.forms[0].auth_type.value==""){	
		alert("Please Choose the Authority type for the member");
		return false;
	}
	else if(document.forms[0].memberCuid.value.length>8){		
		alert("CUID cannot exceed 8 characters");
		return false;
	}
	else{
		var str=document.forms[0].extMem.value;
		//alert(str);
   	 	var arr=new Array();
   	 	var cuid=document.forms[0].memberCuid.value;
    	arr=str.split(","); 
    	//alert(arr.length-1);             
    	for(i=0; i<arr.length; i++){
     	 	//alert(" spling done  ==>"+arr[i]+cuid.toUpperCase());
       		if(arr[i]==cuid.toUpperCase()){
      		 alert(cuid.toUpperCase()+" is already a Member of this Group \n         Please Add a New Member");
       		return false;
   		 	}
    	 }
		return true; 
    }
}
</script>

<html:html>
<html:form action="/CMSAction.do?methodToCall=editProfGroupCuid">	

			<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%" bgcolor="336699" bordercolor="#000000">
			<tr>
			<td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Create/Edit Group </font></u> </td> 
    		</tr>
 			</table>
 			<table align="center"  width="80%" >
				<tr bordercolor="CC0033">
					<td align="center" bgcolor="FFFFCC"><FONT size="4" color="CC0033"><b><html:errors/></b></FONT></td>
				</tr>		
			</table>
 			<input type="hidden" name="extMem" value='<%=request.getParameter("memList").toString()%>'/>
			<table width=60% align="center">			
				<tr bgcolor="CCDDFF">
				<td width="150" class="q" height="23">
				<font size="2" color=" 00638B" >CUID</font></td>
				<td width="325" height="23">: 
				<html:text name="CMSFormBean" property="memberCuid" /></td>
			    </tr>
			    <tr bgcolor="CCDDFF">
				<td width="150" class="q" height="23">
				<font size="2" color=" 00638B" >Authority Type</font></td>
				<td width="325" height="23">: 
				<html:select name="CMSFormBean" property="auth_type" size="1" style="font-size: 1.05em;">
					<html:option value="">Select...</html:option>
					<html:option value="A">ADMIN</html:option>
					<html:option value="M">MEMBER</html:option>	
				</html:select>		
				</td>
			    </tr>
			    <tr>
			    <td width="29%" align="center" bgcolor="C8DFFF"><input type="button"  style="font-size: 1.05em; padding: 0.05em;" value="Add Member" onclick="submitDetails()" /></td>
			    <td width="29%" align="center" bgcolor="C8DFFF"><input type="reset"  style="font-size: 1.05em; padding: 0.05em;" value="Reset" /></td>
			    </tr>
			  </table>
			  <table align="center" width="60%">
				<tr><td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Create Group Members </font></u> </td> </tr>
				<tr><td> <font size="1" color=" 00638B" >Please choose the appropriate Authority Type for the mentioned CUID.  A member with Authority Type 'ADMIN' will be able to manage and perform all functions with respect to the Certificates.  Members with Authority Type 'MEMBER' will only have read privileges. </font></td></tr>
			</table>
			    
</html:form>
</html:html>