package demo.FilterDemo;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/4/29 20:54
 **/
@WebFilter(urlPatterns = "/comment")
public class comment implements Filter {
    private List<String> strs = new ArrayList<>();

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
      /* *//*  ???? 为什么这样写会报文件找不到异常？*//*

        BufferedReader bf = new BufferedReader(new FileReader("comment.txt"));
        //获取行
        String currentLine;
        while ((currentLine = bf.readLine()) != null) {
            if (req.getParameter("comment").contains(currentLine)) {
                resp.getWriter().write("评论中含有非法字符" + currentLine);
                return;
            }
        }*/
        String comment = req.getParameter("comment");

        System.out.println("comment被执行");
        for (String str : strs) {
            System.out.println(str);
            if(str.equals(comment)){
                resp.getWriter().write("含有非法字符，请重新输入评论");
                return;
            }

        }

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        ClassLoader classLoader = comment.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("comment.txt");
        InputStreamReader isr = null;

        try {
            isr = new InputStreamReader(is, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(isr);
        String current = "";
        try {
            while ((current = br.readLine()) != null) {
                strs.add(current);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
