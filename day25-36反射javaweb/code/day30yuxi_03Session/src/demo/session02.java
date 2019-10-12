package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/25 10:33
 **/
@WebServlet(urlPatterns = "/session02", name = "session02")
public class session02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*   HttpSession session = request.getSession();
         *//* session.setAttribute("uname","aobama");
        String uname = (String) session.getAttribute("uname");
        System.out.println(uname);
*//*
       String uname = (String) session.getAttribute("uname");
        System.out.println("在另一边获得的sessioN"+session);*/
        HttpSession session = request.getSession();
        String str = (String) session.getAttribute("str");
        System.out.println(str);


    }
}
