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
    <div style="color: red"><%=msg%></div>
    <form action="login" method="post">
        用户名<input type="text" name="name"><br>
        密码<input type="text" name="password"><br>
        <input type="submit" value="登录">
    </form>
</body>
</html>
