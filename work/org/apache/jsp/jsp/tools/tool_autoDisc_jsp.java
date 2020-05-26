package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class tool_autoDisc_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_text_style_size_property_name_nobody;

  public tool_autoDisc_jsp() {
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_text_style_size_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_text_style_size_property_name_nobody.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script language=\"Javascript\">\r\n\r\nfunction submitServer(){\r\n\tif (validate()){\r\n\t\tdocument.forms[0].action =\"");
      out.print(request.getContextPath());
      out.write("/CMSToolAction.do?methodToCall=checkCert\";\r\n\t\tdocument.forms[0].submit();\r\n\t}\r\n\telse\r\n\t\treturn false;\r\n}\r\n\r\nfunction validate(){\r\n\tif( document.forms[0].appServer.value==\"\" ){\r\n\t\t\talert(\"Please enter the Application Server Name.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\telse\r\n\t\treturn true;\r\n}\r\n\r\n\r\n\r\n               //testing for ajax\r\n               function postRequest(strURL,nameOfFormToPost){\r\n               strURL=strURL+getFormAsString(nameOfFormToPost);\r\n              // alert(\" uri == \"+strURL);\r\n                var http_request;\r\n                try{\r\n\t\t\t\trequest_send = new XMLHttpRequest();                 // This is for browsers like Opera and Mozilla\r\n\t\t\t}\r\n\t\t\tcatch(trymicrosoft){\r\n\t\t\t\ttry{\r\n\t\t\t\t\thttp_request = new ActiveXObject(\"Msxml2.XMLHTTP\");      // This is for IE\r\n\t\t\t\t}\r\n\t\t\t\tcatch(othermicrosoft){\r\n\t\t\t\t\ttry{\r\n\t\t\t\t\t\thttp_request = new ActiveXObject(\"Microsoft.XMLHTTP\");  // This is for IE also\r\n\t\t\t\t\t}catch(failed){\r\n\t\t\t\t\t\thttp_request = null;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif(http_request == null){\r\n\t\t\t\talert(\"Error in creating the request object\");\r\n");
      out.write("\t\t\t}\r\n\t\t\telse\r\n\t\t\t{\r\n\t\t\thttp_request.open('POST', strURL, true);\r\n\t\t\thttp_request.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');\r\n\t\t\thttp_request.onreadystatechange = function(){\r\n\t\t\tvar ready_status=http_request.readyState;\r\n\t\t\tif (ready_status == 4) \r\n        \t{\r\n\t   \t\t\tvar status_response=http_request.status;\r\n            \tif(status_response == 200 ){\r\n            \t\tvar total_result=http_request.responseText;\r\n            \t\t//alert(total_result);\r\n            \t\tupdatepage(total_result);\r\n            \t\t}\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\thttp_request.send(strURL);\r\n               }\r\n               }\r\n               ///////\r\n               \r\n     function getFormAsString(formName){\r\n \t\r\n \t//Setup the return String\r\n \treturnString =\"\";\r\n \t\r\n  \t//Get the form values\r\n \tformElements=document.forms[formName].elements;\r\n \t\r\n \t//loop through the array , building up the url\r\n \t//in the form /strutsaction.do&name=value\r\n \t\r\n \tfor ( var i=formElements.length-1; i>=0; --i ){\r\n \t\t//we escape (encode) each value\r\n");
      out.write(" \t\treturnString=returnString+\"&\"+escape(formElements[i].name)+\"=\"+escape(formElements[i].value);\r\n \t}\r\n \t\r\n \t//return the values\r\n \treturn returnString; \r\n }\r\n               \r\n               function updatepage(str){\r\n               //alert(\"response is => \"+str)\r\n               if(str==0){\r\n               //alert(\"No Certifcates on your accont \\n please Rise Request for the process to Admin 1st \\n if you already done Admin has not yet done the process \\n please do After some time\");\r\n               }else{\r\n             //alert(\"respponse \"+str);\r\n               var hid=document.getElementById('hid').value;\r\n              // alert(\"hid value \"+hid);                        \r\n                //  var newCount = -1;\r\n             //  alert(document.getElementById('keySize').value);\r\n                var theSel=document.getElementById('keySize');             \r\n                var arr=new Array();\r\n                arr=str.split(\",\");              \r\n               for(i=0; i");
      out.write("<arr.length; i++){\r\n               //newCount++;\r\n              if(i==0){\r\n              if(arr.length==1){\t\r\n                theSel.options[i+1]=new Option(\" \"+arr[i].substring(1,arr[i].length-1), arr[i].substring(1,arr[i].length-1));\r\n              }else{\r\n               theSel.options[i+1]=new Option(\" \"+arr[i].substring(1), arr[i].substring(1));\r\n               }\r\n              }else{\r\n              if(i==arr.length-1){\r\n              theSel.options[i+1]=new Option(arr[i].substring(0,arr[i].length-1), arr[i].substring(0,arr[i].length-1));\r\n              }else{theSel.options[i+1]=new Option(arr[i], arr[i]);\r\n              }}\r\n             \r\n             \r\n               \r\n             }\r\n    \r\n                   //document.getElementById('result').value = str;\r\n                 //  str=\"");
      JspRuntimeLibrary.include(request, response, "/jsp/tools/tool_viewCsr.jsp", out, false);
      out.write("\";\r\n                 // document.getElementById(\"result1\").value=str;;\r\n                  // document.getElementById(\"result1\").innerHTML=");
      JspRuntimeLibrary.include(request, response, "/jsp/fun.jsp", out, false);
      out.write(";;  \r\n                  document.getElementById('hid').value=1;\r\n               }\r\n               }\r\n               function reload(){\r\n               window.location.reload();\r\n               \r\n                      }\r\n                \r\n               function callMultiply(){ \r\n               var hid=document.getElementById('hid').value;           \r\n                         //alert(\"hid ==> \"+hid);   \r\n                    var url = \"CMSToolAction.do?methodToCall=dirList\";\r\n                    if(hid==0)\r\n                    postRequest(url,'f1');                              \r\n                   }\r\n               function loadCrt(){ \r\n               \t\tif((document.getElementById(\"keySize\").value)==\"null\"){\r\n               \t\talert(\"Please select File Name\");                   \r\n               \t\t}else{\r\n                    var url = \"CMSToolAction.do?methodToCall=loadCrt\";\r\n                   // postRequest(url,'f1'); \r\n                 document.forms[0].action=\"CMSToolAction.do?methodToCall=disCrtList\";\r\n\t\t\t\t\tdocument.forms[0].submit();\r\n");
      out.write("                    }           \r\n                   }                              \r\n          ");
      out.write("</script>\r\n          \r\n          \r\n\r\n\r\n\r\n\r\n");
      out.write("</head>\r\n\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
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
      out.write("<font size=\"3\" color=\"FFFFFF\"> LOAD CERTIFICATE ");
      out.write("</font> ");
      out.write("</b>");
      out.write("</td> \r\n    ");
      out.write("</tr>\r\n \t");
      out.write("</table>");
      out.write("<br>\r\n\r\n");
      if (_jspx_meth_html_form_0(pageContext))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n\r\n\r\n");
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
    _jspx_th_html_form_0.setAction("CMSToolAction.do?methodToCall=checkCert");
    int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
    if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n\t");
        out.write("<table>\r\n\t\t");
        out.write("<tr>\r\n\t\t");
        out.write("<td>");
        out.write("<font color=\"336699\">");
        out.write("<b>Application Server name :");
        out.write("</b>");
        out.write("</font>");
        out.write("</td>\r\n\t\t");
        out.write("<td>");
        if (_jspx_meth_html_text_0(_jspx_th_html_form_0, pageContext))
          return true;
        out.write(" ");
        out.write("</td>\r\n\t\t");
        out.write("</tr>\t\t\r\n\t");
        out.write("</table>\r\n\t");
        out.write("<center>\r\n\t\t");
        out.write("<input type=\"button\" style=\"font-size: 1.05em; padding: 0.05em;\" name=\"sub\" value=\"Submit\" onclick=\"submitServer()\"/>\r\n\t");
        out.write("</center>\r\n\t");
        out.write("<br>\r\n\t");
        out.write("<table width=\"70%\">\r\n\t\t");
        out.write("<center>");
        out.write("<font size=\"1\" color=\" 00638B\" >Note:  Please ensure that you provide the exact name of the Application Server where the Certificates are hosted.");
        out.write("</font>");
        out.write("</center>\r\n \t");
        out.write("</table>\r\n");
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
    org.apache.struts.taglib.html.TextTag _jspx_th_html_text_0 = (org.apache.struts.taglib.html.TextTag) _jspx_tagPool_html_text_style_size_property_name_nobody.get(org.apache.struts.taglib.html.TextTag.class);
    _jspx_th_html_text_0.setPageContext(pageContext);
    _jspx_th_html_text_0.setParent(_jspx_th_html_form_0);
    _jspx_th_html_text_0.setName("CMSToolForm");
    _jspx_th_html_text_0.setProperty("appServer");
    _jspx_th_html_text_0.setSize("35");
    _jspx_th_html_text_0.setStyle("font-size: 1.05em; padding: 0.05em;");
    int _jspx_eval_html_text_0 = _jspx_th_html_text_0.doStartTag();
    if (_jspx_th_html_text_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_html_text_style_size_property_name_nobody.reuse(_jspx_th_html_text_0);
    return false;
  }
}
