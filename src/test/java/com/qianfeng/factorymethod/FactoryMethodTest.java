package com.qianfeng.factorymethod;

import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void testFactoryMethod(){
        AbstractFactory abstractFactory1 = new LenovoFactory();
        abstractFactory1.createComputer().start();
        AbstractFactory abstractFactory2 = new DellFactory();
        abstractFactory2.createComputer().start();
        AbstractFactory abstractFactory3 = new HpFactory();
        abstractFactory3.createComputer().start();
    }
}
