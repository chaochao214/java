package demo.logindate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * //记录用户的登录时间
 * @Author: twc
 * @Date 2019/4/25 21:14
 **/
@WebServlet(urlPatterns = "/timedemo", name = "timedemo")
public class timedemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-mm-dd/hh:mm:ss");
        String format = sdf.format(date);
        System.out.println(format);
        //数据存入cookie
        Cookie cookie = new Cookie("time",format);
        cookie.setMaxAge(60*60);
        response.addCookie(cookie);

         //第二次访问
        Cookie[] cookies = request.getCookies();
        if (cookies!=null) {
            for (Cookie cookie1 : cookies) {
                if ("time".equals(cookie1.getName())) {
                    response.getWriter().write(cookie1.getValue());
                }
            }
        }


    }
}
