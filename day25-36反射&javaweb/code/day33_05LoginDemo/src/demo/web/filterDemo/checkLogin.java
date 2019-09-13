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
 * @Date 2019/4/30 10:48
 **/
@WebFilter(urlPatterns = "/*")
public class checkLogin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession();

        //获取user数据
        User user = (User) session.getAttribute("user");
        if (user == null) {
            // 未登录
            // 请求和购物车相关，则跳转到购物车相关的页面
            String requestURI = request.getRequestURI();
            if (requestURI.contains("car")) {
                response.sendRedirect("login.jsp");
                return;
            }
        }

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
