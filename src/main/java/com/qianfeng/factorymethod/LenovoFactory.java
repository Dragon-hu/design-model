package com.qianfeng.factorymethod;

public class LenovoFactory extends AbstractFactory {
    @Override
    public AbstractComputer createComputer() {
        return new LenovoComputer();
    }
}
