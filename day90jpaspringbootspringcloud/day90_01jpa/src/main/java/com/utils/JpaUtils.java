package  com.utils;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 抽取工具类
 */
public final class JpaUtils {

    //定义一个对象
    private static EntityManagerFactory myJpa = null;

    //通过静态代码块创建对象 只创建一次

    static {
        myJpa = Persistence.createEntityManagerFactory("myJpa");
    }

    /**
     * 为了方便使用 抽取一个获取实体管理器方法
     */
    public static EntityManager getEntityManager(){
        return myJpa.createEntityManager();
    }
}
