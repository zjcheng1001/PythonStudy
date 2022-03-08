package com.gui;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventTest {
    public static void main(String[] args) {
        final Frame f = new Frame("KeyEvent");
        f.setLayout(new FlowLayout());
        f.setSize(400, 300);
        f.setLocation(300, 200);
        TextField tf = new TextField(30);           //创建文本框对象
        f.add(tf);
        f.setVisible(true);
        //为文本框添加键盘事件监听器
        tf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int KeyCode = e.getKeyCode();               //返回所按键对应的整数值
                String s = KeyEvent.getKeyText(KeyCode);    //返回按键的字符串描述
                System.out.print("输入的内容为：" + s + ", ");
                System.out.println("对应的KeyCode为：" + KeyCode);
            }
        });
    }
}
