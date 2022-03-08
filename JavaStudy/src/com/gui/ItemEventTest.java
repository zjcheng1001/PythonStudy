package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEventTest extends JFrame implements ItemListener, ActionListener {//定义一个窗口，继承并实现ItemListener接口
    JTextField text;
    JButton button;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JRadioButton radio1, radio2;
    ButtonGroup group;
    JComboBox comboBox;
    JTextArea area;

    public void display() {
        setLayout(new FlowLayout());

        add(new JLabel("文本框:"));
        text = new JTextField(10);
        add(text);

        add(new JLabel("按钮:"));
        button = new JButton("确定");
        button.addActionListener(this);
        add(button);

        add(new JLabel("复选框:"));
        checkBox1 = new JCheckBox("喜欢音乐");
        checkBox2 = new JCheckBox("喜欢旅游");
        checkBox3 = new JCheckBox("喜欢篮球");
        checkBox1.addItemListener(this);                //注册监听器，监听JCheckBox组件
        checkBox2.addItemListener(this);
        checkBox3.addItemListener(this);
        add(checkBox1);
        add(checkBox2);
        add(checkBox3);

        add(new JLabel("单选框:"));
        radio1 = new JRadioButton("男");
        radio2 = new JRadioButton("女");
        group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        add(radio1);
        add(radio2);

        add(new JLabel("下拉列表:"));
        comboBox = new JComboBox();
        comboBox.addItem("请选择");
        comboBox.addItem("音乐天地");
        comboBox.addItem("武术天地");
        comboBox.addItem("象棋乐园");
        comboBox.addItemListener(this);             //注册监听器，监听JComboBox组件
        add(comboBox);

        add(new JLabel("文本区:"));
        area = new JTextArea(6, 12);
        add(new JScrollPane(area));

        setSize(300, 300);
        setTitle("ItemEvent");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {//重写itemStateChanged方法，实现监听的处理
        if (e.getItem() == checkBox1) {
            //如果监听到的对象是checkBox1，显示对象内容和选择状态
            String str = checkBox1.getText() + checkBox1.isSelected();
            area.append(str + "\n");
        } else if (e.getItem() == checkBox2) {
            String str = checkBox2.getText() + checkBox2.isSelected();
            area.append(str + "\n");
        } else if (e.getItem() == checkBox3) {
            String str = checkBox3.getText() + checkBox3.isSelected();
            area.append(str + "\n");
        } else if (e.getItemSelectable() == comboBox) {
            //如果监听到的对象是comboBox，显示当前选择的内容
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String str = comboBox.getSelectedItem().toString();
                area.append(str + "\n");
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String str = text.getText();
            area.append(str + "\n");
        }
    }

    public static void main(String[] args) {
        new ItemEventTest().display();
    }
}
