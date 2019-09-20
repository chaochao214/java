<%--
  author:twc
  Time: 2019/5/2 21:53
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  <c:if test="${empty user}">
      <div>
        <br><a href="login.jsp">登录</a>
        <br><a href="register.jsp">注册</a>
        <br><a href="car.jsp">购物车</a>
      </div>
  </body>
  </c:if>
  <c:if test="${not empty user}">
    <div>
       <h2>欢迎${user.nickname}登录,上次登陆的时间是${cookie.time.value}</h2>
       <a href="car.jsp">购物车</a>
    </div>
  </c:if>
</html>
