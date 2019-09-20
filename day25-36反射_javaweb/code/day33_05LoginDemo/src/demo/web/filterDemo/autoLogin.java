package demo.web.filterDemo;

import demo.Service.UserService;
import demo.domain.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/30 14:14
 **/
@WebFilter(urlPatterns = "/*")
public class autoLogin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request   = (HttpServletRequest) req;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user==null) {
            Cookie[] cookies = request.getCookies();
            for (Cookie cookie : cookies) {
                 if("info".equals(cookie.getName())){
                     String value = cookie.getValue();
                     String username = value.split("#")[0];
                     String password = value.split("#")[1];
                     UserService  us=  new UserService();
                     User user1 = us.checkLogin(username, password);
                     session.setAttribute("user",user1);
                 }
            }
        }
        chain.doFilter(req, resp);



    }

    public void init(FilterConfig config) throws ServletException {

    }

}
