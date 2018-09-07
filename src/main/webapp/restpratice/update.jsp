<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/6 0006
  Time: 下午 7:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/3" method="post">
    <input type="hidden" name="_method" value="put" />
    <input type="text" name="uname" />
    <input type="submit" value="提交" />
</form>
</body>
</html>
