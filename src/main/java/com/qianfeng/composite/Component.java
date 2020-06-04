package com.qianfeng.composite;

/**
 * Component为组合中的对象声明接口
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 增加树叶或树枝
     * @param c 树叶或树枝对象
     */
    public abstract void add(Component c);

    /**
     * 移除树叶或树枝
     * @param c 将要移除的树叶或树枝对象
     */
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
