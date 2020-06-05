package com.qianfeng.template;

/**
 * 抽象模板，定义并实现了一个模板方法，这个模板方法一般是一个具体方法，给出了一个顶级
 * 逻辑的框架，而逻辑的组成步骤在相应的抽象操作中，推迟到子类实现
 */
public abstract class AbstractClass {
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();

    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("");
    }
}
