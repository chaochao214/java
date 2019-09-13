<%--
  author:twc
  Time: 2019/6/2 20:08
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>update.jsp</title>

</head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body>

路径：web_info/pags/update.jsp
<form action="${pageContext.request.contextPath}/user/update" method="post">
    姓名 <input type="text" name="username" value="${user.username}">
  <%--  密码<input type="text" name="password" value="${user.password}">--%>
    年龄<input type="text" name="age" value="${user.age}">
    <input type="submit" value="提交">
</form>


</body>
</html>
