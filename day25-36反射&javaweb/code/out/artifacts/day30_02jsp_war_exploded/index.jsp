<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/25
  Time: 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>数据展示界面</title>
</head>

<body>
<h1>数据展示界面</h1>
<table border="1px" cellpadding="0px" width="600px">
    <%
        List<String> list = (List<String>) request.getAttribute("list");
        for (String s : list) {
    %>
    <tr>
        <td><%=s%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
