package com.test.common.util.translate;

import javax.swing.*;

/**
 * 测试
 */
public class TranslateTool {
    public static void main(String[] args) {

        MainFrame mainFrame = new MainFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(300, 200, 600, 500);
        mainFrame.setVisible(true);
        mainFrame.setAlwaysOnTop(true);//设置在最顶层
        mainFrame.setMinWindowLayout();

        Thread t = new Thread(mainFrame);
        t.start();    //开启线程
    }
}