package demo.web.servlet;

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
        request.setCharacterEncoding("UTF-8");
        //1.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        String auto = request.getParameter("auto");
        //

        //2.校验登录，直接使用调用业务层的代码了来校验登录
        UserService us = new UserService();
        User user = us.checkLogin(username, password);

        //3.判断是否登录成功
        if (user != null) {
            //登录成功
            //记录我
            if("on".equals(remember)){
                Cookie username1 = new Cookie("username1", username);
                response.addCookie(username1);
            }
            //自动登录
            if ("on".equals(auto)) {
                Cookie infoCooike = new Cookie("info", username + "#" + password);
                infoCooike.setMaxAge(60 * 60 * 7);
                infoCooike.setPath(request.getContextPath());
                response.addCookie(infoCooike);
            }

            //记录登录时间的timeCookie还没有写



            //登录成功之后信息存到域对象session中
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            //跳转页面
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("msg", "用户名或密码错误");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
