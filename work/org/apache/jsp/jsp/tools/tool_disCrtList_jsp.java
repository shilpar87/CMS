package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;
import com.qwest.cms.utils.ParseX509Certificate;

public class tool_disCrtList_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    javax.servlet.jsp.PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Tool_disCrtList");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/menu.css\" />\r\n");
      out.write("<script language=\"javascript\">\r\n\r\nfunction check(){\r\nvar list=document.crtList.path.length;\r\nvar arList = new Array(list);\r\nif(arList.length==1){\r\nif (document.crtList.path.checked) { \r\nvar valpath=document.crtList.path.value;\r\nvalAppName=valpath+'AppName';\r\nvalnname=valpath+'nname';\r\nvalhid=valpath+'hid';\r\nvalhip=valpath+'hip';\r\nvalCrtType=valpath+'CrtType';\r\nvalnote=valpath+'note';\r\ndocument.getElementById(valAppName).disabled=false;\r\ndocument.getElementById(valnname).disabled=false;\r\ndocument.getElementById(valhid).disabled=false;\r\ndocument.getElementById(valhip).disabled=false;\r\ndocument.getElementById(valCrtType).disabled=false;\r\ndocument.getElementById(valnote).disabled=false;\r\n}\r\nif(!document.crtList.path.checked) {\r\nvar valpath=document.crtList.path.value;\r\nvalAppName=valpath+'AppName';\r\nvalnname=valpath+'nname';\r\nvalhid=valpath+'hid';\r\nvalhip=valpath+'hip';\r\nvalCrtType=valpath+'CrtType';\r\nvalnote=valpath+'note';\r\ndocument.getElementById(valAppName).disabled=true;\r\ndocument.getElementById(valnname).disabled=true;\r\n");
      out.write("document.getElementById(valhid).disabled=true;\r\ndocument.getElementById(valhip).disabled=true;\r\ndocument.getElementById(valCrtType).disabled=true;\r\ndocument.getElementById(valnote).disabled=true;\r\n}\r\n}\r\nif(arList.length!=1){\r\nfor (i=0; i");
      out.write("<arList.length; i++){\r\nif (document.crtList.path[i].checked) { \r\nvar valpath=document.crtList.path[i].value;\r\nvalAppName=valpath+'AppName';\r\nvalnname=valpath+'nname';\r\nvalhid=valpath+'hid';\r\nvalhip=valpath+'hip';\r\nvalCrtType=valpath+'CrtType';\r\nvalnote=valpath+'note';\r\ndocument.getElementById(valAppName).disabled=false;\r\ndocument.getElementById(valnname).disabled=false;\r\ndocument.getElementById(valhid).disabled=false;\r\ndocument.getElementById(valhip).disabled=false;\r\ndocument.getElementById(valCrtType).disabled=false;\r\ndocument.getElementById(valnote).disabled=false;\r\n}\r\nif(!document.crtList.path[i].checked) {\r\nvar valpath=document.crtList.path[i].value;\r\nvalAppName=valpath+'AppName';\r\nvalnname=valpath+'nname';\r\nvalhid=valpath+'hid';\r\nvalhip=valpath+'hip';\r\nvalCrtType=valpath+'CrtType';\r\nvalnote=valpath+'note';\r\ndocument.getElementById(valAppName).disabled=true;\r\ndocument.getElementById(valnname).disabled=true;\r\ndocument.getElementById(valhid).disabled=true;\r\ndocument.getElementById(valhip).disabled=true;\r\ndocument.getElementById(valCrtType).disabled=true;\r\n");
      out.write("document.getElementById(valnote).disabled=true;\r\n}\r\n}\r\n}\r\n}\r\nfunction onloadbd(){\r\nvar list=document.crtList.path.length;\r\nvar arList = new Array(list);\r\nif(arList.length==1){\r\nvar valpath=document.crtList.path.value;\r\nvalAppName=valpath+'AppName';\r\nvalnname=valpath+'nname';\r\nvalhid=valpath+'hid';\r\nvalhip=valpath+'hip';\r\nvalCrtType=valpath+'CrtType';\r\nvalnote=valpath+'note';\r\ndocument.getElementById(valAppName).disabled=true;\r\ndocument.getElementById(valnname).disabled=true;\r\ndocument.getElementById(valhid).disabled=true;\r\ndocument.getElementById(valhip).disabled=true;\r\ndocument.getElementById(valCrtType).disabled=true;\r\ndocument.getElementById(valnote).disabled=true;\r\n}\r\nif(arList.length!=1){\r\nfor (i=0; i");
      out.write("<arList.length; i++){ \r\nvar valpath=document.crtList.path[i].value;\r\nvalAppName=valpath+'AppName';\r\nvalnname=valpath+'nname';\r\nvalhid=valpath+'hid';\r\nvalhip=valpath+'hip';\r\nvalCrtType=valpath+'CrtType';\r\nvalnote=valpath+'note';\r\n//alert(\" hi \"+document.crtList.path.length+\" \"+i+\" val= \"+document.getElementById(valnname).value);\r\ndocument.getElementById(valAppName).disabled=true;\r\ndocument.getElementById(valnname).disabled=true;\r\ndocument.getElementById(valhid).disabled=true;\r\ndocument.getElementById(valhip).disabled=true;\r\ndocument.getElementById(valCrtType).disabled=true;\r\ndocument.getElementById(valnote).disabled=true;\r\n//document.getElementById(document.crtList.path[i].value).disabled=true;\r\n\r\n}\r\n}\r\n}\r\nfunction selPaths(){\r\n\tdocument.crtList.checkedValues.value=0;\r\n\tdocument.crtList.dummy.value='dummy';\r\n\tvar arr = new Array(document.crtList.path.length);\r\n\tvar lenth=arr.length;\r\n\r\n\r\n\t//alert(\"array lentght \"+  document.crtList.path[0].checked);\r\n\tif(lenth==1){\r\n\t\tif (document.crtList.path.checked) {\r\n\t\t\t//alert(\" lentth \"+lenth);\r\n");
      out.write("\t\t\tif(validate(document.crtList.path.value,1)){\r\n\t\t\t\tdocument.crtList.checkedValues.value = \",\"+document.crtList.path.value;\r\n\t\t\t}\t\r\n\t\t}\r\n\t}\r\n\tif(lenth!=1) {\r\n\t\tfor (a=0; a");
      out.write("<lenth; a++){ \r\n\t\t//alert(\" lentth \"+lenth);\r\n\t\t\tif (document.crtList.path[a].checked) {   //alert(\" chdkeing \"+a);\r\n\t\t\t\tval=document.crtList.path[a].value;\r\n\t\t\t\tvar j=a;\r\n\t\t\t\t//alert(\"hi  i valie \"+a+val);\r\n\t\t\t\t//alert(\"hi \"+validate(val)+\" a valie \"+a); \r\n\t\t\t\tif(validate(val,j,lenth)){ \r\n\t\t\t\t\tdocument.crtList.checkedValues.value = document.crtList.checkedValues.value+\",\"+val;\r\n\t\t\t\t\t//alert(\"no of elemts == > \"+lenth+\" \"+i+\" \"+document.crtList.checkedValues.value);\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t//alert(\"lenth iss ==>\"+lenth);\r\n\r\n\t//alert(\"result  -- > \"+document.crtList.checkedValues.value);\r\n\t//alert(\"ocument.crtList.checkedValues.value == > \"+document.crtList.checkedValues.value);\r\n\tif(document.crtList.dummy.value=='stop'){\r\n\t\t//alert(\" stoping \");\r\n\t\treturn;\r\n\t}else if(document.crtList.checkedValues.value==0){\r\n\t\talert(\" Please Select a Certificate to Add\"); \r\n\t\treturn;\r\n\t}\r\n\tdocument.crtList.action=\"CMSToolAction.do?methodToCall=loadCrt\";\r\n\tdocument.crtList.submit();\r\n\r\n}\r\n\r\nfunction back(){\r\ndocument.crtList.action=\"CMSToolAction.do?methodToCall=autoDisc\";\r\n");
      out.write("document.crtList.submit();\r\n}\r\nfunction validate(valpath,num,length){\r\n\tif(length!=1){\r\n\t\tnum=num+1;\r\n\t}\r\n\tvalAppName=valpath+'AppName';\r\n\tvalnname=valpath+'nname';\r\n\tvalhid=valpath+'hid';\r\n\tvalhip=valpath+'hip';\r\n\tvalCrtType=valpath+'CrtType';\r\n\r\n\tif(document.getElementById(valAppName).value==\"null\"){\r\n\t\talert(\" Please Select Application Name in Row \"+num);\r\n\t\tdocument.crtList.dummy.value='stop';\r\n\t\treturn false;\r\n\t}else if(document.getElementById(valnname).value==\"\"){\r\n\t\talert(\" Please Provide Certificate NickName in Row \"+num);\r\n\t\tdocument.crtList.dummy.value='stop';\r\n\t\treturn false;\r\n\t}else if(document.getElementById(valhid).value==\"\"){\r\n\t\talert(\" Please Provide Host ID in Row \"+num);\r\n\t\tdocument.crtList.dummy.value='stop';\r\n\t\treturn false;\r\n\t}else if(document.getElementById(valhip).value==\"\"){\r\n\t\talert(\" Please Provide Host IP in Row \"+num);\r\n\t\tdocument.crtList.dummy.value='stop';\r\n\t\treturn false;\r\n\t}else if(document.getElementById(valCrtType).value==\"null\"){\r\n\t\talert(\" Please Select Certificate Type in Row \"+num );\r\n");
      out.write("\t\tdocument.crtList.dummy.value='stop';\r\n\t\treturn false;\r\n\t}else return verifyIP(valhip,num);\r\n\r\n}\r\n\r\n/////ip validation\r\nfunction verifyIP(valhip,num) {\r\n\r\nIPvalue=document.getElementById(valhip).value;\r\n//IPvalue=valhip;\r\n\r\n//alert(\" this ip validator  \"+IPvalue);\r\nerrorString = \"\";\r\ntheName = \"Host IPaddress\";\r\n\r\nvar ipPattern = /^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$/;\r\nvar ipArray = IPvalue.match(ipPattern);\r\n\r\nif (IPvalue == \"0.0.0.0\")\r\nerrorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used at '+num+' Row';\r\nelse if (IPvalue == \"255.255.255.255\")\r\nerrorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used at '+num+' Row';\r\nif (ipArray == null)\r\nerrorString = errorString + theName + ': '+IPvalue+' is not a valid IP address at '+num+' Row';\r\nelse {\r\nfor (i = 0; i ");
      out.write("< 4; i++) {\r\nthisSegment = ipArray[i];\r\nif (thisSegment > 255) {\r\nerrorString = errorString + theName + ': '+IPvalue+' is not a valid IP address at '+num+' Row';\r\ni = 4;\r\n}\r\nif ((i == 0) && (thisSegment > 255)) {\r\nerrorString = errorString + theName + ': '+IPvalue+' is a special IP address and cannot be used at '+num+' Row';\r\ni = 4;\r\n      }\r\n   }\r\n}\r\nextensionLength = 3;\r\nif (errorString == \"\"){\r\n//alert (\"That is a valid IP address.\");\r\nreturn true;\r\n}\r\nelse{\r\nalert (errorString);\r\ndocument.crtList.dummy.value='stop';\r\nreturn false;\r\n}\r\n}\r\n///////\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body onload=\"onloadbd();\">\r\n");
      out.write("<center>\r\n");
