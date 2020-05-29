package com.qianfeng.adapter.objectadapter;

import org.junit.Test;

public class ObjectAdapterTest {
    @Test
    public void testObjectAdapter(){
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
