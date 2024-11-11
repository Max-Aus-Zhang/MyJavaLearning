package com.max.ui;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame extends JFrame implements MouseListener, KeyListener {

    JFrame frame = new JFrame();
    JButton button = new JButton("click me");

    public MyJFrame() {
        this.initFrame();
    }

    public void initFrame(){
       frame.setSize(603,680);
       this.setTitle("demo");
       this.setAlwaysOnTop(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLayout(null);
       this.setVisible(true);
        button.setSize(100,50);
        this.getContentPane().add(button);
        button.addMouseListener(this);
        this.addKeyListener(this);


    }

    public void monitor(){

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("pass through");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("press now");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("release now");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("enter now");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("exit now");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("release now");
    }
}
