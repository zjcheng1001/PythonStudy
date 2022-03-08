package com.gui;

import java.awt.*;

public class CustomLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setLayout(null);
        f.setSize(300, 150);
        Button btn1 = new Button("press");
        Button btn2 = new Button("pop");
        btn1.setBounds(40, 60, 100,30);         //左上角的x，y坐标，组件的长、宽
        btn2.setBounds(140, 90, 100,30);         //左上角的x，y坐标，组件的长、宽
        f.add(btn1);
        f.add(btn2);
        f.setVisible(true);
    }
}
