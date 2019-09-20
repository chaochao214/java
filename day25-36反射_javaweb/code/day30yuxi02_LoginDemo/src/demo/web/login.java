package demo.web;

import demo.Service.UserService;
import demo.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
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
        String remember  = request.getParameter("remember");

        //获取验证码
        HttpSession session = request.getSession();
        String vcode = request.getParameter("vcode");
        String code_session = (String) session.getAttribute("code_session");


        if(code_session.equalsIgnoreCase(vcode)){
            //2.校验登录，直接使用调用业务层的代码了来校验登录
            UserService  us = new UserService();
            User  user = us.checkLogin(username,password);
            //3.判断是否登录成功
            if(user!=null){
                Cookie cookie = new Cookie("username", username);
                cookie.setPath(request.getContextPath());
                if ("rem".equals(remember)) {
                    cookie.setMaxAge(60*60);
                }else{
                    cookie.setMaxAge(0);
                }
                response.addCookie(cookie);
                session.setAttribute("u",user);
                request.getRequestDispatcher("/success.jsp").forward(request,response);
            }else{
                request.setAttribute("msg","用户名或者密码错误");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

        }else{
             //验证码错误
            request.setAttribute("msg","验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request,response);

        }

    }
}
