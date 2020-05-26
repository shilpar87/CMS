package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;
import com.qwest.cms.utils.*;

public class tool_creatNewCrt_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_file_size_property_onclick_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_submit_value_style_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset_value_style_nobody;

  public tool_creatNewCrt_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_enctype_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_file_size_property_onclick_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_submit_value_style_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_reset_value_style_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_enctype_action.release();
    _jspx_tagPool_html_file_size_property_onclick_nobody.release();
    _jspx_tagPool_html_submit_value_style_nobody.release();
    _jspx_tagPool_html_reset_value_style_nobody.release();
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
      out.write("\r\n    ");
      out.write(" \r\n    ");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<script type=\"text/javascript\" >\r\nfunction setDefaultTotxt(tempVar){\r\n\r\n\tif(tempVar == \"file\"){\r\n\t\tdocument.getElementById(\"Crtfile\").disabled = false;\r\n\t\tdocument.getElementById(\"crttest\").disabled = true;\r\n\t}\r\n\telse{\r\n\t\tdocument.getElementById(\"Crtfile\").disabled = true;\r\n\t\tdocument.getElementById(\"crttest\").disabled = false;\r\n\t}\r\n\r\n}\r\n\r\n\r\n");
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
          out.write("<title> New CSR From Cirtificate ");
          out.write("</title>\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(request.getContextPath() );
          out.write("/css/style.css\" />\r\n");
          out.write("</head>\r\n\r\n");
          out.write("<body>\r\n\r\n\r\n");
          /* ----  html:form ---- */
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(pageContext);
          _jspx_th_html_form_0.setParent(_jspx_th_html_html_0);
          _jspx_th_html_form_0.setAction("/CMSToolAction.do?methodToCall=creatNewCsr");
          _jspx_th_html_form_0.setEnctype("multipart/form-data");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" \r\n");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"1\" cellspacing=\"0\" width=\"60%\" bgcolor=\"336699\" bordercolor=\"#000000\">\r\n");
