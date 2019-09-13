package com.twc.test;

import java.util.Collection;

public class GenericDemo<MVP> {
        private MVP mvp;

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }
}
