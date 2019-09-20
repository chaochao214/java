<%--
  author:twc
  Time: 2019/4/26 10:59
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <%
      int num  =3;
      request.setAttribute("m",num);
 %>
 判断num的值是否大于25:
 <c:if test="${m>25}">
      确实大于25
 </c:if>

 <c:if test="${m<=25}">
     不大于25
 </c:if>
${1>2}
</body>
</html>
