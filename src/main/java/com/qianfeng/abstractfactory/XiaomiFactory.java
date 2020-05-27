package com.qianfeng.abstractfactory;

public class XiaomiFactory extends AbstractFactory {
    @Override
    public Computer createComputer() {
        return new XiaomiComputer();
    }

    @Override
    public Television createTelevision() {
        return new XiaomiTelevision();
    }
}
