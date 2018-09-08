<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/8 0008
  Time: 下午 2:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/verify">
    用户名:<input type="text" name="userName"/><form:errors path="userInfo.userName"></form:errors><br>
    密码:<input type="password" name="password"/><form:errors path="userInfo.password"></form:errors><br>
    验证密码:<input type="password" name="repassword"/><form:errors path="userInfo.repassword"></form:errors><br>
    年龄:<input type="text" name="age"/><form:errors path="userInfo.age"></form:errors><br>
    电话号码:<input type="text" name="phone"/><form:errors path="userInfo.phone"></form:errors><br>
    邮箱地址:<input type="text" name="email"/><form:errors path="userInfo.email"></form:errors><br>
    出生日期:<input type="text" name="birthDate" /><form:errors path="userInfo.birthDate"></form:errors><br>
    个人网址:<input type="text" name="privyUrl"/><form:errors path="userInfo.privyUrl"></form:errors><br>
    <input type="submit" value="提交" />
</form>
</body>
</html>
