package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class tool_creatCsr_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset_value_style_nobody;

  public tool_creatCsr_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_reset_value_style_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_action.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<script type=\"text/javascript\" >\r\nfunction validate(){\r\nvar flg=true;\r\nif(document.getElementById('sigAlgorithm').value=='null'){\r\nalert(\" Please select Signature Algorithm \");\r\nflg=false;\r\n}else if(!echeck(document.getElementById('email').value)){\r\nflg=false;\r\n}\r\nreturn flg;\r\n}\r\n\r\nfunction echeck(str) {\r\n\r\n\t\tvar at=\"@\"\r\n\t\tvar dot=\".\"\r\n\t\tvar lat=str.indexOf(at)\r\n\t\tvar lstr=str.length\r\n\t\tvar ldot=str.indexOf(dot)\r\n\t\tif (str.indexOf(at)==-1){\r\n\t\t   alert(\"Invalid E-mail ID\")\r\n\t\t   return false\r\n\t\t}\r\n\r\n\t\tif (str.indexOf(at)==-1 || str.indexOf(at)==0 || str.indexOf(at)==lstr){\r\n\t\t   alert(\"Invalid E-mail ID\")\r\n\t\t   return false\r\n\t\t}\r\n\r\n\t\tif (str.indexOf(dot)==-1 || str.indexOf(dot)==0 || str.indexOf(dot)==lstr){\r\n\t\t    alert(\"Invalid E-mail ID\")\r\n\t\t    return false\r\n\t\t}\r\n\r\n\t\t if (str.indexOf(at,(lat+1))!=-1){\r\n\t\t    alert(\"Invalid E-mail ID\")\r\n\t\t    return false\r\n\t\t }\r\n\r\n\t\t if (str.substring(lat-1,lat)==dot || str.substring(lat+1,lat+2)==dot){\r\n\t\t    alert(\"Invalid E-mail ID\")\r\n\t\t    return false\r\n\t\t }\r\n\r\n\t\t if (str.indexOf(dot,(lat+2))==-1){\r\n");
      out.write("\t\t    alert(\"Invalid E-mail ID\")\r\n\t\t    return false\r\n\t\t }\r\n\r\n\t\t if (str.indexOf(\" \")!=-1){\r\n\t\t    alert(\"Invalid E-mail ID\")\r\n\t\t    return false\r\n\t\t }\r\n\r\n \t\t return true\r\n\t}\r\n\r\n\r\n");
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
          out.write("<title>Create CSR");
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
    _jspx_th_html_form_0.setAction("/CMSToolAction.do?methodToCall=creatCsr");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \r\n\t");
        out.write("<table border=\"0\" align=\"center\" cellpadding=\"2\" cellspacing=\"0\" width=\"30%\" bgcolor=\"336699\" >\r\n\t");
        out.write("<tr>\r\n\t\t");
        out.write("<td align=\"center\" valign=\"top\" >");
        out.write("<b>");
        out.write("<font size=\"3\" color=\"FFFFFF\"> Create new CSR ");
        out.write("</font>");
        out.write("</b>");
        out.write("</td> \r\n    ");
        out.write("</tr>\r\n \t");
        out.write("</table>");
        out.write("<br>\r\n\t");
        out.write("<div style=\"width:700px; height:9px\" >\r\n\t");
        out.write("<table  width =\"70%\" cellspacing=\"1\" cellpadding=\"1\" border=\"0\">\r\n\r\n\t");
        out.write("<tr bgcolor=\"DFECFF\" >  \r\n\t\t");
        out.write("<td align=\"right\">");
        out.write("<font size=\"2\" color=\"004488\" >Signature Algorithm :");
        out.write("</td>\t\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> \r\n\t\t\t");
        out.write("<select name=\"sigAlgorithm\" size=\"1\" style=\"font-size: 1.05em;\">\r\n\t\t\t");
        out.write("<option value=\"null\" selected>Select...");
        out.write("</option>\r\n\t\t\t");
        out.write("<option value=\"RSA\">RSA");
        out.write("</option>\r\n\t\t\t\r\n\t\t\t");
        out.write("<option value=\"DSA\">DSA");
        out.write("</option>\r\n\t\t\t");
        out.write("</select> \r\n\t\t");
        out.write("</td>\r\n\t");
        out.write("</tr>\t\r\n");
        out.write("<!--\t");
        out.write("<tr bgcolor=\"C8DFFF\" width =\"500px\">  \r\n\t\t");
        out.write("<td align=\"right\">");
        out.write("<font size=\"2\" color=\" 00638B\" >Validity (days) :");
        out.write("</td>\t\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> \r\n\t\t\t");
        out.write("<select name=\"cert_validity\" size=\"1\" style=\"font-size: 1.05em;\">\r\n\t\t\t");
        out.write("<option value=\"select_validity\" selected>Select...");
        out.write("</option>\r\n\t\t\t");
        out.write("<option value=\"365\">365");
        out.write("</option>\r\n\t\t\t");
        out.write("<option value=\"730\">730");
        out.write("</option>\r\n\t\t\t");
        out.write("</select> \r\n\t\t");
        out.write("</td>\r\n\t");
        out.write("</tr>-->\r\n\t");
        out.write("<tr bgcolor=\"D2E8FF\">\r\n\t\t");
        out.write("<td align=\"right\" >");
        out.write("<font size=\"2\" color=\" 004488\" >Common Name (CN) : ");
        out.write("</td>\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> ");
        out.write("<input type=\"text\" size=\"42\"  name=\"comName\"> ");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t");
        out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t");
        out.write("<td align=\"right\" >");
        out.write("<font size=\"2\" color=\" 004488\" >Organizational Unit (OU) : ");
        out.write("</td>\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> ");
        out.write("<input type=\"text\" size=\"42\" wrap=\"off\"  name=\"orgUnit\" > ");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t");
        out.write("<tr bgcolor=\"D2E8FF\">\r\n\t\t");
        out.write("<td align=\"right\" >");
        out.write("<font size=\"2\" color=\" 004488\" >Organizational Name (ON) : ");
        out.write("</td>\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> ");
        out.write("<input type=\"text\" size=\"42\" name=\"orgName\"> ");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t\t");
        out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t");
        out.write("<td align=\"right\" >");
        out.write("<font size=\"2\" color=\" 004488\" >Locality Name (LN) : ");
        out.write("</td>\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> ");
        out.write("<input type=\"text\" size=\"42\" name=\"locName\"> ");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t\t");
        out.write("<tr bgcolor=\"D2E8FF\">\r\n\t\t");
        out.write("<td align=\"right\" >");
        out.write("<font size=\"2\" color=\" 004488\" >State Name (SN) : ");
        out.write("</td>\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> ");
        out.write("<input type=\"text\" size=\"42\" name=\"state\"> ");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t\t");
        out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t");
        out.write("<td align=\"right\" >");
        out.write("<font size=\"2\" color=\" 004488\" >Country (C) : ");
        out.write("</td>\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> ");
        out.write("<input type=\"text\" size=\"42\" name=\"country\"> ");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t\r\n\t\t");
        out.write("<tr bgcolor=\"D2E8FF\">\r\n\t\t");
        out.write("<td align=\"right\" >");
        out.write("<font size=\"2\" color=\" 004488\" >Email (E) : ");
        out.write("</td>\r\n\t\t");
        out.write("<td align=\"left\" width=\"\" height=\"30\"> ");
        out.write("<input type=\"text\" size=\"42\" name=\"email\"> ");
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n \t");
        out.write("</table>\r\n\t");
        out.write("<table>\r\n\t");
        out.write("<tr>\r\n\t\t");
        out.write("<td>&nbsp");
        out.write("</td>\r\n\t\t");
        out.write("<td>&nbsp");
        out.write("</td>\r\n\t\t\t\t");
        out.write("<td>&nbsp");
        out.write("</td>\r\n\t\t\r\n\t\t");
        out.write("<td> ");
        out.write("<input type=\"submit\" value=\"Create\"  style=\"font-size: 1.05em; padding: 0.05em;\" onClick=\"return validate();\" name=\"Create\">");
        out.write("</td>\r\n\t\t\r\n\t\t");
        out.write("<td> &nbsp");
        out.write("</td>\r\n\t\t");
        out.write("<td> ");
        if (_jspx_meth_html_reset_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write("</td>\r\n\t");
        out.write("</tr>\r\n\t");
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
