package com.qianfeng.proxy.staticproxy;

public class Proxy implements Subject {
    private RealSubject realSubject;
    @Override
    public void request() {
        if(realSubject==null){
            realSubject = new RealSubject();
        }
        before();
        realSubject.request();
        after();
    }

    public void before(){
        System.out.println("-------before-----------");
    }

    public void after(){
        System.out.println("--------after------------");
    }
}
