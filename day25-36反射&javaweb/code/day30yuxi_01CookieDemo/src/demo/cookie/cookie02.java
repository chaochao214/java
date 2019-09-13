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
@WebServlet(urlPatterns = "/cookie02", name = "cookie02")
public class cookie02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //测试，以后访问这个项目的任意资源，客户端都会将cookie携带的信息携带过来
        //取出cookie携带过来的数据
        //通过抓包cookie的信息都是由客户端都是通过响应向服务器携带的
        Cookie[] cookies = request.getCookies();
        if(cookies!=null){
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                System.out.println(name+":"+ value);
            }
        }
    }
}
