package com.qianfeng.composite;

/**
 * Leaf在组合中表示叶节点对象，叶节点没有子节点
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    /**
     * 由于叶节点不能增加树枝或树叶，所以add和remove方法没有实现的意义
     * 但这样做可以消除叶子节点和树枝节点对象在抽象层次的区别，
     * 它们具备完全一致的接口
     * @param c 树叶或树枝对象
     */
    @Override
    public void add(Component c) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        for (int i = 0; i < depth ; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
