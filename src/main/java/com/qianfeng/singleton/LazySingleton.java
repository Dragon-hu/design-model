package com.qianfeng.singleton;

/**
 * 懒汉式(双重校验锁，线程安全)
 * @author huwen
 */
public class LazySingleton {
    /**
     * 静态变量
     */
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    /**
     * 静态方法，供外界访问的接口
     * @return
     */
    public static LazySingleton getInstance(){
        //首先判断是否为null
        if(instance==null){
            //同步代码块，多个线程同时只能有一个线程执行同步代码块中的代码
            synchronized (LazySingleton.class){
                //需要再次判断是否为null
                if(instance==null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
