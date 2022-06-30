
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class test_4 {
    public static void main(String[] args) {
        new Jisuanqi();
    }
}

class Jisuanqi extends JFrame {
    public JLabel l1, l2, l3;
    public JTextField text1, text2;
    public JButton bt;
    public JRadioButton rt1, rt2, rt3, rt4;
    ButtonGroup group;

    public Jisuanqi() {

        setTitle("计算器");
        setBounds(400, 300, 280, 180);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();

    }

    void init() {

        setLayout(new FlowLayout());
        l1 = new JLabel("操作数1");
        l2 = new JLabel("操作数2");
        l3 = new JLabel();
        bt = new JButton("计算");
        text1 = new JTextField(18);
        text2 = new JTextField(18);
        rt1 = new JRadioButton("+    ");
        rt2 = new JRadioButton("-    ");
        rt3 = new JRadioButton("x    ");
        rt4 = new JRadioButton("÷               ");
        add(l1);
        add(text1);
        group.add(rt1);
        group.add(rt2);
        group.add(rt3);
        group.add(rt4);
        add(rt1);
        add(rt2);
        add(rt3);
        add(rt4);
        add(l2);
        add(text2);
        add(bt);
        add(l3);
        Jianting jt = new Jianting();
        jt.setView(this);
        bt.addActionListener(jt);
        rt1.addActionListener(jt);
        rt2.addActionListener(jt);
        rt3.addActionListener(jt);
        rt4.addActionListener(jt);
        validate();

    }

}

class Jianting implements ActionListener {

    Jisuanqi view;
    double n, m;

    public void setView(Jisuanqi view) {

        this.view = view;
    }

    public void actionPerformed(ActionEvent e) {

        String str1 = view.text1.getText();

        String str2 = view.text2.getText();

        if (!(str1.isEmpty() && str2.isEmpty())) {

            try {
                n = Double.parseDouble(str1);
                m = Double.parseDouble(str2);
                if (view.rt1.isSelected()) {
                    view.l3.setText(n + m + "");
                } else if (view.rt2.isSelected()) {
                    view.l3.setText(n - m + "");
                } else if (view.rt3.isSelected()) {
                    view.l3.setText(n * m + "");
                } else if (view.rt4.isSelected()) {
                    view.l3.setText(n / m + "");
                }

            } catch (Exception exp) {
                view.text1.setText("请输入数字");
            }

        }

    }

}

