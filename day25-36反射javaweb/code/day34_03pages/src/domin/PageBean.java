package domin;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/6 11:14
 **/
public class PageBean {
    //当前页数的数据集合
    private List<Contact> list;
    //总页数
    private Integer totalPage;
    // 总数据条数
    private Integer totalSize;
    //每页数据条数
    private Integer pageSize;
    // 当前页数
    private Integer currentPage;


    @Override
    public String toString() {
        return "PageBean{" +
                "list=" + list +
                ", totalPage=" + totalPage +
                ", totalSize=" + totalSize +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                '}';
    }

    public PageBean() {
    }

    public PageBean(List<Contact> list, Integer totalPage, Integer totalSize, Integer pageSize, Integer currentPage) {
        this.list = list;
        this.totalPage = totalPage;
        this.totalSize = totalSize;
        this.pageSize = pageSize;
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

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
