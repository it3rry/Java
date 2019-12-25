package com.terr.l2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestActionEvent {
    public static void main(String[] args) {
        //按下按钮,触发一些事件
        Frame frame = new Frame();


        Button button = new Button();
        //因为addActionListener需要ActionListener,所以我们需要构造一个ActionListener
        MyActionListener myActionListener = new MyActionListener();

        button.addActionListener(myActionListener);
        frame.add(button,BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}

class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("aaa");
    }
}
