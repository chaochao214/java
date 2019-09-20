package demo;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * @Author: twc
 * @Date 2019/4/23 9:55
 **/
public class MainTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "test测试";
        String encodeS = URLEncoder.encode(str, "UTF-8");
        System.out.println(encodeS);

    }
}
