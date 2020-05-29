package com.qianfeng.adapter.classadapter;

/**
 * 类适配器 同时继承适配者，实现目标接口
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
