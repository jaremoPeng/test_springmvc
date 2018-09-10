<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/10 0010
  Time: 下午 2:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><s:message code="sayHello"></s:message></h1>
language:<br>
<a href="?lc=zh_CN">中文</a><br>
<a href="?lc=en_US">英文</a><br>
当前语言: ${pageContext.response.locale }
</body>
</html>
