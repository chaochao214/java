package demo.domain;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/4/29 10:32
 **/
public class PageBean {
    // 当前页的数据结合
    private List<Contact> list;
    // 总页数
    private Integer totalPage;
    //总数据条数
    private Integer pageSize;
    //当前页数
    private Integer currentPage;

    @Override
    public String toString() {
        return "PageBean{" +
                "list=" + list +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                '}';
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<Contact> getList() {
        return list;
    }

    public void setList(List<Contact> list) {
        this.list = list;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
