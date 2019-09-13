package com.twc.controller;

import com.twc.exception.SysException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: twc
 * @Date 2019/6/3 9:35
 **/
public class SysExceptionResolver implements HandlerExceptionResolver {
    /**
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return 跳转到其他页面的具体方法
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        e.printStackTrace();
        SysException se = null;
        //获取到异常对象
        if (e instanceof SysException) {
            se = (SysException) e;
        } else {
            se = new SysException("请联系管理元");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", se.getMessage());
        mv.setViewName("error");
        return mv;

    }
}
