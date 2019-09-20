package demo.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import domin.ResultInfo;
import domin.User;
import service.UseService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author: twc
 * @Date 2019/5/6 20:19
 **/
@WebServlet(urlPatterns = "/checkUsername", name = "CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultInfo info = new ResultInfo(true);

        try {
            String username = request.getParameter("username");
            UseService userService =new UseService();
            User user  = userService.checkUsername(username);
            if (user == null) {
                 info.setData("用户名可用");
            }else{
                info.setData("用户名不可用");
            }
        } catch (Exception e) {
            e.printStackTrace();
            info.setFlag(false);

        }
        // 在这里响应客户端
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        //  info对象中的数据输出到客户端,但是不能直接 输出这个数值
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writeValueAsString(info);
        writer.write(jsonStr);


    }
}
