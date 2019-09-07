package test;

import java.io.IOException;
import java.util.Scanner;

/**
 * @title: read
 * @projectName: read
 * @description: TODO
 * @author: Terry
 * @date: 2019/9/713:13
 */
public class read {
    public static void main(String[] args) throws IOException {
        System.out.println("hello world");
        Scanner in = new Scanner(System.in);
        byte[] buffer =  new  byte[1024];
        int len  = System.in.read(buffer);
        String s = new String(buffer,0,len);
        System.out.println("读到了"+ "字节");
        System.out.println(s.toString());
        System.out.println("S的长度是"+s.length());
    }
}
