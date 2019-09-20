package com.i01_singleton;

/**
 * @Author: twc
 * @Date 2019/5/27 11:20
 **/
public class hungrySingleton {
    private static  hungrySingleton hungrySingleton = new hungrySingleton();

    public hungrySingleton() {
    }

    public static com.i01_singleton.hungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }

}
