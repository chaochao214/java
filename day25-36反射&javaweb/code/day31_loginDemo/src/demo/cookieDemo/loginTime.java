package demo.cookieDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: twc
 * @Date 2019/4/27 14:31
 **/
@WebServlet(urlPatterns = "/loginTime", name = "loginTime")
public class loginTime extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //规范代码
        response.setCharacterEncoding("UTF-8");
        response.setHeader("content-type", "text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

            Date date = new Date();
            SimpleDateFormat smp = new SimpleDateFormat("yyyy-MM-dd/hh:mm:ss");
            String currentTime = smp.format(date);
            Cookie timeCookie = new Cookie("lastAcessTime", URLDecoder.decode(currentTime, "UTF-8"));

        // 遍历cookie
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if (name.equals("lastAcessTime")) {
                    String lastTiem = cookie.getValue();
                    writer.write("上次的访问时间" + URLDecoder.decode(lastTiem, "UTF-8"));
                    return;
                }

            }
            writer.write("没有找到上次访问数据"+ currentTime);
        } else {
            writer.write("欢迎第一次访问，当前时间是" + currentTime);


        }

        response.addCookie(timeCookie);
    }
}
