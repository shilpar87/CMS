package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class Header_jsp extends HttpJspBase {


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

      out.write("<html>\r\n");
      out.write("<head>\r\n\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Menu Bar");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/menu.css\" />\r\n\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div  style=\"width:800px; height:30px; \" >\r\n");
      out.write("<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=0 >\r\n  ");
      out.write("<tr >\r\n    ");
      out.write("<td  rowspan=\"0\">");
      out.write("<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/qwest_logo.gif\" alt=\"Qwest - Spirit of Service\"  />");
      out.write("</td>\r\n    ");
      out.write("<td>&nbsp;");
      out.write("</td>");
      out.write("<td class=\"headertitle\">&nbsp;");
      out.write("<h2>Certificate Management System&nbsp;");
      out.write("</h2>");
      out.write("</td>\r\n    ");
      out.write("<td class=\"headerwelcome\">CMS");
      out.write("<sup>&trade;");
      out.write("</sup> Help");
      out.write("<BR> for Qwest users");
      out.write("</td>\r\n  ");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<div>\r\n");
      out.write("<div class=\"bottomLine\">");
      out.write("</div>\r\n\r\n");
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
