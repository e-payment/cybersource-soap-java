<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%
	String contextPath = request.getContextPath();
	String PaRes = request.getParameter("PaRes");
	String MD = request.getParameter("MD");

	if (PaRes != null) {
%>

<pre>
<%
    Map params = new HashMap();
    List<String> keys = Collections.list(request.getParameterNames());

	for (String name: keys) { 
		out.print(name + ": " + request.getParameter(name) + "\n");
	}
%>
</pre>

<body onload="document.ACSResponseForm.submit();">
<!-- <body> -->
	<form id="ACSResponseForm" name="ACSResponseForm" action="<%= contextPath %>/PayerAuthValidate.jsp" method="post" target="_self">
		<input type="hidden" name="PaRes" value="<%= PaRes %>" />
		<input type="hidden" name="MD" value="<%= MD %>" />
		<input type="submit" />
	</form>
</body>

<%
	} else {
%>
invalid PaRes value
<%
	}
%>