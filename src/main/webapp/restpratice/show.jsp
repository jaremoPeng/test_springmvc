<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/7 0007
  Time: 下午 7:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>uid</td>
        <td>uname</td>
    </tr>
    <c:forEach items="${requestScope.pageTools.recordList}" var="record">
        <tr>
            <td>${record.value}</td>
            <td>${record.value}</td>
        </tr>
    </c:forEach>
</table>
<a href="/pagefind?pc=1">首页</a> 总共 ${requestScope.pageTools.totalpage} 页  总记录数 ${requestScope.pageTools.totalrecord}
<c:if test="${requestScope.pageTools.pagecode > 1}"> <!-- 指当前页码大于1的话就显示上一页的连接 -->
    <a href="/pagefind?pc=${requestScope.pageTools.pagecode - 1}">上一页</a>
</c:if>
<c:choose>
    <c:when test="${requestScope.pageTools.totalpage < 6}"><!-- 中间显示的页码格数为六个 如果总页数小于6 -->
        <c:set var="begin" value="1"></c:set>
        <c:set var="end" value="${requestScope.pageTools.totalpage}"></c:set>
    </c:when>
    <c:otherwise>
       <c:choose>
           <c:when test="${requestScope.pageTools.pagecode-3 < 1}"><!-- 如果当前页码-3小于1 -->
               <c:set var="begin" value="1"></c:set>
               <c:set var="end" value="6"></c:set>
           </c:when>
           <c:when test="${requestScope.pageTools.pagecode+2 < requestScope.pageTools.totalpage}"><!-- 如果当前页码+2小于大于总页数 -->
               <c:set var="begin" value="${requestScope.pageTools.totalpage - 5}"></c:set>
               <c:set var="end" value="${requestScope.pageTools.totalpage}"></c:set>
           </c:when>
           <c:otherwise>
               <c:set var="begin" value="${requestScope.pageTools.pagecode - 3}"></c:set>
               <c:set var="end" value="${requestScope.pageTools.pagecode + 2}"></c:set>
           </c:otherwise>
       </c:choose>
    </c:otherwise>
</c:choose>
<c:forEach begin="${begin}" end="${end}" var="i">
    <c:choose>
        <c:when test="${requestScope.pageTools.pagecode eq i}">
            <a style="color: red" aria-disabled="false">${i}</a>
        </c:when>
        <c:otherwise>
            <a style="color: blue" href="/pagefind?pc=${i}">[${i}]</a>
        </c:otherwise>
    </c:choose>
</c:forEach>
<c:if test="${requestScope.pageTools.pagecode < requestScope.pageTools.totalpage}">
    <a href="/pagefind?pc=${requestScope.pageTools.pagecode}">下一页</a>
</c:if>
<a href="/pagefind?pc=${requestScope.pageTools.totalpage}">尾页</a>
</body>
</html>
