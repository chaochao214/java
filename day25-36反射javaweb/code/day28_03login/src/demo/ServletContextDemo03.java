package demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/23 10:40
 **/
@WebServlet(urlPatterns = "/ServletContextDemo03", name = "ServletContextDemo03")
public class ServletContextDemo03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          //需求：  获取servlet的真实路径
        ServletContext servletContext = getServletContext();
        String realPath = servletContext.getRealPath("dw1/1.jpg");
        System.out.println(realPath);
    }
}