Map map=(Map)session.getAttribute("map");
  Set  keyset= map.keySet();
  Iterator ir=keyset.iterator();
  if(map.size()>0){
      out.write("\r\n ");
      out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"40%\"  bordercolor=\"#000000\">\r\n\t");
      out.write("<tr>\r\n\t\t");
      out.write("<td align=\"center\" valign=\"top\" >");
      out.write("<b>");
      out.write("<font size=\"3\" color=\"336699\">Select Certificates to Load");
      out.write("</font>");
      out.write("<b/>");
      out.write("</td> \r\n    ");
      out.write("</tr>\r\n \t");
      out.write("</table>");
      out.write("<br>\r\n\t");
      out.write("<form name=\"crtList\" action=\"/CMSToolAction.do?methodToCall=loadCrt\" method=\"post\">\r\n \t");
      out.write("<input type=hidden name=\"checkedValues\" />\r\n \t");
      out.write("<input type=hidden value=\"dummy\" name=\"dummy\" />\r\n \r\n \t");
      out.write("<div style=\"width:100%; height:300px; overflow-x: scroll; overflow-y: scroll; font-size:small;font-family:monospace;\"> \r\n\t");
      out.write("<table width=\"150%\" align=\"left\" border=\"1\" cellspacing=\"0\" cellpadding=\"1\" bgcolor=\"#DFECFF\">\r\n \t\t  \r\n \t");
      out.write("<tr>\r\n\t\t");
      out.write("<td >");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"12%\" align='center'>Issued To");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"12%\" align='center'>Issued By");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"10%\" align=\"center\">Valid From");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"10%\" align='center'>Valid To");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"13%\" align='center'>Application Name");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"6%\" align='center'>Crt NickName");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"5%\" align='center'>Host ID");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"10%\" align='center'>Host IP");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"8%\" align='center'>Crt Type");
      out.write("</td>\r\n\t\t");
      out.write("<td width=\"16%\" align='center'>Note");
      out.write("</td>\r\n\t");
      out.write("</tr>\r\n \t");
