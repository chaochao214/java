package demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/context01")
public class ServletContextDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取服务器创建的ServletContext对象
        ServletContext servletContext = getServletContext();

        //使用request对象获取ServletContext对象
        /*ServletContext servletContext = request.getServletContext();*/

        //使用ServletConfig对象获取ServletContext
        /*ServletContext servletContext = getServletConfig().getServletContext();*/

        //ServletContext对象的作用介绍
        //作用1:作为域对象(容器)存值，实现多个Servlet中的数据共享
        String str = "张三丰";

        //往ServletContext域对象中存放数据str
        servletContext.setAttribute("name",str);

        //移除域对象里面的数据
        servletContext.removeAttribute("name");
    }
}
