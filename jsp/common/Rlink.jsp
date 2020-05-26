<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=iso-8859-1"%>
<%@ page import="java.util.* " %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@page import="com.qwest.cms.BO.CMSBO, java.util.Calendar, java.text.* "%>

<script language="Javascript" type="text/javascript">
function get_radio_value()
{
for (var i=0; i < document.forms[0].Reply.length; i++)
   {
   if (document.forms[0].Reply[i].checked)
      {
    alert(document.forms[0].Reply[i].checked);
      var rad_val = document.forms[0].Reply[i].value;
      alert(document.forms[0].Reply[i].value);
     

   
      
     document.forms[0].action = "CMSAction.do?methodToCall=insertreply&rad_val="+rad_val;
     document.forms[0].submit();
	return true;
      }
   }
}

</script>

<html:html>
<head>
 Choose one of the reply
 </head>
 <body> 
 <html:form action="/CMSAction.do?methodToCall=insertreply">
 <input type="radio" name="Reply" value="Certificate is no longer used" /> Certificate is no longer used
 <br />
 <input type="radio" name="Reply" value="Certificate is renewed" /> Certificate is renewed
  <br />
 <input type="radio" name="Reply" value="Certificate is yet to be renewed" /> Certificate is yet to be renewed
 <br />
 <input style="font-size: 1.05em; padding: 0.03em; width:90px" type="button" value="Submit" onclick="get_radio_value()"/>	
 </html:form>
</body> 
</html:html>