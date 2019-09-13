package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: twc
 * @Date 2019/4/24 9:36
 **/
@WebServlet(urlPatterns = "/download", name = "download")
public class download extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String referer = request.getHeader("referer");
        System.out.println(referer);
        boolean flag = referer.contains("xunlei");
        if(flag){
            System.out.println("可以下载");
        }else{
            System.out.println("盗链不可以下载");
        }
    }
}
