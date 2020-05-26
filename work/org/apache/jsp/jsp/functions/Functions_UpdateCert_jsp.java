package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class Functions_UpdateCert_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_rows_property_name_cols_nobody;

  public Functions_UpdateCert_jsp() {
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_hidden_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_hidden_property_name_nobody.release();
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.release();
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
      			"/jsp/errorFromMenu.jsp", true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<script type=\"text/javascript\" >\r\n\r\nfunction submitdetail(){\r\n\tif(validate()==true){\r\n\t\tvar agree=confirm(\"Are you sure you wish to continue?\");\r\n    \tif(agree){    \t\t\r\n\t\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSFunctionAction.do?methodToCall=updateCertDetails\";\r\n\t\t\tdocument.forms[0].submit();\t    \t\t\r\n\t\t\treturn true;\r\n    \t\t}   \r\n\t}\r\n\t   \t\t\t\r\n}\r\n\r\nfunction cancel(){\t   \t\t\r\n\t\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSFunctionAction.do?methodToCall=home\";\r\n\t\t\tdocument.forms[0].submit();\t  \t\t\t\r\n}\r\n\r\nfunction validate(){\r\n\tvar certInfo=document.forms[0].certInfo.value;\t\r\n\t//alert(document.forms[0].certStatus.value);\r\n\tif(document.forms[0].certStatus.value=='ACTIVE'){\r\n\t\talert(\"The certificate is Active and has not been renewed.  The certificate cannot be updated before it is sent for renewal. \");\r\n\t\treturn false;\r\n\t}\r\n\telse if(document.forms[0].certStatus.value==\"INACTIVE\"){\r\n\t\talert(\"The certificate is Inactive and has not been renewed.  The certificate cannot be updated before it is sent for renewal. \");\r\n\t\treturn false;\r\n\t}\t\r\n\telse if(document.forms[0].certStatus.value==\"EXPIRED\"){\r\n\t\talert(\"The certificate is Expired and has not been renewed.  The certificate cannot be updated before it is sent for renewal. \");\r\n\t\treturn false;\r\n\t}\t\t\t\r\n\telse if(certInfo==\"\"){\r\n\t\talert(\"Please paste the certificate information.\");\r\n\t\treturn false;\r\n\t}\r\n\telse{\r\n\t\treturn true;\r\n\t}\r\n}\r\n\r\n");
      out.write("</script>\r\n");
      out.write("<head>\r\n\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Update Certificate");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<BODY>\r\n");
      if (_jspx_meth_html_form_0(pageContext))
        return;
      out.write("\r\n");
      out.write("</BODY>\r\n");
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }

  private boolean _jspx_meth_html_form_0(javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:form ---- */
    org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_html_form_0.setPageContext(pageContext);
    _jspx_th_html_form_0.setParent(null);
    _jspx_th_html_form_0.setAction("/CMSFunctionAction.do?methodToCall=updateCert");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n\r\n\t");
        out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"58%\" bgcolor=\"336699\" bordercolor=\"#000000\">\r\n\t");
        out.write("<tr>\r\n\t\t");
        out.write("<td align=\"center\" valign=\"top\" >");
        out.write("<u>");
        out.write("<font size=\"3\" color=\"FFFFFF\"> ");
        out.write("<b>Update Certificate on Renewal ");
        out.write("</b>");
        out.write("</font>");
        out.write("</u>");
        out.write("</td> \r\n\t\t  ");
        out.write("<!--");
        out.write("<tiles:insert\tattribute=\"menu\" />-->\t\t \r\n    ");
        out.write("</tr>\r\n    ");
        out.write("<tr>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("<td>&nbsp");
        out.write("</td>");
        out.write("</tr>\r\n \t");
        out.write("</table>\r\n\t");
        out.write("<table>\r\n\t");
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
        if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("  ");
        out.write("</td>");
        out.write("</tr>\r\n\t");
        out.write("</table>\t\r\n\r\n\t");
        out.write("<table width=\"60%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\">\t\r\n\t");
        out.write("<tr bgcolor=\"DFECFF\">");
        out.write("<td>&nbsp");
        out.write("</td>\r\n\t");
        out.write("<td > ");
        out.write("<font size=\"2\" color=\"094E87\" > Please paste the data from the renewal mail here. ");
        out.write("</font> ");
        out.write("</td>");
        out.write("</tr>\r\n\t\r\n\t");
        out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t");
        out.write("<td align=\"right\" >");
        out.write("<font size=\"2\" color=\" 00638B\" >");
        out.write("<b>Certificate Info : ");
        out.write("</b>");
        out.write("</td>\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"20\"> ");
        if (_jspx_meth_html_textarea_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("  ");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t");
        out.write("</table>\r\n\t");
        out.write("<table width=\"58%\" align = \"center\">\r\n\t");
        out.write("<tr>");
        out.write("<td align = \"center\">");
        out.write("<font size=\"1\" color=\"094E87\" >Note: Only paste the contents between the \"-----BEGIN CERTIFICATE----- and -----END CERTIFICATE-----\" here ");
        out.write("</font>");
        out.write("</td>");
        out.write("</tr>\r\n\t");
        out.write("<tr>");
        out.write("<td  width=\"590px\" > ");
        out.write("<font size=\"2\" color=\"094E87\" > The Certificate will be updated on clicking the UpdateCert button ");
        out.write("</font>");
        out.write("</td>");
        out.write("</tr>\r\n\t");
        out.write("<tr>");
        out.write("<td align = \"center\"> \r\n\t");
        out.write("<input type=\"button\" value=\"UpdateCsr\" onclick=\"submitdetail()\"> ");
        out.write("<font size=\"12\">");
        out.write("</font>\r\n    ");
        out.write("<input type=\"submit\" name=\"Cancel\" value=\"Cancel\" onclick=\"cancel()\"/>\r\n    ");
        out.write("</td>");
        out.write("</tr>\r\n \t");
        out.write("</table>\r\n\r\n");
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

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:hidden ---- */
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_name_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(pageContext);
    _jspx_th_html_hidden_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setName("CMSFunctionForm");
    _jspx_th_html_hidden_0.setProperty("certStatus");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_name_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_html_textarea_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:textarea ---- */
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_textarea_0 = (org.apache.struts.taglib.html.TextareaTag) _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_textarea_0.setPageContext(pageContext);
    _jspx_th_html_textarea_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_textarea_0.setRows("20");
    _jspx_th_html_textarea_0.setCols("80");
    _jspx_th_html_textarea_0.setName("CMSFunctionForm");
    _jspx_th_html_textarea_0.setProperty("certInfo");
    int _jspx_eval_html_textarea_0 = _jspx_th_html_textarea_0.doStartTag();
    if (_jspx_th_html_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.reuse(_jspx_th_html_textarea_0);
    return false;
  }
}
