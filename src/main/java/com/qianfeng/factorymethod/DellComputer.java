package com.qianfeng.factorymethod;

public class DellComputer extends AbstractComputer {
    @Override
    public void start() {
        System.out.println("戴尔电脑启动了");
    }
}
