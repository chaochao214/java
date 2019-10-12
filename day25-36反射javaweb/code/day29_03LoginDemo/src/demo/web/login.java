package demo.web;

import demo.Service.UserService;
import demo.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: twc
 * @Date 2019/4/24 10:11
 **/
@WebServlet(urlPatterns = "/login", name = "login")
public class login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //2.校验登录，直接使用调用业务层的代码了来校验登录
        UserService  us = new UserService();
        User  user = us.checkLogin(username,password);
        //3.判断是否登录成功

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        if(user!=null){
          //  writer.write("登录成功");
             request.setAttribute("user",user);
             request.getRequestDispatcher("success.jsp").forward(request,response);
        }else{
            request.setAttribute("msg","用户名或密码错误");
           // response.sendRedirect("login.jsp");
            request.getRequestDispatcher("login.jsp").forward(request,response);
           // writer.write("登录失败");
        }
    }
}
