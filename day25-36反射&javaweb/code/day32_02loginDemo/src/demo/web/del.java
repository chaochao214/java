package demo.web;

import demo.ContactService.ContactService;
import demo.domain.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/28 22:04
 **/
@WebServlet(urlPatterns = "/del", name = "del")
public class del extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        ContactService cs = new ContactService();
        boolean flag = cs.del(id);
        if (flag) {
            response.sendRedirect("findAll");

        } else {
            request.setAttribute("msg", "删除成功");
            request.getRequestDispatcher("failed.jsp").forward(request, response);
        }
    }
}
