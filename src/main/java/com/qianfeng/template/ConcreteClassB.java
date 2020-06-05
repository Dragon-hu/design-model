package com.qianfeng.template;

/**
 * 实现父类所定义的一个或多个抽象方法，可以有多个具体类
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("具体类B方法1实现");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("具体类B方法2实现");
    }
}
