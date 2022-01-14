<%--
  Created by IntelliJ IDEA.
  User: Sergei
  Date: 15.01.2022
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<title>Checkbox</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/CheckboxServlet" method="post">
        <input type="checkbox" name="lang" value="J"> Java <br>
        <input type="checkbox" name="lang" value="C"> C++ <br>
        <input type="checkbox" name="lang" value="R"> Ruby <br>
        <input type="checkbox" name="lang" value="P"> Python <br>
        <input type="checkbox" name="lang" value="S"> Scala <br>
        <input type="submit" value="SEND">
    </form>
</body>
</html>
