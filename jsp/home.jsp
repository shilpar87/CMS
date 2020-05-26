<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />

</head>
<body>
<center>
<div style="width:750px; height:190px;overflow:scroll" >
<jsp:include page ="/jsp/res.jsp"/>
</div>
<div style="width:750px; height:10px" >
<table width="100%" cellspacing="2" cellpadding="7">
<tr><td align="center" width="60" bgcolor="lightblue"><a href="">Status</a></td>
<td align="center" width="60" bgcolor="lightblue"><a onclike=fun() href="">Details</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="">Summary</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="">Functions</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="">Tools</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="">History</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="">Notes</a></td></tr>
</table>
</div>
<div style="width:750px; height:130px;overflow:scroll" >
<table width="100%" cellspacing="2" cellpadding="7">
<tr><td bgcolor="yellow">
<jsp:include page ="/jsp/res.jsp"/>
</td>
</tr>
</table>
</div>
</center>
</body>
</html>