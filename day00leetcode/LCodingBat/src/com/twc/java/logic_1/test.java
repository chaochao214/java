package com.twc.java.logic_1;

public class test {

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend){
            return true;
        }
        if(cigars >= 40 && cigars <= 60){
            return true;
        }
        return  false;
    }
}
