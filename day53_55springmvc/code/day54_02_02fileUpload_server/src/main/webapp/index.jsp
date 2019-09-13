<%@page contentType="Text/html;charset=UTF-8" language="java" %>
<html>
    <body>
        <h2>Hello World!</h2>
        <a href="user/testFileupload">测试文件上传的功能</a>


        <form action="user/testFileupload1" method="post" enctype="multipart/form-data">
            选择文件
            <input type="file" name="upload"/>
            <br/>
            <input type="submit" value="提交"/>

        </form>
        <br></br>


        <form action="user/testFileupload2" method="post" enctype="multipart/form-data">
            springmvc实现文件上传的功能

            选择文件
            <input type="file" name="upload"/>
            <br/>
            <input type="submit" value="提交"/>
        </form>

    </body>
</html>
