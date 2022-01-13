<%--
  Created by IntelliJ IDEA.
  User: Sergei
  Date: 12.01.2022
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Name user</title>
</head>
<body>
    <h1>Second JSP</h1>
    <p>
        <%
            String firstName = request.getParameter("firstName");
        %>
        <%= "Hello, " + firstName %>
    </p>
</body>
</html>
