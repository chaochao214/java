package demo.servletDemo01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/29 20:16
 **/
@WebServlet(urlPatterns = "/demo01", name = "ServletDemo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* System.out.println("demo01收到了请求");
        request.getRequestDispatcher("demo02");*/
        String username = request.getParameter("username");
        System.out.println(username);
        response.getWriter().write(username);

    }
}
