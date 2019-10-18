package com;

import java.util.ArrayList;

/**
 * @title: TestHero
 * @projectName: Hero
 * @description: TODO
 * @author: Terry
 * @date: 2019/9/8 20:56
 */
public class TestHero {
    public static void main(String[] args) {
        AP ez = new AP("ez");
        AP vn = new AP("vn");
        AP ann = new AP("ann");
        AP amm= new AP("amm");
        AP abb = new AP("abb");

        ez.magicAttack();
        ArrayList a =  new ArrayList();
        a.add(ez);
        a.add(vn);
        a.add(ann);
        a.add(new AD("赵天悦"));

        System.out.println(a.size());
    }
}
