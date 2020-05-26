package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.jasper.runtime.*;
import java.util.*;

public class home_jsp extends HttpJspBase {


  private static java.util.Vector _jspx_includes;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_logic_iterate_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_write_property_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_bean_define_type_property_name_id_nobody;

  public home_jsp() {
    _jspx_tagPool_logic_iterate_name_id = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_bean_write_property_name_nobody = new org.apache.jasper.runtime.TagHandlerPool();
    _jspx_tagPool_bean_define_type_property_name_id_nobody = new org.apache.jasper.runtime.TagHandlerPool();
  }

  public java.util.List getIncludes() {
    return _jspx_includes;
  }

  public void _jspDestroy() {
    _jspx_tagPool_logic_iterate_name_id.release();
    _jspx_tagPool_bean_write_property_name_nobody.release();
    _jspx_tagPool_bean_define_type_property_name_id_nobody.release();
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath() );
      out.write("/css/example.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/js/tabber_revque.js\">");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Menu Bar");
      out.write("</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/menu.css\" />\r\n\r\n");
      out.write("</head>\r\n\r\n");
      out.write("<script language=\"Javascript\">\r\n               function postRequest(strURL,nameOfFormToPost){\r\n               // strURL=strURL+getFormAsString(nameOfFormToPost);\r\n                    var xmlHttp;\r\n                    if(window.XMLHttpRequest){ // For Mozilla, Safari, ...\r\n                         var xmlHttp = new XMLHttpRequest();\r\n                    }\r\n                    else if(window.ActiveXObject){ // For Internet Explorer\r\n                         var xmlHttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n                    }\r\n                    xmlHttp.open('POST', strURL, true);\r\n                    xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');\r\n                    xmlHttp.onreadystatechange = function(){\r\n                         if (xmlHttp.readyState == 4){\r\n                              updatepage(xmlHttp.responseText);\r\n                         }\r\n                    }\r\n                   // alert(\" uri == \"+strURL);\r\n                    xmlHttp.send(strURL);\r\n               }\r\n");
      out.write("     function getFormAsString(formName){\r\n \t\r\n \t//Setup the return String\r\n \treturnString =\"\";\r\n \t\r\n  \t//Get the form values\r\n \tformElements=document.forms[formName].elements;\r\n \t\r\n \t//loop through the array , building up the url\r\n \t//in the form /strutsaction.do&name=value\r\n \t\r\n \tfor ( var i=formElements.length-1; i>=0; --i ){\r\n \t\t//we escape (encode) each value\r\n \t\treturnString=returnString+\"&\"+escape(formElements[i].name)+\"=\"+escape(formElements[i].value);\r\n \t}\r\n \t\r\n \t//return the values\r\n \treturn returnString; \r\n }\r\n               \r\n               function updatepage(str){\r\n                              //  document.getElementById(\"result1\").value=str;;\r\n                               }\r\n               \r\n               function callMultiply(){\r\n              // alert(\"inside ajax== \" + document.getElementById(\"selectCert\").value)\r\n               \r\n                  // var a = parseInt(document.f1.a.value);\r\n                   \r\n                    var url = \"CMSAction.do?methodToCall=ajax&selectCert=\"+get_radio_value();\r\n");
      out.write("                    postRequest(url,'f1');                   \r\n                    //reload();\r\n                                      \r\n               }\r\n               \r\n         \r\n\r\n\r\nvar certificateid = 0;\r\nfunction get_radio_value()\r\n{\r\nif(document.forms[0].selectCert.length > 1)\r\n{\r\nfor (var i=0; i ");
      out.write("< document.forms[0].selectCert.length; i++)\r\n   {\r\n   //alert(document.forms[0].selectCert.length)\r\n   if (document.forms[0].selectCert[i].checked)\r\n    //alert(document.forms[0].selectCert[i].checked)\r\n      {\r\n      var rad_val = document.forms[0].selectCert[i].value;\r\n      //certificateid = rad_val;\r\n       //alert(\"selected id:  \"+rad_val)\r\n       return rad_val;\r\n      }\r\n      \r\n   }\r\n   }\r\n   else \r\n   {\r\n   return document.forms[0].selectCert.value;\r\n   }\r\n}\r\nfunction checkRadio()\r\n{   \r\n\tvar flag=false;\r\n\tif(document.forms[0].selectCert.length > 1)\r\n   {\r\n\tfor (var i=0; i ");
      out.write("< document.forms[0].selectCert.length; i++)\r\n\t{\r\n\tif (document.forms[0].selectCert[i].checked)\r\n\t{\r\n     flag=true;\r\n    // alert(flag)\r\n     }\r\n  }\r\n  }\r\n  else{\r\n    if(document.forms[0].selectCert.checked)\r\n    {\r\n     flag=true;\r\n    \r\n     }\r\n      \r\n   }\r\n  if(flag==false)\r\n  {\r\n   alert(\"Please select a Certificate before you proceed...\")\r\n     //alert(flag)\r\n\t return flag;\r\n\t \r\n\t }\r\n\t return flag;\r\n}\r\nfunction status()\r\n{\r\n\r\nvar res = checkRadio();\r\nalert(res)\r\nif(res==true)\r\n{\r\n  str=\"ksdkksdkdksdk\";\r\n \r\n  \r\n  //document.getElementById(\"respage\").innerHTML=str;;\r\n  \r\n  //document.getElementById(\"respage\").innerHTML = \"");
      JspRuntimeLibrary.include(request, response, "../status.jsp", out, true);
      out.write("\";;\r\n  //document.getElementById(\"respage\").innerHTML=str;;\r\n  alert(\"after innerHTML\");\r\n  \r\n}\r\n\r\n}\r\nfunction reload(){\r\n               window.location.reload();               \r\n                      }\r\nfunction fun(v)\r\n{\r\n\r\nif(document.forms[0].selectCert.length > 1)\r\n{\r\nfor (var i=0; i ");
      out.write("< document.forms[0].selectCert.length; i++)\r\n    { //alert(\" in fun fun  \"+document.forms[0].selectCert[i].value +\" \"+v);\r\n    if (document.forms[0].selectCert[i].value==v){\r\n   document.forms[0].selectCert[i].checked=true;\r\n   //alert(\"hi == \"+document.forms[0].selectCert[i].value)\r\n   }\r\n   }\r\n   }\r\nelse {\r\n if (document.forms[0].selectCert.value==v){\r\n   document.forms[0].selectCert.checked=true;\r\n   //alert(\"hi == \"+document.forms[0].selectCert[i].value)\r\n   }\r\n }\r\n}\r\n\r\n");
      out.write("</script>\r\n");

String checkedRadioValue=(String)session.getAttribute("checkedRadioValue");
System.out.println(" in fi condition checkig == >"+checkedRadioValue);
if(checkedRadioValue!=null){

      out.write("\r\n");
      out.write("<body onload=\"fun(");
      out.print(checkedRadioValue);
      out.write(")\">\r\n");
}else{ 
      out.write("<body >");
} 
      out.write("\r\n");
      out.write("<form name=\"f1\" action=\"/CMSAction.do?methodToCall=certInAccount\" enctype=\"multipart/form-data\">\r\n");
      out.write("<div style=\"font-size:small;font-family:monospace;\">\r\n");
 ArrayList al=new ArrayList();
String totlCert= session.getAttribute("totalCert").toString();
int totalCert = Integer.parseInt(totlCert);
System.out.println("inside homepage****&&&&--->" + totalCert);


if(session.getAttribute("accountList")!=null)
 {al=(ArrayList)session.getAttribute("accountList");
 System.out.println("inside homepage--->");
 System.out.println("size is -->"+ al.size());
 }
 
