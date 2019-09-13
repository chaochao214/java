<%--
  author:twc
  Time: 2019/6/2 20:08
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>update.jsp</title>
<%--修改用户的属性--%>
</head>

<body>
${requestScope }
<form action="${pageContext.request.contextPath}/user/userUpdate" method="post">
   姓名 <input type="text" name="username" value="${user.username}" >
<%----     密码<input type="text" name="password" value="${user.password}" >--%>
    年龄<input type="text" name="age"  value="${user.age}" >
    <input type="submit" value="提交">
</form>



</body>
</html>
