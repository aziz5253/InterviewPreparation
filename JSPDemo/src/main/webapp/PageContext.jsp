<%
pageContext.setAttribute("msg", "Hello PageContext");
session.setAttribute("msg","SessionDetails");
request.setAttribute("msg","RequestDetails");
%>

<p>${pageScope.msg}</p>


<%
    // Correct way: use different variable names
    javax.servlet.http.HttpSession sessionObj = pageContext.getSession();
    javax.servlet.http.HttpServletRequest requestObj = 
            (javax.servlet.http.HttpServletRequest) pageContext.getRequest();
%>


<h3>Accessing via pageContext</h3>

<p>Session ID: <%= sessionObj.getId() %></p>
<p>Request Method: <%= requestObj.getMethod() %></p>




