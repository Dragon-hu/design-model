package com.qianfeng.proxy.jdkdynamicproxy;

import org.junit.Test;

public class TestJDKProxy {
    @Test
    public void tessJDK(){
        Subject subject = DynamicHandler.getSubject();
        subject.request();
    }
}
