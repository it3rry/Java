package test;

import java.util.HashSet;

/**
 * @title: test
 * @projectName: test
 * @description: 实现set
 * @author: Terry
 * @date: 2019/9/210:41
 */
public class test {
    public static void main(String[] args) {
        HashSet<String> a = new HashSet<String>();
        a.add("first");
        a.add("second");
        a.add("first");
        System.out.println(a);
    }
}
