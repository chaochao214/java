package cn.itcast.dao;

import cn.itcast.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/8/8 8:47
 **/
public interface CustomerDao extends JpaRepository<Customer, Long>, JpaSpecificationExecutor<Customer> {
/*
    @Query("select c from Customer  c")
    List<Customer> testQueryCustomer();

    @Query("select  c from c where c.custName  like ?1")
    List<Customer> testQueryCustomerByCustomerName(String cusmoer);*/

    // @Query 使用jpql的方式查询
    @Query(value = "from Customer ")
    public  List<Customer> findAllCustomer();

}
