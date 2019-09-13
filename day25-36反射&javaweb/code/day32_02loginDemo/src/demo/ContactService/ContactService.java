package demo.ContactService;

import demo.dao.ContactDao;
import demo.domain.Contact;

import java.util.List;

/**
 * @Author: twc
 * @Date 2019/4/26 11:28
 **/
public class ContactService {
    ContactDao cd = new ContactDao();

    public List<Contact> findAll() {
        return cd.findAll();
    }


    public boolean add(Contact cn) {
         boolean  flag =  cd.add(cn);
         return flag;
    }

    public boolean update(Contact cn) {
        boolean flag  = cd.update(cn);
        return flag;
    }

    public boolean del(String id) {
        boolean flag = cd.del(id);
        return  flag;
    }
}
