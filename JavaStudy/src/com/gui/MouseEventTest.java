package com.gui;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventTest {
    public static void main(String[] args) {
        final Frame f = new Frame("MouseEvent");
        f.setSize(300, 200);
        f.setLocation(300, 200);
        f.setVisible(true);
        Button btn = new Button("Button");          //创建按钮对象
        f.add(btn);
        //为按钮添加鼠标事件监听器
        btn.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("mouseClicked---鼠标完成单击事件");
                if (e.getButton() == e.BUTTON1) {
                    System.out.println("鼠标左键点击事件");
                }
                if (e.getButton() == e.BUTTON3) {
                    System.out.println("鼠标右键点击事件");
                }
                if (e.getButton() == e.BUTTON2) {
                    System.out.println("鼠标中键点击事件");
                }
                if (e.getClickCount() == 1) {
                    System.out.println("鼠标单击事件");
                }
                if (e.getClickCount() == 2) {
                    System.out.println("鼠标双击事件");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("mousePressed---鼠标按下事件");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("mouseReleased---鼠标放开事件");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("mouseEntered---鼠标进入按钮区域事件");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("mouseExited---鼠标移出按钮区域事件");
            }
        });
    }
}
