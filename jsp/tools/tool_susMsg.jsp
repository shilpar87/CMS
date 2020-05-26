
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="java.util.*" %> 
<html>
	<head>
	<script language=JavaScript>
	function  cpFile(){
		var path=document.viewPub.pubKeyCrt.value;
		if(path==null||path==""){
			alert(" please select the path of Certificate ");

		}else{
		document.viewPub.pubKeyCrtPath.value=path;
		//alert("done "+document.viewPub.pubKeyCrtPath.value);

		document.forms[0].action="CMSToolAction.do?methodToCall=getPubKey";
		document.forms[0].submit();
		//return;
		}
	}
	function validate_form()
	{
		with (thisform)
		{
			if(cpFile()==false)
 				 {alert("ture");
				  return false;
 			 }
			else 
  				 {alert("false");
  				 return true;
  			 }
		}
	}
</script>

	<title>Tools Result page</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />
	</head>
	<body>
		
	<br><br>
		<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%"  bordercolor="#000000">
			<tr>
			<td align="center" valign="top" ><b><u><font size="3" color="336699">App's Certificates Search Request </font></u> </b>	</td> 
    		</tr>
 	    </table>
		<br><br>

		<div style="width:700px; height:10px" >
		<table  width ="70%">
		<tr>  
				<td align="center" width="590px" > <FONT size="3" color="123660"><b> Your Request Has been Sent Successfully to your AIP </b></font></td>

		</tr>
		</table>

		<br>
		<p>	
		<a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=reqform"><u><b>GO back</b><BR><BR></u></a>

	</body>
</html>