package com.qianfeng.simplefactory;

/**
 * @author huwen
 */
public class ComputerFactory {
    public static AbstractComputer createComputer(String type){
        AbstractComputer computer = null;
        switch (type){
            case "lenovo":
                computer = new LenovoComputer();
                break;
            case "dell":
                computer = new DellComputer();
                break;
            case "hp":
                computer = new HpComputer();
                break;
            default:
                break;
        }
        return computer;
    }
}
