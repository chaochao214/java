package com.twc.jlyi;

public class LoginException  extends Exception{
    /**
     *
     *      模拟登陆操作，看其是否有各种登陆异常。
     *
     *
     */
    public LoginException() {
    }
    /**
     * @param  message 表示异常提示
     *
     */
    public LoginException(String message){
        super(message);
    }

}
