package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class include_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String requestedPage = request.getParameter("requestedPage");

if(requestedPage.equals("0")) {

      out.write("\r\n");
      out.write("<div id=\"thisDiv\">\r\n");
      out.write("\tStory Edit Master<br />\r\n");
      out.write("\t<span class=\"text\">The main story editing screen for TheStreet.com publishing system.</span><br />\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "guiNavInclude.jsp" + (("guiNavInclude.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("requestedPageInt", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("0", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("    <img src=\"../r2/r2_storyeditmaster.gif\" id=\"thisImage\" alt=\"\" />\r\n");
      out.write("</div>\r\n");

} else if(requestedPage.equals("1")) {

      out.write("\r\n");
      out.write("<div id=\"thisDiv\">\r\n");
      out.write("\tIn Box<br />\r\n");
      out.write("\t<span class=\"text\">Story \"In Box\" screen for TheStreet.com publishing system.</span><br />\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "guiNavInclude.jsp" + (("guiNavInclude.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("requestedPageInt", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("1", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("    <img src=\"../r2/r2_inbox.gif\" id=\"thisImage\" alt=\"\" />\r\n");
      out.write("</div>\r\n");

} else if (requestedPage.equals("2")) {

      out.write("\r\n");
      out.write("<div id=\"thisDiv\">\r\n");
      out.write("\tEdit Indices<br />\r\n");
      out.write("\t<span class=\"text\">Edit Indices screen for TheStreet.com publishing system.</span><br />\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "guiNavInclude.jsp" + (("guiNavInclude.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("requestedPageInt", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("2", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("    <img src=\"../r2/r2_editindices.gif\" id=\"thisImage\" alt=\"\" />\r\n");
      out.write("</div>\r\n");

} else if (requestedPage.equals("3")) {

      out.write("\r\n");
      out.write("<div id=\"thisDiv\">\r\n");
      out.write("\tLogin<br />\r\n");
      out.write("\t<span class=\"text\">Login screen for TheStreet.com Customer Service Application.</span><br /><br />\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "guiNavInclude.jsp" + (("guiNavInclude.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("requestedPageInt", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("3", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("    <img src=\"../csr/login.gif\" width=\"782\" height=\"351\" id=\"thisImage\" alt=\"\" />\r\n");
      out.write("</div>\r\n");

} else if (requestedPage.equals("4")) {

      out.write("\r\n");
      out.write("<div id=\"thisDiv\">\r\n");
      out.write("\tSearch Customer<br />\r\n");
      out.write("\t<span class=\"text\">\"Search Customer\" screen for TheStreet.com Customer Service Application.</span><br /><br />\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "guiNavInclude.jsp" + (("guiNavInclude.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("requestedPageInt", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("4", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("    <img src=\"../csr/search_customer.gif\" width=\"792\" height=\"447\" id=\"thisImage\" alt=\"\" border=\"0\"/>\r\n");
      out.write("</div>\r\n");

} else if (requestedPage.equals("5")) {

      out.write("\r\n");
      out.write("<div id=\"thisDiv\">\r\n");
      out.write("\tSummary<br />\r\n");
      out.write("\t<span class=\"text\">\"Summary\" screen for TheStreet.com Customer Service Application.</span><br /><br />\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "guiNavInclude.jsp" + (("guiNavInclude.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("requestedPageInt", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("5", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("    <img src=\"../csr/summary.gif\" width=\"897\" height=\"582\" alt=\"\" border=\"0\"/>\r\n");
      out.write("</div>\r\n");

} else if (requestedPage.equals("6")) {

      out.write("\r\n");
      out.write("<div id=\"thisDiv\">\r\n");
      out.write("\tView/Edit Messages<br />\r\n");
      out.write("\t<span class=\"text\">\"View/Edit Messages\" screen for TheStreet.com Customer Service Application.</span><br /><br />\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "guiNavInclude.jsp" + (("guiNavInclude.jsp").indexOf('?')>0? '&': '?') + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("requestedPageInt", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("6", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("\t<br />\r\n");
      out.write("    <img src=\"../csr/view_edit_message.gif\" width=\"954\" height=\"453\" alt=\"\" border=\"0\"/>\r\n");
      out.write("</div>\r\n");

}

      out.write('\r');
      out.write('\n');
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
