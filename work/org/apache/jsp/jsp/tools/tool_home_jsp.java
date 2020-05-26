package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class tool_home_jsp extends HttpJspBase {


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
      			null, true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n\r\n");
      out.write("<html>\r\n\t");
      out.write("<table width=\"45%\" align=\"center\" border=\"1\" bordercolor=\"004488\" cellpadding=\"1\" >\r\n\t\t");
      out.write("<tr>\r\n\t\t\t");
      out.write("<td align=\"center\">");
      out.write("<font size=\"2\" color=\"004488\">");
      out.write("<b>Welcome to the Tools Section.  ");
      out.write("</b>");
      out.write("</font>\r\n\t\t\t\t\r\n\t\t");
      out.write("</tr>\r\n\t");
      out.write("</table>\r\n\t");
      out.write("<br>\r\n\t");
      out.write("<center>");
      out.write("<font size=\"2\" color=\"004488\">Please select the features from the Menu.");
      out.write("</font>");
      out.write("</center>\r\n\t\t\r\n");
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
