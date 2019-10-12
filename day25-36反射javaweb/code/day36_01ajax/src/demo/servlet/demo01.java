package demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: twc
 * @Date 2019/5/6 19:46
 **/
@javax.servlet.annotation.WebServlet(urlPatterns = "/demo01", name = "demo01")
public class demo01 extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println(username+ "---数据测试");
        PrintWriter writer = response.getWriter();
        writer.write("hello");
    }
}
