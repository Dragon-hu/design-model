package com.qianfeng.flyweight;

import org.junit.Test;

public class FlyweightTest {
    @Test
    public void testFlyWeight(){
        int extrinsicstate = 22;
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight a = factory.getFlyweight("a");
        a.operation(--extrinsicstate);
        Flyweight b = factory.getFlyweight("b");
        b.operation(--extrinsicstate);
        Flyweight d = factory.getFlyweight("d");
        d.operation(--extrinsicstate);
        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);
    }
}
