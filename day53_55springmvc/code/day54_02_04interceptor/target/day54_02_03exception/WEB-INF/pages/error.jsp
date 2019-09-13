<%--
  author:twc
  Time: 2019/6/3 9:44
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>访问失败页面 </title>

</head>
<body>
<p>request作用域对象</p>
${requestScope}
<P>获取登录失败的信息</P>
${message}
</body>
</html>
