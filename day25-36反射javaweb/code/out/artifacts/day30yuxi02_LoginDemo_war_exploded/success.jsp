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
    /*//从request域对象中获取user
    User user = (User) request.getAttribute("user");
    //获取user的nickname
    String nickname = user.getNickname();
    if (nickname == null) {
        nickname = "";
    }
*/
 User user  = (User) session.getAttribute("u");

%>
<head>
    <title>登录成功页面</title>
</head>
<body>
<h1>欢迎<%=user.getNickname()%>登录</h1>
</body>
</html>
