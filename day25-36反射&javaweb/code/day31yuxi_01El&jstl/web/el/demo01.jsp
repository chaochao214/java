<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/26
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>使用el表达式获取域对象中存放的简单数据类型</title>

</head>
<body>
    <%
        /*域对象设置对象的时候要使用setAtrribute，获取对象用getAttribute*/
        application.setAttribute("msg","applicationVal");
        session.setAttribute("msg","sessionVal");
        request.setAttribute("msg","requestVal");

       /* (String)application.getAttribute("msg")*/
    %>
    msg=${applicationScope.msg}<br>
    msg=${sessionScope.msg}<br>
    msg=${requestScope.msg}<br>

</body>

</html>
