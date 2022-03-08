package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ActionEventTest extends JFrame implements ActionListener { //实现动作监听器接口
    JButton buttonUp, buttonDown, buttonFirst, buttonLast;              //声明所需的按钮组件
    JLabel label1, label2, label3;                                      //声明所需的JLabel组件
    JPanel panel;                                                       //声明一个JPanel容器，用于图片的载入和显示
    CardLayout card;                                                    //声明一个CardLayout布局管理器，用于组件的叠加存放

    public ActionEventTest() {
        buttonUp = new JButton("上一张");
        buttonDown = new JButton("下一张");
        buttonFirst = new JButton("第一张");
        buttonLast = new JButton("最后一张");
        label1 = new JLabel();                                           //创建JLabel1，用于装入图片
        label2 = new JLabel();
        label3 = new JLabel();
        label1.setIcon(new ImageIcon("/Users/admin/Desktop/study/JavaStudy/src/com/gui/pic/1.png"));                 //将图片加入label1，实现图片的显示
        label2.setIcon(new ImageIcon("/Users/admin/Desktop/study/JavaStudy/src/com/gui/pic/2.png"));
        label3.setIcon(new ImageIcon("/Users/admin/Desktop/study/JavaStudy/src/com/gui/pic/3.png"));
        panel = new JPanel();                                           //创建一个JPanel容器，用于载入各个JLabel组件
        card = new CardLayout();                                        //将JPanel容器的布局管理器设为CardLayout
        panel.setLayout(card);                                          //实现图片的逐一显示
        panel.add(label1);                                              //将各个JLabel组件加入到JPanel容器
        panel.add(label2);
        panel.add(label3);
        card.first(panel);
        add(panel, BorderLayout.CENTER);                                //将JPanel容器加入到窗口的中间位置
        add(buttonUp, BorderLayout.WEST);
        add(buttonDown, BorderLayout.EAST);
        add(buttonFirst, BorderLayout.NORTH);
        add(buttonLast, BorderLayout.SOUTH);
        buttonUp.addActionListener(this);                             //注册监听器，用当前对象this作监听器
        buttonDown.addActionListener(this);                           //因为当前对象所在的类实现了ActionEvent接口
        buttonFirst.addActionListener(this);                          //所以它可以作为监听器
        buttonLast.addActionListener(this);
        setTitle("ActionEvent");
        setSize(300, 200);
        setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //actionPerformed是ActionEvent接口中的方法，必须定义
    //当事件发生后，该方法就会被调用，并将事件对象传递给参数e
    @Override
    public void actionPerformed(ActionEvent e) {
        //一个监听器同时监听4个按钮，所以要判断是哪一个事件源产生的事件
        if (e.getSource() == buttonUp) {
            card.previous(panel);
        } else if (e.getSource() == buttonDown) {
            card.next(panel);
        } else if (e.getSource() == buttonFirst) {
            card.first(panel);
        } if (e.getSource() == buttonLast) {
            card.last(panel);
        }
    }

    public static void main(String[] args) {
        new ActionEventTest();
    }
}
