<%--
  author:twc
  Time: 2019/5/5 21:53
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery-3.3.1.js"></script>

<html>


<head>
    <title>$Title$</title>
</head>
<script>
    function fn1() {
        var xhr = new XMLHttpRequest();
        xhr.open("GET", "demo01?name=aobama")
        xhr.send()
        xhr.onreadystatechange = function () {
            var text = xhr.responseText;
            document.getElementById("sp").innerHTML = text;
        }
    }

    function fn2() {


    }

    /**
     *  ajax请求的参数？
     *   第一个参数： 请求路径URL
     *    第二个参数：携带的参数 name  = twc $ test = 1或者json数据类型房
     *     第三个参数，回调函数，这里一般是用来搞局部刷新的问
     *     第四个参数： 响应是数据类型的问题 , 默认为 "text"表示普通文本
     *
     */
    function fn3() {
        $.get("demo01", "username=jay", function (result) {
            $("#sp").html(result)
        }, "text")
    }

    function fn4() {
        $.get("demo01", "username=twc", function (result) {
            $("#sp").html(result)
        }, "text")

    }


</script>
<body>
<%--直接发起同步请求--%>
<br><a href="demo01?name =aobama">网页 ——发起同步请求</a>
<%-- 原生js发送异步请求--%>
<br><a href="javascript:;" onclick="fn1()">js_发起异步get请</a>
<br><a href="javascript:;" onclick="fn2()">js_发起异步post请</a>

<br>
<%--jq的异步请求--%>
<br><a href="javascript:;" onclick="fn3()">发起异步的get请求</a>
<br><a href="javascript:;" onclick="fn4()">发起异步的post请求</a>

<br>


<span id="sp" style="color:red"></span>
</body>
</html>
