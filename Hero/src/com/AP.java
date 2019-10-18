package com;

/**
 * @title: AP
 * @projectName: Hero
 * @description: TODO
 * @author: Terry
 * @date: 2019/9/821:01
 */
public class AP extends hero{
    public AP(String name) {
        super(name);
    }

    @Override
    public void phycisAttack() {

    }

    @Override
    public void magicAttack(){
        System.out.println("现在是AP英雄进行魔法攻击");
    }
}
