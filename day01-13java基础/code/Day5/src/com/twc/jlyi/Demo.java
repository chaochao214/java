package com.twc.jlyi;

public class Demo {
    //模拟数据库中已经存在账号
    private static String[] names = {"billf","hill","jill"};
    public static void main(String[] args){
        //调用方法






    }
    public static boolean  checkUsername(String uname) throws LoginException {
        for(String name :names){
            if(name.equals(uname)){ //如果问题在这里面，就抛出登陆异常
                throw  new LoginException(name+"已经被注册");
            }
        }
        return true;
    }
}
