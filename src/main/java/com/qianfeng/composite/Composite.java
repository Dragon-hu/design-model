package com.qianfeng.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义树枝节点的行为，用来存储子部件
 */
public class Composite extends Component {
    /**
     * 当前树枝节点的所有子节点，有可能是树枝节点，也有可能是树叶节点
     */
    private List<Component> children  = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    /**
     * 增加子节点
     * @param c 树叶或树枝对象
     */
    @Override
    public void add(Component c) {
        children.add(c);
    }

    /**
     * 移除当前树叶节点的某个子节点
     * @param c 将要移除的树叶或树枝对象
     */
    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    /**
     * 显示节点名称，并对子节点进行遍历
     * @param depth
     */
    @Override
    public void display(int depth) {
        for (int i = 0; i < depth ; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (Component child : children) {
            child.display(depth+2);
        }
    }
}
