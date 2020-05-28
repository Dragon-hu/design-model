package com.qianfeng.proxy.cglib;

import org.junit.Test;

public class TestCglib {
    @Test
    public void testCglib(){
        RealSubject subject = DynamicHandler.getSubject();
        subject.request();
    }
}
