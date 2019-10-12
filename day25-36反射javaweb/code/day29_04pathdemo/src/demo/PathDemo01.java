package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/24 10:42
 **/
@WebServlet(urlPatterns = "/demo01", name = "PathDemo01")
public class PathDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("/demo01收到了请求...");
        // 请求转发到hello.html
        //url:http://localhost:8080/day29_04/hello.html
        request.getRequestDispatcher("/hello.html").forward(request,response);

    }
}
