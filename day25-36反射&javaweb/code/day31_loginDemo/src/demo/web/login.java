package demo.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: twc
 * @Date 2019/4/26 22:08
 **/
@WebServlet(urlPatterns = "/login", name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String  username = request.getParameter("username");
        String password = request.getParameter("password");
        if("username".equals(username)&&"password".equals("password")){
            writer.write("登录成功");
        }else{
            writer.write("登录失败");
        }

    }
}
