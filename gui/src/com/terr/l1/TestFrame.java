package com.terr.l1;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {

        //在内存中开辟一块空间new一个窗口
        Frame frame = new Frame("现在显示的是第一个图形界面窗口");

        //在界面中设置可见性
        frame.setVisible(true);

        //设置窗口大小
        frame.setSize(400,400);

        //设置背景颜色
        frame.setBackground(Color.BLACK);

        //设置弹出窗口的初始位置
        frame.setLocation(200,200);

        //设置的窗体大小固定
        frame.setResizable(false);
    }
}
