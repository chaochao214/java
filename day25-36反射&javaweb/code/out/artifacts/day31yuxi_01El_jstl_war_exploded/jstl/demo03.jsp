<%--
  author:twc
  Time: 2019/4/26 20:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <%
        for (int i = 0; i < 10; i++) {

        }
    %>
</head>
<body>
<%--
     begin 表示循环的下表， end表示结束循环的下表
      step表示步长 var 将遍历出来的数据，存放到域对象中的key
 --%>
<c:forEach begin="0" end ="10" step="1" var="i">
    ${i} <br>
</c:forEach>
</body>
</html>
