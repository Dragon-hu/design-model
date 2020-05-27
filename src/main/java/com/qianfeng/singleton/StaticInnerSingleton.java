package com.qianfeng.singleton;

/**
 * 静态内部类的单例模式
 * @author huwen
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton(){};

    /**
     * 一个静态内部类
     */
    private static class SingletonHolder{
        //创建一个静态常量的实例对象
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }
    public static StaticInnerSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
