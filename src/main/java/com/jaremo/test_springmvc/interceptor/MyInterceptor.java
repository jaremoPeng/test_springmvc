package com.jaremo.test_springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
这是一个实现了HandlerInterceptor的自定义拦截器
 */
public class MyInterceptor implements HandlerInterceptor {

    // 这个方法调用action之前调用
    // false: 不让访问action, true: 允许访问action   过滤器在拦截器之前执行,假如过滤器没有通过,即不存在拦截器,
    // 因为核心的serlvet(DispatcherServlet)并未执行,不会产生action
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler)
            throws Exception {
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }
}
