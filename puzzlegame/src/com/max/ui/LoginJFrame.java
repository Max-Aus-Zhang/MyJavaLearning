package com.max.ui;

import javax.swing.*;
import java.awt.*;

public class LoginJFrame extends JFrame {
    public LoginJFrame() throws HeadlessException {
       this.initFrame();
    }

    public void initFrame(){
        setSize(488,430);
        setVisible(true);
        this.setTitle("拼图单机版 登陆");
        setAlwaysOnTop(true);
        setDefaultCloseOperation(3);
    }
}
