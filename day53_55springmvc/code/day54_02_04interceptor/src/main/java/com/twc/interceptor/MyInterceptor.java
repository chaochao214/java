package com.twc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: twc
 * @Date 2019/6/3 10:09
 **/
public class MyInterceptor implements HandlerInterceptor {
    /**
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     *  controller 方法执行前，进行拦截的方法防
     *  return true 执行
     *  retrun false 拦截
     *   可以用转发或者重定向直接跳转到指定的页面
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println( "访问controller类之前的执行..");
        return false;

    }
}
