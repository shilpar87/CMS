package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import com.qwest.cms.BO.CMSBO;

public class funtions_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_html;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_html_errors_nobody;

  public funtions_jsp() {
    _jspx_tagPool_html_html = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_form_action = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_html_errors_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_html_html.release();
    _jspx_tagPool_html_form_action.release();
    _jspx_tagPool_html_errors_nobody.release();
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
      out.write("\r\n    \r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n\r\n\r\n");
      out.write("<script type=\"text/javascript\" >\r\nfunction DeleteCert()\r\n{\r\n\t\t\t\t\r\n        var ans=false; \r\n        ans=window.confirm('Do you want to Delete the Certificate.....?'); \r\n        //alert (ans); \r\n\t\treturn ans;\r\n\t  \t\r\n\t  }\r\n\t  \r\nfunction ExportCert()\r\n{\r\n\t\t\t\t\r\n        var ans=false; ans=window.confirm('Do you want to download the Certificate!!?'); //alert (ans); \r\n\t\treturn ans;\r\n\t  \t\r\n\t  }\r\n\t  \r\nfunction valChangeStatus(certStatus){\r\n\r\n\t//alert(\"in validate...34532.\");\r\n\t//alert(certStatus.value);\r\n\tstatus=certStatus.value;\r\n\tif(status==\"EXPIRED\"){\r\n\t\talert(\"The certificate status is 'Expired' and cannot be changed. \");\r\n\t\treturn false;\r\n\t}\r\n\telse if(status==\"Renew\"){\r\n\t\talert(\"The certificate is being renewed and status cannot be changed. \");\r\n\t\treturn false;\r\n\t}\t\t\t\r\n\telse{\r\n\t\t//alert(\"returning true\");\r\n\t\treturn ture;\r\n\t}\r\n}\r\n\r\nfunction valUpdateStatus(status){\r\n\tif(status.value==\"ACTIVE\"){\r\n\t\talert(\"The certificate is Active and has not been renewed.  The certificate cannot be updated before it is sent for renewal. \");\r\n");
      out.write("\t\treturn false;\r\n\t}\r\n\telse if(status.value==\"INACTIVE\"){\r\n\t\talert(\"The certificate is Inactive and has not been renewed.  The certificate cannot be updated before it is sent for renewal. \");\r\n\t\treturn false;\r\n\t}\t\r\n\telse if(status.value==\"EXPIRED\"){\r\n\t\talert(\"The certificate is Expired and has not been renewed.  The certificate cannot be updated before it is sent for renewal. \");\r\n\t\treturn false;\r\n\t}\t\t\r\n\telse{\r\n\t\treturn true;\r\n\t}\r\n}\r\n");
      out.write("</script>\r\n\r\n\r\n");
      out.write("\r\n");
      /* ----  html:html ---- */
      org.apache.struts.taglib.html.HtmlTag _jspx_th_html_html_0 = (org.apache.struts.taglib.html.HtmlTag) _jspx_tagPool_html_html.get(org.apache.struts.taglib.html.HtmlTag.class);
      _jspx_th_html_html_0.setPageContext(pageContext);
      _jspx_th_html_html_0.setParent(null);
      int _jspx_eval_html_html_0 = _jspx_th_html_html_0.doStartTag();
      if (_jspx_eval_html_html_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<head>\r\n\t");
          out.write("<title>Functions Tab");
          out.write("</title>\r\n\t");
          out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
          out.print(request.getContextPath() );
          out.write("/css/style.css\" />\r\n");
          out.write("</head>\r\n");
          out.write("<body>\r\n\t");
          /* ----  html:form ---- */
          org.apache.struts.taglib.html.FormTag _jspx_th_html_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_html_form_action.get(org.apache.struts.taglib.html.FormTag.class);
          _jspx_th_html_form_0.setPageContext(pageContext);
          _jspx_th_html_form_0.setParent(_jspx_th_html_html_0);
          _jspx_th_html_form_0.setAction("/CMSAction.do?methodToCall=Functions");
          int _jspx_eval_html_form_0 = _jspx_th_html_form_0.doStartTag();
          if (_jspx_eval_html_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n\t\t \r\n\t\t");
              out.write("<p align=\"left\">\r\n\t\t");
 CMSBO cmsbo=new CMSBO();
			String status="";
			if(session.getAttribute("DetailInfo") != null)
			{
				cmsbo =(CMSBO)session.getAttribute("DetailInfo");
				status=cmsbo.getStatus();
				System.out.println("status is ....."+status);
			}
		
              out.write("\r\n\t\t");
              out.write("<table width=\"100%\" cellspacing=\"2\" cellpadding=\"7\">\r\n\t\t");
              out.write("<tr bgcolor=\"lightyellow\">");
              out.write("<td >\r\n\t\t\t");
              out.write("<input type=hidden name=\"certStatus\" value=\"");
              out.print(status);
              out.write("\" /> \r\n\t\t\t");
              out.write("<a onclick=\" return ExportCert();\" href=\"");
              out.print(request.getContextPath());
              out.write("/CMSFunctionAction.do?methodToCall=doDownload\">Export Certificate");
              out.write("</a>  ");
              out.write("<br> \t\t\r\n        \t");
              out.write("<a href=\"");
              out.print(request.getContextPath());
              out.write("/CMSFunctionAction.do?methodToCall=renewCert\">Renewal of a Certificate ");
              out.write("</a>");
              out.write("<br>  \r\n\t\t\t");
              out.write("<a onclick=\"return valUpdateStatus(certStatus);\" href=\"");
              out.print(request.getContextPath());
              out.write("/CMSFunctionAction.do?methodToCall=updateCert\">Update Certificate");
              out.write("</a>");
              out.write("<br>\r\n       \t\t");
              out.write("<a onclick=\"return valChangeStatus(certStatus);\" href=\"");
              out.print(request.getContextPath());
              out.write("/CMSFunctionAction.do?methodToCall=changeCertStatus\">Change Status of Certificate ");
              out.write("</a>  ");
              out.write("<br>   \r\n       \t\t");
              out.write("<a onclick=\" return DeleteCert();\" href=\"");
              out.print(request.getContextPath());
              out.write("/CMSFunctionAction.do?methodToCall=deleteCertificate\">Delete Certificate");
              out.write("</a>  ");
              out.write("<br>\r\n\t\t");
              out.write("</td>\r\n\t\t");
              out.write("<td>");
              out.write("<FONT size=\"4\" color=\"CC0033\">");
              out.write("<b>");
              if (_jspx_meth_html_errors_0(_jspx_th_html_form_0, pageContext))
                return;
              out.write("</b>");
              out.write("</FONT>");
              out.write("</td>\r\n\t\t");
              out.write("</tr>\r\n\t\t");
              out.write("</table>\r\n    \t");
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
}
