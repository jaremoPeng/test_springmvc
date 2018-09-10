<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/9 0009
  Time: 下午 6:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="../js/jquery-3.3.1.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#btn").click(function () {
                if($("input[type='checkbox']").is(':checked')){
                    alert("checked");
                    $("span[id='sp']").attr("hidden","hidden");
                    $("#btn").submit();
                }else{
                    $("span[id='sp']").attr("hidden","");
                }
            });
        });
    </script>
</head>
<body>
<form action="/temp">
    电话号码:<input type="text" name="phone"/><form:errors path="temp.phone"></form:errors><br>
    <input type="checkbox" id="cb" />我已经阅读并同意该协议<span id="sp" hidden="hidden">你还没同意用户使用协议</span><br>
    <input id="btn" type="button" value="提交"/>
</form>
<a href="/modelview">点击查看user信息</a>
</body>
</html>
