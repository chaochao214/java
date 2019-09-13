<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="hello"> 111111111111111111</a>
<a href="param/testParam?username=twc&age=22">param/testParam的数值</a>

<br>

<form action="anno/testRequestBody" method="post">
    用户名称：<input type="text" name="username"><br/>
    用户密码：<input type="password" name="password"><br/>
    用户年龄：<input type="text" name="age"><br/>
    <input type="submit" value="提交"/>
</form>
<br>
<a href="anno/testRequestBody?body=test">requestBody注解的问题</a>
</body>
</html>
