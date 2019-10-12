package demo.web3.web;

import demo.web3.Service.UserService;
import demo.web3.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: twc
 * @Date 2019/4/27 10:35
 **/
@WebServlet(urlPatterns = "/login3", name = "login3")
public class login3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserService us = new UserService();
        User user = us.daoFindUser(username, password);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        if (user != null) {
            writer.write("登录成功");
        } else {
            request.setAttribute("msg", "wrongmessag");
           // writer.write("登录失败");
             request.getRequestDispatcher("login.jsp").forward(request,response);
        }

    }
}
