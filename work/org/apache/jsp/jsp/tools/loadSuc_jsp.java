package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class loadSuc_jsp extends HttpJspBase {


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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Tool_loadSuc");
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n\t");
      out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"40%\"  bgcolor=\"336699\">\r\n\t");
      out.write("<tr>\r\n\t\t");
      out.write("<td align=\"center\" valign=\"top\" >");
      out.write("<b>");
      out.write("<font size=\"4\" color=\"FFFFFF\">Load Status");
      out.write("</font>");
      out.write("<b/> \r\n\t\t  \r\n\t\t");
      out.write("</td> \r\n    ");
      out.write("</tr>\r\n \t");
      out.write("</table>");
      out.write("<br>\r\n\t");
      out.write("<tr>");
      out.write("<td>&nbsp");
      out.write("</td>");
      out.write("<td>&nbsp");
      out.write("</td>");
      out.write("</tr>\r\n\t");
      out.write("<tr>");
      out.write("<td>&nbsp");
      out.write("</td>");
      out.write("<td>&nbsp");
      out.write("</td>");
      out.write("</tr>\r\n\t");
      out.write("<tr>");
      out.write("</tr>\r\n\r\n\t");
      out.write("<div style=\"width:850px; height:10px\" >\r\n\t");
      out.write("<table  width =\"70%\" cellspacing=\"2\" cellpadding=\"0\" border=\"1\" bordercolor=\"336699\">\r\n\t");
      out.write("<tr>  \r\n\t");
      out.write("<td align=\"center\" width=\"590px\" > ");
      out.write("<font size=\"4\" color=\"red\" >");
      out.print(session.getAttribute("rows"));
      out.write("</font>&nbsp;&nbsp;\r\n\t\t");
 if( session.getAttribute("rows").equals("1")){
		
      out.write("\r\n\t\t\t");
      out.write("<b>");
      out.write("<font size='2' color='336699'>Certificate has been loaded Successfully to your Account. ");
      out.write("</font>");
      out.write("</b>");
      out.write("</td>\r\n\t\t");
 }
			else{
		
      out.write("\r\n\t\t\t");
      out.write("<b>");
      out.write("<font size='2' color='336699'>Certificates have been loaded Successfully to your Account. ");
      out.write("</font>");
      out.write("</b>");
      out.write("</td>\r\n\t\t");
 }
		   session.removeAttribute("rows");
		
      out.write("\r\n\r\n\t");
      out.write("</tr>\r\n\t");
      out.write("</table>");
      out.write("<br>\r\n");
      out.write("<table>");
      out.write("<tr>");
      out.write("<td> &nbsp;\r\n");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=autoDisc\">");
      out.write("<b>");
      out.write("<u>Click here to Go Back");
      out.write("</u>");
      out.write("</b>");
      out.write("</a>  ");
      out.write("</td>");
      out.write("</tr>   \r\n");
      out.write("</table>\r\n");
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
