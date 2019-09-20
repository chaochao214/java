package demo.service;

import com.alibaba.druid.sql.visitor.functions.Concat;
import demo.dao.ContactDao;
import demo.domin.PageBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/9 10:30
 **/
public class pageService {
    public PageBean getPageConcat(Integer currentPage) {
        ContactDao cd = new ContactDao();
        //每页数据条数
        Integer pageSize = 5;
        //查询总数据条数
        Integer totalSize = cd.findTotalSize();

        // 总页数
        Integer totalPageSize = totalSize % pageSize == 0 ? totalSize / pageSize : totalSize % pageSize + 1;
        //返回的分页数据
        List<Concat> list = null;
        list = cd.findListTotal(currentPage, pageSize);
        //封装一个javaBean
        PageBean pb = new PageBean();
        pb.setTotalSife(totalSize);
        pb.setCurrentPage(currentPage);
        pb.setPageSize(pageSize);

        pb.setTotalSife(totalPageSize);
        pb.setListTotal(list);


        return pb;
    }
    //

}
