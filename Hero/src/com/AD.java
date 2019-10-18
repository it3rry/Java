package com;

/**
 * @title: AD
 * @projectName: Hero
 * @description: TODO
 * @author: Terry
 * @date: 2019/9/821:35
 */
public class AD extends hero {
    public AD(String name) {
        super(name);
    }

    @Override
    public void phycisAttack(){
        System.out.println("现在是AD英雄在进行物理攻击");
    }

    @Override
    public void magicAttack() {

    }
}
