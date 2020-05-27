package com.qianfeng.singleton;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void testEnum(){
        EnumSingleton instance = EnumSingleton.INSTANCE;
        instance.doSomething();
    }

}
