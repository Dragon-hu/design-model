package com.qianfeng.builder;

public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public Computer(Builder builder){
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder(){}

        public Builder screen(String val){
            screen = val;
            return this;
        }

        public Builder memory(String val){
            memory = val;
            return this;
        }

        public Builder cpu(String val){
            cpu = val;
            return this;
        }

        public Builder mainboard(String val){
            mainboard = val;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public void show(){
        System.out.println("cpu:"+cpu+";screen:"+screen+";memory:"+memory+";mainboard:"+mainboard);
    }
}
