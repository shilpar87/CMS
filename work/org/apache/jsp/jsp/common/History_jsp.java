package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;
import com.qwest.cms.BO.*;

public class History_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;

  public History_jsp() {
    _jspx_tagPool_logic_iterate_name_id = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_bean_write_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("<html>\r\n\r\n");
      out.write("<header>\r\n\r\n");
      out.write("</header>\r\n");

CMSBO cmsbo= new CMSBO();

String nickName="";

if(session.getAttribute("DetailInfo") != null)
{
	cmsbo=(CMSBO)session.getAttribute("DetailInfo");

	nickName=cmsbo.getCertNickname();
	
		
}


      out.write("\r\n");
      out.write("<body>\r\n\r\n");
      out.write("<br>Cert Nick name: ");
      out.write("<font color=\"blue\"> ");
      out.write("<b>");
      out.print(nickName);
      out.write("</b>");
      out.write("</font>\r\n");
      out.write("<table   border=\"0\"  cellpadding=\"5\" cellspacing=\"1\"   bgcolor=\"white\" width=\"60%\" algin=\"center\">\r\n\t ");
      out.write("<tr>\r\n\t\t\t");
      out.write("<td align=\"center\" colspan=\"4\">");
      out.write("<font face=\"Verdana\" size=\"2\">");
      out.write("<b>History Table");
      out.write("</b>");
      out.write("</font>\r\n\t\t\t");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\r\n\t \r\n          ");
      out.write("<tr bgcolor=\"gainsboro\">\r\n          \r\n          ");
      out.write("<th>");
      out.write("<font face=\"Verdana\" size=\"1\">Time Stamp");
      out.write("</font>");
      out.write("</th>\r\n          ");
      out.write("<th>");
      out.write("<font face=\"Verdana\" size=\"1\">User(cuid)");
      out.write("</font>");
      out.write("</th>\r\n          ");
      out.write("<th>");
      out.write("<font face=\"Verdana\" size=\"1\">Activity");
      out.write("</font>");
      out.write("</th>\r\n          \r\n          ");
      out.write("</tr>\r\n\r\n          ");
      /* ----  logic:iterate ---- */
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(pageContext);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("historyList");
      _jspx_th_logic_iterate_0.setName("historyList");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object historyList = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
          out = _bc;
          _jspx_th_logic_iterate_0.setBodyContent(_bc);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        historyList = (java.lang.Object) pageContext.findAttribute("historyList");
        do {
          out.write("\r\n          ");
          out.write("<tr>\r\n          \r\n\t\t    \r\n\t\t    \r\n\t\t    ");
          out.write("<td width=\"2%\" align=\"center\">\r\n\t          \t");
          out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_0(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t       ");
          out.write("</td>\r\n\r\n\t          ");
          out.write("<td width=\"2%\" align=\"center\">\r\n\t          \t");
          out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t       ");
          out.write("</td>\r\n\t\t       \r\n\t\t       ");
          out.write("<td width=\"2%\" align=\"center\">\r\n\t          \t");
          out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_2(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t       ");
          out.write("</td>\r\n\t\t       \r\n\t           \t\t    \r\n\t          ");
          out.write("</tr>\r\n          ");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          historyList = (java.lang.Object) pageContext.findAttribute("historyList");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = pageContext.popBody();
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\r\n\t  ");
      out.write("</table>\r\n\t\r\n\r\n");
      out.write("</body>\r\n\r\n\r\n");
      out.write("</html>\r\n\r\n");
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }

  private boolean _jspx_meth_bean_write_0(javax.servlet.jsp.tagext.Tag _jspx_th_logic_iterate_0, javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  bean:write ---- */
    org.apache.struts.taglib.bean.WriteTag _jspx_th_bean_write_0 = (org.apache.struts.taglib.bean.WriteTag) _jspx_tagPool_bean_write_property_name_nobody.get(org.apache.struts.taglib.bean.WriteTag.class);
    _jspx_th_bean_write_0.setPageContext(pageContext);
    _jspx_th_bean_write_0.setParent(_jspx_th_logic_iterate_0);
    _jspx_th_bean_write_0.setName("historyList");
    _jspx_th_bean_write_0.setProperty("modifiedDate");
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
    _jspx_th_bean_write_1.setName("historyList");
    _jspx_th_bean_write_1.setProperty("modifiedCuid");
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
    _jspx_th_bean_write_2.setName("historyList");
    _jspx_th_bean_write_2.setProperty("modifiedAction");
    int _jspx_eval_bean_write_2 = _jspx_th_bean_write_2.doStartTag();
    if (_jspx_th_bean_write_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_2);
    return false;
  }
}
