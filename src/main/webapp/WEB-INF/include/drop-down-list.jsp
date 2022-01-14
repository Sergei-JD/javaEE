<%--
  Created by IntelliJ IDEA.
  User: Sergei
  Date: 15.01.2022
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Drop-down-list</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/DropDownListServlet" method="post">
        <select name="lang">
            <option value="J">Java</option>
            <option value="C">C++</option>
            <option value="R">Ruby</option>
            <option value="P">Python</option>
            <option value="S">Scala</option>
        </select>
        <input type="submit" value="SEND">
    </form>
</body>
</html>
