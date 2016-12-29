package com.fop.anjal.footballourpassion;

import java.io.Serializable;

/**
 * Created by anjal on 20/8/16.
 */
public class HitData implements Serializable {
    String hit,current;

    public HitData() {

    }

    public String getHit() {
        return hit;
    }

    public void setHit(String hit) {
        this.hit = hit;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
}
