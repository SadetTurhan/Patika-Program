package view;

import business.UserManager;
import core.Helper;
import entity.User;

import javax.swing.*;

public class LoginView extends Layout{
    private JPanel container;
    private JPanel pnl_top;
    private JPanel pnl_bottom;
    private JLabel lbl_welcome;
    private JLabel lbl_welcome2;
    private JTextField fld_username;
    private JButton btn_login;
    private JPasswordField fld_password;
    private JLabel lbl_username;
    private JLabel lbl_password;
    private final UserManager userManager;
    public LoginView(){
        this.userManager = new UserManager();

        this.add(container);
        guiInitialize(400,400);
        btn_login.addActionListener(e -> {
            JTextField[] checkFieldList = {this.fld_username,this.fld_password};
            if(Helper.isFieldListEmpty(checkFieldList)){
                Helper.showMsg("fill");
            }else{
                User loginUser = this.userManager.findByLogin(this.fld_username.getText(),this.fld_password.getText());
                if(loginUser == null){
                    Helper.showMsg("notFound");
                }else{
                    AdminView adminView = new AdminView(loginUser);
                    dispose();
                }
            }
        });
    }
}
