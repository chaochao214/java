<%--
  author:twc
  Time: 2019/6/2 20:00
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery.min.js"></script>
<script>
    $(function() {
        $("#btn").click(function () {
            alert("ok")
            $.ajax({
                url: "user/testJson",
                contentType: "application/json;charset=UTF-8",
                data: '{"username":"tom","age":30}',
                dataType: "json",
                type: "post",
                success: function (data) {
                    alert(data);
                    alert(data.username);
                    alert(data.age);
                }
            });

        })
    })
</script>
<html>
responsBody 和json的数据问题
<input type="button" value="提交" id="btn">
<head>
    <title>response.jsp</title>
</head>
<h3>返回modelAndView对</h3>
<a href="user/testModelAndView">modelAndView</a>

<body>

</body>
</html>
