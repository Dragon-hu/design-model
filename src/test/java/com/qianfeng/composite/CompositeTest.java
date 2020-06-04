package com.qianfeng.composite;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void compositeTest(){
        Composite root = new Composite("root");
        //根上长出两个叶节点
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        //composite X树枝节点上长出两个叶节点
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        //把composite X挂在根上
        root.add(comp);

        Composite comp2 = new Composite("Composite XY");
        //composite X树枝节点上长出两个叶节点
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));

        comp.add(comp2);

        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
