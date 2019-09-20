package demo.web;

import demo.ContactService.ContactService;
import demo.domain.Contact;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/4/26 11:30
 **/
@WebServlet(urlPatterns = "/findAll", name = "findAll")
public class findAll extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContactService cs = new ContactService();
        List<Contact> list = cs.findAll();
        request.setAttribute("list",list);
        request.getRequestDispatcher("list.jsp").forward(request,response);

    }
}
