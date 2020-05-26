<%@ page language="java" errorPage="/jsp/errorFromMenu.jsp" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Profile Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />
</head>
<body>
 
<br>Old Password   : 
<input type="text" value=" " size="20"></br>
<br>New Password   : 
<input type="text" value=" " size="20"></br>
<br>Confirm Password   : 
<input type="text" value="  " size="20"></br>
<br>
<input type="submit" value="Submit" >

</body>
</html>