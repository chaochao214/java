package login.web.filter;

import login.domain.User;
import login.service.serviceCrud;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/5/4 8:29
 **/
@WebFilter(urlPatterns = "/*")
public class Autologin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            String info = "";
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                if ("info".equals(cookie.getName())) {
                    info = cookie.getValue();
                    String[] split = info.split("#");
                    String username = split[0];
                    String password = split[1];
                    serviceCrud sc = new serviceCrud();
                    user = sc.checkLogin(username, password);
                    System.out.println("成功实现自动登录");
                    session.setAttribute("user", user);
                }
            }

        }

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
