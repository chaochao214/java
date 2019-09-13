package demo.web.servlet;

import demo.Service.UserService;
import demo.domain.User;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2019/4/24 16:30
 **/
@WebServlet(urlPatterns = "/register", name = "register")
public class register extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          request.setCharacterEncoding("UTF-8");
        Map<String, String[]> map = request.getParameterMap();
        User user =  new User();
        try {
            BeanUtils.populate(user,map);
            UserService service = new UserService();
            boolean flag =service.saveUser(user);
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter writer = response.getWriter();
            if(flag){
                response.sendRedirect("login.jsp");

            }else{
                 writer.write("注册失败！！");

            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
