<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu Bar</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/menu.css" />

<script>

function getHelpDoc(){
    alert("getHelpDoc");
    //window.open('C:\\CMS™_Help_for _Qwest_users.html');
    window.open("C:\\CMS™_Help_for _Qwest_users.html");
    return true;
}
</script>
<base target="_blank" >

</head>
<body>
<div  style="width:800px; height:30px; " >
<table width="100%" cellspacing="0" cellpadding="0" border=0 >
  <tr >
    <td  rowspan="0"><img src="<%=request.getContextPath() %>/images/qwest_logo.gif" alt="Qwest - Spirit of Service"  /></td>
    <td>&nbsp;</td><td class="headertitle">&nbsp;<h2>Certificate Management System&nbsp;</h2></td>
    <td class="headerwelcome"><a href="/CERTMGMT/help/CMS.html" onclick="window.open(this.href, 'child', 'height=700,width=900,scrollbars=yes'); return false;" target="_blank" >CMS<sup>&trade;</sup> Help<BR> for Qwest users</td>
  </tr>
</table>
<div>
<div class="bottomLine"></div>
</body>
</html>