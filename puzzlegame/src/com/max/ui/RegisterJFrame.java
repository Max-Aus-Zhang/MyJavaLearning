package com.max.ui;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class RegisterJFrame extends JFrame {
    public RegisterJFrame() throws HeadlessException {
   this.initFrame();
    }

    public void initFrame(){
        setSize(488,500);
        setVisible(true);
        this.setTitle("拼图单机版 注册");
        setAlwaysOnTop(true);
        setDefaultCloseOperation(3);
    }

}
