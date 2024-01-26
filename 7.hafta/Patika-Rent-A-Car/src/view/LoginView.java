package view;

import core.Helper;

import javax.swing.*;

public class LoginView extends JFrame{
    private JPanel container;
    private JPanel w_top;
    private JLabel lbl_welcome;
    private JLabel lbl_welcome2;
    private JPanel w_bottom;
    private JTextField fld_username;
    private JPasswordField fld_pass;
    private JButton btn_login;
    private JLabel lbl_username;
    private JLabel lbl_pass;

    public LoginView(){
        this.add(container);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Rent a Car");
        this.setSize(400,400);
        this.setLocation(Helper.getLocationPoint("x",this.getSize()), Helper.getLocationPoint("y",this.getSize()));

        this.setVisible(true);
        btn_login.addActionListener(e -> {
            JTextField[] checkFieldList = {this.fld_username,this.fld_pass};
            if(Helper.isFieldListEmpty(checkFieldList)){
                Helper.showMsg("fill");
            }
        });
    }
}
