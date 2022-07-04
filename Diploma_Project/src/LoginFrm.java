

import java.sql.Connection;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class LoginFrm extends JFrame {
    public static User currentUser;
    private JButton jB_login;
    private JButton jB_reset;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JTextField passwordText;
    private JComboBox role;
    private JTextField userNameText;

    UserDao userDao = new UserDao();
    DbUtil dbUtil = new DbUtil();


    public LoginFrm() {
        initComponents();
        this.role.addItem("学生");
        this.role.addItem("管理员");
        this.setLocationRelativeTo(null);
    }


    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jB_login = new JButton();
        jB_reset = new JButton();
        userNameText = new JTextField();
        passwordText = new JTextField();
        role = new JComboBox();

        setTitle("用户登录");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("账号：");

        jLabel2.setText("密码：");

        jLabel3.setText("角色：");

        jB_login.setText("登录");
        jB_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_loginActionPerformed(evt);
            }
        });

        jB_reset.setText("重置");
        jB_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_resetActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addComponent(jB_login).addGap(87, 87, 87)
                                .addComponent(jB_reset))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3).addComponent(jLabel2).addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(userNameText, GroupLayout.DEFAULT_SIZE, 150,
                                                Short.MAX_VALUE)
                                        .addComponent(passwordText)
                                        .addComponent(role, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(137, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel1)
                        .addComponent(userNameText, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel2)
                        .addComponent(passwordText, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
                        .addComponent(role, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jB_login)
                        .addComponent(jB_reset))
                .addGap(37, 37, 37)));

        pack();
    }



    private void jB_loginActionPerformed(java.awt.event.ActionEvent evt) {
        String userName = this.userNameText.getText();
        String password = this.passwordText.getText();
        int index = this.role.getSelectedIndex();
        if (StringUtil.isEmpty(userName) || StringUtil.isEmpty(password)) {
            JOptionPane.showMessageDialog(null, "请输入相关信息");
            return;
        }
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        if (index == 0) {
            user.setRole(1);
        } else {
            user.setRole(2);
        }
        Connection con = null;
        try {
            con = dbUtil.getCon();
            User login = userDao.login(con, user);
            currentUser = login;
            if (login == null) {
                JOptionPane.showMessageDialog(null, "登录失败");
            } else {
                // 角色 1普通 2管理员
                if (index == 0) {
                    // 学生
                    this.dispose();
                    new UserMainFrm().setVisible(true);
                } else {
                    // 管理员

                    this.dispose();
                    new AdminMainFrm().setVisible(true);
                }
            }
        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "登录异常");
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

    private void jB_resetActionPerformed(java.awt.event.ActionEvent evt) {
        reset();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrm().setVisible(true);
            }
        });
    }

}