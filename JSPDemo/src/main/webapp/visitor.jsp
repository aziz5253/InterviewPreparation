<%@ page language="java" contentType="text/html;charSet=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Visitor Counter</title>
</head>
<body>
<%
	Integer count=(Integer)application.getAttribute("count");
	if(count==null){
		count=0;
	}
	count++;
	//store back in application scope
	application.setAttribute("count",count);
%>

<h2>✅ Application Scope Demo</h2>

<p><b>Total Visitors:</b> <%= count %></p>

<p>
    This count is shared across <b>all users</b>, <b>all sessions</b>, and <b>all browsers</b>.
</p>

</body>
</html>