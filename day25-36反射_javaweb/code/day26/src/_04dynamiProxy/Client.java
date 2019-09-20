package _04dynamiProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * .动态代理的回顾，
 * ？？？自己写一个动态代理
 * 1.proxy的newProInstance() 方法的三个参数放
 * 类加载器对象，要代理的接口的字节码对象的数组
 * 3.invocationHandler接口的实现类对象
 *
 */
public class Client {
    public static void main(String[] args) {
        // 调用IKindWomne接口对象的happy() 方
        // 动态代理对象
        ClassLoader classLoader = IKindWomen.class.getClassLoader();
        //为什么要加上一个大括号
        Class<?>[] clazzs = {IKindWomen.class};
        //3. InvocationHandler实现类对象， 可以使用匿名内部类
        IKindWomen proxy = (IKindWomen) Proxy.newProxyInstance(classLoader, clazzs, new InvocationHandler() {
            private void openHouse () {
                System.out.println("准备了");
            }
            private void clear(){
                System.out.println("打扫战场");
            }
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                if (methodName.equals("happy")) {
                    openHouse();
                    System.out.println("好嗨哦");
                    clear();
                    return null;
                }else  if(methodName.equals("collect")){
                    System.out.println("收取手续费"+(double)args[0]*0.4);
                    System.out.println("给委托者"+(double)args[0]*0.6);
                    return (double) args[0]*0.6;
                }else{
                    return null;
                }
            }
        });
        proxy.happy();
        double  collect = proxy.collect(1000.00);
        System.out.println("返回值"+collect);


    }
}
