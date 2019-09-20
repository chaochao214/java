<%--
  author:twc
  Time: 2019/4/26 20:04
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap模板</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
</head>
>
<body>
<div class="container">
    <center><h3>修改</h3></center>

    <br/>测试${contact.id}
    <br/>测试${contact.name}
    <br/>测试${contact.sex}

    <form action="update" method="post">
        <input type="hidden" name="id" value="简单测试">
        <div class="from-group">
            <label for="name">姓名</label>
            <input type="text" class="form-control" id="name" name="name" value=<%=request.getParameter("name")%>
            >
        </div>

        <div class="from-group">
            <label for="name">年龄</label>
            <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄" value=age>
        </div>
        <div class="form-group">
            <label>性别：</label>
            <input type="radio" name="sex" value="男" checked="checked"/>男
            <input type="radio" name="sex" value="女"/>女
        </div>
        <div class="from-group">
            <label for="address">籍贯</label>
            <input type="text" class="form-control" id="address" name="address"
                   placeholder="请输入籍贯" <%=request.getParameter("address")%>>
        </div>

        <div class="from-group">
            <label for="name">qq</label>
            <input type="text" class="form-control" id="qq" name="qq" placeholder="请输入qq"
                   value="<%=request.getParameter("qq")%>">
        </div>

        <div class="from-group">
            <label for="name">email</label>
            <input type="text" class="form-control" id="email" name="email" placeholder="请输入邮箱"
                <%=request.getParameter("email")%>>
        </div>

        <div class="form-group" style="text-align:center">
            <input class="btn btn-primary" type="submit" value="提交"/>
            <input class="btn btn-default" type="reset" value="重置"/>
            <input class="btn btn-default" type="button" value="返回"/>
        </div>
    </form>
</div>
</body>
</html>
