package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;

public class tool_serReqForm_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_style_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_rows_property_name_cols_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset_value_style_nobody;

  public tool_serReqForm_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_select_style_style_size_property_name = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_option_value = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_reset_value_style_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_select_style_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_text_property_name_nobody.release();
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.release();
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<script type=\"text/javascript\" >\r\n\r\nfunction sendReq(){\t\r\n\tif ( validate()){\r\n\t\tdocument.forms[0].action=\"CMSToolAction.do?methodToCall=sendReq\";\r\n\t\tdocument.forms[0].submit();\r\n\t}\r\n\telse\r\n\t\treturn false;\r\n}\r\n\r\nfunction validate(){\r\n\t\t\r\n\t\tif( document.forms[0].appName.value==\"\" ){\r\n\t\t\talert(\"Please choose an Application.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if( document.forms[0].appServer.value==\"\" ){\r\n\t\t\talert(\"Please enter the Application Server Name.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if( document.forms[0].aipName.value==\"\" ){\r\n\t\t\talert(\"Please enter the AIP's CUID for the application.\");\r\n\t\t\treturn false;\r\n\t\t}\t\t\r\n\t\telse\r\n\t\t\treturn true;\r\n\t}\r\n\r\n");
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
          out.write("<title> KeyPair Generate ");
          out.write("</title>\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(request.getContextPath() );
          out.write("/css/style.css\" />\r\n");
          out.write("</head>\r\n\r\n");
          out.write("<body>\r\n");
          /* ----  html:form ---- */
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(pageContext);
          _jspx_th_html_form_0.setParent(_jspx_th_html_html_0);
          _jspx_th_html_form_0.setAction("/CMSToolAction.do?methodToCall=reqform");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write(" \r\n");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"45%\"  bordercolor=\"#000000\">\r\n\t");
              out.write("<tr>\r\n\t\t");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<b>");
              out.write("<font size=\"3\" color=\"336699\">");
              out.write("<I> Application Specific Certificate Search Request Form ");
              out.write("</I> ");
              out.write("</font>");
              out.write("</b>");
              out.write("</td> \r\n    ");
              out.write("</tr>\r\n \t");
              out.write("</table>");
              out.write("<br>\r\n \t");
              out.write("<div style=\"width:700px; height:9px\" >\r\n\t");
              out.write("<table  width =\"70%\" cellspacing=\"1\" cellpadding=\"1\" border=\"0\">\r\n\r\n\r\n\t");
              out.write("<tr bgcolor=\"C8DFFF\" >  \r\n\t\t");
              out.write("<td align=\"right\">");
              out.write("<font size=\"2\" color=\" 00638B\" >Application Name :");
              out.write("</td>\t\r\n\t\t");
              out.write("<td align=\"left\" width=\"\" height=\"30\">  \r\n\t\t");
              /* ----  html:select ---- */
              org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
              _jspx_th_html_select_0.setPageContext(pageContext);
              _jspx_th_html_select_0.setParent(_jspx_th_html_form_0);
              _jspx_th_html_select_0.setName("CMSToolForm");
              _jspx_th_html_select_0.setProperty("appName");
              _jspx_th_html_select_0.setSize("1");
              _jspx_th_html_select_0.setStyle("font-size: 1.05em;");
              _jspx_th_html_select_0.setStyle("WIDTH: 250px; HEIGHT: 22px");
              int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
              if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
                  out = _bc;
                  _jspx_th_html_select_0.setBodyContent(_bc);
                  _jspx_th_html_select_0.doInitBody();
                }
                do {
                  out.write("\r\n\t\t\t");
                  if (_jspx_meth_html_option_0(_jspx_th_html_select_0, pageContext))
                    return;
                  out.write("\r\n\t\t\t");
if(session.getAttribute("tool_appList")!=null){
			  ArrayList appList=(ArrayList)session.getAttribute("tool_appList");
			  if(appList.size()>0){
			  for(int i=0;i<appList.size();i++){
			  com.qwest.cms.BO.CMSBO bo=(com.qwest.cms.BO.CMSBO)appList.get(i);
			  String appName=bo.getAppName();
			
                  /* ----  html:option ---- */
                  org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
                  _jspx_th_html_option_1.setPageContext(pageContext);
                  _jspx_th_html_option_1.setParent(_jspx_th_html_select_0);
                  _jspx_th_html_option_1.setValue(appName);
                  int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
                  if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
                      out = _bc;
                      _jspx_th_html_option_1.setBodyContent(_bc);
                      _jspx_th_html_option_1.doInitBody();
                    }
                    do {
                      out.print(appName);
                      int evalDoAfterBody = _jspx_th_html_option_1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                      out = pageContext.popBody();
                  }
                  if (_jspx_th_html_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                  _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_1);
                  out.write("\r\n\t\t\t");
}}}
                  out.write("\r\n\t\t\t");
                  int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = pageContext.popBody();
              }
              if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_html_select_style_style_size_property_name.reuse(_jspx_th_html_select_0);
              out.write("\r\n\t\t");
              out.write("</td>\r\n\t");
              out.write("</tr>\t\r\n\t");
              out.write("<tr bgcolor=\"C8DFFF\" >  \r\n\t\t");
              out.write("<td align=\"right\">");
              out.write("<font size=\"2\" color=\" 00638B\" >App Server Name");
              out.write("</td>\t\r\n\t\t");
              out.write("<td align=\"left\" width=\"\" height=\"30\"> \r\n\t\t\t");
              if (_jspx_meth_html_text_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\t\t");
              out.write("</td>\r\n\t");
              out.write("</tr>\r\n\t");
              out.write("<tr bgcolor=\"C8DFFF\" >  \r\n\t\t");
              out.write("<td align=\"right\">");
              out.write("<font size=\"2\" color=\" 00638B\" >AIP CUID (TO) :");
              out.write("</td>\t\r\n\t\t");
              out.write("<td align=\"left\" width=\"\" height=\"30\"> \r\n\t\t\t");
              if (_jspx_meth_html_text_1(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\t\t");
              out.write("</td>\r\n\t");
              out.write("</tr>\r\n\t");
              out.write("<tr bgcolor=\"C8DFFF\">  \r\n\t\t");
              out.write("<td align=\"right\">");
              out.write("<font size=\"2\" color=\" 00638B\" >Message (optional):");
              out.write("</td>\t\r\n\t\t");
              out.write("<td align=\"left\" width=\"\" height=\"30\"> \r\n\t\t\t");
              if (_jspx_meth_html_textarea_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\t\t");
              out.write("</td>\r\n\t");
              out.write("</tr>\r\n \t");
              out.write("</table>\t\r\n\t");
              out.write("<table>\r\n\t");
              out.write("<tr>\r\n\t\t");
              out.write("<td>&nbsp");
              out.write("</td>\r\n\t\t");
              out.write("<td>&nbsp");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td>&nbsp");
              out.write("</td>\r\n\t\t\r\n\t\t");
              out.write("<td> ");
              out.write("<input type=\"button\"  value=\"Send Request Mail\" style=\"font-size: 1.02em; padding: 0.02em;\" onclick=\"sendReq()\"/>");
              out.write("</td>\r\n\t\t\r\n\t\t");
              out.write("<td> &nbsp");
              out.write("</td>\r\n\t\t");
              out.write("<td> ");
              if (_jspx_meth_html_reset_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t");
              out.write("</tr>\r\n\t");
              out.write("</table>\r\n\t");
              out.write("<br>\r\n\t");
              out.write("<table width=\"70%\">\r\n\t");
              out.write("<center>");
              out.write("<font size=\"1\" color=\" 00638B\" >Note:  There are no Certificates currently loaded for this Application Server.  Please fill this Request Form with the appropriate details.\r\n\t\t\t  This data will be mailed to the respective AIP(as specified) for loading the Certificates hosted in the Application Server. Please make sure that the AIP CUID is entered correctly.");
              out.write("</font>");
              out.write("</center>\r\n \t");
              out.write("</table>\r\n");
              int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
          out.write(" \t\r\n\r\n");
ArrayList info=new ArrayList();
 if(session.getAttribute("info")!=null)
 {info=(ArrayList)session.getAttribute("info");
 if(info.size()>0){ 
          out.write("\r\n ");
          out.print((String)(info.get(0).toString()));
          out.write("\r\n ");
}info.clear();}
  
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

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(pageContext);
    _jspx_th_html_text_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_0.setName("CMSToolForm");
    _jspx_th_html_text_0.setProperty("appServer");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(pageContext);
    _jspx_th_html_text_1.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_1.setName("CMSToolForm");
    _jspx_th_html_text_1.setProperty("aipName");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_textarea_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:textarea ---- */
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_textarea_0 = (org.apache.struts.taglib.html.TextareaTag) _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_textarea_0.setPageContext(pageContext);
    _jspx_th_html_textarea_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_textarea_0.setProperty("mailMessage");
    _jspx_th_html_textarea_0.setName("CMSToolForm");
    _jspx_th_html_textarea_0.setCols("50");
    _jspx_th_html_textarea_0.setRows("3");
    int _jspx_eval_html_textarea_0 = _jspx_th_html_textarea_0.doStartTag();
    if (_jspx_th_html_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.reuse(_jspx_th_html_textarea_0);
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
    _jspx_th_html_reset_0.setStyle("font-size: 1.02em; padding: 0.02em;");
    int _jspx_eval_html_reset_0 = _jspx_th_html_reset_0.doStartTag();
    if (_jspx_th_html_reset_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_reset_value_style_nobody.reuse(_jspx_th_html_reset_0);
    return false;
  }
}
