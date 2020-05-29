package com.qianfeng.bridge;

public class RedefinedAbstraction extends Abstraction {
    protected RedefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化角色被访问");
        implementor.operationImpl();
    }
}
