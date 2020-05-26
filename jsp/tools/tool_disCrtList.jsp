<%@page import="java.util.*" %>
<%@page import="java.text.*" %>
<%@page import="com.qwest.cms.utils.ParseX509Certificate" %> 
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<html:html>
<head>
<title>Tool_disCrtList</title>
<link href="<%=request.getContextPath() %>/css/example.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/tabber_revque.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />

<script language="javascript">

function check(){
var list=document.crtList.path.length;
var arList = new Array(list);
if(arList.length==1){
if (document.crtList.path.checked) { 
var valpath=document.crtList.path.value;
valadd=valpath+'add';

document.getElementById(valadd).disabled=false;

}
if(!document.crtList.path.checked) {
var valpath=document.crtList.path.value;
valadd=valpath+'add';

document.getElementById(valadd).disabled=true;

}
}
if(arList.length!=1){
for (i=0; i<arList.length; i++){
if (document.crtList.path[i].checked) { 
var valpath=document.crtList.path[i].value;
valadd=valpath+'add';

document.getElementById(valadd).disabled=false;

}
if(!document.crtList.path[i].checked) {
var valpath=document.crtList.path[i].value;
valadd=valpath+'add';

document.getElementById(valadd).disabled=true;

}
}
}
}
function onloadbd(){

var list=document.crtList.path.length;
var arList = new Array(list);

if(arList.length==1){
var valpath=document.crtList.path.value;
//alert(valpath);
	valadd=valpath+'add';
	
document.getElementById(valadd).disabled=true;

}
//alert(arList.length);
if(arList.length!=1){
for (i=0; i<arList.length; i++){ 

var valpath=document.crtList.path[i].value;

valadd=valpath+'add';

//alert(" hi "+document.crtList.path.length+" "+i+" val= "+document.getElementById(valadd).name);
document.getElementById(valadd).disabled=true;



}
}
}
function loadAllcrt(){
document.crtList.action="CMSToolAction.do?methodToCall=loadCrt";
	document.crtList.submit();
	}

function selPaths(){

	document.crtList.checkedValues.value=0;
	document.crtList.dummy.value='dummy';
	var arr = new Array(document.crtList.path.length);
	var lenth=arr.length;
	
	if(lenth==1){
		if (document.crtList.path.checked) {
			document.crtList.checkedValues.value = ","+document.crtList.path.value;
			}
	}
	if(lenth!=1) {
		for (a=0; a<lenth; a++){ 	
			if (document.crtList.path[a].checked) {  
				val=document.crtList.path[a].value;
				var j=a;
			
					document.crtList.checkedValues.value = document.crtList.checkedValues.value+","+val;
			
			}
		}
	}
  if(document.crtList.dummy.value=='stop'){
		
		return;
	}else if(document.crtList.checkedValues.value==0){
		alert(" Please Select a Certificate to Add"); 
		return;
	}
	document.crtList.action="CMSToolAction.do?methodToCall=loadCrt";
	document.crtList.submit();

}

function back(){
document.crtList.action="CMSToolAction.do?methodToCall=autoDisc";
document.crtList.submit();
}
function validate(){
alert("hi");
<%HashMap savemap=(HashMap)session.getAttribute("savemap");
System.out.println(" hi size "+savemap.size());
if(savemap.size()>0){%>
return true;
<%}else{ %>
return false;
<%}%>
}

/////ip validation
function verifyIP(valhip,num) {

IPvalue=document.getElementById(valhip).value;
//IPvalue=valhip;

//alert(" this ip validator  "+IPvalue);
errorString = "";
theName = "Host IPaddress";

var ipPattern = /^(\d{1,3})\.(\d{1,3})\.(\d{1,3})\.(\d{1,3})$/;
var ipArray = IPvalue.match(ipPattern);

if (IPvalue == "0.0.0.0")
errorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used at '+num+' Row';
else if (IPvalue == "255.255.255.255")
errorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used at '+num+' Row';
if (ipArray == null)
errorString = errorString + theName + ': '+IPvalue+' is not a valid IP address at '+num+' Row';
else {
for (i = 0; i < 4; i++) {
thisSegment = ipArray[i];
if (thisSegment > 255) {
errorString = errorString + theName + ': '+IPvalue+' is not a valid IP address at '+num+' Row';
i = 4;
}
if ((i == 0) && (thisSegment > 255)) {
errorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used at '+num+' Row';
i = 4;
      }
   }
}
extensionLength = 3;
if (errorString == ""){
//alert ("That is a valid IP address.");
return true;
}
else{
alert (errorString);
document.crtList.dummy.value='stop';
return false;
}
}


function popupAdd(mylink, windowname){
	//alert("POP UP"+mylink);
	mylink=mylink+"&count="+document.crtList.count.value;
     //alert("path....."+mylink);
	
	window.open(mylink,null, 'width=500,height=500,scrollbars=YES',resize=0);
	return false;
}