while(ir.hasNext()){
 	  String path=ir.next().toString();
 	  ParseX509Certificate crt=(ParseX509Certificate) map.get(path);
	
      out.write("\r\n\t ");
      out.write("<tr>\r\n      ");
      out.write("<tr>\r\n     \t ");
      out.write("<td align='center'>");
      out.write("<input type=\"checkbox\" name=\"path\" value=\"");
      out.print(path);
      out.write("\" onclick=\"check();\" />");
      out.write("</td>\r\n     \t ");
      out.write("<td align='center' >");
      out.print(crt.getSubjectCN());
      out.write("</td>\r\n     \t ");
      out.write("<td align='center' >");
      out.print(crt.getIssuerCN());
      out.write("</td>\r\n    \t ");
      out.write("<td align='center' >");
      out.print(crt.getNotBefore().substring(0,10));
      out.write("</td>\r\n     \t ");
      out.write("<td align='center' >");
      out.print(crt.getNotAfter().substring(0,10));
      out.write("</td>\r\n     \t ");
      out.write("<td align='center' >\r\n     \t \r\n     \t \r\n     \t ");
      out.write("<select  name=\"");
      out.print(path);
      out.write("AppName\" size=\"1\" style=\"font-size: 1.05em; width:150px;\" onclick=\"callMultiply()\"  disabled=\"disabled\">\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t");
      out.write("<option value=\"null\" >Select...");
      out.write("</option>\r\n\t\t\t");
if(session.getAttribute("tool_appList")!=null){
			  ArrayList appList=(ArrayList)session.getAttribute("tool_appList");
			  if(appList.size()>0){
			  for(int i=0;i<appList.size();i++){
			  com.qwest.cms.BO.CMSBO bo=(com.qwest.cms.BO.CMSBO)appList.get(i);
			  String appName=bo.getAppName();
			
      out.write("<option title='");
      out.print(appName);
      out.write("' value=\"");
      out.print(appName);
      out.write("\">");
      out.print(appName);
      out.write(" ");
      out.write("</option>\r\n\t\t\t\r\n\t\t\t");
}}}
      out.write("</select>\r\n     \t ");
      out.write("</td>\r\n     \t ");
      out.write("<td align='center' >");
      out.write("<input type=\"text\" name=\"");
      out.print(path);
      out.write("nname\"    >");
      out.write("</td>\t\r\n     \t ");
      out.write("<td align='center' >");
      out.write("<input type=\"text\" name=\"");
      out.print(path);
      out.write("hid\"  >");
      out.write("</td>\r\n     \t ");
      out.write("<td align='center' >");
      out.write("<input type=\"text\" name=\"");
      out.print(path);
      out.write("hip\" >");
      out.write("</td>\r\n     \t ");
      out.write("<td align='center'>");
      out.write("<select name=\"");
      out.print(path);
      out.write("CrtType\" size=\"1\" style=\"font-size: 1.05em;\" onclick=\"callMultiply()\" style=\"WIDTH: 100px; HEIGHT: 22px\"  disabled=\"disabled\">\r\n\t\t\t");
      out.write("<option value=\"null\">Select...");
      out.write("</option>");
      out.write("<option value=\"INTERNAL\">Internal");
      out.write("</option>");
      out.write("<option value=\"EXTERNAL\">External");
      out.write("</option>\t");
      out.write("</td>\r\n     \t ");
      out.write("<td align='center' >");
      out.write("<textarea name=\"");
      out.print(path);
      out.write("note\" >");
      out.write("</textarea>");
      out.write("</td>\r\n   \t");
      out.write("</tr>\r\n   \r\n\t");
}
      out.write("\r\n\t");
      out.write("</table>\r\n\t");
      out.write("</div>\r\n\t");
      out.write("<table>\r\n\t");
      out.write("<tr>\r\n\t\t");
      out.write("<td>&nbsp");
      out.write("</td>\r\n\t\t");
      out.write("<td>&nbsp");
      out.write("</td>\r\n\t\t");
      out.write("<td>&nbsp");
      out.write("</td>\r\n\t\t\r\n\t\t");
      out.write("<td> ");
      out.write("<input type=\"button\" value=\"Add to MY Account\" style=\"font-size: 1.05em; padding: 0.05em;\" onclick=\"javascript:selPaths();\">");
      out.write("</td>\r\n\t\t\r\n\t\t");
      out.write("<td> &nbsp");
      out.write("</td>\r\n\t\t");
      out.write("<td> ");
      out.write("<input type=\"reset\" value=\"Reset\" style=\"font-size: 1.05em; padding: 0.05em;\">");
      out.write("</td>\r\n\t\t");
      out.write("<td> &nbsp");
      out.write("</td>\r\n\t\t");
      out.write("<td> ");
      out.write("<input type=\"button\" value=\"Back\" style=\"font-size: 1.05em; padding: 0.05em;\" onclick=\"javascript:back();\">");
      out.write("</td>\r\n\t");
      out.write("</tr>\r\n\t");
      out.write("</table>\r\n");
      out.write("</table>\t\r\n");
}else{
      out.write("\r\n\t");
      out.write("<br>\r\n\t");
      out.write("<br>\r\n\t");
      out.write("<table align=\"center\"  width=\"80%\">\r\n\t\t");
      out.write("<tr>\r\n\t\t");
      out.write("<td align=\"center\" bgcolor=\"FFFFCC\">");
      out.write("<FONT size=\"4\" color=\"CC0033\">No Certificates have been found in the given Location with this Application User Name");
      out.write("</FONT>");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\r\n\t\t");
      out.write("<tr>\r\n\t\t\t");
      out.write("<td align=\"center\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=autoDisc\">Click here to Go Back");
      out.write("</a>  ");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\t\t\t\t\r\n\t\t");
      out.write("</table>\t\t\r\n\r\n\t\t\t    \r\n");
}
      out.write("\r\n\r\n");
      out.write("</form>\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }
}
