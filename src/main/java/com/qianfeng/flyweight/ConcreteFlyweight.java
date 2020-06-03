package com.qianfeng.flyweight;

public class ConcreteFlyweight implements Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("共享的享元角色："+extrinsicstate);
    }
}
