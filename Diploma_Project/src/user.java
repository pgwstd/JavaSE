//用户登录swing窗口
import javax.swing.*;
import java.awt.*;
import java.util.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class user {
    public static void main(String[] args) {
        JFrame frame = new JFrame("用户登录");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        JLabel label1 = new JLabel("用户名");
        label1.setBounds(10, 10, 80, 25);
        panel.add(label1);
        JTextField textField1 = new JTextField(20);
        textField1.setBounds(100, 10, 160, 25);
        panel.add(textField1);
        JLabel label2 = new JLabel("密码");
        label2.setBounds(10, 40, 80, 25);
        panel.add(label2);
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setBounds(100, 40, 160, 25);
        panel.add(passwordField);
        JButton button = new JButton("登录");
        button.setBounds(100, 80, 80, 25);
        panel.add(button);
        button.addActionListener(e -> {
            String name = textField1.getText();
            String password = new String(passwordField.getPassword());
            if (name.equals("") || password.equals("")) {
                showMessageDialog(null, "用户名或密码不能为空！");
            } else {
                if (name.equals("admin") && password.equals("admin")) {
                    showMessageDialog(null, "登录成功！");
                    frame.dispose();
                    new admin();
                } else {
                    JOption
                    showMessageDialog(null, "用户名或密码错误！");

                }
            }
        }
        );