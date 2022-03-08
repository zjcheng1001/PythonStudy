package com.gui;

import java.awt.*;

public class GridBagLayoutTest extends Frame {
    public GridBagLayoutTest(String title) {
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        this.setLayout(layout);
        c.fill = GridBagConstraints.BOTH;               //设置组件横向纵向都可以拉伸
        c.weightx = 1;                                  //设置横向权重为1
        c.weighty = 1;                                  //设置纵向权重为1
        this.addComponent("btn1", layout, c);
        this.addComponent("btn2", layout, c);
        this.addComponent("btn3", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        this.addComponent("btn4", layout, c);
        c.weightx = 0;
        c.weighty = 0;
        addComponent("btn5", layout, c);
        c.gridwidth = 1;                                //设置组件跨一个网格（默认值）
        this.addComponent("btn6", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER;     //添加的组件是本行最后一个组件
        this.addComponent("btn7", layout, c);
        c.gridheight = 2;                               //设置组件纵向跨两个网格
        c.gridwidth = 1;                                //设置组件横向跨两个网格
        c.weightx = 2;                                  //设置横向权重为2
        c.weighty = 2;                                  //设置纵向权重为2
        this.addComponent("btn8", layout, c);
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight = 1;
        this.addComponent("btn9", layout, c);
        this.addComponent("btn10", layout, c);
        this.setTitle(title);
        this.pack();
        this.setVisible(true);
    }

    //增加组件的方法
    public void addComponent(String name, GridBagLayout layout, GridBagConstraints c) {
        Button btn = new Button(name);      //创建一个名为name的按钮
        layout.setConstraints(btn, c);      //设置GridBagConstraints对象和按钮的关联
        this.add(btn);                      //增加按钮
    }

    public static void main(String[] args) {
        new GridBagLayoutTest("GridBagLayout");
    }
}
