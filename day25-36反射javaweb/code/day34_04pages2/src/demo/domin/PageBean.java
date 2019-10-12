package demo.domin;

import com.alibaba.druid.sql.visitor.functions.Concat;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/9 10:19
 **/
public class PageBean {
    private List<Contact> listTotal;
    private Integer totalSife;
    private Integer totalPageSize;
    private Integer pageSize;
    private Integer currentPage;

    public PageBean() {
    }

    public PageBean(List<Contact> listTotal, Integer totalSife, Integer totalPageSize, Integer pageSize, Integer currentPage) {
        this.listTotal = listTotal;
        this.totalSife = totalSife;
        this.totalPageSize = totalPageSize;
        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "listTotal=" + listTotal +
                ", totalSife=" + totalSife +
                ", totalPageSize=" + totalPageSize +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                '}';
    }

    public List<Contact> getListTotal() {
        return listTotal;
    }

    public void setListTotal(List<Concat> listTotal) {
        this.listTotal = listTotal;
    }

    public Integer getTotalSife() {
        return totalSife;
    }

    public void setTotalSife(Integer totalSife) {
        this.totalSife = totalSife;
    }

    public Integer getTotalPageSize() {
        return totalPageSize;
    }

    public void setTotalPageSize(Integer totalPageSize) {
        this.totalPageSize = totalPageSize;
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
