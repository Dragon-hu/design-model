package com.qianfeng.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("a",new ConcreteFlyweight());
        flyweights.put("b",new ConcreteFlyweight());
        flyweights.put("c",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if(flyweight!=null){
            System.out.println("具体享元 "+key+" 已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight();
            flyweights.put(key,flyweight);
        }
        return flyweight;
    }
}
