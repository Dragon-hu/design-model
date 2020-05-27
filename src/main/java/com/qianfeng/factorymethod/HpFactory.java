package com.qianfeng.factorymethod;

public class HpFactory extends AbstractFactory {
    @Override
    public AbstractComputer createComputer() {
        return new HpComputer();
    }
}
