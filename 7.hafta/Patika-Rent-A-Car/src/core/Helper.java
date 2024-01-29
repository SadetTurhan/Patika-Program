package core;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void setTheme() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }
    public static void showMsg(String str){
        String msg;
        String title;
        switch(str){
            case "fill" -> {
                msg = "Lütfen tüm alanları doldurunuz ! ";
                title = "Hata";
            }
            case "done" -> {
                msg = "İşlem başarılı";
                title = "Sonuç";
            }
            case "notFound" -> {
                msg = "Kayıt bulunamadı";
                title = "Bulunamadı";
            }
            default -> {
                msg = str;
                title = "Mesaj";
            }
            }
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty();
    }
    public static boolean isFieldListEmpty(JTextField[] fieldList) {
        for (JTextField field : fieldList) {
            if (isFieldEmpty(field)) return true;
        }
        return false;
    }

    public static int getLocationPoint(String type, Dimension size){
        switch (type){
            case "x":
                return (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
            case "y":
                return (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
            default:
                return 0;
        }
    }
}
