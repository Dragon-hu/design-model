package com.qianfeng.flyweight;

public class UnsharedConcreteFlyweight implements Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体享元角色："+extrinsicstate);
    }
}
