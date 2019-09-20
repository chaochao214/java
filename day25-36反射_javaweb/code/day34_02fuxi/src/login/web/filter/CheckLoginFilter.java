package login.web.filter;

import login.domain.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/5/4 8:19
 **/
@WebFilter(urlPatterns = "/*")
public class CheckLoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            String requestURI = request.getRequestURI();
            if (requestURI.contains("car")) {
                Cookie cookie = new Cookie("msg", "请登录后查看自己的购物车");
                cookie.setPath(request.getContextPath());
                cookie.setMaxAge(3 * 60 * 60);
                response.addCookie(cookie);
                response.sendRedirect("login.jsp");
                return;
            }
        }

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
