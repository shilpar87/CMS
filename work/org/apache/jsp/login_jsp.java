package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class login_jsp extends HttpJspBase {

  public String getServletInfo() {
    return "QSS";
}

  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_messagesPresent;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_value_size_property_maxlength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_password_value_size_property_maxlength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset_nobody;

  public login_jsp() {
    _jspx_tagPool_logic_messagesPresent = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_messages_id = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_errors_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_value_size_property_maxlength_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_password_value_size_property_maxlength_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_submit_value_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_reset_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_messagesPresent.release();
    _jspx_tagPool_html_messages_id.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_text_value_size_property_maxlength_nobody.release();
    _jspx_tagPool_html_password_value_size_property_maxlength_nobody.release();
    _jspx_tagPool_html_submit_value_nobody.release();
    _jspx_tagPool_html_reset_nobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n    ");
      out.write("<head>\r\n\r\n    ");
      out.write("</head>\r\n    ");
      out.write("<body >\r\n        ");
      out.write("<h4>");
      out.write("</h4>\r\n        ");
      out.write("<table width=100% height=100% border=\"0\" align=\"BASELINE\" bgColor=\"white\">\r\n             ");
      out.write("<tr>\r\n                  ");
      out.write("<td width=50% align=\"center\">");
      out.write("<font face=\"Arial\" size=\"5\">");
      out.write("<b>Certificate Management System");
      out.write("</b>");
      out.write("</font>");
      out.write("</td>\r\n                  ");
      out.write("<td width=50% align =\"right\">\r\n                  ");
      out.write("<table border=\"1\" cellpadding=\"2\" cellspacing=\"6\" >\r\n                     ");
      out.write("<tr>\r\n                       ");
      out.write("<td>\r\n                           ");
      out.write("<table >\r\n                              ");
      out.write("<tr >\r\n                                  ");
      out.write("<td width=20%>");
      out.write("</td>\r\n                                  ");
      out.write("<td width=60%>\r\n                                  ");
      out.write("<img src=\"");
      out.print(request.getContextPath());
      out.write("/images/qwest_logo.gif\" alt=\"http://www.qwestsoftwareservices.com\" valign =\"top\" >\r\n                                  ");
      out.write("</td>\r\n                                  ");
      out.write("<td width=20%>");
      out.write("</td>\r\n                               ");
      out.write("</tr>\r\n                               ");
      out.write("<tr height=20%>\r\n                                   ");
      out.write("<td height=35%>");
      out.write("</td>\r\n                                    ");
      /* ----  logic:messagesPresent ---- */
      org.apache.struts.taglib.logic.MessagesPresentTag _jspx_th_logic_messagesPresent_0 = (org.apache.struts.taglib.logic.MessagesPresentTag) _jspx_tagPool_logic_messagesPresent.get(org.apache.struts.taglib.logic.MessagesPresentTag.class);
      _jspx_th_logic_messagesPresent_0.setPageContext(pageContext);
      _jspx_th_logic_messagesPresent_0.setParent(null);
      int _jspx_eval_logic_messagesPresent_0 = _jspx_th_logic_messagesPresent_0.doStartTag();
      if (_jspx_eval_logic_messagesPresent_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\t\t\t\t\t   \r\n\t\t   \t\t\t\t\t\t\t");
          /* ----  html:messages ---- */
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_id.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_messages_0.setPageContext(pageContext);
          _jspx_th_html_messages_0.setParent(_jspx_th_logic_messagesPresent_0);
          _jspx_th_html_messages_0.setId("errors");
          int _jspx_eval_html_messages_0 = _jspx_th_html_messages_0.doStartTag();
          if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String errors = null;
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
              out = _bc;
              _jspx_th_html_messages_0.setBodyContent(_bc);
              _jspx_th_html_messages_0.doInitBody();
            }
            errors = (java.lang.String) pageContext.findAttribute("errors");
            do {
              out.write("\t\t     \t\r\n\t\t     \t\t\t\t\t\t");
              out.write("<td colspan=\"2\" align=\"center\">\r\n\t\t     \t\t\t\t\t\t");
              out.write("<font color=\"red\" face=\"Arial\" size=\"2\">");
              out.write("<li>");
              if (_jspx_meth_html_errors_0(_jspx_th_html_messages_0, pageContext))
                return;
              out.write("</li>");
              out.write("</font>\r\n\t\t     \t\t\t\t\t   ");
              out.write("</td>\t\t     \t\t\r\n\t\t   \t\t\t\t\t\t   ");
              int evalDoAfterBody = _jspx_th_html_messages_0.doAfterBody();
              errors = (java.lang.String) pageContext.findAttribute("errors");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = pageContext.popBody();
          }
          if (_jspx_th_html_messages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_messages_id.reuse(_jspx_th_html_messages_0);
          out.write("\r\n\t\t   \t\t\t\t\t\t   ");
          int evalDoAfterBody = _jspx_th_logic_messagesPresent_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_logic_messagesPresent_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_messagesPresent.reuse(_jspx_th_logic_messagesPresent_0);
      out.write("\r\n                                   ");
      out.write("<td height=20%>");
      out.write("</td>\r\n                                ");
      out.write("</tr>\r\n                                ");
      out.write("<tr >\r\n                                    ");
      out.write("<td>");
      out.write("</td>\r\n                                    ");
      out.write("<td align=center>\r\n                                    ");
      if (_jspx_meth_html_form_0(pageContext))
        return;
      out.write("\r\n                                    ");
      out.write("</td>\r\n                                    ");
      out.write("<td >");
      out.write("</td>\r\n                                ");
      out.write("</tr>\r\n                            ");
      out.write("</table>\r\n                          ");
      out.write("</td>\r\n                       ");
      out.write("</tr>\r\n                    ");
      out.write("</table>\r\n                    ");
      out.write("</td>\r\n                ");
      out.write("</tr>\r\n                ");
      out.write("<tr>\r\n                    ");
      out.write("<td colspan=\"2\">\r\n                    ");
      out.write("<p align=center>");
      out.write("<FONT face=Arial size=1>Qwest computers and\r\n                    the Qwest computer network are Qwest property. Only\r\n                    authorized persons may use them and only for legalt and\r\n                    proper purposes as determined solely by Qwest. Users consent\r\n                    to the monitoring of their use. Employees must use Qwest\r\n                    computers and the network in accordance with the Qwest Code\r\n                    of Conduct, subject to discipline for misuse. Customer use\r\n                    is governed by the Qwest Acceptable Use Policy. ");
      out.write("</FONT>");
      out.write("</p>\r\n                 \t");
      out.write("</td>\r\n                 ");
      out.write("</tr>\r\n       \t\t");
      out.write("</table >\r\n    ");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_messages_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:errors ---- */
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(pageContext);
    _jspx_th_html_errors_0.setParent(_jspx_th_html_messages_0);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_html_form_0(javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:form ---- */
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(pageContext);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/logon");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n                                        ");
        out.write("<b>");
        out.write("<font face=\"Arial\" size=\"2\">User Name (CUID):");
        out.write("</font>");
        out.write("</b>&nbsp;&nbsp;");
        out.write("<font face=\"Arial\" size=\"2\">&nbsp;");
        if (_jspx_meth_html_text_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("<br>\r\n                                        ");
        out.write("<br>\r\n                                        ");
        out.write("<b>Password (LDAP):");
        out.write("</b>&nbsp;&nbsp;&nbsp;&nbsp;");
        if (_jspx_meth_html_password_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("<br>\r\n                                        ");
        out.write("</font>");
        out.write("<br>\r\n                                        ");
        out.write("<br>\r\n                                        ");
        if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("\r\n                                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        if (_jspx_meth_html_reset_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("<br>\r\n                                    ");
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

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_value_size_property_maxlength_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(pageContext);
    _jspx_th_html_text_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_0.setProperty("loginId");
    _jspx_th_html_text_0.setValue("");
    _jspx_th_html_text_0.setMaxlength("18");
    _jspx_th_html_text_0.setSize("16");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_value_size_property_maxlength_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_password_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:password ---- */
    org.apache.struts.taglib.html.PasswordTag _jspx_th_html_password_0 = (org.apache.struts.taglib.html.PasswordTag) _jspx_tagPool_html_password_value_size_property_maxlength_nobody.get(org.apache.struts.taglib.html.PasswordTag.class);
    _jspx_th_html_password_0.setPageContext(pageContext);
    _jspx_th_html_password_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_password_0.setProperty("password");
    _jspx_th_html_password_0.setValue("");
    _jspx_th_html_password_0.setMaxlength("18");
    _jspx_th_html_password_0.setSize("16");
    int _jspx_eval_html_password_0 = _jspx_th_html_password_0.doStartTag();
    if (_jspx_th_html_password_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_password_value_size_property_maxlength_nobody.reuse(_jspx_th_html_password_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:submit ---- */
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(pageContext);
    _jspx_th_html_submit_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_submit_0.setValue("login");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_submit_value_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_reset_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:reset ---- */
    org.apache.struts.taglib.html.ResetTag _jspx_th_html_reset_0 = (org.apache.struts.taglib.html.ResetTag) _jspx_tagPool_html_reset_nobody.get(org.apache.struts.taglib.html.ResetTag.class);
    _jspx_th_html_reset_0.setPageContext(pageContext);
    _jspx_th_html_reset_0.setParent(_jspx_th_html_form_0);
    int _jspx_eval_html_reset_0 = _jspx_th_html_reset_0.doStartTag();
    if (_jspx_th_html_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_reset_nobody.reuse(_jspx_th_html_reset_0);
    return false;
  }
}
