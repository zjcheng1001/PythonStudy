package com.gui;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerTest implements WindowListener {
    public void windowClosing(WindowEvent e) {
        Window window = e.getWindow();
        window.setVisible(false);
        window.dispose();
    }
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        Frame f = new Frame("我的窗体");
        f.setSize(400, 300);
        f.setLocation(300, 200);
        f.setVisible(true);
        //为窗口组件注册监听器
        WindowListenerTest wt = new WindowListenerTest();
        f.addWindowListener(wt);
    }
}
