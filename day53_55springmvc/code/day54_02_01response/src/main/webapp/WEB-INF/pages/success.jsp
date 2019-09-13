<%--
  author:twc
  Time: 2019/6/2 19:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
访问成功

遍历所有的数据
<c:forEach items="${ list}" var="user">
    ${ user.username}-- ${ user.age}

</c:forEach>

</body>
</html>
