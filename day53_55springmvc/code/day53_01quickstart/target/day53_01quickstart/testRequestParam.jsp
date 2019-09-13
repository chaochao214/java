<%--
  author:twc
  Time: 2019/6/22 8:49
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>requestParam</title>
</head>
<body>
<a href="anno/testRequestParam?name=哈哈&&age=22">RequestParam</a>
<!--注意这里是get方法， post方法会报错-->
<form action="anno/testRequestParam" method="get">
    <input type="text"  name ="name">
    <input type="text"  name ="age">
    <input type="submit">
</form>


</body>
</html>
