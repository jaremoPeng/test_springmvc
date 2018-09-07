<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/7 0007
  Time: 下午 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 文件上传 -->
<form action="/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file" />
    <input type="submit" value="上传">
</form>
</body>
</html>
