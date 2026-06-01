
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<h2>Login Form</h2>

<form action="result.jsp" method="post">
    Username:
    <input type="text" name="username" />
    <br><br>

    Password:
    <input type="password" name="password" />
    <br><br>

    <input type="submit" value="Login" />
</form>
<%
session.setAttribute("user", "Shabbir");
%>
</body>
</html>
