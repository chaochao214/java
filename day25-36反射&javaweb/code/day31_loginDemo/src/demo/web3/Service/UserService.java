package demo.web3.Service;

import demo.web3.dao.UserDao;
import demo.web3.domain.User;

/**
 * @Author: twc
 * @Date 2019/4/27 10:32
 **/
public class UserService {
    UserDao ud = new UserDao();

    public User daoFindUser(String username, String password) {
        User user = ud.findUser(username,password);
         return  user;

    }

}
