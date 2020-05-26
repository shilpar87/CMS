<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />
</head>
<body>
<html>
<div style="width:850px; height:190px;overflow:scroll" >
<jsp:include page ="/jsp/common/home.jsp"/>
</div>
<div style="width:850px; height:40px" >
<table width="100%" cellspacing="2" cellpadding="7">
<tr><td align="center" width="60" bgcolor="lightblue"><a href="">Status</a></td>
<td align="center" width="60" bgcolor="lightblue"><a onclick=fun() href="">Details</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="">Summary</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="<%=request.getContextPath()%>/CMSFunctionAction.do?methodToCall=FMenu">Functions</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="">History</a></td>
<td align="center" width="60" bgcolor="lightblue"><a href="">Notes</a></td></tr>
</table>
</div>
<div style="width:850px; height:130px;" >
<table width="100%" cellspacing="2" cellpadding="7">
<tr><td bgcolor="lightyellow">

</td>
</tr>
</table>
</div>
 </html>
</body>
</html>