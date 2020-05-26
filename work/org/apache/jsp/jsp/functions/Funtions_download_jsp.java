package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class Funtions_download_jsp extends HttpJspBase {


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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n\r\n");
      out.write("<head>\r\n\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Export Certificate Error");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<BODY>\r\n");
      out.write("<html>\r\n\r\n");
      out.write("<table align=\"center\" bgcolor=\"DDDDDD\">\r\n\t\t");
      out.write("<tr>");
      out.write("<td>&nbsp");
      out.write("</td>");
      out.write("</tr>\r\n\t\t");
      out.write("<tr>");
      out.write("<td>");
      out.write("<FONT size=\"3\" color=\"CC0033\">");
      out.write("<b>This Certificate does not exist in your local system and cannot be opened.");
      out.write("</b>");
      out.write("</FONT>");
      out.write("</td>");
      out.write("</tr>\r\n\t\t");
      out.write("<tr>");
      out.write("<td>&nbsp");
      out.write("</td>");
      out.write("</tr>\r\n\t\t");
      out.write("<tr>");
      out.write("<td align=\"center\">");
      out.write("<input type=\"button\"  value=\"Back to Home\" style=\"font-size: 1.05em; padding: 0.03em;\" name=\"BackToHome\" onclick=\"return submit1();\"/>");
      out.write("</td>");
      out.write("</tr>\r\n\t\t");
      out.write("<tr>");
      out.write("<td>&nbsp");
      out.write("</td>");
      out.write("</tr>\r\n\t\t\r\n\t");
      out.write("</table>\r\n");
      out.write("</html>\r\n");
      out.write("</BODY>\r\n");
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
