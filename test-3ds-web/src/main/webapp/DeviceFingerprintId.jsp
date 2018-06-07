<%@ page contentType="text/html;charset=UTF-8"  language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%

//DF: TEST = 1snn5n9w, LIVE = k8vif92e 
String DF_ORG_ID   = "1snn5n9w"; 
String MERCHANT_ID = "kr950210047";
String sess_id     = request.getSession().getId();
String df_param    = "org_id=" + DF_ORG_ID + "&amp;session_id=" + MERCHANT_ID + sess_id;

%>

<!-- DF START -->
<div style="color: #ccc">
<ul>
<li>device_fingerprint_id: <%= sess_id %></li>
<li>df_param: <%= df_param %></li>
</ul>
<p style="background:url(https://h.online-metrix.net/fp/clear.png?<%= df_param %>&amp;m=1)" />
<img src="https://h.online-metrix.net/fp/clear.png?<%= df_param %>&amp;m=2" width="1" height="1" />
</div>
<!-- DF END -->