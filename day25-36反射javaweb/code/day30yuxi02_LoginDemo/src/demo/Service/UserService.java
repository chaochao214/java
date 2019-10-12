package demo.Service;

import demo.dao.UserDao;
import demo.domain.User;

/**
 * @Author: twc
 * @Date 2019/4/24 10:07
 **/
public class UserService {
    public User checkLogin(String username,String password){
        UserDao dao =  new UserDao();
        User  user = dao.findUser(username,password);
        return  user;
    }
    public boolean saveUser(User user){
        UserDao dao = new UserDao();
        boolean flag = dao.addUser(user);
        return flag;
    }

}
