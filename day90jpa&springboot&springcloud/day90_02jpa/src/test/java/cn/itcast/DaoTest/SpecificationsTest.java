package cn.itcast.DaoTest;

import cn.itcast.dao.CustomerDao;
import cn.itcast.entity.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @Author: twc
 * @Date 2019/8/8 9:50
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpecificationsTest {
    @Autowired
    private CustomerDao customerDao;

    @Test
    public void TestSpecifications() {
        // 使用匿名内部类的方式，创建specification的实现类
        Specification<Customer> spec = new Specification<Customer>() {
            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) {


                //cb:构建查询，添加查询方式  like 模糊匹配
                //root : 从实体Customer对象中按照custName属性精心查询房
                return cb.like(root.get("custName").as(String.class)
                        , "传智播客%");

            }
        };
        Customer customer = customerDao.findOne(spec);
        System.out.println(customer);

    }
    @Test
    public  void testPage(){
        //构造查询条件
       /* Specification<Customer>  spe*/

    }
}
