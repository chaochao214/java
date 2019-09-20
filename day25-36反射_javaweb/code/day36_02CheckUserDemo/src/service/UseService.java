package service;

import dao.UserDao;
import domin.User;

/**
 * @Author: twc
 * @Date 2019/5/6 20:26
 **/
public class UseService {
    public User checkUsername(String username) {
        UserDao dao = new UserDao();
        User user = dao.findUserByUsername(username);
        return  user;
    }
}
