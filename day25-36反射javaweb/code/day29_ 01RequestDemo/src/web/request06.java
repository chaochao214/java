package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/23 20:07
 **/
@WebServlet(urlPatterns = "/request06", name = "request06")
public class request06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          /*  String str ="jay";
            //使用request作为域对象
            request.setAttribute("uname",str);
            request.getRequestDispatcher("request06").forward(request,response);*/
         String  uname = (String) request.getAttribute("uname");
        System.out.println("在requestDemo06中获取uname "+uname);


    }
}
