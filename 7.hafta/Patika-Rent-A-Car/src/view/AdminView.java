package view;

import business.BrandManager;
import entity.Brand;
import entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class AdminView extends Layout{
    private JPanel container;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JTabbedPane tab_menu;
    private JButton btn_logout;
    private JPanel pnl_brand;
    private JScrollPane scl_brand;
    private JTable tbl_brand;
    private User user;
    private DefaultTableModel tmdl_brand = new DefaultTableModel();
    private BrandManager brandManager;
    private JPopupMenu brandMenu;
    public AdminView(User user){
        this.brandManager = new BrandManager();
        this.add(container);
        this.guiInitialize(1000,500);
        this.user = user;

        if(this.user == null){
            dispose();
        }
        this.lbl_welcome.setText("Hoşgeldiniz " + this.user.getUsername());

        Object[] col_brand = {"Marka ID", "Marka Adı"};
        ArrayList<Brand> brandList = brandManager.findAll();
        this.tmdl_brand.setColumnIdentifiers(col_brand);
        for(Brand brand : brandList){
            Object[] obj = {brand.getId(),brand.getName()};
            this.tmdl_brand.addRow(obj);
        }

        this.tbl_brand.setModel(this.tmdl_brand);
        this.tbl_brand.getTableHeader().setReorderingAllowed(false);
        this.tbl_brand.setEnabled(false);

        this.tbl_brand.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selected_row = tbl_brand.rowAtPoint(e.getPoint());
                tbl_brand.setRowSelectionInterval(selected_row,selected_row);
            }
        });
        this.brandMenu = new JPopupMenu();
        this.brandMenu.add("Yeni").addActionListener(e -> {
            System.out.println("yeni butonu tıklandı");
        });
        this.brandMenu.add("Güncelle").addActionListener(e -> {
            System.out.println("Güncelle butonu tıklandı");
        });
        this.brandMenu.add("Sil").addActionListener(e -> {
            System.out.println("Sil butonu tıklandı");
        });

        this.tbl_brand.setComponentPopupMenu(brandMenu);
    }
}
