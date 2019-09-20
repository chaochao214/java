package _03staticProxyDemo;

public class Yanpoxi implements  IKindWomen {

    @Override
    public void happy() {
        System.out.println("阎婆惜正在happy");
    }

    @Override
    public double collect(double money) {
        System.out.println("阎婆惜借到"+money);
        return money;
    }
}
