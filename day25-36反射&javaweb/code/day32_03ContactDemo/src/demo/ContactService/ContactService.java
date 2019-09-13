package demo.ContactService;

import demo.dao.ContactDao;
import demo.domain.Contact;
import demo.domain.PageBean;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/4/26 11:28
 **/
public class ContactService implements IContactService{
    ContactDao cd = new ContactDao();

    public List<Contact> findAll() {
        return cd.findAll();
    }
    public boolean add(Contact cn) {


        boolean flag = cd.add(cn);
        return flag;
    }

    public boolean update(Contact cn) {
        boolean flag = cd.update(cn);
        return flag;
    }

    public boolean del(String id) {
        boolean flag = cd.del(id);
        return flag;
    }

    public PageBean findContactByPage(Integer currentPage) {
        PageBean pageBean = new PageBean();
        //向pageBean中封装5个数据 1.封装当前页数
        pageBean.setCurrentPage(currentPage);
        //封装每页的数据条数
        Integer pageSize = 2;
        pageBean.setPageSize(pageSize);

        //封装总数据条数
        Integer totalSize = cd.findCount();
        pageBean.setPageSize(totalSize);
        // 封装总页数，总页数通过需要计算而来
        Integer totalPage = totalSize % pageSize == 0 ? totalSize / pageSize : totalSize / pageSize + 1;
        pageBean.setTotalPage(totalPage);
        //5封装每页的数据集合 , 到数据库进行分页查询
        List<Contact> list = cd.findContactByPage(currentPage, pageSize);
        pageBean.setList(list);
        return pageBean;

    }
}
