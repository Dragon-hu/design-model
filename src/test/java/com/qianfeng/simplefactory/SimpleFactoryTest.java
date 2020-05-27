package com.qianfeng.simplefactory;

import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void testLenovo(){
        AbstractComputer computer = ComputerFactory.createComputer("lenovo");
        computer.start();
    }
    @Test
    public void testDell(){
        AbstractComputer computer = ComputerFactory.createComputer("dell");
        computer.start();
    }
    @Test
    public void testHp(){
        AbstractComputer computer = ComputerFactory.createComputer("hp");
        computer.start();
    }
}
