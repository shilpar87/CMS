package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;

public class Edit_profile_menu_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_style_property_onchange;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_options_property_name_collection_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_hidden_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_onblur_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_rows_property_name_cols_nobody;

  public Edit_profile_menu_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_errors_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_select_style_property_onchange = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_option_value = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_options_property_name_collection_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_hidden_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_select_style_size_property_name = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_property_onblur_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_html_select_style_property_onchange.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_options_property_name_collection_nobody.release();
    _jspx_tagPool_html_text_property_name_nobody.release();
    _jspx_tagPool_html_hidden_property_name_nobody.release();
    _jspx_tagPool_html_select_style_size_property_name.release();
    _jspx_tagPool_html_text_property_onblur_name_nobody.release();
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
      out.write("    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n\r\n");
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
          out.write("<title>Edit/Create Group");
          out.write("</title>\r\n\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(request.getContextPath() );
          out.write("/css/style.css\" />\r\n");
          out.write("</head>\r\n\r\n\r\n");
          out.write("<body>\r\n");
          /* ----  html:form ---- */
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(pageContext);
          _jspx_th_html_form_0.setParent(_jspx_th_html_html_0);
          _jspx_th_html_form_0.setAction("/CMSAction.do?methodToCall=editProfGroupNew");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\t\r\n");
              out.write("<input type=\"hidden\" name=\"hidden\" />\t\r\n\t\t");
              out.write("<table align=\"center\"  width=\"80%\">\r\n\t\t");
              out.write("<tr>\r\n\t\t");
              out.write("<td align=\"center\" bgcolor=\"FFFFCC\">");
              out.write("<FONT size=\"4\" color=\"CC0033\">");
              out.write("<b>");
              if (_jspx_meth_html_errors_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</b>");
              out.write("</FONT>");
              out.write("</td>\r\n\t\t");
              out.write("</tr>\t\t\r\n\t\t");
              out.write("</table>\r\n\t\t\r\n\t\t");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"40%\" bgcolor=\"336699\" bordercolor=\"#000000\">\r\n\t\t");
              out.write("<tr bgcolor=\"FFFFFF\">");
              out.write("<td>&nbsp");
              out.write("</td>");
              out.write("</tr> \r\n\t\t");
              out.write("<tr>\r\n\t\t\t");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<u>");
              out.write("<font size=\"4\" color=\"FFFFFF\"> Create/Edit Group ");
              out.write("</font>");
              out.write("</u> \r\n\t\t \t");
              out.write("</td> \r\n    \t");
              out.write("</tr>\r\n \t\t");
              out.write("</table>\r\n\t\t\r\n\t\t");
              out.write("<br>\t\t\t\r\n\t\t\r\n\t\t");
              out.write("<table border=\"0\" width=\"85%\" align = \"center\" CELLSPACING=\"0\" height=\"15%\">\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t");
              out.write("<tr>\t\r\n\t\t\t\t");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t\t");
              out.write("<td width=\"27%\" class=\"q\" height=\"23\" >\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >Application Name");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"73%\" height=\"23\" >: \r\n\t\t\t\t");
              if (_jspx_meth_html_select_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\r\n\t\t\t\t");
              out.write("</td>\r\n\t\t\t\t");
              out.write("</tr>\r\n\t\t\t   \r\n\t\t\t\t");
              out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t");
              out.write("<td width=\"27%\" class=\"q\" height=\"23\">\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >Application Acronym");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"73%\" height=\"23\">:\r\n\t\t\t\t\t");
              if (_jspx_meth_html_text_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\t\t\t\t\t");
              if (_jspx_meth_html_hidden_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\t\t\t\t\t\r\n\t\t\t\t");
              out.write("</td>\t\t\t\r\n\t\t\t    ");
              out.write("</tr>\r\n\r\n\t\t\t    ");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t    ");
              out.write("<td width=\"27%\" class=\"q\" height=\"23\">\r\n\t\t\t    ");
              out.write("<font size=\"2\" color=\" 00638B\" >AUTH_TYPE");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"73%\" height=\"23\">:\r\n\t\t\t\t");
              if (_jspx_meth_html_select_1(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t    \r\n\t\t\t    ");
              out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t");
              out.write("<td width=\"27%\" class=\"q\" height=\"23\">\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >RCBS Code(*)");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"73%\" height=\"23\">: \r\n\t\t\t\t");
              if (_jspx_meth_html_text_1(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\t\t\t\t");
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t    \r\n\t\t\t    ");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t\t");
              out.write("<td width=\"27%\" class=\"q\" height=\"23\">\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >RCBS Manager Cuid(*)");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"73%\" height=\"23\">: \r\n\t\t\t\t");
              if (_jspx_meth_html_text_2(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t    \r\n\t\t\t    ");
              out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t");
              out.write("<td width=\"27%\" class=\"q\" height=\"23\">\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >Application User Names");
              out.write("</font>");
              out.write("<font size=\"1\" color=\"red\">(comma seperated)");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"73%\" height=\"23\"> :\r\n\t\t\t\t");
              if (_jspx_meth_html_textarea_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\t   \t\t\t    \r\n\t\t\t    \r\n\t\t\t  \t");
              out.write("<tr>");
              out.write("<td>&nbsp");
              out.write("</td>");
              out.write("</tr> \r\n\t\t\t   \t\t\t\t\t    \r\n\t\t\t");
              out.write("</table>\r\n\t\t\t   \r\n\t\t\t   \r\n\t\t  ");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"85%\" bgcolor=\"lightblue\" bordercolor=\"#000000\">\r\n\t\t\t");
              out.write("<tr>\r\n\t\t\t");
              out.write("<td align=\"center\" valign=\"top\">");
              out.write("<u>");
              out.write("<b> ");
              out.write("<font size=\"2\">Notification Information");
              out.write("</font>");
              out.write("</b> ");
              out.write("</u> ");
              out.write("</td>\r\n \t\t\t");
              out.write("</table>\r\n \t\t\t");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"85%\"  bordercolor=\"#000000\">\r\n \t\t\t\r\n\t\t\t    \t\t     \r\n\t\t\t    ");
              out.write("<tr> \r\n\t\t\t    ");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t    ");
              out.write("<td width=\"27%\" class=\"q\" height=\"23\">\r\n\t\t\t    ");
              out.write("<font size=\"2\" color=\" 00638B\" >Alarming Time(in days)");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"73%\" height=\"23\">:\r\n\t\t\t\t");
              if (_jspx_meth_html_select_2(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\t\t\t\r\n\t\t\t\t\r\n      \t\t\t\r\n      \t\t\t");
              out.write("<tr>");
              out.write("<td>&nbsp");
              out.write("</td>");
              out.write("</tr>      \t\t\t\t\t\t     \r\n\t\t\t ");
              out.write("</table>\r\n\t\t\t \r\n\t\t\t ");
              out.write("<center>");
              out.write("<input type=\"button\" name=\"save\" style=\"font-size: 1.05em; padding: 0.05em;\" value=\"Save\" onclick='Save()'>\r\n\t\t\t ");
              out.write("<input type=\"button\" name=\"cancel\" style=\"font-size: 1.05em; padding: 0.05em;\"  value=\"Cancel\" onClick ='Cancel()'>\r\n\t\t\t ");
              out.write("</center>\t\t\t    \t\t    \r\n\t\r\n");
              out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n\r\n\tfunction getAcronym(){\r\n\t\tdocument.forms[0].action=\"CMSAction.do?methodToCall=editProfAcronym\";\r\n\t\tdocument.forms[0].submit();\r\n\t\treturn true;\r\n\t}\r\n\t\r\n\tfunction Cancel(){\r\n\tdocument.forms[0].action=\"CMSAction.do?methodToCall=edit_profile\";\r\n\tdocument.forms[0].submit();\r\n\treturn true;\r\n\t}\r\n\r\n\tfunction Save(){\r\n\t\t\t\t\t\r\n\t  if( validate()==true ){\t\t  \t\r\n\t\tvar ans=false; \r\n\t\tans=window.confirm('Do you wish to create the group...?');\r\n\t\tif(ans == true)\r\n\t\t{\t\r\n\t\t\tdocument.forms[0].action=\"CMSAction.do?methodToCall=groupExists\";\r\n\t\t\tdocument.forms[0].submit();\t\r\n\t\t\t//var error = document.forms[0].errMess.value;\r\n\t\t\t//alert(\"message is \"+document.forms[0].errMess.value);\r\n\t\t\t/*if( (document.forms[0].errMess.value==\"\")||error==null ){\r\n\t\t\t\talert(\"err mess is null\"+document.forms[0].errMess.value);\t\r\n\t\t\t\tdocument.forms[0].action=\"CMSAction.do?methodToCall=createNewGroup\";\r\n\t\t\t\tdocument.forms[0].submit();\r\n\t\t\t}else{\r\n\t\t\t\treturn false;\r\n\t\t\t}\t\t*/\r\n\t\t\t\r\n\t\t}\r\n\t\telse\r\n\t\t\treturn false;\r\n");
              out.write("\t  }\r\n\t  else\r\n\t  return false;\t\t  \r\n\t}\r\n\t\r\n\tfunction validate(){\r\n\t\t\r\n\t\tif( document.forms[0].appName.value==\"\" ){\r\n\t\t\talert(\"Please choose an Application.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if( document.forms[0].rcbsCode.value==\"\" ){\r\n\t\t\talert(\"Please enter the RCBS CODE for the application.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if( document.forms[0].rcbsMgrCuid.value==\"\" ){\r\n\t\t\talert(\"Please enter the RCBS Manager's CUID for the application.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if( document.forms[0].alarmFreq.value==\"\" ){\r\n\t\t\talert(\"Please choose the Alarming Frequency required for the certificates of the application.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse\r\n\t\t\treturn true;\r\n\t}\r\n\r\n\tfunction showAlert(){\t   \r\n\t\t\tdocument.forms[0].action =\"");
              out.print(request.getContextPath());
              out.write("/CMSAction.do?methodToCall=editProfile\";\r\n\t\t\tdocument.forms[0].submit();\t\r\n\t\t\treturn true;  \t\t\t\r\n\t}\r\nfunction checkCuid(str)\r\n{\r\n\tvar cuid=str.value\r\n\t//alert(cuid)\r\n\tvar temp = new Array();\r\n\ttemp = cuid.split(\",\");\r\n\t//alert(temp[0]);\r\n\t//alert(temp[1]);\r\n\t//alert(temp.length);\r\n\tfor(k=0;k ");
              out.write("< temp.length; k++)\r\n\t\t{\r\n\t\t\t//alert(temp[k].length);\r\n\t\t\tif(temp[k].length > 10)\r\n\t\t\t\t{\r\n\t\t\t\talert(\"CUID can not exceed 8 characters\")\r\n\t\t\t\tstr.focus();\r\n\t\t\t\treturn false\r\n\t\t\t\t}\r\n\t\t}\r\n}\r\nfunction checkquote(str)\r\n{\r\nvar string=str.value\r\n//alert(string)\r\nvar quote=\"'\"\r\nvar quote2=\",\"\r\nvar space = \" \"\r\n//alert(string.length)\r\nvar length = string.length;\r\n\r\nfor (i = 0; i ");
              out.write("< string.length ; i++)\r\n  {\r\n   strChar = string.charAt(i);\r\n   //alert(string.charAt(i))\r\n      if (quote.indexOf(strChar) !== -1)\r\n         {\r\n\t         alert(\"Single quote is not allowed!\")\r\n\t         str.focus();\r\n\t      \t return false\r\n\t      }\r\n\t     \r\n       \r\n\r\n }\r\n}\r\nfunction rcbscode01(str)\r\n{\r\n   var valid1 = str.value;\r\n   var flag = true;\r\n    if (valid1  !==  \"\" )\r\n    {\r\n    \tflag=true;\r\n    \t\r\n     }\r\n     else{\r\n      flag= false;\r\n      alert(\"RCBS code can not be empty\");\r\n         \r\n     }\r\n    return flag;\r\n}\r\n\r\nfunction managercuid(string)\r\n{\r\n\tvar mgnrcuid = string.value;\r\n    var flag = false;\r\n    if (mgnrcuid  !==  \"\" )\r\n    {\r\n    \tflag=true;\r\n    \t\r\n     }\r\n     else{\r\n      flag= false;\r\n      alert(\"RCBS Manager CUID can not be empty\");\r\n      //document.forms[0].rcbsMgrCuid.focus();\r\n      \r\n     }\r\n     return flag;\r\n}\r\n \r\n");
              out.write("</script>\r\n");
              int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
          out.write("\r\n\r\n");
          out.write("</body>\r\n");
          int evalDoAfterBody = _jspx_th_html_html_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_html_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_html.reuse(_jspx_th_html_html_0);
      out.write("\r\n");
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

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:select ---- */
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_property_onchange.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(pageContext);
    _jspx_th_html_select_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_select_0.setProperty("appName");
    _jspx_th_html_select_0.setStyle("");
    _jspx_th_html_select_0.setOnchange("getAcronym()");
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
        if (_jspx_meth_html_options_0(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_style_property_onchange.reuse(_jspx_th_html_select_0);
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
        out.write("Select");
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

  private boolean _jspx_meth_html_options_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:options ---- */
    org.apache.struts.taglib.html.OptionsTag _jspx_th_html_options_0 = (org.apache.struts.taglib.html.OptionsTag) _jspx_tagPool_html_options_property_name_collection_nobody.get(org.apache.struts.taglib.html.OptionsTag.class);
    _jspx_th_html_options_0.setPageContext(pageContext);
    _jspx_th_html_options_0.setParent(_jspx_th_html_select_0);
    _jspx_th_html_options_0.setCollection("appList");
    _jspx_th_html_options_0.setName("CMSFormBean");
    _jspx_th_html_options_0.setProperty("appName");
    int _jspx_eval_html_options_0 = _jspx_th_html_options_0.doStartTag();
    if (_jspx_th_html_options_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_options_property_name_collection_nobody.reuse(_jspx_th_html_options_0);
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
    _jspx_th_html_text_0.setProperty("acronym");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_hidden_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:hidden ---- */
    org.apache.struts.taglib.html.HiddenTag _jspx_th_html_hidden_0 = (org.apache.struts.taglib.html.HiddenTag) _jspx_tagPool_html_hidden_property_name_nobody.get(org.apache.struts.taglib.html.HiddenTag.class);
    _jspx_th_html_hidden_0.setPageContext(pageContext);
    _jspx_th_html_hidden_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_hidden_0.setName("CMSFormBean");
    _jspx_th_html_hidden_0.setProperty("errMess");
    int _jspx_eval_html_hidden_0 = _jspx_th_html_hidden_0.doStartTag();
    if (_jspx_th_html_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_hidden_property_name_nobody.reuse(_jspx_th_html_hidden_0);
    return false;
  }

  private boolean _jspx_meth_html_select_1(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:select ---- */
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_1.setPageContext(pageContext);
    _jspx_th_html_select_1.setParent(_jspx_th_html_form_0);
    _jspx_th_html_select_1.setName("CMSFormBean");
    _jspx_th_html_select_1.setProperty("auth_type");
    _jspx_th_html_select_1.setSize("1");
    _jspx_th_html_select_1.setStyle("font-size: 1.05em;");
    int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
    if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_select_1.setBodyContent(_bc);
        _jspx_th_html_select_1.doInitBody();
      }
      do {
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_1(_jspx_th_html_select_1, pageContext))
          return true;
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_2(_jspx_th_html_select_1, pageContext))
          return true;
        out.write("\r\n\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_style_size_property_name.reuse(_jspx_th_html_select_1);
    return false;
  }

  private boolean _jspx_meth_html_option_1(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_1, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_1 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_1.setPageContext(pageContext);
    _jspx_th_html_option_1.setParent(_jspx_th_html_select_1);
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

  private boolean _jspx_meth_html_option_2(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_1, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_2 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_2.setPageContext(pageContext);
    _jspx_th_html_option_2.setParent(_jspx_th_html_select_1);
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

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_onblur_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(pageContext);
    _jspx_th_html_text_1.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_1.setName("CMSFormBean");
    _jspx_th_html_text_1.setProperty("rcbsCode");
    _jspx_th_html_text_1.setOnblur("return rcbscode01(document.forms[0].rcbsCode);");
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_property_onblur_name_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_onblur_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(pageContext);
    _jspx_th_html_text_2.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_2.setName("CMSFormBean");
    _jspx_th_html_text_2.setProperty("rcbsMgrCuid");
    _jspx_th_html_text_2.setOnblur("return managercuid(document.forms[0].rcbsMgrCuid);");
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_property_onblur_name_nobody.reuse(_jspx_th_html_text_2);
    return false;
  }

  private boolean _jspx_meth_html_textarea_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:textarea ---- */
    org.apache.struts.taglib.html.TextareaTag _jspx_th_html_textarea_0 = (org.apache.struts.taglib.html.TextareaTag) _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.get(org.apache.struts.taglib.html.TextareaTag.class);
    _jspx_th_html_textarea_0.setPageContext(pageContext);
    _jspx_th_html_textarea_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_textarea_0.setProperty("appUserName");
    _jspx_th_html_textarea_0.setName("CMSFormBean");
    _jspx_th_html_textarea_0.setCols("32");
    _jspx_th_html_textarea_0.setRows("2");
    int _jspx_eval_html_textarea_0 = _jspx_th_html_textarea_0.doStartTag();
    if (_jspx_th_html_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.reuse(_jspx_th_html_textarea_0);
    return false;
  }

  private boolean _jspx_meth_html_select_2(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:select ---- */
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_2.setPageContext(pageContext);
    _jspx_th_html_select_2.setParent(_jspx_th_html_form_0);
    _jspx_th_html_select_2.setName("CMSFormBean");
    _jspx_th_html_select_2.setProperty("alarmFreq");
    _jspx_th_html_select_2.setSize("1");
    _jspx_th_html_select_2.setStyle("font-size: 1.05em;");
    int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
    if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_select_2.setBodyContent(_bc);
        _jspx_th_html_select_2.doInitBody();
      }
      do {
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_3(_jspx_th_html_select_2, pageContext))
          return true;
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_4(_jspx_th_html_select_2, pageContext))
          return true;
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_5(_jspx_th_html_select_2, pageContext))
          return true;
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_6(_jspx_th_html_select_2, pageContext))
          return true;
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_7(_jspx_th_html_select_2, pageContext))
          return true;
        out.write("\t\t\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_8(_jspx_th_html_select_2, pageContext))
          return true;
        out.write("\t\t\r\n\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_style_size_property_name.reuse(_jspx_th_html_select_2);
    return false;
  }

  private boolean _jspx_meth_html_option_3(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_2, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_3 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_3.setPageContext(pageContext);
    _jspx_th_html_option_3.setParent(_jspx_th_html_select_2);
    _jspx_th_html_option_3.setValue("");
    int _jspx_eval_html_option_3 = _jspx_th_html_option_3.doStartTag();
    if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_3.setBodyContent(_bc);
        _jspx_th_html_option_3.doInitBody();
      }
      do {
        out.write("Select...");
        int evalDoAfterBody = _jspx_th_html_option_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_3);
    return false;
  }

  private boolean _jspx_meth_html_option_4(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_2, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_4 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_4.setPageContext(pageContext);
    _jspx_th_html_option_4.setParent(_jspx_th_html_select_2);
    _jspx_th_html_option_4.setValue("30");
    int _jspx_eval_html_option_4 = _jspx_th_html_option_4.doStartTag();
    if (_jspx_eval_html_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_4.setBodyContent(_bc);
        _jspx_th_html_option_4.doInitBody();
      }
      do {
        out.write("30 days");
        int evalDoAfterBody = _jspx_th_html_option_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_4);
    return false;
  }

  private boolean _jspx_meth_html_option_5(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_2, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_5 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_5.setPageContext(pageContext);
    _jspx_th_html_option_5.setParent(_jspx_th_html_select_2);
    _jspx_th_html_option_5.setValue("40");
    int _jspx_eval_html_option_5 = _jspx_th_html_option_5.doStartTag();
    if (_jspx_eval_html_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_5.setBodyContent(_bc);
        _jspx_th_html_option_5.doInitBody();
      }
      do {
        out.write("40 days");
        int evalDoAfterBody = _jspx_th_html_option_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_5);
    return false;
  }

  private boolean _jspx_meth_html_option_6(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_2, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_6 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_6.setPageContext(pageContext);
    _jspx_th_html_option_6.setParent(_jspx_th_html_select_2);
    _jspx_th_html_option_6.setValue("60");
    int _jspx_eval_html_option_6 = _jspx_th_html_option_6.doStartTag();
    if (_jspx_eval_html_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_6.setBodyContent(_bc);
        _jspx_th_html_option_6.doInitBody();
      }
      do {
        out.write("60 days");
        int evalDoAfterBody = _jspx_th_html_option_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_6);
    return false;
  }

  private boolean _jspx_meth_html_option_7(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_2, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_7 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_7.setPageContext(pageContext);
    _jspx_th_html_option_7.setParent(_jspx_th_html_select_2);
    _jspx_th_html_option_7.setValue("70");
    int _jspx_eval_html_option_7 = _jspx_th_html_option_7.doStartTag();
    if (_jspx_eval_html_option_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_7.setBodyContent(_bc);
        _jspx_th_html_option_7.doInitBody();
      }
      do {
        out.write("70 days");
        int evalDoAfterBody = _jspx_th_html_option_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_7);
    return false;
  }

  private boolean _jspx_meth_html_option_8(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_2, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_8 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_8.setPageContext(pageContext);
    _jspx_th_html_option_8.setParent(_jspx_th_html_select_2);
    _jspx_th_html_option_8.setValue("90");
    int _jspx_eval_html_option_8 = _jspx_th_html_option_8.doStartTag();
    if (_jspx_eval_html_option_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_8.setBodyContent(_bc);
        _jspx_th_html_option_8.doInitBody();
      }
      do {
        out.write("90 days");
        int evalDoAfterBody = _jspx_th_html_option_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_option_value.reuse(_jspx_th_html_option_8);
    return false;
  }
}
