package com.sjsq.view;

import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import com.sjsq.dao.UserDao;
import com.sjsq.model.User;
import com.sjsq.util.DbUtil;
import com.sjsq.util.StringUtil;

public class RegisterFrm extends JFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JTextField passwordText;
    private JTextField userNameText;


    DbUtil dbUtil = new DbUtil();
    UserDao userDao = new UserDao();


    public RegisterFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        userNameText = new JTextField();
        passwordText = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("用户注册");
        setResizable(false);

        jLabel1.setText("账号：");

        jLabel2.setText("密码：");

        jButton1.setText("注册");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("重置");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addComponent(jButton1).addGap(77, 77, 77)
                                .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1).addComponent(jLabel2))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordText).addComponent(userNameText,
                                                GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
                .addContainerGap(123, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
                        .addComponent(userNameText, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
                        .addComponent(passwordText, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jButton1)
                        .addComponent(jButton2))
                .addGap(64, 64, 64)));

        pack();
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String userName = this.userNameText.getText();
        String password = this.passwordText.getText();
        if (StringUtil.isEmpty(userName) || StringUtil.isEmpty(password)) {
            JOptionPane.showMessageDialog(null, "请输入相关信息");
            return;
        }
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setRole(1);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            int i = userDao.addUser(con, user);
            if (i == 2) {
                JOptionPane.showMessageDialog(null, "该用户名已存在,请重新注册");
            } else if (i == 0) {
                JOptionPane.showMessageDialog(null, "注册失败");
            } else {
                JOptionPane.showMessageDialog(null, "注册成功");
                this.dispose();
                new LoginFrm().setVisible(true);
            }
        } catch (Exception e) {

            e.printStackTrace();
        } finally {
            try {
                dbUtil.closeCon(con);
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    private void reset() {
        this.userNameText.setText("");
        this.passwordText.setText("");
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        reset();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrm().setVisible(true);
            }
        });
    }

}
