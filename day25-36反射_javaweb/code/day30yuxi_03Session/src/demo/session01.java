package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/25 10:33
 **/
@WebServlet(urlPatterns = "/session01", name = "session01")
public class session01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* HttpSession session = request.getSession();
        session.setAttribute("uname","aobama");
        String uname = (String) session.getAttribute("uname");
        System.out.println(uname);*/
    //通过设置Cookie
        //seesion id?

        HttpSession session = request.getSession();
        System.out.println(session);
        Cookie cookie = new Cookie("twc", session.getId());
        cookie.setMaxAge(30*60);
        cookie.setPath(request.getContextPath());
        response.addCookie(cookie);

       /* String jay = "jay";
        session.setAttribute("str",jay);*/



    }
}
