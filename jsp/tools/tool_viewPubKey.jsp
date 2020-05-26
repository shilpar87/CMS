
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

<title>Tools View pub key</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />
</head>
<body>

<form name="viewPub"  action="CMSToolAction.do?methodToCall=getPubKey" method="post" enctype="multipart/form-data">
From the Location
<input type="file" name="pubKeyCrt" size="40">
<input type="hidden" name="pubKeyCrtPath" ><BR><BR><BR>
<!--<a href="javascript: cpFile()" ><u>View Public Key<BR><BR></u></a>-->
<input type="button" value="View Pub Key"  onclick="cpFile()"><br>
 <%ArrayList al=new ArrayList();
 if(session.getAttribute("al")!=null)
 {al=(ArrayList)session.getAttribute("al");
 if(al.size()>0){ %><TEXTAREA title=Pubkey style="WIDTH: 444px; HEIGHT: 103px" name=pubkey rows=11 readOnly cols=46>
 <%=(String)(al.get(0).toString())%></textarea>
 <%}al.clear();}
  %>
  
 

 

</form>
</body>
</html>