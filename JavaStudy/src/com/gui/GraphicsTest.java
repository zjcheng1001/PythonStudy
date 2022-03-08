package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class GraphicsTest {
    public static void main(String[] args) {
        final Frame frame = new Frame("验证码");           //创建Frame对象
        Panel panel = new MyPanel();                     //创建Panel对象
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);                     //将Frame窗口居中
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Button refreshBtn = new Button("刷新");
        refreshBtn.setBounds(200, 200, 10, 10);
        refreshBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == refreshBtn) {
                    System.out.println("pass");
                }
            }
        });
        frame.add(refreshBtn);
    }
}

class MyPanel extends Panel {
    public void paint(Graphics g) {
        int width = 160;                                       //定义验证码图片的宽度
        int height = 40;                                       //定义验证码图片的高度
        g.setColor(Color.LIGHT_GRAY);                          //设置颜色
        g.fillRect(0, 0, width, height);                 //设置验证码背景
        g.setColor(Color.BLACK);                               //设置颜色
        g.drawRect(0, 0, width - 1, height - 1);    //绘制边框
        //绘制干扰点
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int x = r.nextInt(width) - 2;
            int y = r.nextInt(height) - 2;
            g.drawOval(x, y, 2, 2);
        }
        g.setFont(new Font("黑体", Font.BOLD, 30));   //设置验证码字体
        g.setColor(Color.BLUE);
        //产生随机验证码
        char[] chars = ("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int pos = r.nextInt(chars.length);
            char c = chars[pos];
            sb.append(c + " ");
        }
        g.drawString(sb.toString(), 20, 30);
    }
}