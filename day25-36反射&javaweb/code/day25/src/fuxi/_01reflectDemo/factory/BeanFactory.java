package fuxi._01reflectDemo.factory;

/**
 * @Author: twc
 * @Date 2019/5/2 11:53
 **/
public class BeanFactory {
    public  static <T>  T  getBean(Class<T> clazz){
        try {
            return  clazz.newInstance();
        } catch (Exception e) {
            throw  new RuntimeException("创建对象异常");
        }
    }

}
