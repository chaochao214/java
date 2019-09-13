package com.twc.Zoye10;

public class Test {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.setName("啦啦啦");
        RemoteControl rm = new RemoteControl();
        rm.controlTV(tv);
        Phone ph = new Phone();
        ph.connecting();
        ph.controlTV(tv);
    }
}
