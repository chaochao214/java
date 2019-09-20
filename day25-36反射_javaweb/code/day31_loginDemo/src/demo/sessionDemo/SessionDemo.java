package demo.sessionDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/27 15:02
 **/


@WebServlet(urlPatterns = "/SessionDemo", name = "SessionDemo")
public class SessionDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       /* 实现关闭浏览器仍然可以访问session的数据*/
        /*这里问题有多*/
        HttpSession session = request.getSession();
        System.out.println(session);

        //自己创建一个cookie,要求被浏览器持久化保存起来
        Cookie cookie = new Cookie("twc", session.getId());
        cookie.setMaxAge(30*60);
        response.addCookie(cookie);





    }
}
