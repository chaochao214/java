<%--
  author:twc
  Time: 2019/6/22 9:17
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testRequestBody</title>
</head>
<body>
 post请求  body的注解
<form action="anno/testRequestBody" method="post">
    username <input type="text" name="username">
    password <input type="text" name="password">
    age <input type="submit">
</form>

get请求jsp的代码
<a href="anno/testRequestBody?body=test">requestBody的get请求</a>
</body>
</html>
