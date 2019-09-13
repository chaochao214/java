package com.twc.Factory;

/**
 * @ClassName BeanFactory
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/5/25 15:19
 * @Version V1.0
 */

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 工厂类
 * 1：读取配置文件中的内容
 * 2：Map<String,Object>集合，存放读取的数据
 key：读取key值
 value：通过反射的技术创建对象，放置到value中

 * 3：提供方法：Object getBean(String name)

 */
public class BeanFactory {
    // 声明Map集合
    static Map<String,Object> map;
    // 读取properties文件
    static Properties properties;


    static{
        // 初始化
        properties = new Properties();
        map = new HashMap<String,Object>();
        //读取配置文件中的内容
        InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            properties.load(in);
            // 查找bean.properties文件中的key
            Enumeration<Object> keys = properties.keys();
            while(keys.hasMoreElements()){
                String beanName = keys.nextElement().toString(); //accountService/accountDao
                // 获取值
                String beanValue = properties.get(beanName).toString(); //com.itheima.service.impl.AccountServiceImpl/com.itheima.dao.impl.AccountDaoImpl
                // 反射
                Object bean = Class.forName(beanValue).newInstance();
                map.put(beanName,bean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //提供方法，Object getBean(String name)
    public static Object getBean(String name,String flag){
        // singleton：单例
        if(flag.equals("singleton")){
            return map.get(name);
        }
        //prototype：多例
        else if(flag.equals("prototype")){
            // 获取值
            String beanValue = properties.get(name).toString(); //com.itheima.service.impl.AccountServiceImpl/com.itheima.dao.impl.AccountDaoImpl
            // 反射
            try {
                Object bean = Class.forName(beanValue).newInstance();
                return bean;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
