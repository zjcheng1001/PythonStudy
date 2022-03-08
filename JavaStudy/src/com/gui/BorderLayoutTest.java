package com.gui;

import java.awt.*;

public class BorderLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("BorderLayout");
        f.setLayout(new BorderLayout());
        f.setSize(200, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        Button btn1 = new Button("东部");
        Button btn2 = new Button("南部");
        Button btn3 = new Button("西部");
        Button btn4 = new Button("北部");
        Button btn5 = new Button("中部");
        f.add(btn1, BorderLayout.EAST);
        f.add(btn2, BorderLayout.WEST);
        f.add(btn3, BorderLayout.SOUTH);
        f.add(btn4, BorderLayout.NORTH);
        f.add(btn5, BorderLayout.CENTER);
    }
}
