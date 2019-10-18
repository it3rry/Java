package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @title: file
 * @projectName: 文件流
 * @description: TODO
 * @author: Terry
 * @date: 2019/9/7 13:23
 */
public class file {
    public static void main(String[] args) throws IOException {
        System.out.println("程序开始运行。");
        byte[]  buf = new  byte[10];
        for (int i = 0 ; i < buf.length ; i++){
            buf[i] = (byte)i;
        }
        FileOutputStream out = new FileOutputStream("a.dat");
        out.write(buf);
        out.close();
        System.out.println("程序运行完毕。");
    }
}
