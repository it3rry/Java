package com;

/**
 * @title: hero
 * @projectName: Hero
 * @description: TODO
 * @author: Terry
 * @date: 2019/9/820:53
 */
public abstract class hero {
    private String name;
//    private int len;

    public hero(String name) {
        this.name = name;
//        this.len = len;
    }
//下面是两个抽线方法，这是一个抽象类
    public abstract void phycisAttack();

    public abstract  void magicAttack();

}
