<%--
  author:twc
  Time: 2019/4/27 15:48
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
   String msg= (String)request.getAttribute("msg");
   if(msg==null){
        msg="";
   }
   String str= "";

%>
<div style="color: red;"><%=msg%></div>
<form action="loginServlet" method="post">
    <br>用户名<input type="text" name="name">
    <br>密码 <input type="text" name="password">
    <br><input type="checkbox" name="remember" value="rem"  <%=str%>>>记住用户名
    <br><input type="submit" value="登录">
</form>
</body>
</html>
