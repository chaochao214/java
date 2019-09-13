<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页</title>
</head>
<body>
<a href="account/findAllAccount">访问查询账户</a>
<br>
<form action="account/save" method="post">
    姓名 <input type="text" name="name"/>
    金额 <input type="text" name="money">
    <input type="submit" value="保存"><br>
</form>
</body>
</html>
