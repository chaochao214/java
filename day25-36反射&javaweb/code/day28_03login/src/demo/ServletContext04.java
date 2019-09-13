package demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: twc
 * @Date 2019/4/23 10:43
 **/
@WebServlet(urlPatterns = "/ServletContext04", name = "ServletContext04")
public class ServletContext04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*ServletContext servletContext = getServletContext();
        InputStream is = servletContext.getResourceAsStream("dw1/1.jpg");
        System.out.println(is);*/



       /* ClassLoader classLoader = this.getClass().getClassLoader();
        InputStream is = classLoader.getResourceAsStream("../../dwl/1.jpg");
        System.out.println(is);*/





    }
}
