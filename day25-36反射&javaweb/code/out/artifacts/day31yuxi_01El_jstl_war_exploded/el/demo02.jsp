<%--
  author:twc
  Time: 2019/4/26 10:44
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String[] arr = {"name","name2"};
    request.setAttribute("arr",arr);

%>
</body>
 ${arr[0]},${arr[1]}
</html>
