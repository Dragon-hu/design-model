package com.qianfeng.decorator;

/**
 * 抽象构件角色
 * @author huwen
 */
public interface Component {
    /**
     * 规范实现类必须重写的方法，也是需要调用的方法
     */
    void operation();
}
