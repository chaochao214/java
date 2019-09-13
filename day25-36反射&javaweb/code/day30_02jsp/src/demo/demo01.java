package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/4/25 20:17
 **/
@WebServlet(urlPatterns = "/demo01", name = "demo01")
public class demo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王麻子");
        names.add("赵柳");
        names.add("蔡徐坤");

        request.setAttribute("list",names);
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
