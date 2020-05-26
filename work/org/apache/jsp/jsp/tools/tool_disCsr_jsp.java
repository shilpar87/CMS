package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import com.qwest.cms.utils.*;
import java.util.ArrayList;

public class tool_disCsr_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;

  public tool_disCsr_jsp() {
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write(" \r\n\r\n");
      out.write("<html>\r\n ");
      out.write("<HEAD>\r\n ");
      out.write("<script>\r\n \r\n function saveCsr(){\r\n \t\r\n }\r\n \r\n function cancel(){\t   \t\t\r\n\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=tool\";\r\n\t\tdocument.forms[0].submit();\t  \t\t\t\r\n}\r\n \r\n ");
      out.write("</script>\r\n  ");
      out.write("<TITLE> New Document ");
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
      /* ----  html:form ---- */
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(pageContext);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/CMSToolAction.do?methodToCall=creatCsr");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n ");
          out.write("<font size=\"3\" color=\"336699\">");
          out.write("<b>Certificate Signing Request ");
          out.write("</b>");
          out.write("</font>\r\n  \t");
          out.write("<table>\r\n  \t");
          out.write("<tr>");
          out.write("<td>\r\n  \t \t");
ArrayList tempcsr=new ArrayList();
 		if(session.getAttribute("tempcsr")!=null)
 			{tempcsr=(ArrayList)session.getAttribute("tempcsr");
 		if(tempcsr.size()>0){String cuid=(String)session.getAttribute("login");  
          out.write("<TEXTAREA title=csr style=\"WIDTH: 430px; HEIGHT: 180px\" name=pubkey rows=11 readOnly cols=46>\r\n \t\t\t");
          out.print(ExportUtil.readCsr(cuid));
          out.write("</textarea>\r\n \t\t\t");
}tempcsr.clear();} 
			
          out.write("\r\n \t");
          out.write("</td>");
          out.write("</tr>\r\n \t");
          out.write("<tr> ");
          out.write("<td align=\"center\">");
          out.write("<input type=\"button\" name=\"Cancel\" value=\"Back\" style=\"font-size: 1.05em; padding: 0.05em;\" onclick=\"cancel()\">");
          out.write("</td>");
          out.write("</tr>\r\n \t");
          out.write("<!--");
          out.write("<tr>");
          out.write("<td align=\"center\">");
          out.write("<input type=\"button\" name=\"Save\" value=\"Save CSR\" style=\"font-size: 1.05em; padding: 0.05em;\" onclick=\"saveCsr()\"> \r\n \t\t\t\t\t\t   ");
          out.write("<input type=\"button\" name=\"Cancel\" value=\"Cancel\" style=\"font-size: 1.05em; padding: 0.05em;\" onclick=\"cancel()\">\r\n \t");
          out.write("</td>");
          out.write("</tr>\r\n \t\r\n \t-->\r\n \t\r\n \t");
          out.write("</table>\r\n\t");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n ");
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
