package com.qianfeng.builder;

public class ConcretBuilder extends AbstractBuilder {
    @Override
    public void buildPartA() {
        product.setPartA("建造partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("建造partC");
    }
}
