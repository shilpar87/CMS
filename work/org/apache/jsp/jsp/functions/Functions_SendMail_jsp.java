package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class Functions_SendMail_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;

  public Functions_SendMail_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<script type=\"text/javascript\" >\r\n\r\nfunction goToHome(){\r\nvar agree=confirm(\"Are you sure you wish to continue?\");\r\n    if(agree){    \t\t\r\n\t\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSFunctionAction.do?methodToCall=Functions\";\r\n\t\t\tdocument.forms[0].submit();\t    \t\t\r\n\t\t\treturn true;\r\n    \t\t}      \t\t\t\r\n}\r\n\r\nfunction load(file,target) {\r\n    if (target != ''){\r\n        target.window.location.reload(true);\r\n        }\r\n    else\r\n        window.location.href = file;\r\n      self.close();\r\n}\r\n\r\nfunction cancel(){\t   \t\t\r\n\t\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSFunctionAction.do?methodToCall=home\";\r\n\t\t\tdocument.forms[0].submit();\t  \t\t\t\r\n}\r\n");
      out.write("</script>\r\n\r\n");
      /* ----  html:html ---- */
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(pageContext);
      _jspx_th_html_html_0.setParent(null);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<head>\r\n\r\n");
          out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
          out.write("<title>Renewal of Certificate");
          out.write("</title>\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(request.getContextPath() );
          out.write("/css/style.css\" />\r\n");
          out.write("</head>\r\n\r\n");
          out.write("<body>\r\n\t");
          if (_jspx_meth_html_form_0(_jspx_th_html_html_0, pageContext))
            return;
          out.write("\r\n");
          out.write("</body>\r\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }

  private boolean _jspx_meth_html_form_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_html_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:form ---- */
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(pageContext);
    _jspx_th_html_form_0.setParent(_jspx_th_html_html_0);
    _jspx_th_html_form_0.setAction("/CMSFunctionAction.do?methodToCall=renewCert");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n\t");
        out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"40%\" bgcolor=\"336699\" bordercolor=\"#000000\">\r\n\t");
        out.write("<tr>\r\n\t\t");
        out.write("<td align=\"center\" valign=\"top\" >");
        out.write("<u>");
        out.write("<font size=\"4\" color=\"FFFFFF\"> Renewal of Certificate ");
        out.write("</font>");
        out.write("</u> \r\n\t\t  ");
        out.write("<!--");
        out.write("<tiles:insert\tattribute=\"menu\" />-->\r\n\t\t");
        out.write("</td> \r\n    ");
        out.write("</tr>\r\n \t");
        out.write("</table>\r\n\t");
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
        out.write("<tr>  \r\n\t\t\t\t");
        out.write("<td align=\"center\" width=\"590px\" > ");
        out.write("<font size=\"2\" color=\" 00638B\" > The CSR has been generated and the mail has been sent to the RCBS Manager for approval.  Once the Manager approves it, he will send it to the risk management team.  The risk management team will renew the certificate and send the Certificate Details.  On receiving the same, Please use the Update Certificate link (Functions tab) to paste the Certificate information in order to update the Certificate. ");
        out.write("</font>");
        out.write("</td>\r\n\r\n\t");
        out.write("</tr>\r\n\t");
        out.write("</table>\r\n\t\r\n\t");
        out.write("<table align=\"center\">\r\n\t");
        out.write("<tr>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("</tr>\r\n\t");
        out.write("<tr>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("</tr>\r\n\t");
        out.write("<tr>");
        out.write("<td>");
        out.write("<input type=\"button\" value=\"Back to Functions home\" onclick=\"goToHome()\">");
        out.write("</td>");
        out.write("</tr>\r\n\t");
        out.write("</table>\r\n\t\r\n\t");
        int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
    return false;
  }
}
