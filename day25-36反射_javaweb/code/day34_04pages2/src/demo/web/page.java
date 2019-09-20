package demo.web;

import com.alibaba.druid.sql.visitor.functions.Concat;
import demo.domin.PageBean;
import demo.service.pageService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/9 10:29
 **/
@WebServlet(urlPatterns = "/page", name = "page")
public class page extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer currentPage = Integer.valueOf(request.getParameter("currentPage"));
        pageService ps = new pageService();
        PageBean list =  ps.getPageConcat(currentPage);
        request.setAttribute("list",list);
        request.getRequestDispatcher("pageTest.jsp").forward(request,response);


    }
}
