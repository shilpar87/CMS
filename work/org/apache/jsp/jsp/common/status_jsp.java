package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;
import com.qwest.cms.BO.*;

public class status_jsp extends HttpJspBase {


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
String serialNo="";
String nickName="";
String status="";
String issuer="";
String issuer_CN="";
String issued_to="";
String issued_by="";
String  valid_from="";
String valid_to="";

if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");
	nickName= cmsbo.getCertNickname();
	status=cmsbo.getStatus();
	issuer=(String)cmsbo.getIssuer();
	issued_by=(String)cmsbo.getIssuer_CN();
	issued_to=(String)cmsbo.getSubject_CN();
	
	valid_from=(String)cmsbo.getFrom_dt();
	valid_to=(String)cmsbo.getExpiry_dt();
	
	
}
if(session.getAttribute("checkedRadioValue")!= null)
{
 serialNo = session.getAttribute("checkedRadioValue").toString();
}

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<br>");
      out.write("<b>Certificate Nick Name: ");
      out.write("<font color=\"blue\">");
      out.print(nickName);
      out.write("</font>");
      out.write("</b>\r\n");
      out.write("<br>\r\n");

if(status.equalsIgnoreCase("active"))
{

      out.write("\r\n");
      out.write("<br>");
      out.write("<b>Status");
      out.write("</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ");
      out.write("<font color=\"green\">");
      out.write("<b>");
      out.print(status);
      out.write("</b>");
      out.write("</font>\r\n");

}
else if ((status.equalsIgnoreCase("expired")))
{

      out.write("\r\n");
      out.write("<br>");
      out.write("<b>Status");
      out.write("</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ");
      out.write("<font color=\"red\">");
      out.write("<b>");
      out.print(status);
      out.write("</b>");
      out.write("</font>\r\n");

}
else if ((status.equalsIgnoreCase("inactive")))
{

      out.write("\r\n");
      out.write("<br>");
      out.write("<b>Status");
      out.write("</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ");
      out.write("<font color=\"#00FFFF\">");
      out.write("<b>");
      out.print(status);
      out.write("</b>");
      out.write("</font>\r\n");

}
else if ((status.equalsIgnoreCase("renew")))
{
	
      out.write("\r\n\t");
      out.write("<br>");
      out.write("<b>Status");
      out.write("</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ");
      out.write("<font color=\"blue\">");
      out.write("<b>");
      out.print(status);
      out.write("</b>");
      out.write("</font>\r\n\t");

	}
else
{

      out.write("\r\n");
      out.write("<br>\r\n\r\n");
      out.write("<br>");
      out.write("<b>Status");
      out.write("</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: ");
      out.write("<font color=\"blue\">");
      out.print(status);
      out.write("</font>\r\n");

}

      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>");
      out.write("<b>Issuer Name:");
      out.write("</b> ");
      out.write("<font color=\"blue\">");
      out.print(issuer);
      out.write("</font>\r\n");
      out.write("<br>\r\n");
      out.write("<br>");
      out.write("<b>Issued To: ");
      out.write("</b>");
      out.write("<font color=\"blue\"> ");
      out.print(issued_to);
      out.write("</font>\r\n");
      out.write("<br>\r\n");
      out.write("<br>");
      out.write("<b>Issued By:");
      out.write("</b> ");
      out.write("<font color=\"blue\">");
      out.print(issued_by);
      out.write("</font>\r\n");
      out.write("<br>\r\n");
      out.write("<br>");
      out.write("<b>Valid from:");
      out.write("</b> ");
      out.write("<font color=\"blue\"> ");
      out.print(valid_from);
      out.write("</b>");
      out.write("</font>");
      out.write("<b>&nbsp;&nbsp;&nbsp;&nbsp;Valid to &nbsp;&nbsp;&nbsp;&nbsp;:");
      out.write("</b>");
      out.write("<font color=\"blue\"> ");
      out.print(valid_to);
      out.write("</font>\r\n\r\n");
      out.write("<br>\r\n");
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
