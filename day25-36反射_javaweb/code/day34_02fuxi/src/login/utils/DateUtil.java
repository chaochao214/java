package login.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 包名:com.itheima.utils
 * 作者:Leevi
 * 日期2019-04-25  16:05
 */
public class DateUtil {
    /**
     * 获取当前时间
     * @return
     */
    public static String getCurrentTime(){
        Date date = new Date();
        //使用SimpleDateFormat将date转换成字符串
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss");
        return format.format(date);
    }
}