if(request.getAttribute("error")!=null){
              out.write("\r\n   ");
              out.write("<tr>\r\n\t\t");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<b>");
              out.write("<font size=\"3\" color=\"red\">");
              out.print((String)request.getAttribute("error"));
              out.write("</font> ");
              out.write("</b>");
              out.write("</td> \r\n    ");
              out.write("</tr>");
              out.write("<tr>");
              out.write("<td>");
              out.write("</td>");
              out.write("</tr>");
}
              out.write("\r\n\t");
              out.write("<tr>\r\n\t\t");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<b>");
              out.write("<font size=\"3\" color=\"FFFFFF\"> CREATE CSR FROM CERTIFICATE ");
              out.write("</font> ");
              out.write("</b>");
              out.write("</td> \r\n    ");
              out.write("</tr>\r\n \t");
              out.write("</table>");
              out.write("<br>\r\n \t");
              out.write("<table  width =\"65%\" cellspacing=\"0\" cellpadding=\"1\" border=\"0\">\r\n\r\n\t");
              out.write("<tr bgcolor=\"DFECFF\" width =\"500px\">  \r\n\t\t");
              out.write("<td align=\"right\">");
              out.write("<font size=\"2\" color=\" 00638B\" >From the Location :");
              out.write("</td>\t\r\n\t\t");
              out.write("<td align=\"left\" width=\"\" height=\"30\"> \r\n\t\t");
              if (_jspx_meth_html_file_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\t\t");
              out.write("</td>\r\n\t");
              out.write("</tr>\r\n\t");
              out.write("</table>\t\r\n   ");
              out.write("<table width=\"55%\" align=\"center\">\r\n   \t\t");
              out.write("<tr>");
              out.write("<td align=\"center\">");
              out.write("<font size=\"1\" color=\"337799\">OR copy and paste the contents between ");
              out.write("</font>");
              out.write("</td>");
              out.write("</tr>\r\n   \t\t");
              out.write("<tr>");
              out.write("<td align=\"center\">");
              out.write("<font size=\"1\" color=\"337799\">'-----BEGIN CERTIFICATE-----' and '-----END CERTIFICATE-----'");
              out.write("</font>");
              out.write("</td>");
              out.write("</tr>\r\n   ");
              out.write("</table>\r\n   \r\n   ");
              out.write("<table>\r\n\t");
              out.write("<tr>");
              out.write("<td>&nbsp");
              out.write("</td>\r\n\t\t");
              out.write("<td>");
              out.write("<TEXTAREA title=csr style=\"WIDTH: 445px; HEIGHT: 180px\"  name=\"crttest\" id=\"crttest\" rows=11 cols=46 onclick=\"setDefaultTotxt('text')\">");
              out.write("</TEXTAREA>");
              out.write("</td>\r\n\t\t\r\n\t");
              out.write("</tr>\r\n\t");
              out.write("</table>\r\n\t\t");
              out.write("<table>\r\n\t");
              out.write("<tr>\r\n\t\t");
              out.write("<td>&nbsp");
              out.write("</td>\r\n\t\t");
              out.write("<td>&nbsp");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td>&nbsp");
              out.write("</td>\r\n\t\t\r\n\t\t");
              out.write("<td> ");
              if (_jspx_meth_html_submit_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t\t\r\n\t\t");
              out.write("<td> &nbsp");
              out.write("</td>\r\n\t\t");
              out.write("<td> ");
              if (_jspx_meth_html_reset_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t");
              out.write("</tr>\r\n\t");
              out.write("</table>\r\n ");
              int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_form_enctype_action.reuse(_jspx_th_html_form_0);
          out.write("\r\n\r\n ");
          out.write("</body>\r\n ");
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

  private boolean _jspx_meth_html_file_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:file ---- */
    org.apache.struts.taglib.html.FileTag _jspx_th_html_file_0 = (org.apache.struts.taglib.html.FileTag) _jspx_tagPool_html_file_size_property_onclick_nobody.get(org.apache.struts.taglib.html.FileTag.class);
    _jspx_th_html_file_0.setPageContext(pageContext);
    _jspx_th_html_file_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_file_0.setProperty("crtfile");
    _jspx_th_html_file_0.setSize("40");
    _jspx_th_html_file_0.setOnclick("setDefaultTotxt('file')");
    int _jspx_eval_html_file_0 = _jspx_th_html_file_0.doStartTag();
    if (_jspx_th_html_file_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_file_size_property_onclick_nobody.reuse(_jspx_th_html_file_0);
    return false;
  }

  private boolean _jspx_meth_html_submit_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:submit ---- */
    org.apache.struts.taglib.html.SubmitTag _jspx_th_html_submit_0 = (org.apache.struts.taglib.html.SubmitTag) _jspx_tagPool_html_submit_value_style_nobody.get(org.apache.struts.taglib.html.SubmitTag.class);
    _jspx_th_html_submit_0.setPageContext(pageContext);
    _jspx_th_html_submit_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_submit_0.setValue("Create");
    _jspx_th_html_submit_0.setStyle("font-size: 1.05em; padding: 0.05em;");
    int _jspx_eval_html_submit_0 = _jspx_th_html_submit_0.doStartTag();
    if (_jspx_th_html_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_submit_value_style_nobody.reuse(_jspx_th_html_submit_0);
    return false;
  }

  private boolean _jspx_meth_html_reset_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:reset ---- */
    org.apache.struts.taglib.html.ResetTag _jspx_th_html_reset_0 = (org.apache.struts.taglib.html.ResetTag) _jspx_tagPool_html_reset_value_style_nobody.get(org.apache.struts.taglib.html.ResetTag.class);
    _jspx_th_html_reset_0.setPageContext(pageContext);
    _jspx_th_html_reset_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_reset_0.setValue("Reset");
    _jspx_th_html_reset_0.setStyle("font-size: 1.05em; padding: 0.05em;");
    int _jspx_eval_html_reset_0 = _jspx_th_html_reset_0.doStartTag();
    if (_jspx_th_html_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_reset_value_style_nobody.reuse(_jspx_th_html_reset_0);
    return false;
  }
}
