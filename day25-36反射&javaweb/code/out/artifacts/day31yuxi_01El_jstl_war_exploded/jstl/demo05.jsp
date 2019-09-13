<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  author:twc
  Time: 2019/4/26 21:11
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String, String> map = new HashMap<>();
    map.put("name", "张三");
    map.put("password", "123456");
    map.put("nickname", "张三风");
    request.setAttribute("map", map);
%>
<c:forEach items="${map.keySet()}" var="val">
    <table border="1" cellpadding="0" width="80">
        <tr>
            <td>  ${val} <br></td>
        </tr>
    </table>
</c:forEach>
</body>
</html>