///////
</script>
</head>
<body onload='onloadbd();'>
<center>
<%Map map=(Map)session.getAttribute("map");
  Set  keyset= map.keySet();
  Iterator ir=keyset.iterator();
  if(map.size()>0){%>
 <table border="0" align="center" cellpadding="0" cellspacing="0" width="40%"  bordercolor="#000000">
	<tr>
		<td align="center" valign="top" ><b><font size="3" color="336699">Select Certificates to Load</font><b/></td> 
    </tr>
 	</table><br>
 	
 	<table align="center"  width="80%" >
		<tr bordercolor="CC0033">
		<td align="center" bgcolor="FFFFCC"><FONT size="4" color="CC0033"><b><html:errors/></b></FONT>
		</td>
		</tr>		
	</table>
	
	<form name="crtList" action="/CMSToolAction.do?methodToCall=loadCrt" method="post">
 	<input type=hidden name="checkedValues" />
 	<input type=hidden value="dummy" name="dummy" />
 	<input type=hidden value="0" name="count" />
 
 	 	
<div style="width:100%; height: 300px; overflow-y: scroll; overflow-x: scroll; font-size:small;font-family:monospace;"> 

      <table width="100%" align="left" border="1" style="table-layout: fixed;" cellspacing="0" cellpadding="1" bgcolor="#DFECFF">

              

      <tr bgcolor="0088AA">

            <th width="3%"></th>

            <th width="25%" align='center'>Certificate Name</th>

            <th width="15%" align='center'>Issued To</th>

            <th width="15%" align='center'>Issued By</th>

            <th width="8%" align="center">Valid From</th>

            <th width="8%" align='center'>Valid To</th>     

            <th width="8%" align='center'>Status</th> 

      </tr>

	
 	<% int num = 1;
 	while(ir.hasNext()){
 	  String path=ir.next().toString();
 	 System.out.println("PATH is _--1 ---------"+path);
 	  
 	  System.out.println("PATH is _-----------"+path);
 	  ParseX509Certificate crt=(ParseX509Certificate) map.get(path);
	%>
	 
      <tr>
     	 <td align='center' ><%=num++%></td>
     	 <td align='center' width="15%"><%=new java.io.File(path).getName()%></td> 
     	 <td align='center' width="15%"><%=crt.getSubjectCN()%></td>
     	 <td align='center' width="15%"><%=crt.getIssuerCN()%></td>
    	 <td align='center' width="10%"><%=crt.getNotBefore().substring(0,10)%></td>
     	 <td align='center' width="10%"><%=crt.getNotAfter().substring(0,10)%></td>  <% String path1 = path.replace('\\','/');%>
     	  
     	 <% 
         DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm s");
         DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
         java.util.Date date = new java.util.Date();
         //System.out.println("Current Date Time : "+dateFormat.format(date).substring(0,10));
         String to_compare=(String)crt.getNotAfter().substring(0,10);
         String compare_with=(String)dateFormat.format(date).substring(0,10);
        // System.out.println("to compare "+to_compare);
        // System.out.println("compare with "+compare_with);
         int day_to_compare=Integer.parseInt( to_compare.substring(0,2));
          int day_compare_with=Integer.parseInt(compare_with.substring(0,2));
         int month_to_compare=Integer.parseInt(to_compare.substring(3,5));
         int month_compare_with=Integer.parseInt(compare_with.substring(3,5));
         int year_to_compare=Integer.parseInt(to_compare.substring(6,10));
         int year_compare_with=Integer.parseInt(compare_with.substring(6,10));
        
         String status="EXPIRED";
         if(year_to_compare>year_compare_with)
         {status="ACTIVE";
        // System.out.println("1");
         }
          if(year_to_compare==year_compare_with && month_to_compare>month_compare_with)
         {status="ACTIVE";        // System.out.println("2");
         }
         if(year_to_compare==year_compare_with && month_to_compare==month_compare_with && day_to_compare>day_compare_with)
         {status="ACTIVE";         //System.out.println("3");
         }
           System.out.println("STATUS is "+status);
             if (status=="ACTIVE"){%>
     	 <td align="center" valign="top" ><b><font size="2" color="green">ACTIVE</font><b/></td>  	 
   <%}else{ %>
   <td align="center" valign="top" ><b><font size="2" color="red">EXPIRED</font><b/></td>
   <%} %>
	<%}%>
	</table>
	</div>
	<table>
	<tr>
		<td>&nbsp</td>
		<td>&nbsp</td>
		<td>&nbsp</td>
		
		<td> <input type="button" value="Add to MY Account" style="font-size: 1.05em; padding: 0.05em;" onclick="javascript:loadAllcrt();"></td>
		
		<td> &nbsp</td>
		<td> <input type="reset" value="Reset" style="font-size: 1.05em; padding: 0.05em;"></td>
		<td> &nbsp</td>
		<td> <input type="button" value="Back" style="font-size: 1.05em; padding: 0.05em;" onclick="javascript:back();"></td>
	</tr>
	</table>
	
<%}else{%>
	<br>
	<br>
	<table align="center"  width="80%">
		<tr>
		<td align="center" bgcolor="FFFFCC"><FONT size="4" color="CC0033">No Certificates have been found in the given Location with this Application User Name</FONT></td>
		</tr>
		<tr>
			<td align="center"><a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=autoDisc">Click here to Go Back</a>  </td>
		</tr>				
		</table>		

			    
<%}%>

</form>
</center>
</body>
</html:html>