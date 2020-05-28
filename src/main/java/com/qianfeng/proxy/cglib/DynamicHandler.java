package com.qianfeng.proxy.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DynamicHandler {
    public static RealSubject getSubject(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        MyAspect myAspect = new MyAspect();
        RealSubject realSubject = new RealSubject();
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                Object obj = method.invoke(realSubject, objects);
                myAspect.after();
                return obj;
            }
        });
        RealSubject subject = (RealSubject) enhancer.create();
        return subject;
    }
}
