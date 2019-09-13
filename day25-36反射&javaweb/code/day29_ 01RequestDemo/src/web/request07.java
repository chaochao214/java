package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/23 20:07
 **/
@WebServlet(urlPatterns = "/request07", name = "request07")
public class request07 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 跳转hello.html
        /**
         *  1.使用重定向进行跳转，其实是客户端执行的跳转操作
         *  2. 重定向的特点：会发起新的请求，跳转操作是由客户端执行的粉
         *  3.浏览器地址栏会编程新的跳转到的地址
         *  4. 可以跳转到任意项目资源
         * // 请求转发的特点。1。不会发起新的请求。2跳转操作由服务器执行
         * 3 .浏览器地址不变 4.只能跳转到本地的资源
         *
         *
         */

        request.getRequestDispatcher("hello.html").forward(request,response);

    }
}
