package com.terr.one1;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");


        //设置为流式布局
        frame.setLayout(new FlowLayout());
        frame.setSize(200,200);

        //把按钮添加上去

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        frame.setVisible(true);
    }
}
