<%--
  author:twc
  Time: 2019/5/2 22:02
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>

</head>

<body>

<%
    //登录错误报错
    Object msg = request.getAttribute("msg");
    if (msg == null) {
        msg = "";
    }


    //记住用户账号
    Cookie[] cookies = request.getCookies();
    String str = "";
    String name = "";

    for (Cookie cookie : cookies) {
        if ("name".equals(cookie.getName())) {
            name = cookie.getValue();
            str = "checked='checked'";
        }


        //回显验证码数据
        String vcode = (String) request.getAttribute("vcode");
      /*  if ("Vcode".equals(cookie.getName())) {
            vcode = cookie.getValue();
            System.out.println(vcode);
        }*/

    }
%>
<script>
    function changeVcode(obj) {
        //改变验证码,其实就是重新设置这个img标签的src属性
        obj.src = "checkCode?time=" + new Date();
    }
</script>
<%--无法获取msg的传值
 --%>
<div style="color:red"><%=msg%>
</div>


<form action="big?action=login" method="post">
    <br>姓名：<input type="text" name="name" value="<%=name%>">
    <br>密码：<input type="text" name="password">
    <%-- 动态码怎么动态刷新--%>
    <br>请输入验证码<input type="text" name="vcode" <%--value="<%=vcode%>"--%>>
    <img src="checkCode" width="80px" height="30px" onclick="changeVcode(this)"><br>
    <br>记住用户名字<input type="checkbox" name="remember" <%=str%>>

    <br>自动登录<input type="checkbox" name="auto">
    <br><input type="submit">
</form>
</body>
</html>
