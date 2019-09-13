package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Author: twc
 * @Date 2019/4/23 19:57
 **/
@WebServlet(urlPatterns = "/RequestDemo02", name = "RequestDemo02")
public class RequestDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求头的信息
        System.out.println(request.getHeader("user-agent"));
       //枚举请求头的信息
        Enumeration<String> names = request.getHeaderNames();
        while(names.hasMoreElements()){
            String s = names.nextElement();
            System.out.print(s);
            System.out.println(":"+request.getHeader(s));
        }
        System.out.println("-------");
        String refer =request.getHeader("referer");
        System.out.println(refer);

    }
}
