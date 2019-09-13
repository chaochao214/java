package com.twc.exception;

/**
 * @Author: twc
 * @Date 2019/6/3 9:33
 **/
public class SysException extends Exception {
     private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
//这个构造器是什么
    public SysException(String message) {
        this.message = message;
    }
}
