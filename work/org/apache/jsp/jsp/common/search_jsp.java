package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;

public class search_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_enctype_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_size_readonly_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_reset_nobody;

  public search_jsp() {
    _jspx_tagPool_html_form_enctype_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_select_style_size_property_name = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_size_readonly_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_reset_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_enctype_action.release();
    _jspx_tagPool_html_select_style_size_property_name.release();
    _jspx_tagPool_html_text_size_readonly_property_name_nobody.release();
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
      response.setContentType("text/html; charset=iso-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/calendar-win2k-cold-1.css\" title=\"win2k-cold-1\" /> \r\n\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/config/calendar.js\">");
      out.write("</script>\r\n\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/config/lang/calendar-en.js\">");
      out.write("</script>\r\n\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/config/calendar-setup.js\">");
      out.write("</script>\r\n\r\n");
      out.write("<script>\r\nfunction CheckForm(){\r\n\t\r\n \t\tdocument.forms[0].action = \"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=searchResult\";\t  \t\r\n\t  \tdocument.forms[0].submit();\r\n}\r\nfunction validDate()\r\n\r\n{\r\n\r\nvar a = document.forms[0].fromDate.value.length;\r\n\r\nvar b = document.forms[0].toDate.value.length;\r\n\t\r\n\tif ( b > 0 && a == 0  )\r\n\tdocument.forms[0].fromDate.focus()\r\n\talert (\"Enter the from Date\")\r\n}\r\nfunction checkNumber(str)\r\n{\r\nvar string=str.value\r\nvar quote=\"0123456789\"\r\nfor (i = 0; i ");
      out.write("< string.length ; i++)\r\n  {\r\n   strChar = string.charAt(i);\r\n       if (quote.indexOf(strChar) == -1)\r\n         {\r\n         alert(\"Please enter numbers[0-9]\")\r\n         str.focus();\r\n         str.value=\"\"\r\n      \t return false\r\n      \t \r\n      \t       \t \r\n         }\r\n       }\r\n\t}\r\n\t\r\nfunction checkCuid(str)\r\n{\r\n\tvar cuid=str.value\r\n\t//alert(cuid)\r\n\tvar temp = new Array();\r\n\ttemp = cuid.split(\" \");\r\n\t//alert(temp[0]);\r\n\t//alert(temp[1]);\r\n\t//alert(temp.length);\r\n\tfor(k=0;k ");
      out.write("< temp.length; k++)\r\n\t\t{\r\n\t\t\talert(temp[k].length);\r\n\t\t\tif(temp[k].length > 10)\r\n\t\t\t\t{\r\n\t\t\t\talert(\"cuid should be less than 10 characters\")\r\n\t\t\t\tstr.focus();\r\n\t\t\t\treturn false\r\n\t\t\t\t}\r\n\t\t}\r\n}\r\n\r\n\r\nfunction checkquote(str)\r\n{\r\n//alert(str)\r\nvar string=str.value\r\n\r\n\r\n//alert(string)\r\nvar quote=\"'\"\r\n//alert(string.length)\r\nfor (i = 0; i ");
      out.write("< string.length ; i++)\r\n  {\r\n   strChar = string.charAt(i);\r\n   //alert(string.charAt(i))\r\n      if (quote.indexOf(strChar) !== -1)\r\n         {\r\n         alert(\"single quote is not allowed!\")\r\n         str.focus();\r\n      \t return false\r\n      \t \r\n      \t       \t \r\n         }\r\n       \r\n   \r\n  }\r\n\r\n}\r\n");
      out.write("</script>\r\n\r\n\r\n");
      out.write("<meta http-equiv=\"Content-Language\" content=\"en-us\">\r\n\r\n");
      out.write("<title>CMS");
      out.write("</title>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n");
      out.write("<script language=\"JavaScript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/calendar.js\">");
      out.write("</script>\r\n");
      out.write("<script language=\"JavaScript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/calFunc.js\">");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath());
      out.write("/js/validation.js\">");
      out.write("</script>\r\n");
      out.write("</head>\r\n\r\n");
      out.write("<body text=#000000 bgColor=#ffffff leftMargin=0  topMargin=0 rightmargin=0 >\r\n      ");

      System.out.println("hi I m here");
       if(session.getAttribute("searchRecord")!=null)
   {
            String srhCnt = "";
			srhCnt = session.getAttribute("searchRecord").toString();
			
			int searchCnt = Integer.parseInt(srhCnt);
			System.out.println("inside homepage int value for search--->");
			if(searchCnt==0)
			{
 			
      out.write("\r\n \t\t\t");
      out.write("<table border=0 width=800>\t\r\n \t\t\t");
      out.write("<tr>\r\n\t\t\t");
      out.write("<td>&nbsp");
      out.write("</td>\r\n\t\t\t");
      out.write("<td>&nbsp");
      out.write("</td>\r\n\t\t\t");
      out.write("<td align=\"center\">");
      out.write("<font color=\"red\"> ");
      out.write("<h3> No Match Found...");
      out.write("</h3>");
      out.write("</font>");
      out.write("</td>\r\n\t\t\r\n\t\t\t");
      out.write("<td>&nbsp ");
      out.write("</td>\r\n\t\t\r\n\t\t\t");
      out.write("<td> &nbsp");
      out.write("</td>\r\n\t\t\r\n\t\t\t");
      out.write("</tr>\r\n\t\t\t");
      out.write("</table>\r\n \t\t\r\n \t\t\t\t");

 				}
 				session.setAttribute("searchRecord",null);
 	}
 
      
      out.write("\r\n      ");
      /* ----  html:form ---- */
      org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_enctype_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_html_form_0.setPageContext(pageContext);
      _jspx_th_html_form_0.setParent(null);
      _jspx_th_html_form_0.setAction("/CMSAction.do?methodToCall=searchResult");
      _jspx_th_html_form_0.setEnctype("multipart/form-data");
      int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
      if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n      ");
          out.write("<table border=\"0\"  cellpadding=\"5\" cellspacing=\"1\"   bgcolor=\"white\"   width=\"80%\" align=\"center\">\r\n      ");
          out.write("<tr bgcolor=\"darkkhaki\">\r\n\t\t\t");
          out.write("<td align=\"center\" colspan=\"4\">");
          out.write("<font face=\"Verdana\" size=\"2\">");
          out.write("<b>Search Account");
          out.write("</b>");
          out.write("</font>\r\n\t\t\t");
          out.write("</td>\r\n\t\t");
          out.write("</tr>\r\n\t\t");
          out.write("<tr bgcolor=\"C8DFFF\">   \r\n\t\t\t\t\t\t\t");
          out.write("<td width=\"26%\" align=\"right\">\r\n\t\t\t\t\t\t\t");
          out.write("<font face=\"Verdana\" size=\"1\">");
          out.write("<b>Application Names: ");
          out.write("</b>");
          out.write("</font>");
          out.write("</td>\r\n\t\t\t\t\t\t\t");
          out.write("<td>\r\n\t\t\t\t\t\t\t");
          /* ----  html:select ---- */
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_0.setPageContext(pageContext);
          _jspx_th_html_select_0.setParent(_jspx_th_html_form_0);
          _jspx_th_html_select_0.setName("CMSFormBean");
          _jspx_th_html_select_0.setProperty("appName");
          _jspx_th_html_select_0.setSize("1");
          _jspx_th_html_select_0.setStyle("WIDTH: 350px; HEIGHT: 22px;FormBorder;font-family:Verdana; font-size:11px");
          int _jspx_eval_html_select_0 = _jspx_th_html_select_0.doStartTag();
          if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
              out = _bc;
              _jspx_th_html_select_0.setBodyContent(_bc);
              _jspx_th_html_select_0.doInitBody();
            }
            do {
              out.write("\r\n\r\n\t\t\t\t\t\t\t");
              out.write("<option value=\"\">SELECT");
              out.write("</option>\r\n\t\t\t\t\t\t\t");

							ArrayList arrList=(ArrayList)session.getAttribute("distinctList");
							for( int i=0;i<arrList.size();i++) {
							String[] strArr = (String[])arrList.get(i);
							System.out.println("inside search page==="+strArr[0]);
							if(strArr[0] != null)
							{
							
              out.write("\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");
              out.write("<option value= \"");
              out.print( strArr[0]);
              out.write("\" >");
              out.print( strArr[0]);
              out.write("</option>\r\n\t\t\t\t\t\t\t");
 
							}
							}	
							
              out.write("\t\r\n\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = pageContext.popBody();
          }
          if (_jspx_th_html_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_style_size_property_name.reuse(_jspx_th_html_select_0);
          out.write("\r\n\t\t\t\t\t\t\t");
          out.write("</td>\t\t");
          out.write("</tr>\r\n\t\t");
          out.write("<tr bgcolor=\"C8DFFF\">   \r\n\t\t\t\t\t\t\t");
          out.write("<td width=\"26%\" align=\"right\">\r\n\t\t\t\t\t\t\t");
          out.write("<font face=\"Verdana\" size=\"1\">");
          out.write("<b>Acronym: ");
          out.write("</b>");
          out.write("</font>");
          out.write("</td>\r\n\t\t\t\t\t\t\t");
          out.write("<td>\r\n\t\t\t\t\t\t\t");
          /* ----  html:select ---- */
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_1 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_1.setPageContext(pageContext);
          _jspx_th_html_select_1.setParent(_jspx_th_html_form_0);
          _jspx_th_html_select_1.setName("CMSFormBean");
          _jspx_th_html_select_1.setProperty("acronym");
          _jspx_th_html_select_1.setSize("1");
          _jspx_th_html_select_1.setStyle("WIDTH: 170px; HEIGHT: 22px;FormBorder;font-family:Verdana; font-size:11px");
          int _jspx_eval_html_select_1 = _jspx_th_html_select_1.doStartTag();
          if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
              out = _bc;
              _jspx_th_html_select_1.setBodyContent(_bc);
              _jspx_th_html_select_1.doInitBody();
            }
            do {
              out.write("\r\n\r\n\t\t\t\t\t\t\t");
              out.write("<option value=\"\">SELECT");
              out.write("</option>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");

							ArrayList arrList=(ArrayList)session.getAttribute("distinctList");
							for( int i=0;i<arrList.size();i++) {
							String[] strArr = (String[])arrList.get(i);
							System.out.println("inside search page==="+strArr[0]);
							if(strArr[1] != null)
							{
							
              out.write("\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");
              out.write("<option value= \"");
              out.print( strArr[1]);
              out.write("\" >");
              out.print( strArr[1]);
              out.write("</option>\r\n\t\t\t\t\t\t\t");
 
							}
							}	
							
              out.write("\t\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = pageContext.popBody();
          }
          if (_jspx_th_html_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_style_size_property_name.reuse(_jspx_th_html_select_1);
          out.write("\r\n\t\t\t\t\t\t\t");
          out.write("</td>\t\t");
          out.write("</tr>\t\t\r\n\t\t");
          out.write("<tr bgcolor=\"C8DFFF\">   \r\n\t\t\t\t\t\t\t");
          out.write("<td width=\"26%\" align=\"right\">\r\n\t\t\t\t\t\t\t");
          out.write("<font face=\"Verdana\" size=\"1\">");
          out.write("<b>Nick name:");
          out.write("</b>");
          out.write("</font>");
          out.write("</td>\r\n\t\t\t\t\t\t\t");
          out.write("<td>\r\n\t\t\t\t\t\t\t");
          /* ----  html:select ---- */
          org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_2 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
          _jspx_th_html_select_2.setPageContext(pageContext);
          _jspx_th_html_select_2.setParent(_jspx_th_html_form_0);
          _jspx_th_html_select_2.setName("CMSFormBean");
          _jspx_th_html_select_2.setProperty("nickName");
          _jspx_th_html_select_2.setSize("1");
          _jspx_th_html_select_2.setStyle("WIDTH: 170px; HEIGHT: 22px;FormBorder;font-family:Verdana; font-size:11px");
          int _jspx_eval_html_select_2 = _jspx_th_html_select_2.doStartTag();
          if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
              out = _bc;
              _jspx_th_html_select_2.setBodyContent(_bc);
              _jspx_th_html_select_2.doInitBody();
            }
            do {
              out.write("\r\n\r\n\t\t\t\t\t\t\t");
              out.write("<option value=\"\">SELECT");
              out.write("</option>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");

							ArrayList arrList=(ArrayList)session.getAttribute("distinctList");
							for( int i=0;i<arrList.size();i++) {
							String[] strArr = (String[])arrList.get(i);
							System.out.println("inside search page**********==="+strArr[0]);
							if(strArr[2] != null)
							{
							
              out.write("\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");
              out.write("<option value= \"");
              out.print( strArr[2]);
              out.write("\" >");
              out.print( strArr[2]);
              out.write("</option>\r\n\t\t\t\t\t\t\t");
 
							}
							}	
							
              out.write("\t\t\r\n\t\t\t\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_select_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_select_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = pageContext.popBody();
          }
          if (_jspx_th_html_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_select_style_size_property_name.reuse(_jspx_th_html_select_2);
          out.write("\r\n\t\t\t\t\t\t\t");
          out.write("</td>\t\t");
          out.write("</tr>\r\n\t\t\r\n\t\t\r\n\t\t");
          out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t\t\t\t");
          out.write("<td width=\"26%\" align=\"right\">\r\n\t\t\t\t\t\t\t");
          out.write("<font face=\"Verdana\" size=\"1\">");
          out.write("<b>Expiry Date On or Before:");
          out.write("</b>");
          out.write("</font>\r\n\t\t\t\t\t\t\t");
          out.write("<td width=\"28%\" align=\"left\">");
          if (_jspx_meth_html_text_0(_jspx_th_html_form_0, pageContext))
            return;
          out.write("\r\n\t\t\t\t\t\t\t");
          out.write("<button type=\"reset\" id=\"f_trigger_b1\">...");
          out.write("</button> ");
          out.write("</td>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t");
          out.write("</tr>\r\n\t\t\r\n\t\t");
          out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t\t\t\t");
          out.write("<td width=\"26%\" align=\"right\">");
          out.write("<font face=\"Verdana\" size=\"1\">");
          out.write("<b> STATUS");
          out.write("</b>");
          out.write("</font>\r\n\t\t\t\t\t\t\t");
          out.write("</td>\r\n\t\t\t\t\t\t\t");
          out.write("<td>\r\n\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_3(_jspx_th_html_form_0, pageContext))
            return;
          out.write("\r\n\t\t\t\t\t\t\t");
          out.write("</td>\r\n\t\t\t\t\t\t\t");
          out.write("</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t");
          out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t\t\t\t");
          out.write("<td width=\"26%\" align=\"right\">");
          out.write("<font face=\"Verdana\" size=\"1\">");
          out.write("<b> TYPE");
          out.write("</b>");
          out.write("</font>\r\n\t\t\t\t\t\t\t");
          out.write("</td>\r\n\t\t\t\t\t\t\t");
          out.write("<td>\r\n\t\t\t\t\t\t\t");
          if (_jspx_meth_html_select_4(_jspx_th_html_form_0, pageContext))
            return;
          out.write("\r\n\t\t\t\t\t\t\t");
          out.write("</td>\r\n\t\t\t\t\t\t\t");
          out.write("</tr>\r\n      ");
          out.write("</table>\r\n      ");
          out.write("<table border=\"0\"  cellpadding=\"5\" cellspacing=\"1\"   bgcolor=\"white\"   width=\"80%\" align=\"center\">\r\n\t\r\n\t\t\t\t        ");
          out.write("<tr bgcolor=\"C8DFFF\">\r\n\t\t\t\t\t\t");
          out.write("<td align=\"center\" colspan=\"2\">\t\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t");
          out.write("<input type=\"button\" value=\"Search\" onclick=\"CheckForm()\"/>&nbsp;\t\r\n\t\t\t\t\t\t");
          if (_jspx_meth_html_reset_0(_jspx_th_html_form_0, pageContext))
            return;
          out.write("</td>\r\n\t\t\t\t\t  ");
          out.write("</tr>\t\t\r\n\t\t\t\t\t  \t\t\r\n\t\r\n\t ");
          out.write("</table>\r\n      ");
          int evalDoAfterBody = _jspx_th_html_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_html_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_html_form_enctype_action.reuse(_jspx_th_html_form_0);
      out.write("\r\n\t");
      out.write("</body>\r\n");
      out.write("</html>\r\n\r\n");
      out.write("<script type=\"text/javascript\">\r\n     Calendar.setup({\r\n         inputField     :    \"expBefDate\",      // id of the input field\r\n         ifFormat       :    \"%m-%d-%Y \",       // format of the input field\r\n                   // will display a time selector\r\n         daFormat\t\t:    \"%d-%b-%Y \",      \r\n         button         :    \"f_trigger_b1\",   // trigger for the calendar (button ID)\r\n         singleClick    :    false,           // double-click mode\r\n         step           :    1                // show all years in drop-down boxes (instead of every other year as default)\r\n     });\r\n ");
      out.write("</script>\r\n \r\n \r\n ");
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_size_readonly_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(pageContext);
    _jspx_th_html_text_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_0.setName("CMSFormBean");
    _jspx_th_html_text_0.setProperty("expBefDate");
    _jspx_th_html_text_0.setSize("20");
    _jspx_th_html_text_0.setReadonly(true);
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_size_readonly_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_html_select_3(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:select ---- */
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_3 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_3.setPageContext(pageContext);
    _jspx_th_html_select_3.setParent(_jspx_th_html_form_0);
    _jspx_th_html_select_3.setName("CMSFormBean");
    _jspx_th_html_select_3.setProperty("status");
    _jspx_th_html_select_3.setSize("1");
    _jspx_th_html_select_3.setStyle("FormBorder;font-family:Verdana; font-size:11px");
    int _jspx_eval_html_select_3 = _jspx_th_html_select_3.doStartTag();
    if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_select_3.setBodyContent(_bc);
        _jspx_th_html_select_3.doInitBody();
      }
      do {
        out.write("\r\n\r\n\t\t\t\t\t\t\t");
        out.write("<option value=\"\">SELECT");
        out.write("</option>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");
        out.write("<option value=\"ACTIVE\">ACTIVE");
        out.write("</option>\r\n\t\t\t\t\t\t\t");
        out.write("<option value=\"RENEWAL\">RENEWAL");
        out.write("</option>\r\n\t\t\t\t\t\t\t");
        out.write("<option value=\"INACTIVE\">INACTIVE");
        out.write("</option>\r\n\t\t\t\t\t\t\t");
        out.write("<option value=\"EXPIRED\">EXPIRED");
        out.write("</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_style_size_property_name.reuse(_jspx_th_html_select_3);
    return false;
  }

  private boolean _jspx_meth_html_select_4(javax.servlet.jsp.tagext.Tag _jspx_th_html_form_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:select ---- */
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_4 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_4.setPageContext(pageContext);
    _jspx_th_html_select_4.setParent(_jspx_th_html_form_0);
    _jspx_th_html_select_4.setName("CMSFormBean");
    _jspx_th_html_select_4.setProperty("type");
    _jspx_th_html_select_4.setSize("1");
    _jspx_th_html_select_4.setStyle("FormBorder;font-family:Verdana; font-size:11px");
    int _jspx_eval_html_select_4 = _jspx_th_html_select_4.doStartTag();
    if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_select_4.setBodyContent(_bc);
        _jspx_th_html_select_4.doInitBody();
      }
      do {
        out.write("\r\n\r\n\t\t\t\t\t\t\t");
        out.write("<option value=\"\">SELECT");
        out.write("</option>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");
        out.write("<option value=\"INTERNAL\">INTERNAL");
        out.write("</option>\r\n\t\t\t\t\t\t\t");
        out.write("<option value=\"EXTERNAL\">EXTERNAL");
        out.write("</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_html_select_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_html_select_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = pageContext.popBody();
    }
    if (_jspx_th_html_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_select_style_size_property_name.reuse(_jspx_th_html_select_4);
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
