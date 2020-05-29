package com.qianfeng.bridge;

public class ConcreteImplementor implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化角色被访问");
    }
}
