<%@ page import="login.domain.User" %><%--
  author:twc
  Time: 2019/5/3 9:45
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功页面</title>
</head>
<body>
<%
    User user = (User) request.getAttribute("user");
    String nickname = user.getNickname();
%>
</body>
  <p>欢迎<%=nickname%>登录</p>
</html>
