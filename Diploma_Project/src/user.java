//用户登录swing窗口
import javax.swing.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class user {
    public static void main(String[] args) {
        JFrame frame = new JFrame("用户登录");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("用户名：");
        JLabel label2 = new JLabel("密码：");
        JTextField text1 = new JTextField(10);
        JPasswordField text2 = new JPasswordField(10);
        JButton button1 = new JButton("登录");
        JButton button2 = new JButton("取消");
        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(button1);
        frame.add(button2);
        button1.addActionListener(e -> {
            String name = text1.getText();
            String password = text2.getText();
            if (name.equals("") || password.equals("")) {
                showMessageDialog(null, "用户名或密码不能为空");
            } else {
                if (name.equals("admin") && password.equals("admin")) {
                    showMessageDialog(null, "登录成功");
                    frame.dispose();
                    new admin();
                } else {
                    showMessageDialog(null, "用户名或密码错误");
                }
            }
        });
        button2.addActionListener(e -> {
            frame.dispose();
            new main();
        });
    }
}