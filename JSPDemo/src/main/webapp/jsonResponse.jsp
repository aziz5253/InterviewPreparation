<%
    response.setContentType("application/json");
%>
<p>Welcome ${sessionScope.user}</p>

<%
session.invalidate();
%>

{
  "status": "success",
  "message": "Data processed successfully"
}
