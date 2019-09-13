package login.service;

import login.dao.Dao;
import login.domain.User;

/**
 * @Author: twc
 * @Date 2019/5/2 22:19
 **/
public class serviceCrud {
    Dao dao = new Dao();

    public User checkLogin(String username, String password) {
        User user = dao.checkLogin(username, password);
        return user;
    }

    public boolean register(String username, String password, String nickname) {
        boolean flag = dao.insertUser(username,password,nickname);
        return  flag;
    }
}
