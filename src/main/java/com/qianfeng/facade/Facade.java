package com.qianfeng.facade;

public class Facade {
    private SubSystemA systemA;
    private SubSystemB systemB;
    private SubSystemC systemC;

    public Facade() {
        this.systemA = new SubSystemA();
        this.systemB = new SubSystemB();
        this.systemC = new SubSystemC();
    }

    public void showA(){
        systemA.show();
    }

    public void showB(){
        systemB.show();
    }

    public void showC(){
        systemC.show();
    }
}
