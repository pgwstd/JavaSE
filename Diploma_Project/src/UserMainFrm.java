package com.sjsq.view;

import javax.swing.GroupLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class UserMainFrm extends JFrame {

    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JDesktopPane userMainjdp;

    public UserMainFrm() {
        initComponents();
        // 设置位置
        setBounds(100, 200, 1050, 650);
        // 居中显示
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {

        userMainjdp = new JDesktopPane();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("图书者主界面");

        jMenu1.setText("基本信息");

        jMenuItem1.setText("书籍信息");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("借书记录");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("退出系统");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(userMainjdp,
                GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(userMainjdp,
                GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE));

        pack();
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        int i = JOptionPane.showConfirmDialog(null, "确认退出系统");
        if (i == 0) {
            this.dispose();
        }
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        UserBorrowDetail userBorrowDetail = new UserBorrowDetail();
        userBorrowDetail.setVisible(true);
        this.userMainjdp.add(userBorrowDetail);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        BookInfoFrm infoFrm = new BookInfoFrm();
        infoFrm.setVisible(true);
        this.userMainjdp.add(infoFrm);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMainFrm().setVisible(true);
            }
        });
    }

}