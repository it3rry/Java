package com.terr.one1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();

        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(33, 50, 32));

        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(50, 26, 25));

        frame.add(panel);
        frame.setVisible(true);
        //监听事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //这个时候需要结束程序
                System.exit(0);

            }
        });
    }
}
