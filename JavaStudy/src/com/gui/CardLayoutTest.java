package com.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutTest extends Frame implements ActionListener {
    Panel cardPanel = new Panel();                      //定义Panel面板放置卡片
    Panel controlPanel = new Panel();                   //定义Panel面板放置按钮
    Button nextButton, preButton;                       //声明两个按钮
    CardLayout cardLayout = new CardLayout();           //定义卡片布局对象

    //定义构造方法，设置卡片布局管理器的属性
    public CardLayoutTest() {
        setSize(300, 200);
        setVisible(true);
        //为窗口添加关闭事件监听器
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                CardLayoutTest.this.dispose();
            }
        });
        cardPanel.setLayout(cardLayout);                //设置cardPanel面板对象为卡片布局
        //在cardPanel面板对象中添加3个文本标签
        cardPanel.add(new Label("第一个界面", Label.CENTER));
        cardPanel.add(new Label("第二个界面", Label.CENTER));
        cardPanel.add(new Label("第三个界面", Label.CENTER));
        //创建两个按钮对象
        nextButton = new Button("下一张卡片");
        preButton = new Button("上一张卡片");
        //为按钮对象注册监听器
        nextButton.addActionListener(this);
        preButton.addActionListener(this);
        //将按钮添加到controlPanel中
        controlPanel.add(preButton);
        controlPanel.add(nextButton);
        //将cardPanel面板放置在窗口边界布局的中间，窗口默认为边界布局
        this.add(cardPanel, BorderLayout.CENTER);
        //将controlPanel面板放置在窗口边界布局的南区
        this.add(controlPanel, BorderLayout.SOUTH);
    }
    //下面的代码实现了按钮的监听触发，并对触发事件做出相应的处理
    public void actionPerformed(ActionEvent e) {
        //如果用户单机nextButton按钮，执行的语句
        if (e.getSource() == nextButton) {
            //切换到cardPanel面板中当前组件的下一个组件
            //若当前组件为最后一个组件，则显示第一个组件
            cardLayout.next(cardPanel);
        }
        if (e.getSource() == preButton) {
            //切换到cardPanel面板中当前组件的前一个组件
            //若当前组件为第一个组件，则显示最后一个组件
            cardLayout.previous(cardPanel);
        }
    }

    public static void main(String[] args) {
        CardLayoutTest cardLayout = new CardLayoutTest();
    }
}
