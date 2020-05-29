package com.qianfeng.adapter.classadapter;

import org.junit.Test;

public class ClassAdapterTest {
    @Test
    public void testClassAdapter(){
        Target target = new ClassAdapter();
        target.request();
    }
}
