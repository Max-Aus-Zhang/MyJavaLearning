package com.max.guidemo1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJButton extends JFrame implements ActionListener {
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    public MyJButton() throws HeadlessException {
        this.initFrame();
    }

    public void initFrame(){
        JFrame frame = new JFrame();
        frame.setSize(603, 680);
        frame.setTitle("demo");
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);


        jButton1.setText("jButton1");
        jButton1.setBounds(50, 50, 100, 50);
        jButton1.addActionListener(this);

        jButton2.setText("jButton2");
        jButton2.setBounds(200, 50, 100, 50);
        jButton2.addActionListener(this);


        frame.getContentPane().add(jButton1);
        frame.getContentPane().add(jButton2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

            if (e.getSource() == jButton1) {
                JOptionPane.showMessageDialog(null, "Hello World");
            } else if (e.getSource() == jButton2) {
                System.out.println("sec button running now !");
            }
        }
    }

