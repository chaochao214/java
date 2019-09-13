package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/23 19:46
 **/
@WebServlet(urlPatterns = "/RequestDemo01", name = "RequestDemo01")
public class RequestDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //request的第一个作用，获取请求行的信息
        //1. 获取请求行的方式
         String method  =  request.getMethod();
        System.out.println(method);
        /**
         *  2.获取请求的URI以及请求的URL
         */
        /*String uri = request.getRequestURI();
        System.out.println("uri"+  uri);
        StringBuffer requestURL = request.getRequestURL();
        System.out.println("url"+requestURL);*/

        //协议版本
        System.out.println(request.getProtocol());
        System.out.println(request.getRemoteAddr());

    }
}
