package view;

import business.BrandManager;
import business.ModelManager;
import core.Helper;
import entity.Model;
import entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
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
    private JPanel pnl_model;
    private JScrollPane scrl_model;
    private JTable tbl_model;
    private User user;
    private DefaultTableModel tmdl_brand = new DefaultTableModel();
    private DefaultTableModel tmdl_model = new DefaultTableModel();
    private BrandManager brandManager;
    private ModelManager modelManager;
    private JPopupMenu brand_menu;
    private JPopupMenu model_menu;
    public AdminView(User user){
        this.brandManager = new BrandManager();
        this.modelManager = new ModelManager();
        this.add(container);
        this.guiInitialize(1000,500);
        this.user = user;

        if(this.user == null){
            dispose();
        }
        this.lbl_welcome.setText("Hoşgeldiniz " + this.user.getUsername());
        loadBrandTable();
        loadBrandComponent();

        loadModelTable();
        loadModelComponent();

    }

    private void loadModelComponent() {
        tableRowSelect(this.tbl_model);
        this.model_menu = new JPopupMenu();
        this.tbl_model.setComponentPopupMenu(model_menu);
        this.model_menu.add("Yeni").addActionListener(e -> {
            ModelView modelView = new ModelView(new Model());
            modelView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadModelTable();
                }
            });
        });
        this.model_menu.add("Güncelle").addActionListener(e -> {
            int selectModelId = this.getTableSelectedRow(tbl_model,0);
            ModelView modelView = new ModelView(this.modelManager.getById(selectModelId));
            modelView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadModelTable();
                }
            });

        });
        this.model_menu.add("Sil").addActionListener(e -> {
            if (Helper.confirm("sure")){
                int selectModelId = this.getTableSelectedRow(tbl_model,0);
                if(this.modelManager.delete(selectModelId)){
                    Helper.showMsg("done");
                    loadModelTable();
                }else{
                    Helper.showMsg("error");
                }
            }
        });
        this.tbl_model.setComponentPopupMenu(model_menu);
    }

    public void loadBrandComponent(){
        tableRowSelect(this.tbl_brand);
        this.brand_menu = new JPopupMenu();
        this.brand_menu.add("Yeni").addActionListener(e -> {
            BrandView brandView = new BrandView(null);
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                }
            });
        });
        this.brand_menu.add("Güncelle").addActionListener(e -> {
            int selectBrandId = this.getTableSelectedRow(tbl_brand,0);
            BrandView brandView = new BrandView(this.brandManager.getById(selectBrandId));
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                    loadModelTable();
                }
            });
        });
        this.brand_menu.add("Sil").addActionListener(e -> {
            if (Helper.confirm("sure")){
                int selectBrandId = this.getTableSelectedRow(tbl_brand,0);
                if(this.brandManager.delete(selectBrandId)){
                    Helper.showMsg("done");
                    loadBrandTable();
                    loadModelTable();
                }else{
                    Helper.showMsg("error");
                }
            }
        });
        this.tbl_brand.setComponentPopupMenu(brand_menu);
    }
    public void loadBrandTable(){

        Object[] col_brand = {"Marka ID", "Marka Adı"};
        ArrayList<Object[]> brandList = this.brandManager.getForTable(col_brand.length);
        this.createTable(this.tmdl_brand,this.tbl_brand,col_brand,brandList);
    }
    public void loadModelTable(){
        Object[] col_model = {"Model ID", "Marka","Model Adı","Tip","Yıl","Yakıt Türü","Vites"};
        ArrayList<Object[]> modelList = this.modelManager.getForTable(col_model.length,this.modelManager.findAll());
        this.createTable(this.tmdl_model,this.tbl_model,col_model,modelList);
    }
}
