
<html>
<head>
<title>Tool_loadSuc</title>
</head>
<body>
	<table border="0" align="center" cellpadding="0" cellspacing="0" width="40%"  bgcolor="336699">
	<tr>
		<td align="center" valign="top" ><b><font size="4" color="FFFFFF">Load Status</font><b/> 
		  
		</td> 
    </tr>
 	</table><br>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr><td>&nbsp</td><td>&nbsp</td></tr>
	<tr></tr>

	<div style="width:850px; height:10px" >
	<table width ="70%" cellspacing="2" cellpadding="0" border="1" bordercolor="336699">
	         <tr><td><%=((HashMap)session.getAttribute("map")).size()%></td><td></td><td>certificates has beeen loaded</td></tr>
	</table><br>
<table><tr><td> &nbsp;
<a href="<%=request.getContextPath()%>/CMSToolAction.do?methodToCall=autoDisc"><b><u>Click here to Go Back</u></b></a>  </td></tr>   
</table>
</body>
</html>