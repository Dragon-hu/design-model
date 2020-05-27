package com.qianfeng.prototype;

import org.junit.Test;

public class PrototypeTest {
    @Test
    public void testPrototype(){
        Realizetype realizetype = new Realizetype();
        realizetype.setName("张三");
        System.out.println(realizetype.getName());
        try {
            Object obj = realizetype.clone();
            Realizetype realizetype1 = (Realizetype)obj;
            System.out.println(realizetype1.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
