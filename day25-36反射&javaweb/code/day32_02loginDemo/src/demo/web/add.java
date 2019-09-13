package demo.web;

import demo.ContactService.ContactService;
import demo.dao.ContactDao;
import demo.domain.Contact;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2019/4/28 10:39
 **/
@WebServlet(urlPatterns = "/add", name = "add")
public class add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        Contact cn = new Contact();
        Map<String, String[]> map = request.getParameterMap();
        boolean flag = false;
        try {
            BeanUtils.populate(cn, map);
            ContactService contactService = new ContactService();
            flag = contactService.add(cn);
            if(flag){
                 response.sendRedirect("findAll");

            }else{
                 request.setAttribute("msg","添加失败");
                 request.getRequestDispatcher("failed.jsp").forward(request,response);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
