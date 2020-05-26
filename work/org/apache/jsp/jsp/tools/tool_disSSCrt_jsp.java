package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import com.qwest.cms.utils.*;
import java.util.ArrayList;

public class tool_disSSCrt_jsp extends HttpJspBase {


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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<HTML>\r\n ");
      out.write("<HEAD>\r\n  ");
      out.write("<TITLE> Self Sign Certificate ");
      out.write("</TITLE>\r\n  ");
      out.write("<META NAME=\"Generator\" CONTENT=\"EditPlus\">\r\n  ");
      out.write("<META NAME=\"Author\" CONTENT=\"\">\r\n  ");
      out.write("<META NAME=\"Keywords\" CONTENT=\"\">\r\n  ");
      out.write("<META NAME=\"Description\" CONTENT=\"\">\r\n  ");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" />\r\n ");
      out.write("</HEAD>\r\n\r\n ");
      out.write("<BODY>\r\n ");
      out.write("<b>");
      out.write("<u>");
      out.write("<font size=\"2\" color=\"336699\"> Certificate ");
      out.write("</font>");
      out.write("</u>");
      out.write("</b>\r\n  ");
      out.write("<table>");
      out.write("<tr>");
      out.write("<td>\r\n   ");
ArrayList tempcrt=new ArrayList();
 if(session.getAttribute("tempcrt")!=null)
 {tempcrt=(ArrayList)session.getAttribute("tempcrt");
 if(tempcrt.size()>0){String cuid=(String)session.getAttribute("login"); 
      out.write("<TEXTAREA title=crt style=\"WIDTH: 430px; HEIGHT: 250px\" name=pubkey rows=11 readOnly cols=46>\r\n ");
      out.print(ExportUtil.readCrt(cuid));
      out.write("</textarea>\r\n ");
}tempcrt.clear();} 

      out.write("\r\n ");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>\r\n\r\n ");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
