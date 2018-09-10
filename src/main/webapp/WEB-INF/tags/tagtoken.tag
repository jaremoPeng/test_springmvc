<%@ tag import="java.util.*" language="java" pageEncoding="UTF-8" %> <%-- 导包,设置编程语言,设置页面的编码 --%>
<%@ attribute name="tokenName" required="false" %> <%----%>
<%--
    防止重复提交 自定义标签库
        方式:设置session令牌
        在自定义标签库中,产生随机且唯一的一个值,放在一个提交表单中,并且同时将此值保存在session域中,
        在指定的拦截器中,判断表单传入的值,和session域中的值是否一致,并且比较key和输入框的名字是否
        一致,如若有一项不同,则拦截此请求
--%>
<%
    String randomStr = UUID.randomUUID().toString();
    String key = (tokenName==null?"myToken":tokenName);
    request.getSession().setAttribute(key,randomStr);
%>
<input type="hidden" name="<%=key %>" value="<%=randomStr %>" />