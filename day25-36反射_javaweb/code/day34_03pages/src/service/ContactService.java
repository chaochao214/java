package service;

import dao.ContactDao;
import domin.Contact;
import domin.PageBean;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/4 10:03
 **/

public class ContactService {
    ContactDao dao = new ContactDao();

    /**
     * 查找所有用户
     *
     * @return
     */
    public List<Contact> findAll() {
        List<Contact> list = dao.findAll();
        return list;
    }

    /**
     * 处理分页请求的方法
     *
     * @param currentPage
     * @return
     */
    public PageBean findContactByPage(Integer currentPage) {
        PageBean pageBean = new PageBean();
        //pggeBean中封装几个数据
        //1.封装当前页数
        pageBean.setCurrentPage(currentPage);
        //2.封装每页的数据条数
        Integer pageSize = 3;
        pageBean.setPageSize(pageSize);
        //3 封装总数据条数， 到数据库查询总数据条数 到数据库查询总数据条数
        Integer totalSize = dao.findCount();
        pageBean.setTotalSize(totalSize);
        Integer totalPage = totalSize % pageSize == 0 ? totalSize / pageSize : totalSize / pageSize + 1;

        //4。封装总页数，总页数需要计算得来
        pageBean.setTotalPage(totalPage);
        //5.封装每页的数据集合
        List<Contact> list = dao.findContactByPage(currentPage, pageSize);
        pageBean.setList(list);
        return pageBean;

    }
}
