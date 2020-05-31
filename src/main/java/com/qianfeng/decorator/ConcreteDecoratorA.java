package com.qianfeng.decorator;

/**
 * 具体装饰器角色
 * @author huwen
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        //初始化父类对象，设置属性component
        super(component);
    }

    @Override
    public void operation(){
        //调用父类的operation方法
        //实质上就是调用了具体构件的operation方法
        super.operation();
        addedFunction();
    }

    /**
     * 增加功能
     */
    public void addedFunction(){
        System.out.println("为具体构件角色增加额外的功能addedFunctionA()");
    }
}
