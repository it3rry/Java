package test.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

/**
 * @title: file
 * @projectName: 文件流
 * @description: TODO
 * @author: Terry
 * @date: 2019/9/7 13:23
 */
public class TestFile {
    public static void main(String[] args) throws FileNotFoundException {
//        File f=new File("E:/电脑桌面/jar/files/create.txt");
        OutputStream f = new FileOutputStream("D:/git/Java/FileStream/www.txt");
//        File f1 = new File("D:/git/Java/FileStream/www.txt");
        System.out.println("程序运行完毕。");
    }
}
