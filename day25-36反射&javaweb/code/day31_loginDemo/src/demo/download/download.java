package demo.download;

import org.apache.commons.io.IOUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

/**
 * @Author: twc
 * @Date 2019/4/27 9:05
 **/
@WebServlet(urlPatterns = "/download", name = "download")
public class download extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = request.getParameter("filename");
         //解决编码问题
        String encodefilename = URLEncoder.encode(filename, "UTF-8");
        //请求头问题
       // response.setHeader("content-disposition", "attachment;filename=" + encodefilename);

        ServletContext servletContext = getServletContext();
        InputStream  is = servletContext.getResourceAsStream("dwl/" + encodefilename);
        ServletOutputStream os = response.getOutputStream();
        IOUtils.copy(is,os);
        is.close();
        os.close();
    }
}
