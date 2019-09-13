package demo.web;

import demo.ContactService.ContactService;
import demo.domain.Contact;
import demo.domain.PageBean;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @Author: twc
 * @Date 2019/4/29 8:46
 **/
@WebServlet(urlPatterns = "/big", name = "BigServlet")
public class BigServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //解决请求参数乱码的问题
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        /*// 判断action的值
        if ("findAll".equals(action)) {
            findAll(request, response);
        }
        if ("update".equals(action)) {
            update(request, response);
        }
        if ("delete".equals(action)) {
            delete(request, response);
        }
        if ("add".equals(action)) {
            add(request, response);
        }
        if ("page".equals(action)) {
            page(request, response);
        }*/
        //使用反射技术能够获取一个方法，并且调用
        Class<? extends BigServlet> clazz = this.getClass();
        try {
            Method method = clazz.getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
            method.invoke(this,request,response);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


    /**
     * 更新用户的方法
     *
     * @param request
     * @param response
     */
    private void update(HttpServletRequest request, HttpServletResponse response) {
        // 获取请求端的所有参数
        Map<String, String[]> map = request.getParameterMap();
        Contact contact = new Contact();

        try {
            BeanUtils.populate(contact, map);
            ContactService cs = new ContactService();
            boolean flag = cs.update(contact);
            if (flag) {
                response.sendRedirect("big?action=findAll");

            } else {
                request.setAttribute("msg", "信息修改失败");
                request.getRequestDispatcher("failed.jsp").forward(request, response);
            }

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * page分页的方法
     *
     * @param request
     * @param response
     */
    private void page(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.获取客户端携带过来的当前页数
        Integer currentPage = Integer.valueOf(request.getParameter("currentPage"));
        ContactService cs = new ContactService();
        PageBean pageBean = cs.findContactByPage(currentPage);
        System.out.println(pageBean);
        request.setAttribute("page", pageBean);
        request.getRequestDispatcher("page.jsp").forward(request, response);


    }

    /**
     * 删除的方法
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");
        ContactService cs = new ContactService();
        boolean flag = cs.del(id);
        if (flag) {
            response.sendRedirect("findAll");

        } else {
            request.setAttribute("msg", "删除失败");
            request.getRequestDispatcher("failed.jsp").forward(request, response);
        }
    }

    /**
     * 找到所有的方法
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    private void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ContactService cs = new ContactService();
        List<Contact> list = cs.findAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    /**
     * 添加用户的 方法
     *
     * @param request
     * @param response
     * @throws UnsupportedEncodingException
     */
    private void add(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        Contact cn = new Contact();
        Map<String, String[]> map = request.getParameterMap();
        boolean flag = false;
        try {
            BeanUtils.populate(cn, map);
            ContactService contactService = new ContactService();
            flag = contactService.add(cn);
            if (flag) {
                response.sendRedirect("findAll");

            } else {
                request.setAttribute("msg", "添加失败");
                request.getRequestDispatcher("failed.jsp").forward(request, response);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
