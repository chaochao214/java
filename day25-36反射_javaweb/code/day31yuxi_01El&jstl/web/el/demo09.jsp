<%--
  author:twc
  Time: 2019/4/26 20:49
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 使用el表达式获取cookie的值 ${cookie}
<br>
${cookie.JSESSIONID}
 <br>
  <%--cookie的value值怎么理解？--%>
${cookie.JSESSIONID.value}

</body>
</html>
