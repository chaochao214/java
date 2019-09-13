package web.servlet;

import domin.Contact;
import domin.PageBean;
import service.ContactService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/4 10:03
 **/
@WebServlet(urlPatterns = "/big", name = "big")
public class big extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");


        if ("findAll".equals(action)) {
            findAll(request, response);
        }

        if ("page".equals(action)) {
            page(request, response);
        }
}

    ContactService cs = new ContactService();

    private void page(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //1.获取客户端携带过来的当前页数
        Integer currentPage = Integer.valueOf(request.getParameter("currentPage"));
        //调用业务层的方法来处理请求
        PageBean pageBean = cs.findContactByPage(currentPage);
        System.out.println(pageBean);
        // 将PageBean存放到域对象
        request.setAttribute("page", pageBean);
        //跳转页面显示内容
        request.getRequestDispatcher("page.jsp").forward(request,response);

    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Contact> list = cs.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("list.jsp").forward(request, response);


    }
}
