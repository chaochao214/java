package demo.web;

import demo.ContactService.ContactService;
import demo.domain.Contact;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2019/4/28 20:33
 **/
@WebServlet(urlPatterns = "/update", name = "update")
public class update extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 获取请求端的所有参数
        Map<String, String[]>  map = request.getParameterMap();
        Contact contact = new Contact();

        try {
            BeanUtils.populate(contact,map);
            ContactService cs  = new ContactService();
            boolean flag = cs.update(contact);
            if(flag){
                 response.sendRedirect("findAll");

            }else{
                request.setAttribute("msg","信息修改失败");
                request.getRequestDispatcher("failed.jsp").forward(request,response);
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
