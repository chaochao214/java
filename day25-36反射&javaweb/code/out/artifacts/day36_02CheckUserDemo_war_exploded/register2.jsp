<%--
  author:twc
  Time: 2019/5/15 8:58
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script src="js/jquery-3.3.1.js"></script>

<head>
    <title>注册案例2的解决方案问题</title>
</head>
<script>
    function checkUsername(obj) {
        $.post("checkUsername", "name=" + obj.value, function (result) {
            var data = result.data;
            $("#sp").html(data)
        }, "json")
    }
</script>
<body>
<%--form表单的提交--%>
<form>
    用户名<input type="text" onblur="checkUsername(this)">
    <span id="sp" style="color:red"></span>
</form>

</body>
</html>
