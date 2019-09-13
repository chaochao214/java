package demo.web4.Service;

import demo.web4.bean.User;
import demo.web4.dao.UserDao;

/**
 * @Author: twc
 * @Date 2019/4/27 15:40
 **/
public class serviceLogin {
      public  User findUser(String username,String password){
          UserDao ud  = new UserDao();
          User  user = ud.findUser(username, password);
          return  user;
      }
}
