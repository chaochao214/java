<%--
  Created by IntelliJ IDEA.
  User: Fanyi Xiao
  Date: 2018/7/8
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
    <%--相对路径
        相对的是当前文件的url地址:http://localhost:8080/requestDemo/index.jsp
         目标文件的url路径:http://localhost:8080/requestDemo/request03
    --%>
    <form action="login" method="post">
      用户名<input type="text" name="username"><br>
      密码<input type="text" name="password"><br>
      <input type="submit" value="登录">
    </form>
    <br>

    <form method="post" action="request04">
      用户名<input type="text" name="username"><br>
      密码<input type="text" name="pwd"><br>
      性别<input type="radio" name="gender" value="male">男
      <input type="radio" name="gender" value="female">女<br>
      兴趣爱好
      <input type="checkbox" name="hobby" value="basketball">篮球
      <input type="checkbox" name="hobby" value="football">足球
      <input type="checkbox" name="hobby" value="pingpang">乒乓球
      <input type="checkbox" name="hobby" value="yumaoball">羽毛球<br>
      <input type="submit" value="注册">
    </form>
  </body>
</html>
