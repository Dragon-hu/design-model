package com.qianfeng.builder;

public class Director {
    private AbstractBuilder builder;
    public Director(AbstractBuilder builder){
        this.builder = builder;
    }
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
