package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;

public class template_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_tiles_insert_attribute_nobody;

  public template_jsp() {
    _jspx_tagPool_tiles_insert_attribute_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_tiles_insert_attribute_nobody.release();
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("\n\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      if (_jspx_meth_tiles_insert_0(pageContext))
        return;
      out.write("\n");
      out.write("<title>Certificate Management System ");
      out.write("</title>\n");
      out.write("</head>\n\n");
      out.write("<center>\n");
      out.write("<div style=\"width:850px; height:10px\" >\n");
      out.write("<table  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"2%\" width=\"100%\" bordercolor=\"#000000\" >\n");
      out.write("<tr>");
      out.write("<td>");
      out.write("</td>");
      out.write("<td  align=\"left\" valign=\"top\">");
      if (_jspx_meth_tiles_insert_1(pageContext))
        return;
      out.write("\n    ");
      out.write("</td>\n\t");
      out.write("</tr>\n");
      out.write("</table>\n\n");
      out.write("</div>\n");
      out.write("<div style=\"width:850px; height:70px; >\n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" bordercolor=\"#000000\">\n\t");
      out.write("<tr>\n\t\t");
      out.write("<td align=\"left\" valign=\"top\" class=\"rightLinesOnly\" id=\"menu\">\n\t\t  ");
      if (_jspx_meth_tiles_insert_2(pageContext))
        return;
      out.write("\n    \t");
      out.write("</td> \n    ");
      out.write("</tr>\n ");
      out.write("</table>\n");
      out.write("</div>\n\n");
      out.write("<div style=\"width:850px; height:365px;\" >\n    \t");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" bordercolor=\"#5b89bd\">\n    \t");
      out.write("<tr>\n\t\t");
      out.write("<td align=\"left\" valign=\"top\" id=\"body\">\n  \t\t  ");
      if (_jspx_meth_tiles_insert_3(pageContext))
        return;
      out.write("\n   \t\t ");
      out.write("</td>\n\t");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("<div style=\"width:850px; height:20px;  >\n");
      out.write("<table  frame=\"below\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"10%\"\twidth=\"100%\" bordercolor=\"#000000\">\n\t");
      out.write("<tr >\n\t\t");
      out.write("<td align=\"left\" valign=\"top\">\n\t\t  ");
      if (_jspx_meth_tiles_insert_4(pageContext))
        return;
      out.write("\n    ");
      out.write("</td>\n\t");
      out.write("</tr>\n\t\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</center>\n\n");
      out.write("</html>");
    } catch (Throwable t) {
      out = _jspx_out;
      if (out != null && out.getBufferSize() != 0)
        out.clearBuffer();
      if (pageContext != null) pageContext.handlePageException(t);
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(pageContext);
    }
  }

  private boolean _jspx_meth_tiles_insert_0(javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  tiles:insert ---- */
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_0 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_0.setPageContext(pageContext);
    _jspx_th_tiles_insert_0.setParent(null);
    _jspx_th_tiles_insert_0.setAttribute("styles");
    int _jspx_eval_tiles_insert_0 = _jspx_th_tiles_insert_0.doStartTag();
    if (_jspx_th_tiles_insert_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_0);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_1(javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  tiles:insert ---- */
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_1 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_1.setPageContext(pageContext);
    _jspx_th_tiles_insert_1.setParent(null);
    _jspx_th_tiles_insert_1.setAttribute("header");
    int _jspx_eval_tiles_insert_1 = _jspx_th_tiles_insert_1.doStartTag();
    if (_jspx_th_tiles_insert_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_1);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_2(javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  tiles:insert ---- */
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_2 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_2.setPageContext(pageContext);
    _jspx_th_tiles_insert_2.setParent(null);
    _jspx_th_tiles_insert_2.setAttribute("menu");
    int _jspx_eval_tiles_insert_2 = _jspx_th_tiles_insert_2.doStartTag();
    if (_jspx_th_tiles_insert_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_2);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_3(javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  tiles:insert ---- */
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_3 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_3.setPageContext(pageContext);
    _jspx_th_tiles_insert_3.setParent(null);
    _jspx_th_tiles_insert_3.setAttribute("body");
    int _jspx_eval_tiles_insert_3 = _jspx_th_tiles_insert_3.doStartTag();
    if (_jspx_th_tiles_insert_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_3);
    return false;
  }

  private boolean _jspx_meth_tiles_insert_4(javax.servlet.jsp.PageContext pageContext)
          throws Throwable {
    JspWriter out = pageContext.getOut();
    /* ----  tiles:insert ---- */
    org.apache.struts.taglib.tiles.InsertTag _jspx_th_tiles_insert_4 = (org.apache.struts.taglib.tiles.InsertTag) _jspx_tagPool_tiles_insert_attribute_nobody.get(org.apache.struts.taglib.tiles.InsertTag.class);
    _jspx_th_tiles_insert_4.setPageContext(pageContext);
    _jspx_th_tiles_insert_4.setParent(null);
    _jspx_th_tiles_insert_4.setAttribute("footer");
    int _jspx_eval_tiles_insert_4 = _jspx_th_tiles_insert_4.doStartTag();
    if (_jspx_th_tiles_insert_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_tiles_insert_attribute_nobody.reuse(_jspx_th_tiles_insert_4);
    return false;
  }
}
