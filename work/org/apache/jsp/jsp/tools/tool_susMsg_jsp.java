package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;

public class tool_susMsg_jsp extends HttpJspBase {


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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write(" \r\n");
      out.write("<html>\r\n\t");
      out.write("<head>\r\n\t");
      out.write("<script language=JavaScript>\r\n\tfunction  cpFile(){\r\n\t\tvar path=document.viewPub.pubKeyCrt.value;\r\n\t\tif(path==null||path==\"\"){\r\n\t\t\talert(\" please select the path of Certificate \");\r\n\r\n\t\t}else{\r\n\t\tdocument.viewPub.pubKeyCrtPath.value=path;\r\n\t\t//alert(\"done \"+document.viewPub.pubKeyCrtPath.value);\r\n\r\n\t\tdocument.forms[0].action=\"CMSToolAction.do?methodToCall=getPubKey\";\r\n\t\tdocument.forms[0].submit();\r\n\t\t//return;\r\n\t\t}\r\n\t}\r\n\tfunction validate_form()\r\n\t{\r\n\t\twith (thisform)\r\n\t\t{\r\n\t\t\tif(cpFile()==false)\r\n \t\t\t\t {alert(\"ture\");\r\n\t\t\t\t  return false;\r\n \t\t\t }\r\n\t\t\telse \r\n  \t\t\t\t {alert(\"false\");\r\n  \t\t\t\t return true;\r\n  \t\t\t }\r\n\t\t}\r\n\t}\r\n");
      out.write("</script>\r\n\r\n\t");
      out.write("<title>Tools Result page");
      out.write("</title>\r\n\t");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/menu.css\" />\r\n\t");
      out.write("</head>\r\n\t");
      out.write("<body>\r\n\r\n\t\t");
      out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"40%\"  bordercolor=\"#000000\">\r\n\t\t\t");
      out.write("<tr>\r\n\t\t\t");
      out.write("<td align=\"center\" valign=\"top\" >");
      out.write("<b>");
      out.write("<u>");
      out.write("<font size=\"3\" color=\"336699\">App's Certificates Search Request ");
      out.write("</font>");
      out.write("</u> ");
      out.write("</b>\t");
      out.write("</td> \r\n    \t\t");
      out.write("</tr>\r\n \t    ");
      out.write("</table>\r\n\t\t");
      out.write("<br>");
      out.write("<br>\r\n\r\n\t\t");
      out.write("<div style=\"width:700px; height:10px\" >\r\n\t\t");
      out.write("<table  width =\"70%\" cellspacing=\"2\" cellpadding=\"0\" border=\"1\" bordercolor=\"336699\">\r\n\t\t");
      out.write("<tr>  \r\n\t\t\t\t");
      out.write("<td align=\"center\" width=\"590px\" > ");
      out.write("<font size=\"4\" color=\"007E8B\"> Your Request Has been Sent Successfully to your AIP ");
      out.write("</font>");
      out.write("</td>\r\n\r\n\t\t");
      out.write("</tr>\r\n\t\t");
      out.write("</table>\r\n\r\n\t\t");
      out.write("<br>\r\n\t\t");
      out.write("<p>\t\r\n\t\t");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=reqform\">");
      out.write("<u>");
      out.write("<b>GO back");
      out.write("</b>");
      out.write("<BR>");
      out.write("<BR>");
      out.write("</u>");
      out.write("</a>\r\n\r\n\t");
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
