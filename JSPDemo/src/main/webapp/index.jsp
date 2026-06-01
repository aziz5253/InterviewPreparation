<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page session="false" %>
<%@ page errorPage="error1.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Demo</title>
</head>
<body>

<h2>✅ JSP is Working!</h2>

<p>Current Server Time:</p>
<b><%= new Date() %></b>
 <%!

int count = 0;
public int add(int x, int y) {
    return x + y;
}
 %>
<%
int a = 10;
int b = 20;
out.println(a + b);
out.println(add(10,30));
%>

<%
int x = 10 / 0;
%>



<h3>Result: <%= a + b %></h3>
h3>Result: <%= add(10,30) %></h3>
</body>
</html>
