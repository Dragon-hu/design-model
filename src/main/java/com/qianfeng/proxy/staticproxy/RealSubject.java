package com.qianfeng.proxy.staticproxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("调用真实主题的request方法");
    }
}
