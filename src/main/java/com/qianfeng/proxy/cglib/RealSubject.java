package com.qianfeng.proxy.cglib;

public class RealSubject{

    public void request() {
        System.out.println("调用真实主题的request方法");
    }
}
