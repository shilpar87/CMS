package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;

public class Edit_profGroupEdit_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_size_readonly_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_readonly_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_textarea_rows_property_name_cols_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_size_property_name_maxlength_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;

  public Edit_profGroupEdit_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_errors_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_size_readonly_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_readonly_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_size_property_name_maxlength_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_select_style_size_property_name = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_option_value = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_logic_iterate_name_id = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_bean_write_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_errors_nobody.release();
    _jspx_tagPool_html_text_size_readonly_property_name_nobody.release();
    _jspx_tagPool_html_text_readonly_property_name_nobody.release();
    _jspx_tagPool_html_textarea_rows_property_name_cols_nobody.release();
    _jspx_tagPool_html_text_property_name_nobody.release();
    _jspx_tagPool_html_text_size_property_name_maxlength_nobody.release();
    _jspx_tagPool_html_select_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">");
      out.write("<!--\r\n\r\n\tfunction Cancel(){\r\n\tdocument.forms[0].action=\"CMSAction.do?methodToCall=edit_profile\";\r\n\tdocument.forms[0].submit();\r\n\treturn true;\r\n}\r\n\r\nfunction Save(){\r\n\tif(validate()==true){\r\n\t\tvar ans=false; \r\n\t\tans=window.confirm('Do you wish to edit the Group Details ?');\r\n\t\tif(ans == true)\t{\t\r\n\t\t\tdocument.forms[0].action=\"CMSAction.do?methodToCall=editGroupSave\";\r\n\t\t\t//alert(\"saving details......\");\r\n\t\t\tdocument.forms[0].submit();\t\r\n\t\t\treturn true;\r\n\t\t}else{\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\t\r\n\t}\r\n\telse \r\n\t\treturn false;\r\n}\r\n\r\nfunction refresh(){\r\n\t//document.forms[0].action=\"CMSAction.do?methodToCall=editProfileGroup\";\r\n\t//alert(\"refresh......\");\r\n\twindow.location.reload( true );\t\r\n\t//document.forms[0].submit();\treturn true;\r\n}\r\n\r\nfunction validate(){\r\n\tif(document.forms[0].alarmTime.value==\"\"){\r\n\t\talert(\"Please choose the Alarming Time\");\r\n\t\treturn false;\r\n\t}\r\n\telse if(document.forms[0].rcbsMgrCuid.value==\"\"){\r\n\t\talert(\"Please enter the RCBS Manager Cuid\");\r\n\t\treturn false;\r\n\t}\r\n\telse \r\n\t\treturn true;\t\r\n}\r\n\r\n\r\nfunction disp_prompt()\r\n");
      out.write("{\r\nvar name=prompt(\"Please enter your name\",\"CUID\");\r\n//var auth=prompt(\"Please enter the authentication type\",\"A\");\r\nif (name!=null && name!=\"\" )\r\n  {\r\n  \tif (name.length > 7)\r\n \t {\t\r\n  \t\talert(\"Please enter a valid cuid\"+name.length);\r\n  \t}\r\n  \telse{\r\n  \t\t//alert(\"in else...\");\r\n \t\t //document.write(\"Hello \" + name + \"! How are you today?\");\r\n \t\t document.forms[0].hidden.value=name;\r\n \t\t //document.forms[0].authType.value=auth;\r\n \t\t //alert(document.forms[0].hidden.value=name+document.forms[0].authType.value=auth);\r\n \t\t document.forms[0].action=\"CMSAction.do?methodToCall=editProfileGroup\";\r\n \t\t document.forms[0].submit();\r\n \t }\r\n  }\r\n  else\r\n  alert(\"Please enter the cuid\");\r\n}\r\n\r\n\r\nfunction get_radio_value()\r\n{\r\n\t//alert(\"in get radio value....\"+document.forms[0].selectCuid.value);\r\n\tvar arr = new Array(document.forms[0].selectCuid.length);\r\n\tvar lenth=arr.length;\r\n\tif(lenth > 1)\r\n\t{\r\n\t\tvar temp=\"\";\r\n\t\tfor (var i=0; i ");
      out.write("< document.forms[0].selectCuid.length; i++)\r\n   \t\t{\r\n \t  \t\tif (document.forms[0].selectCuid[i].checked)\r\n   \t \t\t {\r\n   \t   \t\t\t//alert(document.forms[0].selectCuid[i].checked);\t\r\n   \t \t\t\t  var rad_val = document.forms[0].selectCuid[i].value;\r\n      \t\t\t //alert(\"selected id:  \"+rad_val);      \t \r\n      \t\t\t temp=rad_val+\",\"+temp;\t \r\n      \t \t\t\t//alert(temp);\r\n      \t \t\t\tdocument.forms[0].selCuid.value=temp;  \r\n      \t\t\t// alert(\"sel cuid\"+temp);\r\n      \t \t\t\t//alert(document.forms[0].selCuid.value);\r\n      \t \t\t\t//return temp;\r\n      \t\r\n      \t\t\t}           \r\n   \t\t  }   \r\n  \t\t  if (document.forms[0].selCuid.value == \"\"){\r\n   \t \t\t\talert(\"Please choose a CUID\");\r\n   \t\t\t\treturn false;\r\n   \t\t\t}return true;\r\n  \t}\r\n   \telse \r\n  \t {\r\n  \t \tif (document.forms[0].selectCuid.checked){\r\n  \t \t\r\n \t\t\t document.forms[0].selCuid.value=document.forms[0].selectCuid.value;\r\n \t\t \t// return document.forms[0].selectCuid.value;\r\n  \t\t \treturn true;\r\n  \t\t }\r\n  \t\t else{\r\n  \t\t \talert(\"Please choose a CUID\");\r\n  \t\t \treturn false;\r\n   \t\t }\r\n  \t  }\r\n");
      out.write(" }\r\n\r\nfunction popUpMember(urlToOpen){\r\n\t\r\n\t//alert(\"URL\"+urlToOpen);\r\n\tvar window_width = screen.availWidth/3;\r\n\tvar window_height = screen.availHeight/3;\r\n\tvar window_left = (screen.availWidth/2)-(window_width/2);\r\n\tvar window_top = (screen.availHeight/2)-(window_height/2);\r\n\tvar winParms = \"Status=yes\" + \",resizable=yes\" + \",height=\"+window_height+\",width=\"+window_width + \",left=\"+window_left+\",top=\"+window_top;\r\n\r\n\tvar newwindow = window.open(urlToOpen,'_blank',winParms);\r\n\tnewwindow.focus()\t\r\n}\r\n\r\nfunction addMember(){\r\n\t//document.forms[0].memList.value='';\r\n\tvar x=0;\r\n    var mem='';\r\n    var size=document.forms[0].selectCuid.length;\r\n    //alert(\" size \"+size);\r\n    if(size>1)\r\n\t{\r\n    for (x=0;x");
      out.write("<size;x++){      \r\n    mem=mem+document.forms[0].selectCuid[x].value+',';    \r\n    }    \r\n\t//alert(mem);\r\n\tdocument.forms[0].memList.value=mem;\r\n\tdocument.forms[0].action=\"CMSAction.do?methodToCall=editProfGroupCuid\";\r\n \tdocument.forms[0].submit();\r\n \t}else{\r\n \t//alert(document.forms[0].selectCuid.value);\r\n \tdocument.forms[0].memList.value=document.forms[0].selectCuid.value;\r\n \tdocument.forms[0].action=\"CMSAction.do?methodToCall=editProfGroupCuid\";\r\n \tdocument.forms[0].submit();\r\n \t}\r\n}\r\n\r\nfunction deleteMem(){\r\n\t//alert(\"Delete mem\");\r\n\tif (get_radio_value()){\r\n\tdocument.forms[0].action=\"CMSAction.do?methodToCall=editProfMemDelete\";\r\n \tdocument.forms[0].submit();\r\n \t}\r\n}\r\n\r\n\r\n");
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
          out.write("<title>Edit/Create Group");
          out.write("</title>\r\n\r\n");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(request.getContextPath() );
          out.write("/css/style.css\" />\r\n");
          out.write("</head>\r\n\r\n\r\n");
          out.write("<body>\r\n\r\n");
          /* ----  html:form ---- */
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(pageContext);
          _jspx_th_html_form_0.setParent(_jspx_th_html_html_0);
          _jspx_th_html_form_0.setAction("/CMSAction.do?methodToCall=editProfileGroup");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\t\r\n\t\t");
              out.write("<input type=\"hidden\" name=\"hidden\" />\t\r\n\t\t");
              out.write("<input type=\"hidden\" name=\"selAcronym\" />\t\r\n\t\t");
              out.write("<input type=\"hidden\" name=\"selCuid\" />\r\n\t\t");
              out.write("<input type=\"hidden\" name=\"authType\" />\r\n\t\t");
              out.write("<input type=\"hidden\" name=\"memList\" value=''/>\r\n\t\t");
              out.write("<table align=\"center\"  width=\"80%\" >\r\n\t\t");
              out.write("<tr bordercolor=\"CC0033\">\r\n\t\t");
              out.write("<td align=\"center\" bgcolor=\"FFFFCC\">");
              out.write("<FONT size=\"4\" color=\"CC0033\">");
              out.write("<b>");
              if (_jspx_meth_html_errors_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</b>");
              out.write("</FONT>\r\n\t\t");
              out.write("</td>\r\n\t\t");
              out.write("</tr>\t\t\r\n\t\t");
              out.write("</table>\r\n\t\t");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"40%\" bgcolor=\"336699\" bordercolor=\"#000000\">\r\n\r\n\t\t");
              out.write("<tr>\r\n\t\t\t");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<u>");
              out.write("<font size=\"4\" color=\"FFFFFF\"> Create/Edit Group ");
              out.write("</font>");
              out.write("</u> ");
              out.write("</td> \r\n    \t");
              out.write("</tr>\r\n \t\t");
              out.write("</table>\r\n\t\t\r\n\t\t");
              out.write("<br>\t\t\t\r\n\t\t\t\t\r\n\t\t");
              out.write("<table border=\"0\" width=\"70%\" align = \"center\" CELLSPACING=\"0\" height=\"15%\">\r\n\t\t\t\r\n\t\t\t\t");
              out.write("<tr>\t\r\n\t\t\t\t");
              out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t");
              out.write("<td width=\"30%\" >\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >Application Name");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"70%\" bgcolor=\"C8DFFF\">: \r\n\t\t\t\t");
              if (_jspx_meth_html_text_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\r\n\t\t\t\t");
              out.write("</td>\r\n\t\t\t\t");
              out.write("</tr>\r\n\t\t\t   \r\n\t\t\t\t");
              out.write("<tr>\r\n\t\t\t\t");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t\t");
              out.write("<td width=\"30%\" >\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >Acronym");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"70%\">: \t\t\t\t\r\n\t\t\t\t");
              if (_jspx_meth_html_text_1(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t");
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t    ");
              out.write("<tr>\r\n\t\t\t    ");
              out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t");
              out.write("<td width=\"30%\" >\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >Creator");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"70%\">: \r\n\t\t\t\t");
              if (_jspx_meth_html_text_2(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t    ");
              out.write("<tr>\r\n\t\t\t\t");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t\t");
              out.write("<td width=\"30%\" class=\"q\" height=\"23\">\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >Application User Names");
              out.write("</font>");
              out.write("<font size=\"1\" color=\"red\">(comma seperated)");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"70%\" height=\"23\"> :\r\n\t\t\t\t");
              if (_jspx_meth_html_textarea_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\t\t\t\t\r\n\t\t\t\t");
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t    ");
              out.write("<tr>\r\n\t\t\t    ");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t\t");
              out.write("<td width=\"30%\" >\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >RCBS Code");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"70%\">: \r\n\t\t\t\t");
              if (_jspx_meth_html_text_3(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t\t     \r\n\t\t\t    ");
              out.write("<tr>\r\n\t\t\t    ");
              out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t");
              out.write("<td width=\"30%\" >\r\n\t\t\t\t");
              out.write("<font size=\"2\" color=\" 00638B\" >RCBS Manager CUID");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"70%\">: \r\n\t\t\t\t");
              if (_jspx_meth_html_text_4(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</td>\r\n\t\t\t    ");
              out.write("</tr>\r\n\t\t");
              out.write("</table>\r\n\t\t\t    \r\n\t\t");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"70%\" bgcolor=\"lightblue\" bordercolor=\"#000000\">\r\n\t\t\t\t");
              out.write("<tr>\r\n\t\t\t\t");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<u>");
              out.write("<b> Notification Information");
              out.write("</b> ");
              out.write("</u> ");
              out.write("</td> ");
              out.write("</tr>\r\n \t\t");
              out.write("</table>\r\n\t\t");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"70%\" bgcolor=\"336699\" bordercolor=\"#000000\">\r\n \t\t\t\r\n\t\t\t    ");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t    ");
              out.write("<td width=\"30%\" class=\"q\" >\r\n\t\t\t    ");
              out.write("<font size=\"2\" color=\" 00638B\" >Alarming Time");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"70%\" >:\r\n\t\t\t\t");
              if (_jspx_meth_html_select_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("\t\t      \t\t\t\r\n      \t\t\t ");
              out.write("</td>");
              out.write("</tr>\t\t\t\t     \r\n\t\t ");
              out.write("</table>\r\n\t\t\t    ");
              out.write("<center>\r\n\t\t\t    ");
              out.write("<input type=\"button\" name=\"print\" style=\"font-size: 1.05em; padding: 0.05em;\" id=\"print\" value=\"Save\" onclick='Save()'>\r\n\t\t\t\t ");
              out.write("<input type=\"button\" name=\"print\" style=\"font-size: 1.05em; padding: 0.05em;\" id=\"print\" value=\"Cancel\" onclick ='Cancel()'>\r\n\t\t\t \t");
              out.write("</center>\r\n\t\t\t \t\r\n\t\t\t");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" width=\"70%\" bgcolor=\"lightblue\" bordercolor=\"#000000\">\r\n\t\t\t    ");
              out.write("<tr>");
              out.write("<td align=\"center\" valign=\"top\" >");
              out.write("<u>");
              out.write("<b>Group Member Information ");
              out.write("</b> ");
              out.write("</u>");
              out.write("</td>");
              out.write("</tr>\r\n\t\t\t");
              out.write("</table>\r\n\t\t\t    \r\n\t\t\t");
              out.write("<table border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" width=\"70%\">\t\t\t   \r\n\t\t\t    ");
              out.write("<tr bgcolor=\"DFECFF\">\r\n\t\t\t\t");
              out.write("<td width=\"150\" class=\"q\" height=\"23\">");
              out.write("<font size=\"2\" color=\" 00638B\" >Group Member CUID");
              out.write("</font>");
              out.write("</td>\r\n\t\t\t\t");
              out.write("<td width=\"325\" height=\"23\">&nbsp;&nbsp;\r\n\t\t\t\t\t");
              out.write("<div style=\"overflow:auto;width:200px; height:90px; table-layout:fixed;\">\r\n\t\t\t\t\t");
              out.write("<table align=\"center\">\t\t\t\t\t\r\n\t\t\t\t\t");
              /* ----  logic:iterate ---- */
              org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
              _jspx_th_logic_iterate_0.setPageContext(pageContext);
              _jspx_th_logic_iterate_0.setParent(_jspx_th_html_form_0);
              _jspx_th_logic_iterate_0.setName("cuidList");
              _jspx_th_logic_iterate_0.setId("cuidList");
              int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
              if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                java.lang.Object cuidList = null;
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
                  out = _bc;
                  _jspx_th_logic_iterate_0.setBodyContent(_bc);
                  _jspx_th_logic_iterate_0.doInitBody();
                }
                cuidList = (java.lang.Object) pageContext.findAttribute("cuidList");
                do {
                  out.write("\r\n\t\t\t\t\t");
                  out.write("<tr>\r\n\t\t\t\t\t");
                  out.write("<td align=\"center\">\r\n\t\t\t\t\t");
                  out.write("<input type=\"checkbox\" id=\"cuidList\" name=\"selectCuid\" value=\"");
                  if (_jspx_meth_bean_write_0(_jspx_th_logic_iterate_0, pageContext))
                    return;
                  out.write("\"   />\r\n\t\t\t\t\t");
                  out.write("</td>\r\n\t\t\t\t\t");
                  out.write("<td align=\"center\">\r\n\t          \t\t");
                  out.write("<font face=\"Verdana\" size=\"1\"> ");
                  if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, pageContext))
                    return;
                  out.write("</font>\t\t       \r\n  \t\t\t \t\t");
                  out.write("</td>\r\n  \t\t\t \t\t");
                  out.write("</tr>\r\n\t\t\t\t\t");
                  int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
                  cuidList = (java.lang.Object) pageContext.findAttribute("cuidList");
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                  out = pageContext.popBody();
              }
              if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
              out.write("\t\t\t\t\t\r\n\t\t\t\t\t");
              out.write("</table>\t\r\n\t\t\t\t\t");
              out.write("</div>\r\n\t\t\t\t");
              out.write("</td>\t\t    \r\n\t\t\t\t");
              out.write("</tr>\t\t    \t\t  \r\n                \t  \r\n      \t\t    ");
              out.write("<tr bgcolor=\"DFECFF\">\r\n    \t\t\t");
              out.write("<td width=\"29%\" align=\"center\" bgcolor=\"C8DFFF\">");
              out.write("<input type=\"button\"  style=\"font-size: 1.05em; padding: 0.05em;\" value=\"Add Member\" onclick=\"addMember()\"/>");
              out.write("</td>\r\n    \t\t\t");
              out.write("<td width=\"29%\" align=\"center\" bgcolor=\"C8DFFF\">");
              out.write("<input type=\"button\" name=\"print\" style=\"font-size: 1.05em; padding: 0.05em;\" id=\"print\" value=\"Delete Member\" onclick=\"deleteMem()\" />");
              out.write("</td>\r\n\r\n    \t\t\t");
              out.write("</tr>\r\n      \t\t");
              out.write("</table>\t   \t\t\t \r\n\t\t\t \r\n\t\t\t    \t\t    \r\n");
              int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_form_action.reuse(_jspx_th_html_form_0);
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
      out.write("\r\n\t\t\t    \r\n     \r\n");
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
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_readonly_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(pageContext);
    _jspx_th_html_text_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_0.setName("CMSFormBean");
    _jspx_th_html_text_0.setProperty("appName");
    _jspx_th_html_text_0.setSize("60");
    _jspx_th_html_text_0.setReadonly(true);
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_size_readonly_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_text_1(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_1 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_readonly_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_1.setPageContext(pageContext);
    _jspx_th_html_text_1.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_1.setName("CMSFormBean");
    _jspx_th_html_text_1.setProperty("acronym");
    _jspx_th_html_text_1.setReadonly(true);
    int _jspx_eval_html_text_1 = _jspx_th_html_text_1.doStartTag();
    if (_jspx_th_html_text_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_readonly_property_name_nobody.reuse(_jspx_th_html_text_1);
    return false;
  }

  private boolean _jspx_meth_html_text_2(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_2 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_readonly_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_2.setPageContext(pageContext);
    _jspx_th_html_text_2.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_2.setName("CMSFormBean");
    _jspx_th_html_text_2.setProperty("creatorCuid");
    _jspx_th_html_text_2.setReadonly(true);
    int _jspx_eval_html_text_2 = _jspx_th_html_text_2.doStartTag();
    if (_jspx_th_html_text_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_readonly_property_name_nobody.reuse(_jspx_th_html_text_2);
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

  private boolean _jspx_meth_html_text_3(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_3 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_3.setPageContext(pageContext);
    _jspx_th_html_text_3.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_3.setName("CMSFormBean");
    _jspx_th_html_text_3.setProperty("rcbsCode");
    int _jspx_eval_html_text_3 = _jspx_th_html_text_3.doStartTag();
    if (_jspx_th_html_text_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_3);
    return false;
  }

  private boolean _jspx_meth_html_text_4(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_4 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_property_name_maxlength_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_4.setPageContext(pageContext);
    _jspx_th_html_text_4.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_4.setName("CMSFormBean");
    _jspx_th_html_text_4.setProperty("rcbsMgrCuid");
    _jspx_th_html_text_4.setMaxlength("8");
    _jspx_th_html_text_4.setSize("9");
    int _jspx_eval_html_text_4 = _jspx_th_html_text_4.doStartTag();
    if (_jspx_th_html_text_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_size_property_name_maxlength_nobody.reuse(_jspx_th_html_text_4);
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
    _jspx_th_html_select_0.setProperty("alarmTime");
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
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_3(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_4(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\t\t\r\n\t\t\t\t\t");
        if (_jspx_meth_html_option_5(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\t\t\r\n\t\t\t\t ");
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
    _jspx_th_html_option_1.setValue("30");
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_1.setBodyContent(_bc);
        _jspx_th_html_option_1.doInitBody();
      }
      do {
        out.write("30 days");
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
    _jspx_th_html_option_2.setValue("40");
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_2.setBodyContent(_bc);
        _jspx_th_html_option_2.doInitBody();
      }
      do {
        out.write("40 days");
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

  private boolean _jspx_meth_html_option_3(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_3 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_3.setPageContext(pageContext);
    _jspx_th_html_option_3.setParent(_jspx_th_html_select_0);
    _jspx_th_html_option_3.setValue("60");
    int _jspx_eval_html_option_3 = _jspx_th_html_option_3.doStartTag();
    if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_3.setBodyContent(_bc);
        _jspx_th_html_option_3.doInitBody();
      }
      do {
        out.write("60 days");
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

  private boolean _jspx_meth_html_option_4(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_4 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_4.setPageContext(pageContext);
    _jspx_th_html_option_4.setParent(_jspx_th_html_select_0);
    _jspx_th_html_option_4.setValue("70");
    int _jspx_eval_html_option_4 = _jspx_th_html_option_4.doStartTag();
    if (_jspx_eval_html_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_4.setBodyContent(_bc);
        _jspx_th_html_option_4.doInitBody();
      }
      do {
        out.write("70 days");
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

  private boolean _jspx_meth_html_option_5(javax.servlet.jsp.tagext.Tag _jspx_th_html_select_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:option ---- */
    org.apache.struts.taglib.html.OptionTag _jspx_th_html_option_5 = (org.apache.struts.taglib.html.OptionTag) _jspx_tagPool_html_option_value.get(org.apache.struts.taglib.html.OptionTag.class);
    _jspx_th_html_option_5.setPageContext(pageContext);
    _jspx_th_html_option_5.setParent(_jspx_th_html_select_0);
    _jspx_th_html_option_5.setValue("90");
    int _jspx_eval_html_option_5 = _jspx_th_html_option_5.doStartTag();
    if (_jspx_eval_html_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_5.setBodyContent(_bc);
        _jspx_th_html_option_5.doInitBody();
      }
      do {
        out.write("90 days");
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

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(pageContext);
    _jspx_th_bean_write_0.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_0.setName("cuidList");
    _jspx_th_bean_write_0.setProperty("memberCuid");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(pageContext);
    _jspx_th_bean_write_1.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_1.setName("cuidList");
    _jspx_th_bean_write_1.setProperty("memberCuid");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }
}
