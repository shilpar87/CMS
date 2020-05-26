
<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<script language="javascript" type="text/javascript">

	function Cancel(){
	document.forms[0].action="CMSAction.do?methodToCall=edit_profile";
	document.create_edit.submit();
	return true;
}
</script>

<html>
<head>


	<form name="create_edit"  action="CMSAction.do?methodToCall=edit_profile" method="post">			
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%" bgcolor="336699" bordercolor="#000000">
		<tr>
			<td align="center" valign="top" ><u><font size="4" color="FFFFFF"> Create/Edit Group </font></u> 
		 	</td> 
    	</tr>
 		</table>
		
		<br>	
			
		<table border="0" width="60%" align = "center" CELLSPACING="0" height="15%">
	
				<tr></tr>
				<tr></tr>
				<tr></tr><tr></tr><tr></tr><tr></tr>
						
				<tr>	
				<tr bgcolor="C8DFFF">
				<td width="150" class="q" height="23" bgcolor="C8DFFF">
				<font size="2" color=" 00638B" >Group Name</font></td>
				<td width="325" height="23" bgcolor="C8DFFF">: <input type="text" ></td>
				</tr></tr>
			   
				<tr>
				<tr bgcolor="C8DFFF">
				<td width="150" class="q" height="23">
				<font size="2" color=" 00638B" >Group Description</font></td>
				<td width="325" height="23">: <input type="text" ></td>
			    </tr></tr>
			    	
			    <tr>
			    <tr bgcolor="C8DFFF">
				<td width="150" class="q" height="23">
				<font size="2" color=" 00638B" >RCBS Code</font></td>
				<td width="325" height="23">: <input type="text" ></td>
			    </tr></tr>
			     
			    <tr>
			    <tr bgcolor="C8DFFF">
				<td width="150" class="q" height="23">
				<font size="2" color=" 00638B" >Group Member Cuid</font></td>
				<td width="325" height="23">&nbsp;&nbsp;<textarea cols="30 " rows="5" wrap="off" readonly name="message" ></textarea>
			    </tr></tr>
			    
			  
                <tr>			  
      		    <tr bgcolor="C8DFFF">
    			<td width="29%" align="center" bgcolor="C8DFFF"><input type="button" name="print" style="font-size: 1.05em; padding: 0.05em;" id="print" value="Add Member"  /></td>
    			<td width="29%" align="center" bgcolor="C8DFFF"><input type="button" name="print" style="font-size: 1.05em; padding: 0.05em;" id="print" value="Delete Member"  /></td>
    			</tr></tr>
      		   
      		    <tr>
      		    <tr bgcolor="C8DFFF">
				<td width="150" class="q" height="23">
				<font size="2" color=" 00638B" >Primary Admin Access For Group</font></td>
				<td width="325" height="23">: <input type="text" ></td>
			    </tr></tr></tr>
      		   
      		    <tr> 
      		    <tr bgcolor="C8DFFF">
				<td width="150" class="q" height="23">
				<font size="2" color=" 00638B" >Secondary Admin Access For Group</font></td>
				<td width="325" height="23">: <input type="text" ></td>
			    </tr></tr>
			    
			    </table>
			   
			   
			 <table border="0" align="center" cellpadding="0" cellspacing="0" width="60%" bgcolor="lightblue" bordercolor="#000000">
				<tr>
				<td align="center" valign="top" ><u><style="font-size: 2.05em; padding: 0.05em;" ><b> Notification Information</b> </font></u> 
		 		</td> 
    			</tr>
 			</table>
 			
 			<table border="0" align="center" cellpadding="0" cellspacing="0" width="60%" bgcolor="336699" bordercolor="#000000">
 			
			    <tr>
			    <tr bgcolor="C8DFFF">
			    <td width="150" class="q" height="23">
			    <font size="2" color=" 00638B" >Alarming Time</font></td>
				<td width="325" height="23">:
				<select style="font-size: 1.05em;">
					<option value="">Select </option>
					<option value="">30 days </option>
      				<option value="">40 days</option>
      				<option value="">60 days</option>
      				<option value="">70 days</option>
      				<option value="">90 days</option>
      			</select>
      			</tr></tr>
			     
			    <tr> 
			    <tr bgcolor="C8DFFF">
			    <td width="150" class="q" height="23">
			    <font size="2" color=" 00638B" >Alarming Frequency</font></td>
				<td width="325" height="23">:
				<select style="font-size: 1.05em;">
					<option value="">Select </option>
					<option value="">Daily </option>
      				<option value="">Weekly</option>
      				<option value="">Monthly</option>
      				<option value="">Yearly</option>
      			</select>
      			</tr></tr>
      			
      			<tr>
      			<tr bgcolor="C8DFFF">
				<td width="150" class="q" height="23">
				<font size="2" color=" 00638B"  >Notification CUID</font></td>
				<td width="325" height="23">: <input type="text" ></td>
			    </tr></tr>
      			
      						     
			    </table>
			 
			 <center><input type="button" name="print" style="font-size: 1.05em; padding: 0.05em;" id="print" value="Save" >
			 <input type="button" name="print" style="font-size: 1.05em; padding: 0.05em;" id="print" value="Cancel" onclick ='Cancel()'>
			 </center>
			    		    
			    
     
</form>
</body>
</html>