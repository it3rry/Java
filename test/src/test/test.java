package test;

import java.util.ArrayList;
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
//        HashSet<String> a = new HashSet<String>();
//        a.add("first");
//        a.add("second");
//        a.add("first");
//        System.out.println(a);
//        System.out.println("----------");
//        HashMap<Integer,String> hm = new HashMap<Integer, String>();
//        hm.put(1,"现在是1");
//        hm.put(2,"现在是2");
//        System.out.println(hm);
        ArrayList al = new ArrayList();
        al.add("111");

        ArrayList al2 = new ArrayList();
        al2.add("zhaotianyue");
        al.addAll(al2);

        al.add(0,"a");
//        System.out.println(al.get(0));

        for (int i = 0;i < al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
