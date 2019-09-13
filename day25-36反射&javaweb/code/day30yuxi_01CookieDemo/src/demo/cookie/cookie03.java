package demo.cookie;

import demo.utils.CookieUtil;

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
//为什么找不到这个地址？
@WebServlet(urlPatterns = "/cookie03", name = "cookie03")
public class cookie03 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nickname = CookieUtil.getCookieValue(request, "nickname");
        System.out.println("nickname的值是"+nickname);


    }
}
