<%--
  author:twc
  Time: 2019/5/4 10:08
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>展示所有</title>
    <link href="css/bootstrap.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.js"></script>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">显示所有联系人</h3>
    <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>

            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${page.list}" var="contact" varStatus="vst">
        <tr>
            <td>${vst.count}</td>
            <td>${contact.name}</td>
            <td>${contact.sex}</td>
            <td>${contact.age}</td>
            <td>${contact.address}</td>
            <td>${contact.qq}</td>
            <td>${contact.email}</td>
            <td><a class="btn btn-default btn-sm" href="big?action=showOne&id=${contact.id}">修改</a>&nbsp;<a
                    class="btn btn-default btn-sm" onclick="delContact('${contact.id}')" href="javascript:;">删除</a>
            </td>
        </tr>
        </c:forEach>
        <tr>
            <td>


                <nav aria-label="Page navigation">
                    <ul class="pagination">
                        <%--如果当前不是第一页，则显示上一页--%>
                        <c:if test="${page.currentPage != 1}">
                            <li>
                                <a href="big?action=page&currentPage=${page.currentPage-1}" aria-label="Previous">
                                    <span aria-hidden="true">上一页</span>
                                </a>
                            </li>
                        </c:if>
                        <%--  循环显示当前页码--%>
                        <c:forEach begin="1" end="${page.totalPage}" var="i">
                            <%--判断当前页等于i的话, 那么高亮显示--%>
                            <c:if test="${page.currentPage==i}">
                                <li class="active">
                                        <%--js空对象，防止a标签跳转--%>
                                    <a href="javascript:;">${i}</a>
                                </li>
                            </c:if>
                            <c:if test="${page.currentPage!=i}">
                                <li><a href="big?action=page&currentPage=${i}">${i}</a></li>
                            </c:if>
                        </c:forEach>
                        <%--如果当期页不是最后一页，则显示下一页--%>
                        <c:if test="${page.currentPage != page.totalPage}">
                            <li>
                                <a href="big?action=page&currentPage=${page.currentPage+1}" aria-label="Next">
                                    <span aria-hidden="true">下一页</span>
                                </a>
                            </li>
                        </c:if>
                    </ul>
                </nav>
            </td>
        </tr>
        <tr>
            <td colspan="8" align="center"><a class="btn btn-primary" href="add.jsp">添加联系人</a></td>
        </tr>
</div>
</table>

</body>
</html>

