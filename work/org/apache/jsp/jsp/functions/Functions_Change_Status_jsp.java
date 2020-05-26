package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class Functions_Change_Status_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_size_readonly_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_readonly_property_name_cols_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_cancel_value_style_onclick_nobody;

  public Functions_Change_Status_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_size_readonly_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_textarea_readonly_property_name_cols_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_select_style_size_property_name = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_option_value = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_cancel_value_style_onclick_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_text_size_readonly_property_name_nobody.release();
    _jspx_tagPool_html_textarea_readonly_property_name_cols_nobody.release();
    _jspx_tagPool_html_select_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_cancel_value_style_onclick_nobody.release();
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
      out.write("\r\n    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n");
      out.write("<script type=\"text/javascript\" >\r\n\r\nfunction submitdetail(){\r\n\t//validate();\r\n\tif(validate()==true){\r\n\t\tvar agree=confirm(\"Are you sure you wish to continue?\");\r\n   \t    if(agree){    \t\t\r\n\t\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSFunctionAction.do?methodToCall=updateCertStatus\";\r\n\t\t\tdocument.forms[0].submit();\t    \t\t\r\n\t\t\treturn true;\r\n    \t\t}  \r\n\t}\r\n\t    \t\t\t\r\n}\r\nfunction cancel(){\t   \t\t\r\n\t\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSFunctionAction.do?methodToCall=home\";\r\n\t\t\tdocument.forms[0].submit();\t  \t\t\t\r\n}\r\n\r\nfunction validate(){\r\n\t//alert(document.forms[0].certStatus.value);\r\n\tif(document.forms[0].changeCertStatus.value==\"\"){\r\n\t\talert(\"Please choose the Status for updation\");\r\n\t\treturn false;\r\n\t}\r\n\telse if(document.forms[0].certStatus.value==\"EXPIRED\"){\r\n\t\talert(\"The certificate status is Expired and cannot be changed. \");\r\n\t\treturn false;\r\n\t}\r\n\telse if(document.forms[0].certStatus.value==\"Renew\"){\r\n\t\talert(\"The certificate is being renewed and status cannot be changed. \");\r\n\t\treturn false;\r\n\t}\t\t\t\r\n\telse{\r\n\t\t//alert(document.forms[0].changeCertStatus.value);\r\n\t\treturn true;\r\n\t}\r\n\r\n}\r\n\r\n");
      out.write("</script>\r\n");
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
    _jspx_th_html_form_0.setAction("/CMSFunctionAction.do?methodToCall=changeCertStatus");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\t\t");
        out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"40%\" bgcolor=\"336699\" bordercolor=\"#000000\">\r\n\t");
        out.write("<tr>\r\n\t\t");
        out.write("<td align=\"center\" valign=\"top\" >");
        out.write("<u>");
        out.write("<font size=\"4\" color=\"FFFFFF\"> Change Status of Certificate ");
        out.write("</font>");
        out.write("</u> ");
        out.write("</td> \r\n\t\t ");
        out.write("</tr>\r\n\t\t\r\n   \r\n \t");
        out.write("</table> \r\n \t");
        out.write("<tr>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("</tr>\r\n \t\r\n\t");
        out.write("<tr>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("</tr>\r\n\t");
        out.write("<table width=\"600px\">\r\n\t\t\r\n\t\t");
        out.write("<tr bgcolor=\"DFECFF\" >\r\n\t\t\t");
        out.write("<td align=\"right\" width=\"18%\">");
        out.write("<font size=\"2\" color=\" 00638B\">Application Name ");
        out.write("</td>\r\n\t\t\t");
        out.write("<td align=\"left\" width=\"45%\" height=\"30\">");
        if (_jspx_meth_html_text_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("</td>\r\n\t\t");
        out.write("</tr>\r\n\t\t");
        out.write("<tr bgcolor=\"DFECFF\" >\r\n\t\t\t");
        out.write("<td align=\"right\" width=\"18%\">");
        out.write("<font size=\"2\" color=\" 00638B\">Certificate Serial No");
        out.write("</td>\r\n\t\t\t");
        out.write("<td align=\"left\" width=\"45%\" height=\"30\">");
        if (_jspx_meth_html_textarea_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("</td>\r\n\t\t");
        out.write("</tr>\r\n\t\t");
        out.write("<tr bgcolor=\"DFECFF\" >\r\n\t\t\t");
        out.write("<td align=\"right\" width=\"18%\">");
        out.write("<font size=\"2\" color=\" 00638B\">Current Status ");
        out.write("</td>\r\n\t\t\t");
        out.write("<td align=\"left\" width=\"45%\" height=\"30\">");
        if (_jspx_meth_html_text_1(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("</td>\r\n\t\t");
        out.write("</tr>\r\n\t\t");
        out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t");
        out.write("<td align=\"right\" width=\"18%\">");
        out.write("<font size=\"2\" color=\" 00638B\">Change Status to ");
        out.write("</td>\r\n\t\t\t");
        out.write("<td align=\"left\" width=\"45%\" height=\"30\">\r\n\t\t\t");
        if (_jspx_meth_html_select_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("\t\t\t\t\t\t\t\t\t\r\n\t\t\t");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t\r\n\t");
        out.write("</table>\r\n\t");
        out.write("<tr>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("</tr>\r\n\t\r\n\r\n\t");
        out.write("<tr>\r\n\t\t");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("<b>\r\n\t\t");
        out.write("<td>&nbsp");
        out.write("</td>\r\n\t\t");
        out.write("<td>");
        out.write("<input type=\"button\" value=\"Submit\" style=\"font-size: 1.05em; padding: 0.05em;\" onclick=\"submitdetail()\">");
        out.write("</td>\r\n\t\t");
        out.write("<td> &nbsp");
        out.write("</td>\r\n\t\t");
        out.write("<td> ");
        if (_jspx_meth_html_cancel_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t");
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
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_readonly_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(pageContext);
    _jspx_th_html_text_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_0.setSize("60");
    _jspx_th_html_text_0.setName("CMSFunctionForm");
    _jspx_th_html_text_0.setProperty("applicationName");
    _jspx_th_html_text_0.setReadonly(true);
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_size_readonly_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_textarea_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:textarea ---- */
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_textarea_0 = (org.apache.struts.taglib.html.TextareaTag) _jspx_tagPool_html_textarea_readonly_property_name_cols_nobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_textarea_0.setPageContext(pageContext);
    _jspx_th_html_textarea_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_textarea_0.setCols("60");
    _jspx_th_html_textarea_0.setName("CMSFunctionForm");
    _jspx_th_html_textarea_0.setProperty("serialNo");
    _jspx_th_html_textarea_0.setReadonly(true);
    int _jspx_eval_html_textarea_0 = _jspx_th_html_textarea_0.doStartTag();
    if (_jspx_th_html_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_textarea_readonly_property_name_cols_nobody.reuse(_jspx_th_html_textarea_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_readonly_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(pageContext);
    _jspx_th_html_text_1.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_1.setSize("30");
    _jspx_th_html_text_1.setName("CMSFunctionForm");
    _jspx_th_html_text_1.setProperty("certStatus");
    _jspx_th_html_text_1.setReadonly(true);
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_size_readonly_property_name_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:select ---- */
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(pageContext);
    _jspx_th_html_select_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_select_0.setName("CMSFunctionForm");
    _jspx_th_html_select_0.setProperty("changeCertStatus");
    _jspx_th_html_select_0.setSize("1");
    _jspx_th_html_select_0.setStyle("font-size: 1.05em; background:EEEEEE;");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_select_0.setBodyContent(_bc);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\r\n\t\t\t\t");
        if (_jspx_meth_html_option_0(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n\t\t\t\t");
        if (_jspx_meth_html_option_1(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n\t\t\t\t");
        if (_jspx_meth_html_option_2(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\t\r\n\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_style_size_property_name.reuse(_jspx_th_html_select_0);
    return false;
  }

  private boolean _jspx_meth_html_option_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_0 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_0.setPageContext(pageContext);
    _jspx_th_html_option_0.setParent(_jspx_th_html_select_0);
    _jspx_th_html_option_0.setValue("");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_0.setBodyContent(_bc);
        _jspx_th_html_option_0.doInitBody();
      }
      do {
        out.write("Select...");
        int evalDoAfterBody = _jspx_th_html_option_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_0);
    return false;
  }

  private boolean _jspx_meth_html_option_1(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_1.setPageContext(pageContext);
    _jspx_th_html_option_1.setParent(_jspx_th_html_select_0);
    _jspx_th_html_option_1.setValue("ACTIVE");
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_1.setBodyContent(_bc);
        _jspx_th_html_option_1.doInitBody();
      }
      do {
        out.write("ACTIVE");
        int evalDoAfterBody = _jspx_th_html_option_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_1);
    return false;
  }

  private boolean _jspx_meth_html_option_2(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_2 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_2.setPageContext(pageContext);
    _jspx_th_html_option_2.setParent(_jspx_th_html_select_0);
    _jspx_th_html_option_2.setValue("INACTIVE");
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_2.setBodyContent(_bc);
        _jspx_th_html_option_2.doInitBody();
      }
      do {
        out.write("INACTIVE");
        int evalDoAfterBody = _jspx_th_html_option_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_2);
    return false;
  }

  private boolean _jspx_meth_html_cancel_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:cancel ---- */
    org.apache.struts.taglib.html.CancelTag _jspx_th_html_cancel_0 = (org.apache.struts.taglib.html.CancelTag) _jspx_tagPool_html_cancel_value_style_onclick_nobody.get(org.apache.struts.taglib.html.CancelTag.class);
    _jspx_th_html_cancel_0.setPageContext(pageContext);
    _jspx_th_html_cancel_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_cancel_0.setValue("Cancel");
    _jspx_th_html_cancel_0.setOnclick("cancel()");
    _jspx_th_html_cancel_0.setStyle("font-size: 1.05em; padding: 0.05em;");
    int _jspx_eval_html_cancel_0 = _jspx_th_html_cancel_0.doStartTag();
    if (_jspx_th_html_cancel_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_cancel_value_style_onclick_nobody.reuse(_jspx_th_html_cancel_0);
    return false;
  }
}
