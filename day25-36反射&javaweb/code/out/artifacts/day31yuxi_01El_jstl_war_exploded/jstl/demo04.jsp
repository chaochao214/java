<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  author:twc
  Time: 2019/4/26 11:05
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
     List<String> list  = new ArrayList<>();
     list.add("张三");
     list.add("李四");
     list.add("王五");
     list.add("赵柳");
     request.setAttribute("list",list);

     List<Integer> list2 = new ArrayList<>();
     list2.add(1);
     list2.add(2);
     list2.add(3);
     list2.add(4);
     request.setAttribute("list2",list2);


%>
<table border="1" cellpadding="0" width="80">
    <c:forEach items="${list}" var="name" >
        <tr>
             <td>${name}</td>
        </tr>


    </c:forEach>
</table>


</body>
</html>
