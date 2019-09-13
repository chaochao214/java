<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  author:twc
  Time: 2019/6/3 11:11
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success.jsp </title>
</head>
<body>
<h1>访问成功</h1>
<c:forEach items="${list}" var="account">
    ${account.id} =${account.name}=${account.money} <br>
</c:forEach>
</body>
</html>
