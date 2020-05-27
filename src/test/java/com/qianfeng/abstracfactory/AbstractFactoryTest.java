package com.qianfeng.abstracfactory;

import com.qianfeng.abstractfactory.AbstractFactory;
import com.qianfeng.abstractfactory.HuaweiFactory;
import com.qianfeng.abstractfactory.XiaomiFactory;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void testAbstractFactory(){
        AbstractFactory xiaomiFactory = new XiaomiFactory();
        xiaomiFactory.createComputer().show();
        xiaomiFactory.createTelevision().show();
        AbstractFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.createTelevision().show();
        huaweiFactory.createComputer().show();
    }
}
