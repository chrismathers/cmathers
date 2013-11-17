package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class guiNavInclude1_jsp extends org.apache.jasper.runtime.HttpJspBase
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


String[] requestedPageArray = {"storyeditmaster", "inbox", "editindices", "login", "searchcustomer", "summary", "message"};

int reqPageInt = Integer.parseInt(request.getParameter("requestedPageInt"));
int requestedPageInt = 0;
if(reqPageInt+1 < 7) requestedPageInt = Math.min(reqPageInt+1,6);

if(reqPageInt < 3) {

      out.write("\r\n");
      out.write("<div style=\"width:60%\">\r\n");
      out.write("<div style=\"float:left; padding-left:20px;\">\r\n");
      out.write("<div align=\"center\" class=\"underline\">Select a version</div>\r\n");
      out.write("<a href=\"javascript:changeImage('/r1/r1_");
      out.print(requestedPageArray[reqPageInt]);
      out.write(".gif')\" class=\"glink\"><img src=\"arrow_back.gif\" width=\"15\" height=\"13\" border=\"0\">&nbsp;View old version&nbsp;</a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:changeImage('/r2/r2_");
      out.print(requestedPageArray[reqPageInt]);
      out.write(".gif')\" class=\"glink\">View new version&nbsp;<img src=\"arrow_forward.gif\" width=\"15\" height=\"13\" border=\"0\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("<div align=\"right\" style=\"padding-top:17px; padding-right:5%;\">\r\n");
      out.write("<a href=\"javascript:loadPage('");
      out.print(requestedPageInt);
      out.write("');\" class=\"glink\">Next screenshot&nbsp;<img src=\"next.gif\" width=\"15\" height=\"13\" border=\"0\"></a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:closeDiv();\" class=\"glink\">Close<img src=\"closeX.gif\" width=\"15\" height=\"13\" border=\"0\"></a>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");

} else {

      out.write("\r\n");
      out.write("<div align=\"right\" style=\"padding-right:20%;\">\r\n");
      out.write("<a href=\"javascript:loadPage('");
      out.print(requestedPageInt);
      out.write("');\" class=\"glink\">Next screenshot&nbsp;<img src=\"next.gif\" width=\"15\" height=\"13\" border=\"0\"></a>&nbsp;&nbsp;\r\n");
      out.write("<a href=\"javascript:closeDiv();\" class=\"glink\">Close<img src=\"closeX.gif\" width=\"15\" height=\"13\" border=\"0\"></a>\r\n");
      out.write("</div>\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
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
