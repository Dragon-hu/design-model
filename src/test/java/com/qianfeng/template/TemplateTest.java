package com.qianfeng.template;

import org.junit.Test;

public class TemplateTest {
    @Test
    public void testTemplate(){
        AbstractClass c = null;

        c = new ConcreteClassA();
        c.templateMethod();

        c = new ConcreteClassB();
        c.templateMethod();
    }
}
