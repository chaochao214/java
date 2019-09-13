package com.twc.Keth;

public class Test {
    public static void main(String[] args) {
        InnerClass ic  = new InnerClass();
        InnerClass.Heart h = ic.new Heart();
        h.jump();
        ic.setLive(false);
        h.jump();
    }
}
