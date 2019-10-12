package cn.itcast.DaoTest;

import cn.itcast.dao.CustomerDao;
import cn.itcast.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/8/8 9:12
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class daoTest {
    @Autowired
    private CustomerDao customerDao;// 代理对象

    /**
     * 增加客户
     */
    @Test
    public  void testSave(){
        //customer对象
        Customer customer = new Customer();
        customer.setCustName("隔壁老李");
        customerDao.save(customer);
    }
    /**
     *  删除客户
     */
    @Test
    public  void  testDelById(){
        Customer customer = new Customer();
        customer.setCustId(9L);
        customerDao.delete(customer);

    }
    @Test
    public  void  testFindAllCustomer(){

        List<Customer> allCustomer = customerDao.findAllCustomer();
        for (Customer customer : allCustomer) {
            System.out.println(customer);

        }
    }

}
