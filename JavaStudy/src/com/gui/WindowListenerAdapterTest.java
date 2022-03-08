package com.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//继承WindowAdapter类，重写windowClosing()方法
public class WindowListenerAdapterTest extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        Window window = (Window) e.getComponent();
        window.dispose();
    }

    public static void main(String[] args) {
        Frame f = new Frame("我的窗体");
        f.setSize(400, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        //为窗口组件注册监听器
        WindowListenerAdapterTest wt = new WindowListenerAdapterTest();
        f.addWindowListener(wt);
    }
}
