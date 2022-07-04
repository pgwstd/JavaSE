

import javax.swing.GroupLayout;
import javax.swing.JInternalFrame;

public class UserManagerFrm extends JInternalFrame {

    public UserManagerFrm() {
        initComponents();
    }

    private void initComponents() {

        setClosable(true);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 394, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 278, Short.MAX_VALUE));

        pack();
    }

}