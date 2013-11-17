package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_005fcenterDivChange_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>Untitled</title>\r\n");
      out.write("<style>\r\n");
      out.write("<!--\r\n");
      out.write("BODY {margin:0; background:#DDDDDD; text:#000000}\r\n");
      out.write("H1 {font : bold 14px Arial, Helvetica, sans-serif; letter-spacing:.2em; margin-top:16px; margin-bottom:0px}\r\n");
      out.write("H2 {font : bold 12px Arial, Helvetica, sans-serif; line-height:.2em}\r\n");
      out.write("P {font : 13px Arial, Helvetica, sans-serif; margin-top: 0em; text-align:justify}\r\n");
      out.write("ol {font : 13px Arial, Helvetica, sans-serif;}\r\n");
      out.write("A.link, A.link:active, A.link:visited {font : 14px Arial, Helvetica, sans-serif; color:#52514D; text-decoration:underline}\r\n");
      out.write("A.glink, A.glink:active, A.glink:visited {font : bold 13px Arial, Helvetica, sans-serif; color:#000; text-decoration:none;}\r\n");
      out.write(".name {font : bold 13px Arial, Helvetica, sans-serif; letter-spacing:.2em;}\r\n");
      out.write(".text {font : 13px Arial, Helvetica, sans-serif; padding-top:3px}\r\n");
      out.write(".underline {border-bottom:1px solid white; font: bold 12px Arial; line-height:12px; color:#000; padding-top:3px}\r\n");
      out.write("\r\n");
      out.write("#thisDiv {\r\n");
      out.write("    background:#FCF1BF;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("\twidth:100%; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"height()\">\r\n");
      out.write("\r\n");
      out.write("<a href=\"javascript:changeImage('../r1/r1_editindices.gif')\">change image</a><br><br>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function height() {\r\n");
      out.write("\tvar imgHeight = document.getElementById(\"thisImage\").height;\r\n");
      out.write("\tdocument.getElementById(\"thisDiv\").style.height = imgHeight+20;\r\n");
      out.write("\tdocument.getElementById(\"thisDiv\").style.paddingTop = 10;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function changeImage(src) {\r\n");
      out.write("\tdocument.images[\"thisImage\"].src = src;\r\n");
      out.write("\theight();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include1.jsp" + (("include1.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("requestedPage", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("1", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("<!-- <div id=\"thisSpan\" style=\"position:absolute; padding:0;font-size:10px\">\r\n");
      out.write("    <img src=\"../r2/r2_storyeditmaster.gif\" id=\"thisImage\" alt=\"\" />\r\n");
      out.write("</div> -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
