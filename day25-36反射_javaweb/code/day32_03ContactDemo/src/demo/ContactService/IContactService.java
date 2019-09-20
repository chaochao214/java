package demo.ContactService;

import demo.domain.Contact;
import demo.domain.PageBean;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/5/1 10:42
 **/
public interface IContactService {
     List<Contact> findAll();
     boolean add(Contact cn);
     boolean del(String id);
     boolean update(Contact cn);
     PageBean findContactByPage(Integer currentPage);
}
