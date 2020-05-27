package com.qianfeng.factorymethod;

public class DellFactory extends AbstractFactory {
    @Override
    public AbstractComputer createComputer() {
        return new DellComputer();
    }
}
