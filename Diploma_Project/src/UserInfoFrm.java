package com.sjsq.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

import com.sjsq.dao.UserDao;
import com.sjsq.model.User;
import com.sjsq.util.DbUtil;
import com.sjsq.util.StringUtil;

public class UserInfoFrm extends JInternalFrame {

    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private JTextField passwordText;
    private JTextField userIdText;
    private JTextField userNameText;
    private JTextField userNaneSelectText;
    private JTable userTable;


    DbUtil dbUtil = new DbUtil();
    UserDao userDao = new UserDao();


    public UserInfoFrm() {
        initComponents();
        fillTable(new User());
        setTitle("用户信息");
        this.setLocation(200, 50);
    }

    private void fillTable(User user) {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();
        model.setRowCount(0);

        Connection con = null;
        try {
            con = dbUtil.getCon();
            ResultSet list = userDao.list(con, user);
            while (list.next()) {
                Vector rowData = new Vector();
                rowData.add(list.getInt("id"));
                rowData.add(list.getString("username"));
                rowData.add(list.getString("password"));
                model.addRow(rowData);
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


    private void initComponents() {

        jLabel2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        userTable = new JTable();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        userNaneSelectText = new JTextField();
        jPanel2 = new JPanel();
        jLabel3 = new JLabel();
        userIdText = new JTextField();
        jLabel4 = new JLabel();
        userNameText = new JTextField();
        jLabel5 = new JLabel();
        passwordText = new JTextField();
        jButton2 = new JButton();

        jLabel2.setText("jLabel2");

        setClosable(true);

        userTable.setModel(new DefaultTableModel(new Object[][] {

        }, new String[] { "编号", "账号", "密码" }) {
            boolean[] canEdit = new boolean[] { false, false, false };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        userTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(userTable);

        jPanel1.setBorder(BorderFactory.createTitledBorder("表单操作"));

        jLabel1.setText("账号：");

        jButton1.setText("查询");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(userNaneSelectText, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                        .addGap(18, 18, 18).addComponent(jButton1).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                .createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1).addComponent(userNaneSelectText,
                                                GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                                GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton1))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel2.setBorder(BorderFactory.createTitledBorder("用户操作"));

        jLabel3.setText("编号：");

        userIdText.setEditable(false);

        jLabel4.setText("账号：");

        jLabel5.setText("密码：");

        jButton2.setText("修改");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup().addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userIdText, GroupLayout.PREFERRED_SIZE, 85,
                                                GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18).addComponent(jLabel4))
                                .addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel5)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(passwordText, GroupLayout.PREFERRED_SIZE, 88,
                                                GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(37, 37, 37).addComponent(
                                        userNameText, GroupLayout.PREFERRED_SIZE, 94,
                                        GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(8, 8, 8).addComponent(jButton2)))
                        .addContainerGap(26, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3).addComponent(jLabel4)
                                .addComponent(userIdText, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(userNameText, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(passwordText, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))
                        .addContainerGap(37, Short.MAX_VALUE)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, GroupLayout.Alignment.LEADING,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, GroupLayout.Alignment.LEADING,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE))
                .addGap(226, 226, 226)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 136,
                                GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE)));

        pack();
    }


    private void userTableMousePressed(java.awt.event.MouseEvent evt) {
        int row = this.userTable.getSelectedRow();
        this.userIdText.setText(userTable.getValueAt(row, 0).toString());
        this.userNameText.setText(userTable.getValueAt(row, 1).toString());
        this.passwordText.setText(userTable.getValueAt(row, 2).toString());
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        String userId = this.userIdText.getText();
        String userName = this.userNameText.getText();
        String password = this.passwordText.getText();
        if (StringUtil.isEmpty(userName) || StringUtil.isEmpty(password)) {
            JOptionPane.showMessageDialog(null, "请输入相关信息");
            return;
        }
        User user = new User();
        user.setUserId(Integer.parseInt(userId));
        user.setUserName(userName);
        user.setPassword(password);
        Connection con = null;
        try {
            con = dbUtil.getCon();
            int i = userDao.update(con, user);
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "修改成功");
                fillTable(new User());
            } else {
                JOptionPane.showMessageDialog(null, "修改失败");
            }
        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "修改异常");
        } finally {
            try {
                dbUtil.closeCon(con);
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String userName = this.userNaneSelectText.getText();
        User user = new User();
        user.setUserName(userName);
        fillTable(user);
    }
}