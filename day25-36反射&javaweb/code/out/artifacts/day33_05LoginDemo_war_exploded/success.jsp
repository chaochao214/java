<%@ page import="demo.domain.User" %><%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2019/4/23
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    //从request域对象中获取user
    User user = (User) request.getAttribute("user");
    //获取user的nickname
    String nickname = user.getNickname();
    if (nickname == null) {
        nickname = "";
    }
%>
<head>
    <title>登录成功页面</title>
</head>
<body>
<p>当前登录用户为：${user.username}</p>
<h1>欢迎<%=nickname%>登录</h1>
<br>
<a href="car.jsp">前往购物车</a>
</body>
</html>
