
<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script language="javascript" type="text/javascript">

	function vali_resource(){
	document.forms[0].action="CMSAction.do?methodToCall=shilpa";
	document.resform.submit();
	return true;
}
	
	function Display(){
	 
	alert("Displays CUID's from DB");
	 
}

</script>



<html>
<head>


<form name="resform"  action="CMSAction.do?methodToCall=shilpa" method="post"
<table border="0"  width="100%" cellspacing="7" height="15%" bgcolor="336699" bordercolor="#000000">


		<tr>
		<td width="27" height="23">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td width="27" height="23">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
		<td width="325" height="23" align="center" valign="top" bgcolor="336699"><u><font size="4" color="FFFFFF"><b> Create/Update Profile </b></font></u> </td> 
    	</tr>

		<tr></tr><tr></tr><tr></tr><tr></tr>
		<tr></tr><tr></tr><tr></tr><tr></tr>
		<tr></tr><tr></tr><tr></tr><tr></tr>
		
		
		<tr>						
		<tr bgcolor="C8DFFF" width ="500px">
		<td width="27" height="23">&nbsp;</td>
		<td width="150" class="q" height="23" ><font size="2" color=" 00638B" >Group Name</td>
		<td width="325" height="23">:
		<select style="font-size: 1.05em;">
			<option value="">Select </option>
      		<option value="">Start With</option>
      		<option value="">Is Exactly</option>
      		<option value="">Contains</option>
      	</select>
      	<input type="text" />	
      	<td><input type= "button" style="font-size: 1.05em; padding: 0.05em;" name = "find_grp" value ="Find Group" onclick='Display()'/></td>
		</tr></tr>

		<tr>
		<tr bgcolor="C8DFFF" width ="500px">
		<td width="27" height="23" bgcolor="C8DFFF">&nbsp;</td>
		<td width="150" class="q" height="23" bgcolor="C8DFFF" ><font size="2" color=" 00638B" >Group Description</td>
		<td width="325" height="15">: <input type="text"  ></td>
		<td width="150" class="q" height="23" bgcolor="C8DFFF" ></td>
		</tr></tr>	
		
		 <tr>
	     <tr bgcolor="C8DFFF" width ="500px">
			<td width="27" height="23">&nbsp;</td>
			<td width="150" class="q" height="23"><font size="2" color=" 00638B" >Group </td>
			<td width="325" height="23">&nbsp;&nbsp;<textarea cols="30 " rows="5" wrap="off" readonly name="txt" id ="textout">
			</textarea>
			document.getElementById("textout").value += "Find Group";
		    <td width="325" height="23" bgcolor="C8DFFF" >
	  	</tr></tr>
        
        </table>
	  	
	  	<br>
	  	<center>
	  		<input type = "button"  name = "create_new_grp" style="font-size: 1.05em; padding: 0.05em;" value = "Create New Group" onclick='vali_resource()'>
	  		<input type = "button" name = "edit_sel_grp" value = "Edit Selected Group" style="font-size: 1.05em; padding: 0.05em;" onclick='vali_resource()' >
	  		<input type = "button" name = "remove_sel_grp" style="font-size: 1.05em; padding: 0.05em;" value = "Remove Selected Group">
	  	</center>
	  	</br>
	  	
	  	
	  	

</form>
</head>	
</html>