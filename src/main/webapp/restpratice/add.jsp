<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/6 0006
  Time: 下午 2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user" method="post">
    <input type="text" name="id" />
    <input type="text" name="name" />
    <input type="submit" value="提交" />
</form>
</body>
</html>
