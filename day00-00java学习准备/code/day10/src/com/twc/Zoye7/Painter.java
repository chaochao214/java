package com.twc.Zoye7;

public class Painter {
    String name;

    void draw(Pen pen) {
        System.out.println("画家XX正在绘画");
        pen.write();
    }
    public Painter(){
    }
    public Painter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}






