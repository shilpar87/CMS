package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;
import com.qwest.cms.BO.*;

public class detail_jsp extends HttpJspBase {


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
String pki_extn="";
String alorithm="";
String rcbsCode="";
String rcbsMgrCuid="";
if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");
	nickName= cmsbo.getCertNickname();
	pki_extn=(String)cmsbo.getRaw_certificate();
	 if(pki_extn != null)
	 {
		 pki_extn= pki_extn.substring(pki_extn.lastIndexOf("."));
	 }
	 System.out.println("extn-->"+pki_extn );
	 alorithm=(String)cmsbo.getSignature_algo();
	 rcbsCode=(String)cmsbo.getRcbsCode();
	 rcbsMgrCuid=(String)cmsbo.getRcbsMgrCuid();
	 System.out.println("inside details page: rcbscode-->"+ rcbsCode);
	 System.out.println("inside details page: rcbsMGR-->"+ rcbsMgrCuid);
}




if(session.getAttribute("checkedRadioValue")!= null)
{
 serialNo = session.getAttribute("checkedRadioValue").toString();
 
}


      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<br>");
      out.write("<u>");
      out.write("<b>Certificate Information");
      out.write("</b>");
      out.write("</u>\r\n");
      out.write("<br>\r\n");
      out.write("<br>Cert Nick Name: ");
      out.write("<font color=\"blue\"> ");
      out.print(nickName);
      out.write("</font>\r\n");
      out.write("<br>\r\n");
      out.write("<br>PKI Extension: ");
      out.write("<font color=\"blue\"> ");
      out.print(pki_extn);
      out.write("</font>\r\n");
      out.write("<br>\r\n");
      out.write("<br>Algorithm used: ");
      out.write("<font color=\"blue\"> ");
      out.print(alorithm);
      out.write("</font>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>");
      out.write("<u>");
      out.write("<b>Other information:");
      out.write("</b>");
      out.write("</u>\r\n");
      out.write("<br>\r\n");
      out.write("<br>RCBS code: ");
      out.write("<font color=\"blue\"> ");
      out.print(rcbsCode);
      out.write("</font>\r\n");
      out.write("<br>\r\n");
      out.write("<br>RCBS manager(CUID): ");
      out.write("<font color=\"blue\"> ");
      out.print(rcbsMgrCuid);
      out.write("</font>\r\n");
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
