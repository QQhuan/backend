package com.qquhuan.JFrame;

import javax.swing.*;

public class JFrameTest {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setSize(520, 520);

        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 关闭窗体则关闭程序

        f.setTitle("爷的窗体");

        f.setLayout(null); // 取消默认布局方式

        JButton btn = new JButton("确认下单");
        btn.setBounds(250, 250, 100, 45);

        f.getContentPane().add(btn);

        f.setVisible(true);
    }
}
