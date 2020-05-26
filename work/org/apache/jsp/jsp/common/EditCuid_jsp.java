package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;

public class EditCuid_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;

  public EditCuid_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_errors_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_select_style_size_property_name = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_option_value = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_html_text_property_name_nobody.release();
    _jspx_tagPool_html_select_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
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
      out.write("    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n");
      out.write("<script>\r\n\r\nfunction submitDetails(){\r\n\tif(validation()==true){\r\n\t\tdocument.forms[0].action=\"CMSAction.do?methodToCall=editProfCuidInsert\";\r\n \t\tdocument.forms[0].submit();\r\n\t}\r\n\telse\r\n\treturn false;\t\r\n}\r\n\r\nfunction cancel(){\t   \t\t\r\n\t\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=home\";\r\n\t\t\tdocument.forms[0].submit();\t  \t\t\t\r\n}\r\n\r\nfunction validation(){\t\r\n       \r\n\tif(document.forms[0].memberCuid.value==\"\"){\t\t\r\n\t\talert(\"Please enter a valid CUID\");\r\n\t\treturn false;\r\n\t}\r\n\telse if(document.forms[0].auth_type.value==\"\"){\t\r\n\t\talert(\"Please Choose the Authority type for the member\");\r\n\t\treturn false;\r\n\t}\r\n\telse if(document.forms[0].memberCuid.value.length>8){\t\t\r\n\t\talert(\"CUID cannot exceed 8 characters\");\r\n\t\treturn false;\r\n\t}\r\n\telse{\r\n\t\tvar str=document.forms[0].extMem.value;\r\n\t\t//alert(str);\r\n   \t \tvar arr=new Array();\r\n   \t \tvar cuid=document.forms[0].memberCuid.value;\r\n    \tarr=str.split(\",\"); \r\n    \t//alert(arr.length-1);             \r\n    \tfor(i=0; i");
      out.write("<arr.length; i++){\r\n     \t \t//alert(\" spling done  ==>\"+arr[i]+cuid.toUpperCase());\r\n       \t\tif(arr[i]==cuid.toUpperCase()){\r\n      \t\t alert(cuid.toUpperCase()+\" is already a Member of this Group \\n         Please Add a New Member\");\r\n       \t\treturn false;\r\n   \t\t \t}\r\n    \t }\r\n\t\treturn true; \r\n    }\r\n}\r\n");
      out.write("</script>\r\n\r\n");
      /* ----  html:html ---- */
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(pageContext);
      _jspx_th_html_html_0.setParent(null);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          /* ----  html:form ---- */
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(pageContext);
          _jspx_th_html_form_0.setParent(_jspx_th_html_html_0);
          _jspx_th_html_form_0.setAction("/CMSAction.do?methodToCall=editProfGroupCuid");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\t\r\n\r\n\t\t\t");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"40%\" bgcolor=\"336699\" bordercolor=\"#000000\">\r\n\t\t\t");
              out.write("<tr>\r\n\t\t\t");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<u>");
              out.write("<font size=\"4\" color=\"FFFFFF\"> Create/Edit Group ");
              out.write("</font>");
              out.write("</u> ");
              out.write("</td> \r\n    \t\t");
              out.write("</tr>\r\n \t\t\t");
              out.write("</table>\r\n \t\t\t");
              out.write("<table align=\"center\"  width=\"80%\" >\r\n\t\t\t\t");
              out.write("<tr bordercolor=\"CC0033\">\r\n\t\t\t\t\t");
              out.write("<td align=\"center\" bgcolor=\"FFFFCC\">");
              out.write("<FONT size=\"4\" color=\"CC0033\">");
              out.write("<b>");
              if (_jspx_meth_html_errors_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</b>");
              out.write("</FONT>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("</tr>\t\t\r\n\t\t\t");
              out.write("</table>\r\n \t\t\t");
              out.write("<input type=\"hidden\" name=\"extMem\" value='");
              out.print(request.getParameter("memList").toString());
              out.write("'/>\r\n\t\t\t");
              out.write("<table width=60% align=\"center\">\t\t\t\r\n\t\t\t\t");
              out.write("<tr bgcolor=\"CCDDFF\">\r\n\t\t\t\t");
              out.write("<td width=\"150\" class=\"q\" height=\"23\">\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >CUID");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"325\" height=\"23\">: \r\n\t\t\t\t");
              if (_jspx_meth_html_text_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t    ");
              out.write("<tr bgcolor=\"CCDDFF\">\r\n\t\t\t\t");
              out.write("<td width=\"150\" class=\"q\" height=\"23\">\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >Authority Type");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"325\" height=\"23\">: \r\n\t\t\t\t");
              if (_jspx_meth_html_select_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\t\t\r\n\t\t\t\t");
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t    ");
              out.write("<tr>\r\n\t\t\t    ");
              out.write("<td width=\"29%\" align=\"center\" bgcolor=\"C8DFFF\">");
              out.write("<input type=\"button\"  style=\"font-size: 1.05em; padding: 0.05em;\" value=\"Add Member\" onclick=\"submitDetails()\" />");
              out.write("</td>\r\n\t\t\t    ");
              out.write("<td width=\"29%\" align=\"center\" bgcolor=\"C8DFFF\">");
              out.write("<input type=\"reset\"  style=\"font-size: 1.05em; padding: 0.05em;\" value=\"Reset\" />");
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t  ");
              out.write("</table>\r\n\t\t\t  ");
              out.write("<table align=\"center\" width=\"60%\">\r\n\t\t\t\t");
              out.write("<tr>");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<u>");
              out.write("<font size=\"4\" color=\"FFFFFF\"> Create Group Members ");
              out.write("</font>");
              out.write("</u> ");
              out.write("</td> ");
              out.write("</tr>\r\n\t\t\t\t");
              out.write("<tr>");
              out.write("<td> ");
              out.write("<font size=\"1\" color=\" 00638B\" >Please choose the appropriate Authority Type for the mentioned CUID.  A member with Authority Type 'ADMIN' will be able to manage and perform all functions with respect to the Certificates.  Members with Authority Type 'MEMBER' will only have read privileges. ");
              out.write("</font>");
              out.write("</td>");
              out.write("</tr>\r\n\t\t\t");
              out.write("</table>\r\n\t\t\t    \r\n");
              int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
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

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:errors ---- */
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(pageContext);
    _jspx_th_html_errors_0.setParent(_jspx_th_html_form_0);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(pageContext);
    _jspx_th_html_text_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_0.setName("CMSFormBean");
    _jspx_th_html_text_0.setProperty("memberCuid");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:select ---- */
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(pageContext);
    _jspx_th_html_select_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_select_0.setName("CMSFormBean");
    _jspx_th_html_select_0.setProperty("auth_type");
    _jspx_th_html_select_0.setSize("1");
    _jspx_th_html_select_0.setStyle("font-size: 1.05em;");
    int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
    if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_select_0.setBodyContent(_bc);
        _jspx_th_html_select_0.doInitBody();
      }
      do {
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_0(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_1(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_2(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\t\r\n\t\t\t\t");
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
    _jspx_th_html_option_1.setValue("A");
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_1.setBodyContent(_bc);
        _jspx_th_html_option_1.doInitBody();
      }
      do {
        out.write("ADMIN");
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
    _jspx_th_html_option_2.setValue("M");
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_2.setBodyContent(_bc);
        _jspx_th_html_option_2.doInitBody();
      }
      do {
        out.write("MEMBER");
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
}
