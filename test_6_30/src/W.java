//import javax.swing.*;
//import java.awt.*;
//
////用swing在窗口中输入操作数 1 和操作数 2
////点击按钮选择加减乘除中的一种运算，点击“计算”按钮， 得到结果显示到窗口中。
//public class test_5 {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("计算器");
//        frame.setBounds(400, 300, 280, 180);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
//        JLabel l1 = new JLabel("操作数1");
//        JLabel l2 = new JLabel("操作数2");
//        JLabel l3 = new JLabel();
//        JButton bt = new JButton("计算");
//        JTextField text1 = new JTextField(18);
//        JTextField text2 = new JTextField(18);
//        JRadioButton rt1 = new JRadioButton("+    ");
//        JRadioButton rt2 = new JRadioButton("-    ");
//        JRadioButton rt3 = new JRadioButton("x    ");
//        JRadioButton rt4 = new JRadioButton("÷               ");
//        ButtonGroup group = new ButtonGroup();
//        group.add(rt1);
//        group.add(rt2);
//        group.add(rt3);
//        group.add(rt4);
//        frame.add(l1);
//        frame.add(text1);
//        frame.add(rt1);
//        frame.add(rt2);
//        frame.add(rt3);
//        frame.add(rt4);
//        frame.add(l2);
//        frame.add(text2);
//        frame.add(bt);
//        frame.add(l3);
//        Jianting jt = new Jianting();
//        jt.setView((Jisuanqi) frame);
//        bt.addActionListener(jt);
//        rt1.addActionListener(jt);
//        rt2.addActionListener(jt);
//        rt3.addActionListener(jt);
//}
//}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class W extends JFrame implements ActionListener {
    private JButton buttonOne;
    private JButton buttonTwo;
    public JTextField inputOne, inputTwo, result;

    public W() {
        setTitle("计算器");
        setBounds(100, 100, 350, 200);
        setLocationRelativeTo(null);//窗口居中
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inputOne = new JTextField(5);
        inputTwo = new JTextField(5);
        JLabel Label = new JLabel("=");
        result = new JTextField(15);
        result.setEditable(false);
        add(inputOne);
        add(inputTwo);
        add(Label);
        add(result);
        buttonOne = new JButton("+");
        buttonTwo = new JButton("-");
        add(buttonOne);
        add(buttonTwo);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        /*
         * resizable - true if this frame is resizable; false otherwise.See Also:
                     可调整大小-如果此框架是可调整大小的，则为true；否则为假。另请参见：
         */
        setResizable(false);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        try {
            double number1 = Double.parseDouble(inputOne.getText());
            double number2 = Double.parseDouble(inputTwo.getText());
            double s = 0;
            if (e.getSource() == buttonOne) {
                s = number1 + number2;
            } else if (e.getSource() == buttonTwo) {
                s = number1 - number2;
            }
            result.setText(String.valueOf(s));
        } catch (Exception e2) {
            result.setText("请输入正确字符");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new W();
    }

}
