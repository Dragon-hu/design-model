package com.qianfeng.adapter.objectadapter;

/**
 * 适配者类定义了将要在目标接口中被调用的方法
 */
public class Adaptee {
    public void specificRequest(){
        System.out.println("适配者中的业务代码被调用");
    }
}
