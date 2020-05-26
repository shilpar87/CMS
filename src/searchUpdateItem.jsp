<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java"  contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.*,com.qwest.prpo.action.*,com.qwest.prpo.actionform.*,com.qwest.prpo.dao.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<html>
<head><title></title>
</head>
<meta http-equiv="Content-Language" content="en-us">
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=iso-8859-1">
<script type="text/javascript">

</script>

<script language="javascript">
function checkforupdate()
{
<%if(session.getAttribute("updateitemerror") != null && session.getAttribute("updateitemerror") != ""){
				String strTemp = (String)session.getAttribute("updateitemerror");
				
				%>
					alert("<%=strTemp%>");
				<%
				session.removeAttribute("updateitemerror");
			}
			%>
			
			
			<%if(session.getAttribute("addItemError0") != null && session.getAttribute("addItemError0") != ""){
				String strTemp = (String)session.getAttribute("addItemError0");
				session.removeAttribute("addItemError");
				%>
					alert("<%=strTemp%>");
				<%
			}
			
			%>
			
			
			

}
function getUpdateDetails(s,s1,s2,s3,s4,s5){
		
			 document.forms[0].action ="./ItemAction.do?methodName=updateItemPage&id="+s+"&val1="+s1+"&val2="+s2+"&val3="+s3+"&val4="+s4+"&val5="+s5;
            
             document.forms[0].submit();  
			 //window.open("./PRPOFinanceItemAction.do?eventName=updateItemPage&id="+s+"&val1="+s1+"&val2="+s2+"&val3="+s3+"&val4="+s4+"&val4="+s5,'name','height=500,width=400,left=100,top=100,resizable=no,scrollbars=yes,toolbar=no,status=no');
}			//end of getUpdateDetails

function submitByGo()
  { 
  //  document.forms[0].itemVendor.value =document.forms[0].itemVendor.options[document.forms[0].itemVendor.selectedIndex].text;
   	  document.forms[0].itemType.value =document.forms[0].itemType.options[document.forms[0].itemType.selectedIndex].text;
  //  document.forms[0].selectedItemName.value = document.forms[0].selectedItemCode.options[document.forms[0].selectedItemCode.selectedIndex].text;
  //  alert("selectedProjectCode2=>"+document.forms[0].selectedItemName.value);
  //  alert("selectedProjectvendor=>"+document.forms[0].itemVendor.value);
  //  alert("selectedProjectCode=>"+document.forms[0].itemType.value);
      /*alert("=f>"+dateFrom.length);
      alert("Date=>"+datePartFrom);
      alert("Month>"+monthPartFrom);
      alert("year>"+yearPartFrom);*/
		//document.forms[0].nameType.value =document.forms[0].nameType.options[document.forms[0].nameType.selectedIndex];
	
document.forms[0].searchType.value =document.forms[0].searchType.options[document.forms[0].searchType.selectedIndex].text;
	
    //alert(document.forms[0].searchType.value);
   	if(document.forms[0].itemType.value==""){
    alert("Please select an item Type");
    return;
    }
    
    if(document.forms[0].itemName.value ==""){
    alert("Please enter an Item Name");
    return;
    }
   
      
    //var val1 = "<%=request.getParameter("nameType01")%>";
    //if(val1 != 0)
    //{
    //alert("The count is ----------"+val1);
    //}
    document.forms[0].action ="./ItemAction.do?methodName=searchItemPage";
    document.forms[0].submit();

  }//end of submit by Go
</script>
<%
	 Properties HtmplProps = (Properties)session.getAttribute("HtmlProperties");
	 String str = (String)HtmplProps.getProperty("prpo.vendor.length");
%>


