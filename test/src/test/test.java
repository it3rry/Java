package test;

import java.util.HashMap;
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
        System.out.println("----------");
        HashMap<Integer,String> hm = new HashMap<Integer, String>();
        hm.put(1,"现在是1");
        hm.put(2,"现在是2");
        System.out.println(hm);
    }
}
