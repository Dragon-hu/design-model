package com.qianfeng.builder;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void testBuilder(){
        AbstractBuilder builder = new ConcretBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
    @Test
    public void testComputer(){
        Computer computer = new Computer.Builder()
                .cpu("i9-9900k")
                .screen("dell xasx6z7s")
                .memory("samsung 3200 16g")
                .mainboard("asus b360")
                .build();
        computer.show();
    }
}