 if(totalCert==0)
 {
 
      out.write("\r\n \t");
      out.write("<table align=\"center\"  width=\"80%\" >\r\n\t\t");
      out.write("<tr bordercolor=\"CC0033\">\r\n\t\t");
      out.write("<td align=\"center\" bgcolor=\"FFFFCC\">");
      out.write("<FONT size=\"4\" color=\"CC0033\">");
      out.write("<b>There are currently no Certificates in your Account.  ");
      out.write("</b>");
      out.write("</FONT>");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\r\n\t\t");
      out.write("<br>\r\n\t\t");
      out.write("<br>\r\n\t\t");
      out.write("<tr>\r\n\t\t");
      out.write("<td align=\"center\" bgcolor=\"FFFFEE\" >");
      out.write("<FONT size=\"2\" color=\"336699\">Please use the Create/Update Group link in the top right corner to create a Group for the Application.  Once the Group is created, go to the Tools section and click on 'Request to Search' on the Menu to request the AIP to get the Application specific Certificates. On receiving confirmation from the AIP, use the 'Load Certificate' link on the Tools Menu to load the Certificates into your Account.");
      out.write("</FONT>");
      out.write("</td>\r\n\t\t");
      out.write("</tr>\t\t\r\n\t");
      out.write("</table>\r\n           \r\n ");

 
 }

else {

      out.write("\r\n\r\n");
      out.write("<table width=\"829\" border=\"1\" cellspacing=\"0\" cellpadding=\"2\" bgcolor=\"#FFFFCC\">\r\n\r\n");
      out.write("<tr>");
      out.write("<th width=\"60\">Select");
      out.write("</th>");
      out.write("<th width=\"163\">Application Name");
      out.write("</th>");
      out.write("<th width=\"95\">Acronym");
      out.write("</th>");
      out.write("<th width=\"157\">Nick \r\n\tName");
      out.write("</th>");
      out.write("<th width=\"115\">Type");
      out.write("</th>");
      out.write("<th width=\"126\">Expiry Date");
      out.write("</th>\r\n\t");
      out.write("<th width=\"71\">\r\n\tStatus");
      out.write("</th>");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");

}

      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div style=\"overflow:auto;width:850px; height:180px; table-layout:fixed;\">\r\n\r\n");
      out.write("<table width=\"828\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      /* ----  logic:iterate ---- */
      org.apache.struts.taglib.logic.IterateTag _jspx_th_logic_iterate_0 = (org.apache.struts.taglib.logic.IterateTag) _jspx_tagPool_logic_iterate_name_id.get(org.apache.struts.taglib.logic.IterateTag.class);
      _jspx_th_logic_iterate_0.setPageContext(pageContext);
      _jspx_th_logic_iterate_0.setParent(null);
      _jspx_th_logic_iterate_0.setId("accountList");
      _jspx_th_logic_iterate_0.setName("accountList");
      int _jspx_eval_logic_iterate_0 = _jspx_th_logic_iterate_0.doStartTag();
      if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        java.lang.Object accountList = null;
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          javax.servlet.jsp.tagext.BodyContent _bc = pageContext.pushBody();
          out = _bc;
          _jspx_th_logic_iterate_0.setBodyContent(_bc);
          _jspx_th_logic_iterate_0.doInitBody();
        }
        accountList = (java.lang.Object) pageContext.findAttribute("accountList");
        do {
          out.write("\r\n");
          out.write("<tr>\r\n");
          out.write("<td width=\"8%\" aligh=\"centre\" align=\"center\" > \r\n\t\t   \r\n\t\t   ");
          out.write("<input type=\"radio\" id=\"serialId\" name=\"selectCert\" value=\"");
          if (_jspx_meth_bean_write_0(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\" onclick=\"callMultiply()\"  />\r\n\t\t    ");
          out.write("</td> \r\n ");
          out.write("<td width=\"20%\" align=\"center\">\r\n\t          \t");
          out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_1(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t       ");
          out.write("</td>\r\n    ");
          out.write("<td width=\"12%\" align=\"center\">\r\n\t          \t");
          out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_2(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t       ");
          out.write("</td>\r\n\t\t    \r\n\t\t    ");
          out.write("<td width=\"20%\" align=\"center\">\r\n\t          \t");
          out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_3(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t       ");
          out.write("</td>\r\n         \t         \t\t       \r\n\t\t       ");
          out.write("<td width=\"14%\" align=\"center\">\r\n\t          \t");
          out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_4(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t       ");
          out.write("</td>\r\n\t\t       \r\n\t          ");
          out.write("<td width=\"16%\" align=\"center\">\r\n\t          \t");
          out.write("<font face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_5(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t       ");
          out.write("</td>\t       \t\t       \r\n\t         ");
          out.write("<td width=\"9%\" align=\"center\">\r\n\t          ");
          /* ----  bean:define ---- */
          org.apache.struts.taglib.bean.DefineTag _jspx_th_bean_define_0 = (org.apache.struts.taglib.bean.DefineTag) _jspx_tagPool_bean_define_type_property_name_id_nobody.get(org.apache.struts.taglib.bean.DefineTag.class);
          _jspx_th_bean_define_0.setPageContext(pageContext);
          _jspx_th_bean_define_0.setParent(_jspx_th_logic_iterate_0);
          _jspx_th_bean_define_0.setId("res");
          _jspx_th_bean_define_0.setName("accountList");
          _jspx_th_bean_define_0.setProperty("status");
          _jspx_th_bean_define_0.setType("java.lang.String");
          int _jspx_eval_bean_define_0 = _jspx_th_bean_define_0.doStartTag();
          if (_jspx_th_bean_define_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
          _jspx_tagPool_bean_define_type_property_name_id_nobody.reuse(_jspx_th_bean_define_0);
          java.lang.String res = null;
          res = (java.lang.String) pageContext.findAttribute("res");
          out.write("\r\n\r\n\t          \r\n\t          ");

	           if(res.equalsIgnoreCase("active"))
	           {
	           
          out.write("\r\n\t           \r\n\t           \r\n\t          \t");
          out.write("<font color=\"green\" face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_6(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t        ");
 } 
	           else if(res.equalsIgnoreCase("expired")) {
		        
          out.write("\r\n\t\t        \t");
          out.write("<font color=\"red\" face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_7(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t        ");
 } 
	           else if(res.equalsIgnoreCase("inactive")) {
		        
          out.write("\r\n\t\t        ");
          out.write("<font color=\"#00FFFF\" face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_8(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t        ");
 } 
	           else  {
		        
          out.write("\r\n\t\t         ");
          out.write("<font color=\"blue\" face=\"Verdana\" size=\"1\">\r\n\t\t\t\t\t");
          if (_jspx_meth_bean_write_9(_jspx_th_logic_iterate_0, pageContext))
            return;
          out.write("\t\t          \r\n\t\t         ");
          out.write("</font>\r\n\t\t        ");
 } 
          out.write("\r\n\t           \r\n\t\t        \r\n\t\t         ");
          out.write("</td>\r\n");
          out.write("</tr>\r\n\r\n");
          int evalDoAfterBody = _jspx_th_logic_iterate_0.doAfterBody();
          accountList = (java.lang.Object) pageContext.findAttribute("accountList");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_logic_iterate_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = pageContext.popBody();
      }
      if (_jspx_th_logic_iterate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
        return;
      _jspx_tagPool_logic_iterate_name_id.reuse(_jspx_th_logic_iterate_0);
      out.write("\r\n\r\n\r\n");
      out.write("</table>\r\n\r\n");
      out.write("</div>\r\n\r\n\r\n\r\n\r\n");

System.out.println("size is ***** -->"+ al.size());
if(al.size()!= 0)
{
System.out.println("size is not zero...");

      out.write("\r\n\r\n");
      out.write("<div style=\"width:850px; height:10px;\" >\r\n");
      out.write("<table width=\"100%\" border = \"1\" cellspacing=\"0\" cellpadding=\"7\">\r\n");
      out.write("<tr>\r\n");
if(session.getAttribute("pageToCall")!=null){
		String pageName=(String)session.getAttribute("pageToCall");
		if(pageName.equals("status"))
			{
      out.write("\r\n");
      out.write("<td id=\"status\" align=\"center\" width=\"80\" bgcolor=\"#9e9fb1\" onclick=\"return checkRadio()\">");
      out.write("<a   href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=status\">");
      out.write("<u>Status");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"details\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=details\">");
      out.write("<u>Details");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"summary\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=summary\">");
      out.write("<u>Summary");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"Functions\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=Functions\">");
      out.write("<u>Functions");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"history\"  align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=history\">");
      out.write("<u>History");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"notes\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=notes\">");
      out.write("<u>Notes");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
}else if(pageName.equals("details"))
			{
      out.write("\r\n");
      out.write("<td id=\"status\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a   href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=status\">");
      out.write("<u>Status");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"details\" align=\"center\" width=\"80\" bgcolor=\"#9e9fb1\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=details\">");
      out.write("<u>Details");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"summary\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=summary\">");
      out.write("<u>Summary");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"Functions\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=Functions\">");
      out.write("<u>Functions");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"history\"  align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=history\">");
      out.write("<u>History");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"notes\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=notes\">");
      out.write("<u>Notes");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
}else if(pageName.equals("summary"))
			{
      out.write("\r\n");
      out.write("<td id=\"status\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a   href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=status\">");
      out.write("<u>Status");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"details\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=details\">");
      out.write("<u>Details");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"summary\" align=\"center\" width=\"80\" bgcolor=\"#9e9fb1\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=summary\">");
      out.write("<u>Summary");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"Functions\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=Functions\">");
      out.write("<u>Functions");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"history\"  align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=history\">");
      out.write("<u>History");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"notes\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=notes\">");
      out.write("<u>Notes");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
}else if(pageName.equals("functions"))
			{
      out.write("\r\n");
      out.write("<td id=\"status\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a   href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=status\">");
      out.write("<u>Status");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"details\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=details\">");
      out.write("<u>Details");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"summary\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=summary\">");
      out.write("<u>Summary");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"Functions\" align=\"center\" width=\"80\" bgcolor=\"#9e9fb1\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=Functions\">");
      out.write("<u>Functions");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"history\"  align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=history\">");
      out.write("<u>History");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"notes\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=notes\">");
      out.write("<u>Notes");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
}else	if(pageName.equals("history"))
			{
      out.write("\r\n");
      out.write("<td id=\"status\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a   href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=status\">");
      out.write("<u>Status");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"details\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=details\">");
      out.write("<u>Details");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"summary\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=summary\">");
      out.write("<u>Summary");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"Functions\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=Functions\">");
      out.write("<u>Functions");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"history\"  align=\"center\" width=\"80\" bgcolor=\"#9e9fb1\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=history\">");
      out.write("<u>History");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"notes\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=notes\">");
      out.write("<u>Notes");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
}else if(pageName.equals("notes"))
			{
      out.write("\r\n");
      out.write("<td id=\"status\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a   href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=status\">");
      out.write("<u>Status");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"details\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=details\">");
      out.write("<u>Details");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"summary\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=summary\">");
      out.write("<u>Summary");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"Functions\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=Functions\">");
      out.write("<u>Functions");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"history\"  align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=history\">");
      out.write("<u>History");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"notes\" align=\"center\" width=\"80\" bgcolor=\"#9e9fb1\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=notes\">");
      out.write("<u>Notes");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
}}else{
      out.write("\r\n");
      out.write("<td id=\"status\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a   href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=status\">");
      out.write("<u>Status");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"details\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=details\">");
      out.write("<u>Details");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"summary\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=summary\">");
      out.write("<u>Summary");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"Functions\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=Functions\">");
      out.write("<u>Functions");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td  id=\"history\"  align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=history\">");
      out.write("<u>History");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
      out.write("<td id=\"notes\" align=\"center\" width=\"80\" bgcolor=\"lightblue\" onclick=\"return checkRadio()\">");
      out.write("<a href=\"");
      out.print(request.getContextPath());
      out.write("/CMSAction.do?methodToCall=notes\">");
      out.write("<u>Notes");
      out.write("</u>");
      out.write("</a>");
      out.write("</td>\r\n");
}
      out.write("\r\n");
      out.write("</tr>\r\n\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
      out.write("<div style=\"width:850px; height:130px;overflow:scroll\" >\r\n");
      out.write("<table width=\"100%\" cellspacing=\"2\" cellpadding=\"7\">\r\n");
      out.write("<tr>\r\n");
if(session.getAttribute("pageToCall")!=null){
		String pageName=(String)session.getAttribute("pageToCall");
		if(pageName.equals("status"))
			{
      out.write("\r\n\t\t\t\t");
      out.write("<td>\r\n\t\t\t\t");
      JspRuntimeLibrary.include(request, response, "/jsp/common/status.jsp", out, false);
      out.write("\r\n\t\t\t\t");
      out.write("</td>\r\n\t\t\t");
}
		else if(pageName.equals("details"))
			{
      out.write("\r\n  \t\t\t\t");
      out.write("<td>\r\n\t\t\t\t");
      JspRuntimeLibrary.include(request, response, "/jsp/common/detail.jsp", out, false);
      out.write("\r\n\t\t\t\t");
      out.write("</td>\t\r\n\t\t\t");
}
		else if(pageName.equals("summary"))
			{
      out.write("\r\n  \t\t\t\t");
      out.write("<td>\r\n\t\t\t\t");
      JspRuntimeLibrary.include(request, response, "/jsp/common/summary.jsp", out, false);
      out.write("\r\n\t\t\t\t");
      out.write("</td>\r\n\t\t\t");
}
			else if(pageName.equals("history"))
			{
      out.write("\r\n  \t\t\t\t");
      out.write("<td>\r\n\t\t\t\t");
      JspRuntimeLibrary.include(request, response, "/jsp/common/History.jsp", out, false);
      out.write("\r\n\t\t\t\t");
      out.write("</td>\r\n\t\t\t");
}
			else if(pageName.equals("notes"))
			{
      out.write("\r\n  \t\t\t\t");
      out.write("<td>\r\n\t\t\t\t");
      JspRuntimeLibrary.include(request, response, "/jsp/common/Notes.jsp", out, false);
      out.write("\r\n\t\t\t\t");
      out.write("</td>\r\n\t\t\t");
}
			else if(pageName.equals("history"))
			{
      out.write("\r\n  \t\t\t\t");
      out.write("<td>\r\n\t\t\t\t");
      JspRuntimeLibrary.include(request, response, "/jsp/common/History.jsp", out, false);
      out.write("\r\n\t\t\t\t");
      out.write("</td>\r\n\t\t\t");
}
			else if(pageName.equals("functions"))
			{
      out.write("\r\n  \t\t\t\t");
      out.write("<td>\r\n\t\t\t\t");
      JspRuntimeLibrary.include(request, response, "/jsp/common/funtions.jsp", out, false);
      out.write("\r\n\t\t\t\t");
      out.write("</td>\r\n\t\t\t");
}
	}
      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");

}

      out.write("\r\n\r\n\r\n\r\n\r\n\r\n");
      out.write("</body>\r\n\r\n");
      out.write("</html>\r\n");
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
    _jspx_th_bean_write_0.setName("accountList");
    _jspx_th_bean_write_0.setProperty("serialNo");
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
    _jspx_th_bean_write_1.setName("accountList");
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
    _jspx_th_bean_write_2.setName("accountList");
    _jspx_th_bean_write_2.setProperty("acronym");
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
    _jspx_th_bean_write_3.setName("accountList");
    _jspx_th_bean_write_3.setProperty("nickName");
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
    _jspx_th_bean_write_4.setName("accountList");
    _jspx_th_bean_write_4.setProperty("expDate");
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
    _jspx_th_bean_write_5.setName("accountList");
    _jspx_th_bean_write_5.setProperty("type");
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
    _jspx_th_bean_write_6.setName("accountList");
    _jspx_th_bean_write_6.setProperty("status");
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
    _jspx_th_bean_write_7.setName("accountList");
    _jspx_th_bean_write_7.setProperty("status");
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
    _jspx_th_bean_write_8.setName("accountList");
    _jspx_th_bean_write_8.setProperty("status");
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
    _jspx_th_bean_write_9.setName("accountList");
    _jspx_th_bean_write_9.setProperty("status");
    int _jspx_eval_bean_write_9 = _jspx_th_bean_write_9.doStartTag();
    if (_jspx_th_bean_write_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_bean_write_property_name_nobody.reuse(_jspx_th_bean_write_9);
    return false;
  }
}
