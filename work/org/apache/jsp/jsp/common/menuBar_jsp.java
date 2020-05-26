package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class menuBar_jsp extends HttpJspBase {


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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Menu Bar");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/menu.css\" />\r\n");
      out.write("<script>\r\nfunction showListPage(){\r\n  document.forms[0].action = \"");
      out.print(request.getContextPath());
      out.write("/PAFAction.do?methodToCall=list\";\t  \t\r\n document.forms[0].submit();\r\n}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
 
String cuid = "";
if(session.getAttribute("login")!=null)
{
cuid = session.getAttribute("login").toString();
}
String totalCert="";
if(session.getAttribute("totalCert")!=null)
{
 totalCert= session.getAttribute("totalCert").toString();
}

      out.write("\r\n");
      out.write("<body>");
      out.write("<table>\r\n");
      out.write("<tr >\r\n");
      out.write("<td width=\"500\">Total Certificates in your account: ");
      out.write("<font color=\"blue\" ");
      out.write("<b>");
      out.print(totalCert);
      out.write("</b>");
      out.write("</font>");
      out.write("</td>\r\n");
      out.write("<td >User Cuid: ");
      out.write("<font color=\"blue\" ");
      out.write("<b>");
      out.print(cuid);
      out.write("</b>");
      out.write("</font>");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td >");
      out.write("</td>\r\n");
      out.write("<td   align=\"center\"> \r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=search\">");
      out.write("<u>Search");
      out.write("</u>");
      out.write("</a>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=certInAccount\">");
      out.write("<u>Home");
      out.write("</u>");
      out.write("</a>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=tool\">");
      out.write("<u>Tools");
      out.write("</u>");
      out.write("</a>\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=edit_profile\">");
      out.write("<u>Create/Update Group");
      out.write("</u>");
      out.write("</a>\r\n");
      out.write("<a href=\"./Logout.do\">");
      out.write("<u>Sign Out");
      out.write("</u>");
      out.write("</a>\r\n");
      out.write("</td>\r\n\r\n");
      out.write("</tr>\r\n\r\n");
      out.write("</table>\r\n");
      out.write("<div class=\"bottomLine\">");
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
