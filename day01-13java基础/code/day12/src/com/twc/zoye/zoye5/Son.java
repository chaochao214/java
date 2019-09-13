package com.twc.zoye.zoye5;

public class Son extends  Father{
    @Override
    public void askMoney() {
        System.out.println("儿子要钱");
    }

    @Override
    public void spendMoney() {
        System.out.println("儿子花钱");
    }
    public void helpFather(Helper helper){
        helper.help();
    }
    public void daJlYz(){
        helpFather(super::askMoney);
        helpFather(super::spendMoney);
    }

}
