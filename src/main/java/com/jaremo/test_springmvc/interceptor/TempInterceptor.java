package com.jaremo.test_springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TempInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
           String myToken =  request.getParameter("myToken");
           Object seMyToken =  request.getSession().getAttribute("myToken");
           if (myToken == null){ // 说明请求的url中不含有myToken这个参数(不建议)
               return true;
           }
           if(seMyToken != null && myToken.equals(seMyToken.toString()) ){ // 得到session中的值  和  表单中的值,并进行比较
               request.getSession().removeAttribute("myToken"); // 验证一次,删除一次
               return true;
           }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }
}
