package _03staticProxyDemo;

public class Client {
    public static void main(String[] args) {
        //调用金莲的happy()方法
       /* JinLian  jinLian  = new JinLian();
        jinLian.happy();*/
        Yanpoxi yanpoxi = new Yanpoxi();
        Wangpo wangpo  = new Wangpo(yanpoxi);

        wangpo.happy();
        wangpo.collect(2400);
    }
}
