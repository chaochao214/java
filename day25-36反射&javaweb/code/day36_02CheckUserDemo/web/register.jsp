<%--
  author:twc
  Time: 2019/5/6 20:11
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        function checkUsername(obj) {
            $.post("checkUsername", "username=" + obj.value, function (result) {
                var data = result.data;
                $("#sp").html(data)
            }, "json")
        }
    </script>
</head>
<form action="" method="post">
    用户名<input type="text" onblur="checkUsername(this)">
    <span id="sp" style="color:red"></span>

</form>
<body>

</body>
</html>
