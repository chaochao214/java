<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2019/4/23
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<%--
    jsp中既能写HTML代码又能写Java代码，其实jsp也就是一个Servlet
--%>
<%
    //这里就能写Java代码
    //从域对象中取出msg
    String msg = (String) request.getAttribute("msg");

    if (msg == null) {
        msg = "";
    }
%>
<body>
<br>
<p>当前登录用户为：${user.username}</p>
<br>
<div style="color: red"><%=msg%>
</div>
<form action="login" method="post">
    <%-- 用户名<input type="text" name="username" value="jay"><br>
     密码<input type="text" name="password" value="111"><br>--%>

 <%--   用户名<input type="text" name="username"  ${empty cookie.username1.value ? "":value='${cookie.username1.value}'}><br>--%>

    密码<input type="text" name="password"><br>

    记住我<input type="checkbox" name="remember"  ${empty cookie.username1.value ? "":"checked ='checked'"}><br>

    自动登录<input type="checkbox" name="auto"><br>
    <input type="submit" value="登录">
</form>
<a href="car.jsp">前往购物车</a>
</import>
</body>
</html>
