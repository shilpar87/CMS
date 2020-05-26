
<%@ page language="java" info="QSS" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<html>
    <head>

    </head>
    <body >
        <h4></h4>
        <table width="100%" height="100%" border="0" align="BASELINE" bgColor="white">
        <th width="70%" valign="center"><font face="Arial" size="6"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        Certificate Management System</b></font></th>
        
             <tr>
             
             <td width="50%">
             <img src="<%=request.getContextPath()%>/images/certificate.gif" alt="http://www.qwestsoftwareservices.com" valign ="top" >
             </td>  
             
                  <td width="100%" align ="right">
                  <table width ="100%" border="1" cellpadding="1" cellspacing="6" >
                     <tr>
                       <td>
                           <table width ="50%" align="center" >
                              <tr >
                                  <td width="20%"></td>
                                  <td width="60%">
                                  <img src="<%=request.getContextPath()%>/images/qwest_logo.gif" alt="http://www.qwestsoftwareservices.com" valign ="top" >
                                  </td>
                                  
                               </tr>
                               <tr height=50%>
                                   <td height=35%></td>
                                    <logic:messagesPresent>					   
		   		<html:messages id="errors">		     	
		     		<td colspan="2" align="center">
		     			<font color="red" face="Arial" size="2"><li><html:errors/></li></font>
		     			</td>		     		
		   		</html:messages>
		   		</logic:messagesPresent>
                                   <td height=20%></td>
                                </tr>
                                <tr >
                                    <td></td>
                                    <td align=center>
                                    <html:form action="/logon">
                                        <b><font face="Arial" size="2">User Name (CUID):</font></b>&nbsp;&nbsp;<font face="Arial" size="2">&nbsp;<html:text property="loginId" value="" maxlength="18" size="16"/><br>
                                        <br>
                                        <b>Password (LDAP):</b>&nbsp;&nbsp;&nbsp;&nbsp;<html:password property="password" value="" maxlength="18" size="16" /><br>
                                        </font><br>
                                        <br>
                                        <html:submit value="login"/>
                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<html:reset/><br>
                                    </html:form>
                                    </td>
                                    <td ></td>
                                </tr>
                            </table>
                          </td>
                       </tr>
                    </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                    <p align=center><FONT face=Arial size=1>Qwest computers and
                    the Qwest computer network are Qwest property. Only
                    authorized persons may use them and only for legalt and
                    proper purposes as determined solely by Qwest. Users consent
                    to the monitoring of their use. Employees must use Qwest
                    computers and the network in accordance with the Qwest Code
                    of Conduct, subject to discipline for misuse. Customer use
                    is governed by the Qwest Acceptable Use Policy. </FONT></p>
                 	</td>
                 </tr>
       		</table >
    </body>
</html>
