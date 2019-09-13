package demo;


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
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

/**
 * @Author: twc
 * @Date 2019/4/23 9:14
 **/
@WebServlet(urlPatterns = "/download", name = "ServletDemo01")
public class ServletDemo01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  //1.请求获取参数filaname的数值
        String filename = request.getParameter("filename");

        ServletContext servletContext = getServletContext();
        InputStream is = servletContext.getResourceAsStream("dwl/" + filename);

        String encodeFilename =  null;
    //怎么判断当前发起的是否是火狐浏览器
        String header = request.getHeader("user-agent");
        System.out.println(header);
        if(header.contains("Firefox")){
           encodeFilename= base64Encode(filename);
        }else {
            encodeFilename=URLEncoder.encode(filename,"UTF-8");
        }
        response.setHeader("content-disposition","attachment;filename="+encodeFilename);

        ServletOutputStream out  = response.getOutputStream();

        IOUtils.copy(is,out);
        out.close();
        is.close();
    }

    private  String base64Encode(String  filename) throws UnsupportedEncodingException {
        Base64.Encoder encoder = Base64.getEncoder();
        filename = encoder.encodeToString(filename.getBytes("UTF-8"));
        filename = "=?utf-8?B?"+filename + "?=";
        return filename;
    }
}
