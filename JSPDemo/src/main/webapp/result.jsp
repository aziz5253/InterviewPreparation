<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>Result
</title>
</head>
<h2> Form Data recieved</h2>
<p>Welcome ${sessionScope.user}</p>
<%
    // Reading form data using request implicit object
    String user = request.getParameter("username");
    String pass = request.getParameter("password");
	
if (user == null || user.isEmpty()) {
        // Redirect user to login page
        response.sendRedirect("login.jsp");
    } else {
        out.println("Welcome " + user);
    }

%>

<p>Username: <b><%= user %></b></p>
<p>Password: <b><%= pass %></b></p>

</body>
</html>

