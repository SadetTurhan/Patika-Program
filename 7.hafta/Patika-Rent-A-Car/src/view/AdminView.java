package view;

import business.BrandManager;
import business.CarManager;
import business.ModelManager;
import core.ComboItem;
import core.Helper;
import entity.Brand;
import entity.Car;
import entity.Model;
import entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class AdminView extends Layout{
    private JPanel container;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JPanel pnl_bottom;
    private JTabbedPane tab_menu;
    private JButton btn_logout;
    private JTable tbl_brand;
    private JScrollPane scl_brand;
    private JPanel pnl_model;
    private JPanel pnl_brand;
    private JTable tbl_model;
    private JScrollPane scl_model;
    private JComboBox cmb_brand;
    private JComboBox cmb_type;
    private JComboBox cmb_fuel;
    private JButton btn_search;
    private JComboBox cmb_gear;
    private JLabel lbl_brand_name;
    private JLabel lbl_model_fuel;
    private JLabel lbl_model_type;
    private JLabel lbl_model_gear;
    private JButton btn_cancel_search;
    private JPanel pnl_car;
    private JTable tbl_car;
    private JScrollPane scl_car;
    private JLabel Tip;
    private User user;
    private BrandManager brandManager;
    private JPopupMenu brandMenu = new JPopupMenu();
    private JPopupMenu modelMenu = new JPopupMenu();
    private JPopupMenu carMenu = new JPopupMenu();
    private ModelManager modelManager;
    private DefaultTableModel tmdl_brand = new DefaultTableModel();
    private DefaultTableModel tmdl_model = new DefaultTableModel();
    private CarManager carManager;
    private DefaultTableModel tmdl_car = new DefaultTableModel();
    private Object[] col_model;
    public AdminView(User user){
        this.brandManager = new BrandManager();
        this.modelManager = new ModelManager();
        this.carManager = new CarManager();
        this.add(container);
        this.guiInitialize(800,600);
        this.user = user;
        if(user == null){
            dispose();
        }
        this.lbl_welcome.setText("Hoşgeldiniz : " + this.user.getUsername());
        loadBrandTable();
        loadBrandComponent();

        loadModelTable(null);
        loadModelComponent();
        loadModelFilter();

        loadCarTable();
        loadCarComponent();

        tbl_brand.setModel(tmdl_brand);
        tbl_brand.getTableHeader().setReorderingAllowed(false);
        tbl_brand.setEnabled(false);



    }
    public void loadBrandTable(){
        Object[] col_brand = {"Marka ID","Marka Adı"};
        ArrayList<Object[]> brandList = this.brandManager.getForTable(col_brand.length);
        this.createTable(this.tmdl_brand,this.tbl_brand,col_brand,brandList);
    }
    public void loadBrandComponent(){
        this.tbl_brand.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int selected_row = tbl_brand.rowAtPoint(e.getPoint());
                tbl_brand.setRowSelectionInterval(selected_row, selected_row);
            }
        });
        this.brandMenu = new JPopupMenu();
        brandMenu.add("Yeni").addActionListener(e -> {
            BrandView brandView = new BrandView(null);
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();
                }
            });
        });
        brandMenu.add("Güncelle").addActionListener(e -> {
            int selectBrandId = this.getTableSelectedRow(tbl_brand,0);
            BrandView brandView = new BrandView(this.brandManager.getById(selectBrandId));
            brandView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();
                }
            });

        });
        brandMenu.add("Sil").addActionListener(e -> {
            if(Helper.confirm("sure")){
                int selectBrandId = this.getTableSelectedRow(tbl_brand,0);
                if(this.brandManager.delete(selectBrandId)){
                    Helper.showMsg("done");
                    loadBrandTable();
                    loadModelTable(null);
                    loadModelFilterBrand();
                }else{
                    Helper.showMsg("error");
                }
            }
        });
        this.tbl_brand.setComponentPopupMenu(brandMenu);

        this.btn_search.addActionListener(e -> {
            ComboItem selectedBrand = (ComboItem) this.cmb_brand.getSelectedItem();
            int brandId = 0;
            if(selectedBrand != null){
                brandId = selectedBrand.getKey();
            }
            ArrayList<Model> modelListBySearch = this.modelManager.searchForTable(
                    brandId,
                    (Model.Fuel) cmb_fuel.getSelectedItem(),
                    (Model.Gear) cmb_gear.getSelectedItem(),
                    (Model.Type) cmb_type.getSelectedItem()
            );
            ArrayList<Object[]> modelRowListBySearch = this.modelManager.getForTable(this.col_model.length,modelListBySearch);
            loadModelTable(modelRowListBySearch);
        });

        this.btn_cancel_search.addActionListener(e -> {
            this.cmb_type.setSelectedItem(null);
            this.cmb_gear.setSelectedItem(null);
            this.cmb_fuel.setSelectedItem(null);
            this.cmb_brand.setSelectedItem(null);
            loadModelTable(null);
        });
    }
    public void loadModelTable(ArrayList<Object[]> modelList){
        this.col_model = new Object[]{"Model ID","Marka","Model Adı","Tip","Yıl","Yakıt Türü","Vites"};
        if(modelList == null){
            modelList = this.modelManager.getForTable(col_model.length,this.modelManager.findAll());
        }
        createTable(this.tmdl_model,this.tbl_model,col_model,modelList);
    }
    public void loadModelComponent(){
        tableRowSelect(this.tbl_model);
        this.modelMenu = new JPopupMenu();
        this.modelMenu.add("Yeni").addActionListener(e -> {
            ModelView modelView = new ModelView(new Model());
            modelView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadModelTable(null);
                }
            });
        });
        this.modelMenu.add("Güncelle").addActionListener(e -> {
            int selectModelId = this.getTableSelectedRow(tbl_model,0);
            ModelView modelView = new ModelView(this.modelManager.getById(selectModelId));
            modelView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadModelTable(null);
                }
            });
        });
        this.modelMenu.add("Sil").addActionListener(e -> {
            if(Helper.confirm("sure")){
                int selectBrandId = this.getTableSelectedRow(tbl_model,0);
                if(this.modelManager.delete(selectBrandId)){
                    Helper.showMsg("done");
                    loadBrandTable();
                    loadModelTable(null);
                }else{
                    Helper.showMsg("error");
                }
            }
        });
        this.tbl_model.setComponentPopupMenu(modelMenu);
    }
    public void loadModelFilter(){
        this.cmb_type.setModel(new DefaultComboBoxModel<>(Model.Type.values()));
        this.cmb_type.setSelectedItem(null);
        this.cmb_gear.setModel(new DefaultComboBoxModel<>(Model.Gear.values()));
        this.cmb_gear.setSelectedItem(null);
        this.cmb_fuel.setModel(new DefaultComboBoxModel<>(Model.Fuel.values()));
        this.cmb_fuel.setSelectedItem(null);
        loadModelFilterBrand();
    }
    public void loadModelFilterBrand(){
        for(Brand obj: brandManager.findAll()){
            this.cmb_brand.addItem(new ComboItem(obj.getId(), obj.getName()));
        }
        this.cmb_brand.setSelectedItem(null);
    }
    public void loadCarComponent(){
        tableRowSelect(this.tbl_car);
        this.carMenu = new JPopupMenu();
        this.carMenu.add("Yeni").addActionListener(e -> {
            CarView carView = new CarView(new Car());
            carView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadCarTable();
                }
            });
        });
        this.carMenu.add("Güncelle").addActionListener(e -> {
            int selectModelId = this.getTableSelectedRow(tbl_car,0);
            CarView carView = new CarView(this.carManager.getById(selectModelId));
            carView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    loadCarTable();
                }
            });
        });
        this.carMenu.add("Sil").addActionListener(e -> {
            if(Helper.confirm("sure")){
                int selectCarId = this.getTableSelectedRow(tbl_car,0);
                if(this.carManager.delete(selectCarId)){
                    Helper.showMsg("done");
                    loadCarTable();
                }else {
                    Helper.showMsg("error");
                }
            }
        });
        this.tbl_car.setComponentPopupMenu(carMenu);
    }
    public void loadCarTable(){
        Object[] col_car = {"ID","Marka","Model","Plaka","Renk","KM","Yıl","Tip","Yakıt Türü"," Vites"};
        ArrayList<Object[]> carList = this.carManager.getForTable(col_car.length,this.carManager.findAll());
        createTable(this.tmdl_car,this.tbl_car,col_car,carList);
    }
}
