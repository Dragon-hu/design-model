package com.qianfeng.abstractfactory;

public class HuaweiTelevision implements Television {
    @Override
    public void show() {
        System.out.println("华为电视创建了");
    }
}
