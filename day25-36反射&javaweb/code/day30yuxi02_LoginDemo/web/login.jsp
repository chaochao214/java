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
    //如果是记住用户名，就要勾选那个勾
    String name = "";
    String str = "";
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if ("name".equals(cookie.getName())) {
                name = cookie.getValue();
                str = "checked = 'checked'";
            }
        }
    }
%>
<script>
    function changeVcode(obj) {
        //改变验证码,其实就是重新设置img标签的src属性
        obj.src = "checkCode?time=" + new Date();

    }
</script>
<body>
<div style="color: red"><%=msg%>
</div>
<form action="login" method="post">
    用户名<input type="text" name="name" value="<%=name%>"><br>
    密码<input type="text" name="password"><br>
    验证码<input type="text" name="vcode">
    <img src="checkCode" width="80px" height="30px" onclick="changeVcode(this)"><br>

    <input type="checkbox" name="remember" value="rem" <%=str%>>记住用户名<br>
    <input type="submit" value="登录">
</form>
</body>
</html>
