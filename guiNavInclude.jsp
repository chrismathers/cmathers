<%
String[] requestedPageArray = {"storyeditmaster", "inbox", "editindices", "login", "searchcustomer", "summary", "message"};

int reqPageInt = Integer.parseInt(request.getParameter("requestedPageInt"));
int requestedPageInt = 0;
if(reqPageInt+1 < 7) requestedPageInt = Math.min(reqPageInt+1,6);

if(reqPageInt < 3) {
%>
<div class="navInclude">
	<div class="navIncludeLeft">
		<div class="underline">Select a version</div>
			<a href="javascript:changeImage('/r1/r1_<%=requestedPageArray[reqPageInt]%>.gif')"><img src="arrow_lft.gif" width="15" height="13" border="0" align="bottom"></a>
			<a href="javascript:changeImage('/r1/r1_<%=requestedPageArray[reqPageInt]%>.gif')">View old version</a>&nbsp;&nbsp;&nbsp;
			<a href="javascript:changeImage('/r2/r2_<%=requestedPageArray[reqPageInt]%>.gif')">View new version</a>
			<a href="javascript:changeImage('/r2/r2_<%=requestedPageArray[reqPageInt]%>.gif')"><img src="next.gif" width="15" height="13" border="0" align="bottom"></a>
	</div>
	<div class="navIncludeRight">
		<a href="javascript:loadPage('<%=requestedPageInt%>');">Next screenshot</a>
		<a href="javascript:loadPage('<%=requestedPageInt%>');"><img src="next.gif" width="15" height="13" border="0"></a>&nbsp;&nbsp;
		<a href="javascript:closeDiv();">Close<img src="closeX.gif" width="15" height="13" border="0"></a>
	</div>
</div>
<%
} else {
%>
<div class="navInclude navIncludeRight">
<a href="javascript:loadPage('<%=requestedPageInt%>');" class="glink">Next screenshot<img src="next.gif" width="15" height="13" border="0"></a>&nbsp;&nbsp;
<a href="javascript:closeDiv();" class="glink">Close<img src="closeX.gif" width="14" height="12" border="0"></a>
</div>
<%
}
%>

