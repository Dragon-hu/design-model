package com.qianfeng.strategy;

import org.junit.Test;

public class StrategyTest {
    @Test
    public void testStrategy(){
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();
        System.out.println("----------------------");
        s = new ConcreteStrategyB();
        c.setStrategy(s);
        c.strategyMethod();
    }
}
