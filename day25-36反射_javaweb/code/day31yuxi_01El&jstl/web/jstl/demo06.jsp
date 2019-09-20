<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  author:twc
  Time: 2019/4/26 21:20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<String> list = new ArrayList<>();
    list.add("张三");
    list.add("李四");
    list.add("王五");
    list.add("赵柳");
    list.add("田七");
    request.setAttribute("list", list);
%>
<%--
    varStatus属性表示遍历出来的每一个数据的状态:
        index:遍历出来的每一个数据的下标
        count:遍历出来的每一个数据的序号
        first:遍历出来的数据是否是第一个数据
        last:遍历出来的数据是否是最后一个数据
--%>
<table border="1" cellspacing="0" width="500">
    <tr>
        <th>下标</th>
        <th>序号</th>
        <th>内容</th>
        <th>是否是第一个</th>
        <th>是否是最后一个</th>
    </tr>
    <c:forEach items="${list}" var="obj" varStatus="vst">
    <tr>
         <td>${vst.index}</td>
         <td>${vst.count}</td>
         <td>${obj}</td>
         <td>${vst.first}</td>
         <td>${vst.last}</td>
    </tr>
    </c:forEach>
</table>


</body>
</html>
