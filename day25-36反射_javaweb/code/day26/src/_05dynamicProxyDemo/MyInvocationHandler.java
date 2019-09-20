package _05dynamicProxyDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private IKindWomen women;

    public MyInvocationHandler(IKindWomen women) {
        this.women = women;
    }
    private void openHouse(){
        System.out.println("战前准备");

    }
    private  void clear(){
        System.out.println("清扫战场");

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    String methodName =         // 代理对象调用任何方法都会执行到invoke来
            method.getName();
    if(methodName.equals("happy")){
         openHouse();
         women.happy();
         clear();
    }
    return  null;

    }
}
