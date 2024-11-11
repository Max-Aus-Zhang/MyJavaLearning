package com.max.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;


public class GameJFrame extends JFrame implements KeyListener , ActionListener {
//  随机数
    Random r = new Random();
    //        创建用于存储的二维数组
    int[][] doubleNums = new int[4][4];
    //    一个正确顺序的二维数组
    int[][] standard = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    //    创建接受空白拼图的索引
    int x = 0;
    int y = 0;
//    步数统计
    int count = 0;
    //        类别里的选项
    JMenuItem reset = new JMenuItem("重新开始");
    JMenuItem relogin = new JMenuItem("重新登陆");
    JMenuItem close = new JMenuItem("退出");
    JMenuItem publicPage = new JMenuItem("公众号");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    JLabel bg = new JLabel(new ImageIcon("image\\background.png"));


    //   GameJFrame类的构造函数
    /*在构造函数中调用初始化框架和载入图像方法*/
    public GameJFrame() throws HeadlessException {
        this.initJFrame();
        this.initNum();
        this.initImage();
        this.initMenu();
    }

    public void initNum() {
        //        创建数组
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//     打乱数组
        Random r = new Random();
        for (int i = 0; i < nums.length; i++) {
            //获取到随机索引
            int index = r.nextInt(nums.length);
            //拿着遍历到的每一个数据，跟随机索引上的数据进行交换
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
//        赋值

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                x = i / 4;
                y = i % 4;
                System.out.println("x=" + x + " y=" + y);
            }
            doubleNums[i / 4][i % 4] = nums[i];
        }
//        显示打乱顺序后的二维数组
        for (int i = 0; i < doubleNums.length; i++) {
            for (int j = 0; j < doubleNums[i].length; j++) {
                System.out.print(doubleNums[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*根据二维数组传图片*/
    private void initImage() {

//        开始前清空图片
        this.getContentPane().removeAll();



//        判断赢了没
        if(this.passGame()){
            JLabel win = new JLabel(new ImageIcon("image\\win.png"));
            win.setBounds(201,281,197,73);
            this.getContentPane().add(win);
            System.out.println("win the game");
        }

JLabel step = new JLabel("步数:"+count);
        step.setBounds(600,600,100,50);
        this.getContentPane().add(step);

        //        添加图片位置
        /*通过双重循环来添加图片*/


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int count = doubleNums[i][j];
                JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\Max.Zhang\\Desktop\\JavaWorkShop\\puzzlegame" +
                        "\\image\\animal" +
                        "\\animal3\\" + count + ".jpg"));

                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                this.getContentPane().add(jLabel);
//                给图加边框
                jLabel.setBorder(new BevelBorder(1));

                System.out.print(count+"  ");
            }
        }
        //            美化,添加背景图片


        bg.setBounds(40, 40, 508, 560);

        this.getContentPane().add(bg);



//        可以强制刷新窗口和子组件布局，确保所有内容被正确绘制。
        this.getContentPane().revalidate();
        this.getContentPane().repaint();

    }

    //初始化界面的尺寸并且可以显示
    private void initJFrame() {
        setSize(703, 780);
        this.setTitle("拼图单机版v1.0");
        setAlwaysOnTop(true);
        setDefaultCloseOperation(3);

//        添加键盘监听
        this.addKeyListener(this);


        setVisible(true);
//禁用布局管理器这样设置的图像才能在坐标上
        this.setLayout(null);

        this.getContentPane().repaint();
    }

    //初始化菜单选项
    public void initMenu() {
//        菜单框架
        JMenuBar menuBar = new JMenuBar();
//        菜单里的类别
        JMenu functionMenu = new JMenu("功能");
        JMenu introMenu = new JMenu("关于我们");
//创建更换图片
        JMenu changeImage = new JMenu("更换图片");
        functionMenu.add(changeImage);
        functionMenu.add(reset);
        functionMenu.add(relogin);
        functionMenu.add(close);
        introMenu.add(publicPage);

        menuBar.add(functionMenu);
        menuBar.add(introMenu);

        //把美女，动物，运动添加到更换图片当中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

//        绑定鼠标监听给选项
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);
        reset.addActionListener(this);
        relogin.addActionListener(this);
        close.addActionListener(this);
        publicPage.addActionListener(this);

//        设置做好的菜单
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }



    /*键盘监听方法*/
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //    按下A键,导入大图
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (passGame()){
            return;
        }
        if (code == 65) {
            this.getContentPane().removeAll();
            JLabel wholePic = new JLabel(new ImageIcon("image\\animal\\animal3\\all.jpg"));
            wholePic.setBounds(83, 134, 420, 420);
            this.getContentPane().add(wholePic);
            this.getContentPane().add(bg);
            this.getContentPane().repaint();

        }
    }

    //    判断按键
    @Override
    public void keyReleased(KeyEvent e) {


        if (passGame()){
            return;
        }
        int code = e.getKeyCode();
        System.out.println(code + "is press");

//        向上移动
        if (code == 38) {
            if (x == 3) {
                return;
            }
            doubleNums[x][y] = doubleNums[x + 1][y];
            doubleNums[x + 1][y] = 0;
            x++;
            count++;
            this.initImage();

        }
//      向下移动
        if (code == 40) {
            if (x == 0) {
                return;
            }
            doubleNums[x][y] = doubleNums[x - 1][y];
            doubleNums[x - 1][y] = 0;
            x--;
            count++;
            this.initImage();

        }
//向左移动
        if (code == 37) {
            if (y == 3) {
                return;
            }
            doubleNums[x][y] = doubleNums[x][y + 1];
            doubleNums[x][y + 1] = 0;
            y++;
            count++;
            this.initImage();

        }
//      向右移动
        if (code == 39) {
            if (y == 0) {
                return;
            }
            doubleNums[x][y] = doubleNums[x][y - 1];
            doubleNums[x][y - 1] = 0;
            y--;
            count++;
            this.initImage();

        }
//
        if (code == 65) {
            this.initImage();
        }
        if (code == 87) {
            doubleNums = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}

            };
            x = 3;
            y = 3;
            initImage();
        }

    }
//    判断是否成功
    public boolean passGame (){
        for (int i = 0; i < doubleNums.length; i++) { // 遍历行
            for (int j = 0; j < doubleNums[i].length; j++) { // 遍历列
                if (standard[i][j] != doubleNums[i][j]) {
                    return false;
                }
            }

        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == reset) {
            System.out.println("reset");
            count = 0;
            this.initNum();
            this.initImage();

        }
        if (source == relogin) {
            System.out.println("relogin");
            this.setVisible(false);
            new LoginJFrame();
        }
        if (source == close) {
            System.exit(0);
        }
        if (source == publicPage) {
            System.out.println("publicPage");
        }
        if (source== girl){
            System.out.println("girl");

//            随机1到13的数字
            int num = r.nextInt(12)+1;
            new ImageIcon();

            System.out.println(num);
        }
        if (source == animal) {
            int num = r.nextInt(7)+1;

            System.out.println("animal");
        }
        if (source == sport) {
            System.out.println("sport");
        }
    }




}




