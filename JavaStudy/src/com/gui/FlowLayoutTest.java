package com.gui;

import java.awt.*;

public class FlowLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout");
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));
        f.setSize(200, 300);
        f.setLocation(300, 200);
        f.add(new Button("第1个按钮"));
        f.add(new Button("第2个按钮"));
        f.add(new Button("第3个按钮"));
        f.add(new Button("第4个按钮"));
        f.add(new Button("第5个按钮"));
        f.add(new Button("第6个按钮"));
        f.setVisible(true);
    }
}
