package com.qianfeng.facade;

import org.junit.Test;

public class FacadeTest {
    @Test
    public void testFacade(){
        Facade facade = new Facade();
        facade.showA();
        facade.showB();
        facade.showC();
    }
}
