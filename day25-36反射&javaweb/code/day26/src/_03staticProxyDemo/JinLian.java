package _03staticProxyDemo;

public class JinLian implements  IKindWomen {

    @Override
    public void happy() {
        System.out.println("金莲正在happy");
    }

    @Override
    public double collect(double money) {
        System.out.println("金莲收钱了");
        return money;
    }
}
