package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;
import com.qwest.cms.BO.*;

public class Notes_jsp extends HttpJspBase {


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
      response.setContentType("text/html; charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n\r\n");
      out.write("<header>\r\n\r\n");
      out.write("</header>\r\n");

CMSBO cmsbo= new CMSBO();
String notes="";

String nickName="";

if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");
	notes= cmsbo.getNotes();
	nickName=cmsbo.getCertNickname();
	
	 System.out.println("notes-->"+notes );
	
	
}


      out.write("\r\n");
      out.write("<body>\r\n\r\n");
      out.write("<br>\r\n");
      out.write("<br>Cert Nick Name: ");
      out.write("<font color=\"blue\">");
      out.write("<b> ");
      out.print(nickName);
      out.write("</b>");
      out.write("</font>\r\n");
      out.write("<br>\r\n");
      out.write("<br>");
      out.write("<b>");
      out.write("<u>Notes:");
      out.write("</u>");
      out.write("</b> \r\n");
      out.write("<br>\r\n");
      out.write("<br> ");
      out.write("<font color=\"blue\"> ");
      out.print(notes);
      out.write("</font>\r\n\r\n");
      out.write("</body>\r\n\r\n\r\n");
      out.write("</html>\r\n\r\n");
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
