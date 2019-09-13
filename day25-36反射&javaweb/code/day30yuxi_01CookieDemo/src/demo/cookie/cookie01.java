package demo.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/25 8:57
 **/
@WebServlet(urlPatterns = "/cookie01", name = "cookie01")
public class cookie01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*//使用cookie技术，往客户端存放一个数据
        Cookie cookie = new Cookie("name", "aobama");
        //删除cookie的信息
        cookie.setMaxAge(0);
        //设置cookie可以被使用的路径
        cookie.setPath(request.getContextPath()+"/cookie02");
        response.addCookie(cookie);*/
        String str = "jay";
        Cookie cookie = new Cookie("uname", str);
        cookie.setMaxAge(60*60);
        cookie.setPath(request.getContextPath()+"/cookie02");
        response.addCookie(cookie);

        String str2 = "nickname";
        Cookie cookie2 = new Cookie("nickname", str2);
        cookie.setMaxAge(60*60);
        cookie.setPath(request.getContextPath()+"/cookie03");
        response.addCookie(cookie2);

    }
}