<body onload="checkforupdate()">

 
  	<form method="POST"  >
	<table border="0"  cellpadding="5" cellspacing="1"   bgcolor="white"   width="70%" align="center">
		
		<tr class= "BgBlue">
			<td align="center" colspan="7"><font face="Verdana" size="2"><b>SearchItem Form</b></font>
			</td>
		</tr>
		

		<tr class= "BgGrey" >
							<td width="15%" align="right">
							<font face="Verdana" size="1"><b>Type</b></font><font color="red">*</font></td>
							<td width="18%">
							
							<%
							AdminDAO dao1 = new AdminDAO();
							List itemtypecombo01 = new ArrayList();
							itemtypecombo01 = dao1.getItemTypeValues("PRPO_ITEM_TYPE_MASTER");
							request.setAttribute("itemtypecombo01", itemtypecombo01);
							List itemtype=(List)request.getAttribute("itemtypecombo01");
							%>
							
							
							
							<select name="itemType" property="itemType" size="1" style="FormBorder;font-family:Verdana; font-size:11px">
							<%
							for(int my=0; my<itemtype.size(); my++){
								//AdminForm form=(ItemForm)itemtype.get(my);
								System.out.println("-----------------------inside jsp");
								AdminForm form5=(AdminForm)itemtype.get(my);
								String itemtypesearch=(String)form5.getItemType();
							
							%>
							<option value="<%=itemtypesearch%>"><%=itemtypesearch%></option>
							<%}%>
							
							</select></td>
							<td width="18%">
							<select name="searchType" property="searchType" size="1" style="FormBorder;font-family:Verdana; font-size:11px">
							
							<option value="contains">contains</option>
							<option value="is exactly">is exactly</option>
							<option value="starts with">starts with</option>
							</select></td> 						
							
 					<td width="15%" align="center">
 					<td width="30%"><INPUT TYPE="text" NAME="itemName" maxlength="<%=str%>" ></td>
	
			<td width="30%" align="right"><input type="button" value="Search" onclick="submitByGo()"/></td>
			<td width="30%" align="left"><input type="Reset" name="Reset" value="Reset"/></td>
		</tr>
	</table>
	 <table bgcolor="white"   width="60%">
     <tr class= "BgBlue">
			<td align="center" colspan="7"><font face="Verdana" size="2"><b>&nbsp;Search Items Form&nbsp;</b></font>
			</td>
		</tr>
	 <tr class= "BgBlue"><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
     					 <td><center>Item Type</center></td>
     					 <td><center>Item Name</center></td>
     					 <!--<td>&nbsp;Item Price&nbsp;&nbsp;</td>
     					 <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Vendor Name&nbsp;&nbsp;</td>-->
                         <td><center>Unit</center></td>
                         <td><center>Current Stock</center></td>
                         <td><center>Item Vendors</center></td></tr>

 <%ArrayList list3 = (ArrayList) request.getAttribute("result1");
 String itemType=null;
 String itemName=null;
 String itemUnit=null;
 String itemId=null;
 String unitName=null;
 ArrayList unitNames=null;
 String vendorName=null;
 ArrayList vendorList=null;
 int itemStock=0;
 if(list3!=null)
 {
	 for(int i=0;i<list3.size();i++){
		  unitName="";
		  vendorName="";
          ItemForm bean = (ItemForm)list3.get(i);
		  itemId=(String)Integer.toString(bean.getItemId());
		  itemType=(String)bean.getItemType();
		  itemName=(String)bean.getItemName();
		  itemStock=(int)bean.getItemStock();
		  unitNames=(ArrayList)bean.getUnitName();
		  vendorList = (ArrayList)bean.getVendor_name();
		  
		  for(int j=0;j<unitNames.size();j++)
		  {
			  unitName = unitName + (String)unitNames.get(j) +",";
		  }
		  for(int k=0;k<vendorList.size();k++)
		  {
			  vendorName =vendorName + (String)vendorList.get(k) +",";
		  }
		  itemUnit=(String)bean.getItemUnit();
		  
		  
 %>

 <TR> <td><input type=hidden name=hUnit /></td></TR>
 <TR class="BgGrey">
 <!--  &nbsp;<INPUT TYPE="radio" NAME="Update"  OnClick="getUpdateDetails('<%=itemId%>','<%=itemType%>','<%=itemName%>','<%=itemStock%>','<%=itemUnit%>')">-->
 <td align="center"><input type="image" src="/PRPO/images/edit_icon_transp.gif" OnClick="getUpdateDetails('<%=itemId%>','<%=itemType%>','<%=itemName.replaceAll("'","apos;")%>','<%=itemStock%>','<%=unitName%>','<%=vendorName.replaceAll("'","apos;")%>')" />  </td>
<td align="center">&nbsp;<%=itemType%><INPUT TYPE="hidden" value=<%=itemId%> name="itemId"></td>
 <td align="center">&nbsp;<%=itemName%></td>
 <td align="center">&nbsp;<%=unitName%></td>
 <td align="center">&nbsp;<%=itemStock%></td>
  <td align="center">&nbsp;<%=vendorName%></td>
 </tr> 

 <%}} %>

<!-- <tr bgcolor="#D6F1F5"><td width="30%" align="center"><input type="submit" value="Update" /></td> -->
<!-- <td width="30%" align="center"><input type="Reset" name="Reset" value="Reset"/></td><td></td></tr> -->
 </table> 

</form>	
</body>

</html>

