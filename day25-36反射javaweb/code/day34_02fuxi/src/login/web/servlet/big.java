package login.web.servlet;

import login.domain.User;
import login.service.serviceCrud;
import login.utils.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/5/2 22:10
 **/
@WebServlet(urlPatterns = "/big", name = "big")
public class big extends HttpServlet {
    serviceCrud sc = new serviceCrud();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决中文乱码的问题
        String action = request.getParameter("action");
        if ("login".equals(action)) {
            login(request, response);
        }
        if ("register".equals(action)) {
            register(request, response);
        }
    }

    /**
     * 注册功能的实现
     *
     * @param request
     * @param response
     * @return
     */
    private boolean register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String nickname = request.getParameter("nickname");

        boolean flag = sc.register(username, password, nickname);
        if (flag) {
            response.sendRedirect("login.jsp");
        } else {
            request.setAttribute("msg", "注册失败");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }
        return flag;
    }

    /**
     * 登录方法
     *
     * @param request
     * @param response
     */
    private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        String vcode = request.getParameter("vcode");
        String auto = request.getParameter("auto");
        HttpSession session = request.getSession();

        //记住账号
        Cookie cookie = new Cookie("username", username);
        if ("on".equals(remember)) {
            cookie.setMaxAge(7 * 60 * 60);
        } else {
            cookie.setMaxAge(0);
        }
        cookie.setPath(request.getContextPath());
        response.addCookie(cookie);

        //获取验证码对象
        String code_session = (String) session.getAttribute("code_session");
//这个 code_session的数值是固定的,怎么实现自动会写验证码
       /* Cookie cookieVcode = new Cookie("Vcode",code_session);
        cookieVcode.setPath(request.getContextPath());
        cookieVcode.setMaxAge(7*60*60);
        response.addCookie(cookieVcode);*/
        request.setAttribute("vcode", code_session);
        if (code_session.equalsIgnoreCase(vcode)) {
            User user = sc.checkLogin(username, password);
            if (user != null) {
                if ("on".equals(auto)) {
                    Cookie cookieinfo = new Cookie("info", username + "#" + password);
                    cookieinfo.setPath(request.getContextPath());
                    cookieinfo.setMaxAge(6 * 60 * 60);
                    response.addCookie(cookieinfo);
                }
                // 登录成功后把user 放到域对象中
                session.setAttribute("user", user);
                //设置时间
                String currentTime = DateUtil.getCurrentTime();
                Cookie timeCookie = new Cookie("time", currentTime);
                timeCookie.setPath(request.getContextPath());
                timeCookie.setMaxAge(7 * 60 * 60);
                response.addCookie(timeCookie);

                //通过请求转发来传输数据
                request.setAttribute("user", user);
                request.getRequestDispatcher("success.jsp").forward(request, response);

            } else {
                request.setAttribute("msg", "login_failure,please_relogin");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }


        } else {
            request.setAttribute("msg", "验证码错误");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }


    }
}
