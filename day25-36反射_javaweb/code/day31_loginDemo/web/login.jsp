<%--
  author:twc
  Time: 2019/4/27 10:25
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    String msg = (String) request.getAttribute("msg");
    if (msg == null) {
        msg = "";
    }
%>
<body>
<div style="color:red"><%=msg%>
</div>
<form action="login3" method="post">
    用户名<input type="text" name="name"><br>
    密码 <input type="text" name="password"><br>
    <input type="submit" value="登录">
</form>

</body>

</html>
