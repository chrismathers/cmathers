<%
String[] requestedPageArray = {"storyeditmaster", "inbox", "editindices", "login", "searchcustomer", "summary", "message"};
String requestedPage = request.getParameter("requestedPage");

if(requestedPage.equals("0")) {
%>
<div id="thisDiv">
	Story Edit Master<br />
	<span class="text">The main story editing screen for TheStreet.com publishing system.</span><br />
	<jsp:include page="guiNavInclude.jsp">
		<jsp:param name="requestedPageInt" value="0"/>
	</jsp:include>
	<br />
    <img src="../r2/r2_storyeditmaster.gif" id="thisImage" alt="" />
</div>
<%
} else if(requestedPage.equals("1")) {
%>
<div id="thisDiv">
	In Box<br />
	<span class="text">Story "In Box" screen for TheStreet.com publishing system.</span><br />
	<jsp:include page="guiNavInclude.jsp">
		<jsp:param name="requestedPageInt" value="1"/>
	</jsp:include>
	<br />
    <img src="../r2/r2_inbox.gif" id="thisImage" alt="" />
</div>
<%
} else if (requestedPage.equals("2")) {
%>
<div id="thisDiv">
	Edit Indices<br />
	<span class="text">Edit Indices screen for TheStreet.com publishing system.</span><br />
	<jsp:include page="guiNavInclude.jsp">
		<jsp:param name="requestedPageInt" value="2"/>
	</jsp:include>
	<br />
    <img src="../r2/r2_editindices.gif" id="thisImage" alt="" />
</div>
<%
} else if (requestedPage.equals("3")) {
%>
<div id="thisDiv">
	Login<br />
	<span class="text">Login screen for TheStreet.com Customer Service Application.</span><br /><br />
	<jsp:include page="guiNavInclude.jsp">
		<jsp:param name="requestedPageInt" value="3"/>
	</jsp:include>
	<br />
    <img src="../csr/login.gif" width="782" height="351" id="thisImage" alt="" />
</div>
<%
} else if (requestedPage.equals("4")) {
%>
<div id="thisDiv">
	Search Customer<br />
	<span class="text">"Search Customer" screen for TheStreet.com Customer Service Application.</span><br /><br />
	<jsp:include page="guiNavInclude.jsp">
		<jsp:param name="requestedPageInt" value="4"/>
	</jsp:include>
	<br />
    <img src="../csr/search_customer.gif" width="792" height="447" id="thisImage" alt="" border="0"/>
</div>
<%
} else if (requestedPage.equals("5")) {
%>
<div id="thisDiv">
	Summary<br />
	<span class="text">"Summary" screen for TheStreet.com Customer Service Application.</span><br /><br />
	<jsp:include page="guiNavInclude.jsp">
		<jsp:param name="requestedPageInt" value="5"/>
	</jsp:include>
	<br />
    <img src="../csr/summary.gif" width="897" height="582" alt="" border="0"/>
</div>
<%
} else if (requestedPage.equals("6")) {
%>
<div id="thisDiv">
	View/Edit Messages<br />
	<span class="text">"View/Edit Messages" screen for TheStreet.com Customer Service Application.</span><br /><br />
	<jsp:include page="guiNavInclude.jsp">
		<jsp:param name="requestedPageInt" value="6"/>
	</jsp:include>
	<br />
    <img src="../csr/view_edit_message.gif" width="954" height="453" alt="" border="0"/>
</div>
<%
}
%>
