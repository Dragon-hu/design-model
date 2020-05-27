package com.qianfeng.singleton;

/**
 * 饿汉式单例，类加载的时候就创建实例对象
 * @author huwen
 */
public class HungrySingleton {
    /**
     * 创建一个静态实例
     */
    private static HungrySingleton instance = new HungrySingleton();

    /**
     * 私有化构造方法
     */
    private HungrySingleton(){}

    /**
     * 提供外界访问的方法
     * @return 返回之前创建的实例
     */
    public static HungrySingleton getInstance(){
        return instance;
    }
}
