<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Sergei
  Date: 12.01.2022
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>First JSP</h1>
    <p>
        <%@ page import="com.javaee.example.additionally.TestClass" %>
        <%
            TestClass testClass = new TestClass();
        %>
        <%= testClass.getInfo() %>
        <%
            for (int i = 0; i < 10; i++) {
                out.println("<p>" + "Hello : " + i + "</p>");
            }
        %>
        <%=
            new Date()
        %>
    </p>
</body>
</html>
