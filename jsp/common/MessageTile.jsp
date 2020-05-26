<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/c.tld" prefix="c" %>
<!-- MessageTile.jsp BEGIN -->
<center>
<table border="0" cellspacing="0" cellpadding="0" width="100%">
<!-- Message block for LD Carrier Downloads -->


<!-- Message block for resource error -->
<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
<tr align="left" valign="top" class="errors">
  <td colspan="2" align="center" class="rightLeftLines">
    ERROR:  Application resources not loaded
  </td>
</tr>
</logic:notPresent>
	
<!-- Message block for type = msg.error -->
<logic:messagesPresent message="true">
<html:messages property="msg.error" id="msg" message="true"> 
  <tr align="left" valign="top"  class="error">
    <td colspan="2" align="center" class="rightLeftLines"> 
      <bean:write name="msg"/>
    </td>
  </tr>
</html:messages>
</logic:messagesPresent> 

 
<!-- Message block for type = msg.warn -->
<logic:messagesPresent message="true"> 
<html:messages property="msg.warn" id="msg" message="true">
  <tr align="left" valign="top" class="warn">
    <td colspan="2" class="rightLeftLines" align="center">
      <bean:write name="msg"/>
    </td>
  </tr>
</html:messages>
</logic:messagesPresent>
	
<!-- Message block for type = msg.info -->
<logic:messagesPresent message="true"> 
<html:messages property="msg.info" id="msg" message="true">
  <tr align="left" valign="top" class="info">
    <td colspan="2" class="rightLeftLines" align="center">
      <bean:write name="msg"/>
    </td>
  </tr>
</html:messages>
</logic:messagesPresent>	

</table>
</center>
<!-- MessageTile.jsp END -->
