package com.qianfeng.abstractfactory;

public class HuaweiFactory extends AbstractFactory {
    @Override
    public Computer createComputer() {
        return new HuaweiComputer();
    }

    @Override
    public Television createTelevision() {
        return new HuaweiTelevision();
    }
}
