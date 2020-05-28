package com.qianfeng.proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicHandler {
    public static Subject getSubject(){
        Subject subject = new RealSubject();
        MyAspect myAspect = new MyAspect();
        Subject s1 = (Subject) Proxy.newProxyInstance(DynamicHandler.class.getClassLoader(), subject.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                myAspect.before();
                Object obj = method.invoke(subject, args);
                myAspect.after();
                return obj;
            }
        });
        return s1;
    }
}
