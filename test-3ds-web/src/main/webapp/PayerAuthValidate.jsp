<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<h2>PayerAuthValidate</h2>
<pre>
<%
    Map params = new HashMap();
    List<String> keys = Collections.list(request.getParameterNames());

	for (String name: keys) { 
		out.print(name + ": " + request.getParameter(name) + "\n");
	}
%>
</pre>

process next step => PayerAuthValidateAndAuthorize