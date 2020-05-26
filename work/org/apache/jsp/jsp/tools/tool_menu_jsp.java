package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class tool_menu_jsp extends HttpJspBase {


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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"/jsp/errorFromMenu.jsp", true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n");
      out.write("<html>\r\n");
      out.write("<script type=\"text/javascript\">\r\n\r\nfunction loadCert(noCerts){\t\t\r\n\t\tif(noCerts.value==\"Certificates\"){\r\n\t\t\t//alert(\"alert\"+noCerts.value);\r\n\t\t\tdocument.location.href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=autoDisc\";\r\n\t\t\t//document.forms[0].action=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=autoDisc\";\r\n\t\t\t//document.forms[0].submit();\t\t\t\r\n\t\t}\r\n\t\telse if(noCerts.value==\"noCertificates\"){\r\n\t\t\talert(\"No Certificates in your account\");\r\n\t\t\tdocument.forms[0].action=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=tool\";\r\n\t\t\t//alert(\"action is \"+document.forms[0].action.value);\r\n\t\t\tdocument.forms[0].submit();\t\t\t\r\n\t\t}\r\n}\r\n\r\n");
      out.write("</script>\r\n");
      out.write("<head>\r\n\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Tools Menu Bar");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/menu.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n\r\n");
      out.write("<br>");
      out.write("<br>");
      out.write("<br>");
      out.write("<br>\r\n");
      out.write("<p align=\"left\">\r\n ");
      out.write("<div class=\"sdmenu\">\r\n     ");
      out.write("<span class=\"title\" id=\"top\"  > ");
      out.write("<font color=\"black\">Menu");
      out.write("</font>");
      out.write("</span>\r\n      ");
      out.write("<div class=\"submenu\">\r\n     \t");
String noCerts = (String)session.getAttribute("noCerts");
     	  System.out.println("nocerts is ......"+noCerts);
      out.write("\r\n        ");
      out.write("<input type=\"hidden\" name=\"noCerts\" value=\"");
      out.print(noCerts);
      out.write("\">\r\n        ");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=csrform\">Create CSR");
      out.write("</a>  \r\n        ");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=creatCrt\">Create Certificate");
      out.write("</a>  \r\n        ");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=creatNewCsrFromOld\">Create New CSR with  CERT as a Model");
      out.write("</a>  \r\n        ");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=reqform\">Request To Search");
      out.write("</a>\r\n        ");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=autoDisc\">Load Certificates");
      out.write("</a>\r\n                 \r\n        \t      \r\n      ");
      out.write("</div>\r\n");
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
