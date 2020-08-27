package com.qianfeng.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 可翻译为主题或抽象通知者，一般用一个抽象类或者一个接口实现
 * 将所有对观察者对象的引用保存在一个集合中，每个主题都可以有任何数量的观察者，
 * 抽象主题提供一个接口，可以增加和删除观察者对象
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notice(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
