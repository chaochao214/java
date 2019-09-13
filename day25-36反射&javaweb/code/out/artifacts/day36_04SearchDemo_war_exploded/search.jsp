<%--
  author:twc
  Time: 2019/5/6 21:09
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试项目</title>
</head>
<style type="text/css">
    .content {
        width: 643px;
        margin: 200px auto;
        text-align: center;
    }

    input[type='text'] {
        width: 530px;
        height: 40px;
        font-size: 14px;
    }

    input[type='button'] {
        width: 100px;
        height: 46px;
        background: #38f;
        border: 0;
        color: #fff;
        font-size: 15px
    }

    .show {
        position: absolute;
        width: 535px;
        height: 100px;
        border: 1px solid #999;
        border-top: 0;
    }
</style>
<script type="text/javascript" src="jquery-3.3.1.js"></script>
<script type="text/javascript">
    function search(obj) {
        //如果输入框的内容不为空
        if (obj.value.trim() != "") {
            //将 div显示出来
            $(".show").css("display", "block")
            //像服务器发送一个异步请求,并将用户搜索的关键字作为参数传递
            $.post("search", "keyword=" + obj.value, function (result) {
                //result 就是获取到的服务器的json数据
                // result 实际上就是一个json数组
                // 添加遍历之前，清空table的所有子标签
                $("#content").empty();
                $.each(result, function (index, element) {
                    var name = element.name;
                    $("#content").append("<tr><td>" + name + "</td></tr>")
                })
            }, "json")

        } else {
            // 输入框中的内容为空，隐藏div
            $(".show").css("display", "none")
    }

    }


</script>

<body>
<div class="content">
    <img alt="" src="logo.png"><br/><br/>
    <input type="text" name="word" onkeyup="search(this)">
    <input type="button" value="搜索一下">
    <div class="show" style="display: none">
        <table id="content" width="100%"></table>
    </div>
</div>
</body>
</html>
