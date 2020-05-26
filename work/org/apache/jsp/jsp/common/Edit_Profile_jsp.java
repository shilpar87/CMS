package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;

public class Edit_Profile_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_select_style_size_property_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_messages_message_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;

  public Edit_Profile_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_select_style_size_property_name = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_option_value = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_messages_message_id = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_bean_write_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_errors_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_logic_iterate_name_id = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_bean_write_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_select_style_size_property_name.release();
    _jspx_tagPool_html_option_value.release();
    _jspx_tagPool_html_text_property_name_nobody.release();
    _jspx_tagPool_html_messages_message_id.release();
    _jspx_tagPool_bean_write_name_nobody.release();
    _jspx_tagPool_html_errors_nobody.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n\r\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\r\n\r\n\tfunction vali_resource(){\r\n\tdocument.forms[0].action=\"CMSAction.do?methodToCall=editProfGroupNew\";\r\n\tdocument.forms[0].submit();\r\n\treturn true;\r\n\t}\r\n\t\r\n\tfunction submitGroup(){\r\n\t\tdocument.forms[0].action=\"/CMSAction.do?methodToCall=editProfile\";\r\n\t\tdocument.forms[0].submit();\r\n\t\treturn true;\r\n\t}\r\n\t\r\nfunction Display(){\r\n\tvar agree=confirm(\"Are you sure you wish to continue?\");\r\n    if(agree){    \t\t\r\n\t\t\tdocument.forms[0].action =\"CMSAction.do?methodToCall=editProfile\";\r\n\t\t\tdocument.forms[0].submit();\t    \t\t\r\n\t\t\treturn true;\r\n    \t\t}      \t\t\t\r\n}\r\n\r\nfunction DelGroup()\r\n{\r\n\t\tif(checkRadio() == false)\r\n\t    {\r\n\t     alert (\"Please select a Group to be Deleted !!\")\r\n\t     return \t\r\n\t     }\t          \r\n         document.forms[0].action =\"CMSAction.do?methodToCall=deleteGroup\";\r\n\t  \t document.forms[0].submit();\t \t\t  \r\n\t  \t\r\n }\r\n\r\nfunction callMultiply(){\r\n              alert(\"inside call multiply \" + document.getElementById(\"selectGroup\").value);\r\n              get_radio_value();\r\n");
      out.write("              checkRadio();\r\n              document.forms[0].action =\"CMSAction.do?methodToCall=editProfileGroup\";\r\n               document.forms[0].submit();\t\r\n                                      \r\n               }\r\n               \r\nfunction get_radio_value()\r\n{\r\n\tif(document.forms[0].selectGroup.length > 1)\r\n\t{\r\n\tfor (var i=0; i ");
      out.write("< document.forms[0].selectGroup.length; i++)\r\n   \t{\r\n  \t //alert(document.forms[0].selectCert.length)\r\n \t  if (document.forms[0].selectGroup[i].checked)    \r\n   \t   {\r\n   \t   var rad_val = document.forms[0].selectGroup[i].value;\r\n       //alert(\"selected id:  \"+rad_val);\r\n       var temp=rad_val;\r\n     //  alert(rad_val);\r\n      document.forms[0].selAppName.value=rad_val;\r\n\t   var acronym=temp+'ac'+i;\r\n\t    //   alert(\" acrnom==> \"+document.getElementById(acronym).value);\r\n\t   document.forms[0].selAcronym.value=document.getElementById(acronym).value;\r\n\t  // alert(document.forms[0].selAcronym.value);\t   \r\n       return rad_val;\r\n      }\r\n      \r\n   }\r\n   }\r\n   else \r\n   {\r\n   var app=document.forms[0].selectGroup.value;\r\n   var acronym=app+'ac'+0;\r\n   document.forms[0].selAppName.value=document.forms[0].selectGroup.value;\r\n   document.forms[0].selAcronym.value=document.getElementById(acronym).value;\r\n   return document.forms[0].selectGroup.value;\r\n   \r\n   }\r\n}\r\n\r\n\r\n\r\nfunction EditGroup(act)\r\n{\r\n\t\tif(checkRadio() == false)\r\n");
      out.write("\t    {\r\n\t     alert (\"Please select  a Group !!\")\r\n\t     return \t\r\n\t     }else{\r\n\t     //alert(\"Edit --- act\"+act);\r\n\t     document.forms[0].actbut.value=act;\r\n\t     var url = \"CMSAction.do?methodToCall=checkAuth\";\r\n\t     postRequest(url,'editform');\t     \t\r\n\t     }\r\n }\r\n/////////Ajax call//////////\r\n\tfunction postRequest(strURL,nameOfFormToPost){\r\n               strURL=strURL+getFormAsString(nameOfFormToPost);\r\n               \r\n             \t//alert(\" uri == \"+strURL);\r\n                var http_request;\r\n                try{\r\n\t\t\t\trequest_send = new XMLHttpRequest();                 // This is for browsers like Opera and Mozilla\r\n\t\t\t    }\r\n\t\t\t    catch(trymicrosoft){\r\n\t\t\t\t  try{\r\n\t\t\t\t\thttp_request = new ActiveXObject(\"Msxml2.XMLHTTP\");      // This is for IE\r\n\t\t\t\t  }catch(othermicrosoft){\r\n\t\t\t\t\t  try{\r\n\t\t\t\t\t\thttp_request = new ActiveXObject(\"Microsoft.XMLHTTP\");  // This is for IE also\r\n\t\t\t\t\t  }catch(failed){\r\n\t\t\t\t\t\t      http_request = null;\r\n\t\t\t\t\t  }\r\n\t\t\t\t   }\r\n\t\t\t    }\r\n\t\t\t\tif(http_request == null){\r\n\t\t\t\t\talert(\"Error in creating the request object\");\r\n");
      out.write("\t\t\t\t}\r\n\t\t\t\telse\r\n\t\t\t\t{\r\n\t\t\t\thttp_request.open('POST', strURL, true);\r\n\t\t\t\thttp_request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');\r\n\t\t\t\r\n\t\t\t\thttp_request.onreadystatechange = function(){\r\n\t\t\t\tvar ready_status=http_request.readyState;\r\n\t\t\t\tif (ready_status == 4) \r\n        \t\t{\r\n\t   \t\t\t\tvar status_response=http_request.status;\r\n            \t\tif(status_response == 200 ){\r\n            \t\t\r\n            \t\t\tvar total_result=http_request.responseText;\r\n            \t\t\t updatepage(total_result);\r\n            \t\t}\r\n\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\thttp_request.send(strURL);\r\n              }\r\n              }\r\n        ////gen url////\r\n    function getFormAsString(formName){ \t\r\n \t//Setup the return String\r\n \treturnString =\"\";\r\n \t\r\n  \t//Get the form values\r\n \tformElements=document.forms[formName].elements;\r\n \t\r\n \t//loop through the array , building up the url\r\n \t//in the form /strutsaction.do&name=value\r\n \t\r\n \tfor ( var i=formElements.length-1; i>=0; --i ){\r\n \t\t//we escape (encode) each value\r\n \t\treturnString=returnString+\"&\"+escape(formElements[i].name)+\"=\"+escape(formElements[i].value);\r\n");
      out.write(" \t}\r\n \t\r\n \t//return the values\r\n \treturn returnString; \r\n }\r\n //////wrint resp of Ajax//////\r\n \tfunction updatepage(str){ \t\r\n       if(str==''){\r\n          alert(\"You Are Not A Member Of This Group To Edit/Remove \");\r\n          //return false;\r\n        }\r\n        else if(str=='B'){\r\n           alert(\"You Are Not Authorized To Edit/Remove This Group\");\r\n           //return false;\r\n        }\r\n        else if(str=='exp'){\r\n           alert(\"Please try after some time Database having Problem\");\r\n           //return false;\r\n        }\r\n        else{\r\n            var act=document.forms[0].actbut.value;\r\n            if(act=='edit'){\r\n            \t//alert(\"act\"+act);\r\n            \tdocument.forms[0].action =\"CMSAction.do?methodToCall=editProfileGroup\";\r\n\t  \t\t \tdocument.forms[0].submit();\r\n             }\r\n             else if(act=='delete'){\r\n               \t//alert(\" call for Remove gropu\");\r\n             \tdocument.forms[0].action =\"CMSAction.do?methodToCall=deleteGroup\";\r\n\t  \t\t\tdocument.forms[0].submit();\r\n             }\r\n");
      out.write("          }\r\n       }\r\n//////////////////////\r\n\tfunction checkRadio()\r\n\t{\r\n\t\r\n\t var GroupList = new Array()\r\n\t\t  obj=document.forms[0].selectGroup\r\n\t\t  var len = document.forms[0].length;\r\n\t\t // alert(len)\r\n\t\t    var k=0\r\n\t\t\tvar cnt = 0;\r\n\t\t\t//alert('length= '+len);\r\n\t\t\tfor(i=0;i");
      out.write("<len;i++)\r\n\t\t\t{\r\n\t\t\t\tif(document.forms[0].elements[i].type=='radio')\r\n\t\t\t\t{\r\n\t\t\t\t\tif(document.forms[0].elements[i].name=='selectGroup')\r\n\t\t\t\t\t{\r\n\t\t\t\t\t\tif(document.forms[0].elements[i].checked==true)\r\n\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t//alert(document.forms[0].elements[i+1].value)\r\n\t\t\t\t\t\t  \r\n\t\t\t\t\t\t  if(document.forms[0].elements[i+1].value >= 1 )\r\n\t\t\t\t\t\t   {\r\n\t\t\t\t\t\t   \t\t//alert(document.forms[0].elements[i+1].value)\r\n\t\t\t\t\t\t   \t\t//alert(\"You can't delete approved PAF\")\r\n\t\t\t\t\t\t   \t\t return false\r\n\t\t\t\t\t\t    }\r\n\t\t\t\t\t\t\t//document.forms[0].checklevel.checked=true;\r\n\t\t\t\t\t\t\t//alert('value of check box '+ document.forms[0].checklevel[i].value);\r\n\t\t\t\t\t\t\tcnt= cnt+1;\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\tif(cnt==0)\r\n\t\t\t{\r\n \t\t\t\treturn false\r\n\t\t\t}\r\n\t}\r\n\t\r\n\tfunction checkRadioRadio()\r\n\t{   \r\n\t\tvar flag=false;\r\n\t\tif(document.forms[0].selectGroup.length > 1)\r\n  \t\t {\r\n\t\t\tfor (var i=0; i ");
      out.write("< document.forms[0].selectGroup.length; i++)\r\n\t\t\t{\r\n\t\t\t\t//alert(document.forms[0].selectGroup[i]);\r\n\t\t\t\tif (document.forms[0].selectGroup[i].checked)\r\n\t\t\t\t{\r\n\t\t\t\t\t//alert(document.forms[0].selectGroup[i].value);\r\n     \t\t\t\tflag=true;\r\n    \t\t\t\t alert(flag)\r\n    \t\t\t }\r\n  \t\t\t}\r\n  \t\t}\r\n  \t\telse{\r\n   \t\t if(document.forms[0].selectGroup.checked)\r\n   \t\t {\r\n   \t\t\t  flag=true;\r\n     \t  }\r\n  \t\t}\r\n  \t\tif(flag==false)\r\n  \t\t{\r\n  \t\t\t alert(\"select a row\")\r\n   \t\t \t //alert(flag)\r\n\t\t \treturn flag;\r\n\t\t }\r\n\t\t return flag;\r\n\t}\r\n");
      out.write("</script>\r\n\r\n\r\n\r\n");
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
          out.write("</head>\r\n\r\n\r\n");
          out.write("<body>\r\n");
          out.write("<form action=\"CMSAction.do?methodToCall=editProfile\" method='post' name='editform'>\r\n\t");
          out.write("<table border=\"0\" align=\"center\" width=\"37%\" >\r\n\t\r\n\t\t\r\n\t\t");
          out.write("<tr>\t\t\r\n\t\t");
          out.write("<td align=\"center\" valign=\"top\" bgcolor=\"336699\">");
          out.write("<u>");
          out.write("<font size=\"4\" color=\"FFFFFF\">");
          out.write("<b> Create/Update Profile ");
          out.write("</b>");
          out.write("</font>");
          out.write("</u> ");
          out.write("</td> \r\n    \t");
          out.write("</tr>\r\n\t\t");
          out.write("<tr>");
          out.write("<td>&nbsp");
          out.write("</td>");
          out.write("</tr>\r\n\t");
          out.write("</table>\r\n\t");
          out.write("<table align=\"center\" width=\"50%\"  >\t\r\n\t\t");
          out.write("<tr bgcolor=\"DFECFF\">\t\t\r\n\t\t\t");
          out.write("<input type=\"hidden\" name=\"selAcronym\" />\r\n\t\t\t");
          out.write("<input type=\"hidden\" name=\"selAppName\" />\r\n\t\t\t");
          out.write("<input type=\"hidden\" name=\"actbut\" value=''/>\r\n\t\t");
          out.write("<td align=\"center\" >");
          out.write("<font size=\"2\" color=\"1C50A2\" >");
          out.write("<b>Group Name");
          out.write("</b>");
          out.write("</font>");
          out.write("</td>\r\n\t\t");
          out.write("<td align=\"center\">\r\n\t\t");
          if (_jspx_meth_html_select_0(_jspx_th_html_html_0, pageContext))
            return;
          out.write("\r\n      \t");
          if (_jspx_meth_html_text_0(_jspx_th_html_html_0, pageContext))
            return;
          out.write("\t\r\n      \t");
          out.write("</td>\r\n      \t");
          out.write("</tr>\r\n      \t\r\n      \t");
          out.write("<tr bgcolor=\"DFECFF\">\r\n      \t");
          out.write("<td >&nbsp;");
          out.write("</td>      \t\r\n      \t");
          out.write("<td align=\"center\">");
          out.write("<input type= \"button\" style=\"font-size: 1.05em; padding: 0.03em; width:90px\" name = \"find_grp\" value =\"Find Group\" onclick='Display()'/>");
          out.write("</td>\r\n\t\t");
          out.write("</tr>\r\n\t\t");
          out.write("<tr bgcolor=\"FFFFFF\">");
          out.write("<td>&nbsp");
          out.write("</td>");
          out.write("<td>&nbsp");
          out.write("</td>");
          out.write("</tr>\r\n\t");
          out.write("</table>\r\n\t\t \r\n\t");
          out.write("<table width=\"50%\" align=\"center\" >\r\n\t\t ");
          out.write("<tr>");
          out.write("<td>");
          /* ----  html:messages ---- */
          org.apache.struts.taglib.html.MessagesTag _jspx_th_html_messages_0 = (org.apache.struts.taglib.html.MessagesTag) _jspx_tagPool_html_messages_message_id.get(org.apache.struts.taglib.html.MessagesTag.class);
          _jspx_th_html_messages_0.setPageContext(pageContext);
          _jspx_th_html_messages_0.setParent(_jspx_th_html_html_0);
          _jspx_th_html_messages_0.setMessage("true");
          _jspx_th_html_messages_0.setId("mess");
          int _jspx_eval_html_messages_0 = _jspx_th_html_messages_0.doStartTag();
          if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.String mess = null;
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
              out = _bc;
              _jspx_th_html_messages_0.setBodyContent(_bc);
              _jspx_th_html_messages_0.doInitBody();
            }
            mess = (java.lang.String) pageContext.findAttribute("mess");
            do {
              out.write("\r\n\t\t \t\t\t");
              out.write("<table width=\"50%\" cellpadding=\"1\" align=\"center\" border=\"1\" bordercolor=\"336699\" >\r\n\t\t\t\t\t\t");
              out.write("<tr>");
              out.write("<td align=\"center\">");
              out.write("<font size=\"3\" color=\"336699\">");
              out.write("<b>");
              if (_jspx_meth_bean_write_0(_jspx_th_html_messages_0, pageContext))
                return;
              out.write("</b>");
              out.write("</font>");
              out.write("</td>");
              out.write("</tr>\r\n\t\t\t\t\t");
              out.write("</table>\r\n\t\t\t\t");
              int evalDoAfterBody = _jspx_th_html_messages_0.doAfterBody();
              mess = (java.lang.String) pageContext.findAttribute("mess");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_html_messages_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = pageContext.popBody();
          }
          if (_jspx_th_html_messages_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_html_messages_message_id.reuse(_jspx_th_html_messages_0);
          out.write("\r\n\t\t");
          out.write("</td>");
          out.write("</tr>\r\n\t\t");
          out.write("<tr bordercolor=\"CC0033\">\r\n\t\t");
          out.write("<td align=\"center\" bgcolor=\"FFFFCC\">");
          out.write("<FONT size=\"4\" color=\"CC0033\">");
          out.write("<b>");
          if (_jspx_meth_html_errors_0(_jspx_th_html_html_0, pageContext))
            return;
          out.write("</b>");
          out.write("</FONT>\r\n\t\t");
          out.write("</td>\r\n\t");
          out.write("</table>\r\n\t\t\t\r\n\t\t\t");
  ArrayList al=new ArrayList();
				int groupSize = 0;
			    //System.out.println(session.getAttribute("groupList"));
			    if(session.getAttribute("groupList")!=null)
 				{al=(ArrayList)session.getAttribute("groupList"); 				
 				System.out.println("size is -->"+ al.size());
 				}	
			    if (session.getAttribute("groupListSize") != null){
			  		String groupListSize= session.getAttribute("groupListSize").toString();				
					groupSize = Integer.parseInt(groupListSize);				
			  		System.out.println("inside update page---Group Size ...>"+groupSize);
				}
			    if( groupSize > 0 ){			    	
			    
				
          out.write("\r\n\t\t\t\t\r\n\t\t");
          out.write("<table width=\"50%\" align=\"center\" border=\"1\" bordercolor=\"3377CC\" bgcolor=\"DFECFF\" cellspacing=\"1\">\t\t\r\n\t\t");
          out.write("<tr >\r\n\t\t\t");
          out.write("<td align=\"center\">");
          out.write("<font size=\"2\" color=\"1C50A2\" >");
          out.write("<b>Groups ");
          out.write("</b>");
          out.write("</font>");
          out.write("</td>\r\n\t\t\t\t\r\n \t\t\t");
          out.write("<td width=\"50%\" align=\"center\" > \r\n \t\t\t");
          out.write("<div style=\"overflow:auto;width:300px; height:100px; table-layout:fixed;\">\r\n \t\t\t\r\n \t\t\t");
          out.write("<table>\r\n\t\t\t");
int x=0;
          out.write("\r\n \t\t\t");
          /* ----  logic:iterate ---- */
          org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
          _jspx_th_logic_iterate_0.setPageContext(pageContext);
          _jspx_th_logic_iterate_0.setParent(_jspx_th_html_html_0);
          _jspx_th_logic_iterate_0.setId("groupList");
          _jspx_th_logic_iterate_0.setName("groupList");
          int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
          if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            java.lang.Object groupList = null;
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
              out = _bc;
              _jspx_th_logic_iterate_0.setBodyContent(_bc);
              _jspx_th_logic_iterate_0.doInitBody();
            }
            groupList = (java.lang.Object) pageContext.findAttribute("groupList");
            do {
              out.write("\r\n\t\t\t");
              out.write("<tr>\r\n\t\t\t\t\t   \r\n\t\t    ");
              out.write("<td align=\"center\">\r\n\t\t    ");
              out.write("<input type=\"radio\" id=\"groupId\" name=\"selectGroup\" value=\"");
              if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("\" onclick=\"get_radio_value()\"  />\r\n\t\t   \r\n\t\t    \r\n\t\t    ");
              out.write("<td id=\"");
              if (_jspx_meth_bean_write_2(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("\" >");
              out.write("<input type=\"hidden\" value=\"");
              if (_jspx_meth_bean_write_3(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("\" name=\"");
              if (_jspx_meth_bean_write_4(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("\">\r\n\t          \t");
              out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
              if (_jspx_meth_bean_write_5(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("\t\t          \r\n\t\t         ");
              out.write("</font>\t\t        \r\n  \t\t\t ");
              out.write("</td>\r\n  \t\t\t ");
              out.write("<td>&nbsp;");
              out.write("</td>  \t\t\t \r\n\t\t    ");
              out.write("<td id=\"");
              if (_jspx_meth_bean_write_6(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("\" >");
              out.write("<input type=\"hidden\" value=\"");
              if (_jspx_meth_bean_write_7(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("\" name=\"");
              if (_jspx_meth_bean_write_8(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("ac");
              out.print(x);
              out.write("\">\r\n\t          \t");
              out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
              if (_jspx_meth_bean_write_9(_jspx_th_logic_iterate_0, pageContext))
                return;
              out.write("\t\t          \r\n\t\t         ");
              out.write("</font>\r\n\t\t         \r\n\t\t      ");
              out.write("</td>\r\n \t\t\t");
              out.write("</tr> ");
x=x+1;
              out.write("\r\n \t\t\t");
              int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
              groupList = (java.lang.Object) pageContext.findAttribute("groupList");
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = pageContext.popBody();
          }
          if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
          out.write("\r\n\r\n\t\t     ");
          out.write("</table>\r\n \t\t\t");
          out.write("</div>\r\n \t\t\t");
session.removeAttribute("groupListSize");
 				}
			    else{
 			
          out.write("\r\n \t\t\t\t\t");
          out.write("<table>");
          out.write("<tr bgcolor=\"C8DFFF\" >");
          out.write("<td>\r\n\t\t\t\t");

					}
			    
          out.write("\r\n\t\t\t");
          out.write("</td>\r\n\t\t");
          out.write("</tr>\r\n       \r\n\t\t\t\r\n        \r\n        ");
          out.write("</table>\r\n\t  \t\r\n\t\t");
          out.write("<table align=\"center\" width=\"50%\">\t  \t\r\n\t  \t\t");
          out.write("<tr>");
          out.write("<td>&nbsp");
          out.write("</td>");
          out.write("<td>&nbsp");
          out.write("</td>");
          out.write("</tr>\r\n\t  \t\t");
          out.write("<tr>\t  \t\r\n\t  \t\t");
          out.write("<td>");
          out.write("<input type = \"button\"  name = \"create_new_grp\" style=\"font-size: 1.04em; padding: 0.03em; width:122px\" value = \"Create New Group\" onclick='vali_resource()'>");
          out.write("</td>\r\n\t  \t\t");
          out.write("<td>");
          out.write("<input type = \"button\" name = \"edit_sel_grp\"  style=\"font-size: 1.04em; padding: 0.03em; width:142px\" value = \"Edit Selected Group\" onclick='EditGroup(\"edit\")' >");
          out.write("</td>\r\n\t  \t\t");
          out.write("<td>");
          out.write("<input type = \"button\" name = \"removeselgrp\" style=\"font-size: 1.04em; padding: 0.03em; width:162px\" value = \"Remove Selected Group\" onclick='EditGroup(\"delete\")'>");
          out.write("</td>\r\n\t  \t\t");
          out.write("</tr>\r\n\t  \t");
          out.write("</table>\r\n\t");
          out.write("</td>\t\r\n\t");
          out.write("</tr>\r\n\t");
          out.write("</table>\r\n");
          out.write("</form>  \t\t  \t  \t\r\n\r\n");
          out.write("</body>\t\r\n");
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

  private boolean _jspx_meth_html_select_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_html_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:select ---- */
    org.apache.struts.taglib.html.SelectTag _jspx_th_html_select_0 = (org.apache.struts.taglib.html.SelectTag) _jspx_tagPool_html_select_style_size_property_name.get(org.apache.struts.taglib.html.SelectTag.class);
    _jspx_th_html_select_0.setPageContext(pageContext);
    _jspx_th_html_select_0.setParent(_jspx_th_html_html_0);
    _jspx_th_html_select_0.setName("CMSFormBean");
    _jspx_th_html_select_0.setProperty("selectGroupName");
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
        out.write("\t\t\t\t\r\n      \t\t");
        if (_jspx_meth_html_option_0(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n      \t\t");
        if (_jspx_meth_html_option_1(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n      \t\t");
        if (_jspx_meth_html_option_2(_jspx_th_html_select_0, pageContext))
          return true;
        out.write("\r\n      \t");
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
    _jspx_th_html_option_0.setValue("Starts With");
    int _jspx_eval_html_option_0 = _jspx_th_html_option_0.doStartTag();
    if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_0.setBodyContent(_bc);
        _jspx_th_html_option_0.doInitBody();
      }
      do {
        out.write("Starts With");
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
    _jspx_th_html_option_1.setValue("Is Exactly");
    int _jspx_eval_html_option_1 = _jspx_th_html_option_1.doStartTag();
    if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_1.setBodyContent(_bc);
        _jspx_th_html_option_1.doInitBody();
      }
      do {
        out.write("Is Exactly");
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
    _jspx_th_html_option_2.setValue("Contains");
    int _jspx_eval_html_option_2 = _jspx_th_html_option_2.doStartTag();
    if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_html_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
        out = _bc;
        _jspx_th_html_option_2.setBodyContent(_bc);
        _jspx_th_html_option_2.doInitBody();
      }
      do {
        out.write("Contains");
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

  private boolean _jspx_meth_html_text_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_html_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:text ---- */
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(pageContext);
    _jspx_th_html_text_0.setParent(_jspx_th_html_html_0);
    _jspx_th_html_text_0.setName("CMSFormBean");
    _jspx_th_html_text_0.setProperty("groupString");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_messages_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(pageContext);
    _jspx_th_bean_write_0.setParent(_jspx_th_html_messages_0);
    _jspx_th_bean_write_0.setName("mess");
    int _jspx_eval_bean_write_0 = _jspx_th_bean_write_0.doStartTag();
    if (_jspx_th_bean_write_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_name_nobody.reuse(_jspx_th_bean_write_0);
    return false;
  }

  private boolean _jspx_meth_html_errors_0(javax.servlet.jsp.tagext.Tag _jspx_th_html_html_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  html:errors ---- */
    org.apache.struts.taglib.html.ErrorsTag _jspx_th_html_errors_0 = (org.apache.struts.taglib.html.ErrorsTag) _jspx_tagPool_html_errors_nobody.get(org.apache.struts.taglib.html.ErrorsTag.class);
    _jspx_th_html_errors_0.setPageContext(pageContext);
    _jspx_th_html_errors_0.setParent(_jspx_th_html_html_0);
    int _jspx_eval_html_errors_0 = _jspx_th_html_errors_0.doStartTag();
    if (_jspx_th_html_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_errors_nobody.reuse(_jspx_th_html_errors_0);
    return false;
  }

  private boolean _jspx_meth_bean_write_1(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_1 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_1.setPageContext(pageContext);
    _jspx_th_bean_write_1.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_1.setName("groupList");
    _jspx_th_bean_write_1.setProperty("appName");
    int _jspx_eval_bean_write_1 = _jspx_th_bean_write_1.doStartTag();
    if (_jspx_th_bean_write_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_1);
    return false;
  }

  private boolean _jspx_meth_bean_write_2(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_2 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_2.setPageContext(pageContext);
    _jspx_th_bean_write_2.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_2.setName("groupList");
    _jspx_th_bean_write_2.setProperty("appName");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }

  private boolean _jspx_meth_bean_write_3(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_3 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_3.setPageContext(pageContext);
    _jspx_th_bean_write_3.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_3.setName("groupList");
    _jspx_th_bean_write_3.setProperty("appName");
    int _jspx_eval_bean_write_3 = _jspx_th_bean_write_3.doStartTag();
    if (_jspx_th_bean_write_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_3);
    return false;
  }

  private boolean _jspx_meth_bean_write_4(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_4 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_4.setPageContext(pageContext);
    _jspx_th_bean_write_4.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_4.setName("groupList");
    _jspx_th_bean_write_4.setProperty("appName");
    int _jspx_eval_bean_write_4 = _jspx_th_bean_write_4.doStartTag();
    if (_jspx_th_bean_write_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_4);
    return false;
  }

  private boolean _jspx_meth_bean_write_5(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_5 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_5.setPageContext(pageContext);
    _jspx_th_bean_write_5.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_5.setName("groupList");
    _jspx_th_bean_write_5.setProperty("appName");
    int _jspx_eval_bean_write_5 = _jspx_th_bean_write_5.doStartTag();
    if (_jspx_th_bean_write_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_5);
    return false;
  }

  private boolean _jspx_meth_bean_write_6(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_6 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_6.setPageContext(pageContext);
    _jspx_th_bean_write_6.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_6.setName("groupList");
    _jspx_th_bean_write_6.setProperty("acronym");
    int _jspx_eval_bean_write_6 = _jspx_th_bean_write_6.doStartTag();
    if (_jspx_th_bean_write_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_6);
    return false;
  }

  private boolean _jspx_meth_bean_write_7(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_7 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_7.setPageContext(pageContext);
    _jspx_th_bean_write_7.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_7.setName("groupList");
    _jspx_th_bean_write_7.setProperty("acronym");
    int _jspx_eval_bean_write_7 = _jspx_th_bean_write_7.doStartTag();
    if (_jspx_th_bean_write_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_7);
    return false;
  }

  private boolean _jspx_meth_bean_write_8(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_8 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_8.setPageContext(pageContext);
    _jspx_th_bean_write_8.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_8.setName("groupList");
    _jspx_th_bean_write_8.setProperty("appName");
    int _jspx_eval_bean_write_8 = _jspx_th_bean_write_8.doStartTag();
    if (_jspx_th_bean_write_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_8);
    return false;
  }

  private boolean _jspx_meth_bean_write_9(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_9 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_9.setPageContext(pageContext);
    _jspx_th_bean_write_9.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_9.setName("groupList");
    _jspx_th_bean_write_9.setProperty("acronym");
    int _jspx_eval_bean_write_9 = _jspx_th_bean_write_9.doStartTag();
    if (_jspx_th_bean_write_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_9);
    return false;
  }
}
