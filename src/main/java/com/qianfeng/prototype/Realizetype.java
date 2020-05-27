package com.qianfeng.prototype;

/**
 * @author huwen
 */
public class Realizetype implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Realizetype realizetype = (Realizetype) super.clone();;

        return realizetype;
    }
}
