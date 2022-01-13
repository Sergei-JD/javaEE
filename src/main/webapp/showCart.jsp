<%@ page import="com.javaee.example.additionally.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Sergei
  Date: 13.01.2022
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <% Cart cart = (Cart) session.getAttribute("cart"); %>

    <p> NAME: <%= cart.getName() %> <p>
    <P> QUANTITY: <%= cart.getQuantity() %> <p>
</body>
</html>
