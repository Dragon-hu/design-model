package com.qianfeng.bridge;

import org.junit.Test;

public class BridgeTest {
    @Test
    public void testBridge(){
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RedefinedAbstraction(implementor);
        abstraction.operation();
    }
}
