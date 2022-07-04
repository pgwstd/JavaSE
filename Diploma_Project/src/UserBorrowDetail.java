package com.sjsq.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.table.DefaultTableModel;

import com.sjsq.dao.BorrowDetailDao;
import com.sjsq.model.BorrowDetail;
import com.sjsq.util.DbUtil;
import com.sjsq.util.StringUtil;
import com.sjsq.util.TimeUtil;

public class UserBorrowDetail extends JInternalFrame {

    private JTextField borrowIdText;
    private JTable borrowTbale;
    private JButton jB_return;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;


    DbUtil dbUtil = new DbUtil();
    BorrowDetailDao borrowDetailDao = new BorrowDetailDao();


    public UserBorrowDetail() {
        initComponents();
        fillTable(new BorrowDetail());
        this.jB_return.setVisible(false);
        setTitle("借还信息");
        this.setLocation(200, 50);
    }

    private void fillTable(BorrowDetail borrowDetail) {
        DefaultTableModel model = (DefaultTableModel) borrowTbale.getModel();
        model.setRowCount(0);
        Integer userId = LoginFrm.currentUser.getUserId();
        Connection con = null;
        try {
            con = dbUtil.getCon();
            borrowDetail.setUserId(userId);
            ResultSet list = borrowDetailDao.list(con, borrowDetail);
            while (list.next()) {
                Vector rowData = new Vector();
                rowData.add(list.getInt("id"));
                rowData.add(list.getString("book_name"));
                int status = list.getInt("status");
                if (status == 1) {
                    rowData.add("在借");
                }
                if (status == 2) {
                    rowData.add("已还");
                }
                rowData.add(TimeUtil.getDateByTime(list.getLong("borrow_time")));
                if (status == 2) {
                    rowData.add(TimeUtil.getDateByTime(list.getLong("return_time")));
                }
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

        jScrollPane1 = new JScrollPane();
        borrowTbale = new JTable();
        jLabel1 = new JLabel();
        borrowIdText = new JTextField();
        jB_return = new JButton();

        setClosable(true);

        borrowTbale.setModel(new DefaultTableModel(new Object[][] {

        }, new String[] { "编号", "书名", "状态", "借书时间", "还书时间" }) {
            boolean[] canEdit = new boolean[] { false, false, false, false, false };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        borrowTbale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                borrowTbaleMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(borrowTbale);

        jLabel1.setText("编号：");

        borrowIdText.setEditable(false);

        jB_return.setText("还书");
        jB_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_returnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGap(35, 35, 35).addComponent(jLabel1).addGap(38, 38, 38)
                        .addComponent(borrowIdText, GroupLayout.PREFERRED_SIZE, 114,
                                GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                        .addComponent(jB_return).addGap(44, 44, 44))
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                        .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 239,
                        GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
                        .addComponent(borrowIdText, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jB_return))
                .addContainerGap(26, Short.MAX_VALUE)));

        pack();
    }


    private void jB_returnActionPerformed(java.awt.event.ActionEvent evt) {
        String BorrowStr = this.borrowIdText.getText();
        if (StringUtil.isEmpty(BorrowStr)) {
            JOptionPane.showMessageDialog(null, "请选择未还的书籍");
            return;
        }
        BorrowDetail detail = new BorrowDetail();
        detail.setBorrowId(Integer.parseInt(BorrowStr));
        detail.setStatus(2);
        detail.setReturnTime(TimeUtil.getTime());
        Connection con = null;
        try {
            con = dbUtil.getCon();
            int i = borrowDetailDao.returnBook(con, detail);
            if (i == 1) {
                JOptionPane.showMessageDialog(null, "还书成功");
            } else {
                JOptionPane.showMessageDialog(null, "还书失败");
            }
        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "还书异常");
        } finally {
            try {
                dbUtil.closeCon(con);
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        fillTable(new BorrowDetail());
    }

    private void borrowTbaleMousePressed(java.awt.event.MouseEvent evt) {
        int row = borrowTbale.getSelectedRow();
        Integer borrowId = (Integer) borrowTbale.getValueAt(row, 0);
        String status = (String) borrowTbale.getValueAt(row, 2);
        this.borrowIdText.setText(borrowId.toString());
        if (status.equals("在借")) {
            this.jB_return.setVisible(true);
        } else {
            this.jB_return.setVisible(false);
        }
    }
}