package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/guiNavInclude.jsp");
  }

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
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");

String requestedPage = request.getParameter("requestedPage");

if(requestedPage.equals("storyeditmaster")) {

      out.write("\r\n");
      out.write("<div align=\"center\"><span class=\"name\">Story Edit Master</span><span class=\"text\"><br>\r\n");
      out.write("The main story editing screen for TheStreet.com publishing system.<span><br><br>\r\n");
      out.write("<a href=\"javascript:switchImage('old');\" class=\"glink\"><img src=\"arrow_back.gif\" width=\"15\" height=\"13\" border=\"0\">&nbsp;Old version&nbsp;</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage('new');\" class=\"glink\">New version&nbsp;<img src=\"arrow_forward.gif\" width=\"15\" height=\"13\" border=\"0\"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage('new');\" class=\"glink\">Next screenshot&nbsp;<img src=\"next.gif\" width=\"15\" height=\"13\" border=\"0\"></a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage();\" class=\"glink\">Close</a><img src=\"closeX.gif\" width=\"15\" height=\"13\" border=\"0\">\r\n");
      out.write("\r\n");
      out.write("<br><br></div>\r\n");
      out.write("<div style=\"display:none\" id=\"old\"><img src=\"r1/r1_storyeditmaster.gif\" width=\"910\" height=\"560\" alt=\"\" border=\"0\"></div>\r\n");
      out.write("<div style=\"display:none\" id=\"new\"><img src=\"r2/r2_storyeditmaster.gif\" width=\"910\" height=\"560\" alt=\"\" border=\"0\"></div>\r\n");

} else if(requestedPage.equals("inbox")) {

      out.write("\r\n");
      out.write("<div align=\"center\"><span class=\"name\">In Box</span><span class=\"text\"><br>\r\n");
      out.write("Story \"In Box\" screen for TheStreet.com publishing system.<span><br><br>\r\n");
      out.write("<a href=\"javascript:switchImage('old');\" class=\"glink\"><img src=\"arrow_back.gif\" width=\"15\" height=\"13\" border=\"0\">&nbsp;Old version&nbsp;</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage('new');\" class=\"glink\">New version&nbsp;<img src=\"arrow_forward.gif\" width=\"15\" height=\"13\" border=\"0\"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage('new');\" class=\"glink\">Next screenshot&nbsp;<img src=\"next.gif\" width=\"15\" height=\"13\" border=\"0\"></a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage();\" class=\"glink\">Close</a><img src=\"closeX.gif\" width=\"15\" height=\"13\" border=\"0\">\r\n");
      out.write("\r\n");
      out.write("<br><br></div>\r\n");
      out.write("<div style=\"display:none\" id=\"old\"><img src=\"r1/r1_inbox.gif\" width=\"997\" height=\"547\" alt=\"\" border=\"0\"></div>\r\n");
      out.write("<div style=\"display:none\" id=\"new\"><img src=\"r2/r2_inbox.gif\" width=\"997\" height=\"547\" alt=\"\" border=\"0\"></div>\r\n");

} else if (requestedPage.equals("editindices")) {

      out.write("\r\n");
      out.write("<div align=\"center\"><span class=\"name\">Edit Indices</span><span class=\"text\"><br>\r\n");
      out.write("Edit Indices screen for TheStreet.com publishing system.<span><br><br>\r\n");
      out.write("<a href=\"javascript:switchImage('old');\" class=\"glink\"><img src=\"arrow_back.gif\" width=\"15\" height=\"13\" border=\"0\">&nbsp;Old version&nbsp;</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage('new');\" class=\"glink\">New version&nbsp;<img src=\"arrow_forward.gif\" width=\"15\" height=\"13\" border=\"0\"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage('new');\" class=\"glink\">Next screenshot&nbsp;<img src=\"next.gif\" width=\"15\" height=\"13\" border=\"0\"></a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:switchImage();\" class=\"glink\">Close</a><img src=\"closeX.gif\" width=\"15\" height=\"13\" border=\"0\">\r\n");
      out.write("\r\n");
      out.write("<br><br></div>\r\n");
      out.write("<div style=\"display:none\" id=\"old\"><img src=\"r1/r1_editindices.gif\" width=\"989\" height=\"571\" alt=\"\" border=\"0\"></div>\r\n");
      out.write("<div style=\"display:none\" id=\"new\"><img src=\"r2/r2_editindices.gif\" width=\"849\" height=\"593\" alt=\"\" border=\"0\"></div>\r\n");

}

      out.write("\r\n");
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
