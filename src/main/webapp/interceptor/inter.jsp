<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10 0010
  Time: 下午 6:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %> <!-- 引用自定义标签库 -->
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/koukuan">
    <my:tagtoken></my:tagtoken>

    扣款:<input type="text" name="money" /><br>
    <input type="submit" value="提交" />
</form>
</body>
</html>
