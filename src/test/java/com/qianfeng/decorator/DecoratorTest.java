package com.qianfeng.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testDecorator(){
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);

        decoratorB.operation();
    }
}
