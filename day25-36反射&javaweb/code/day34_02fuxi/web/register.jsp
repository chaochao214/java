<%@ page import="java.util.Random" %><%--
  author:twc
  Time: 2019/5/3 10:18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册功能</title>

</head>
<body>
<%
    String msg = (String) request.getAttribute("msg");
    if (msg == null) {
        msg = "";
    }
    Random r = new Random();
    int i = r.nextInt(1000);
%>
<div style="color: red"><%=msg%>
</div>
 <%--用get方法为什么会报错--%>
<form action="big?action=register"   method = post>
    <br>注册账号：<input type="text" name="name" value="name"+ <%=i%>>
    <br>注册密码:<input type="text" name="password" value="password" + <%=i%>>
    <br>注册昵称:<input type="text" name="nickname" value="nickname" + <%=i%>>
    <br><input type="submit">
</form>

</body>
</html>
