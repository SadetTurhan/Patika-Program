package dev.patika.ecommerce.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id",columnDefinition = "serial")
    private int id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_price")
    private double prc;
    @Column(name = "product_stock")
    private int stock;
    @ManyToOne()
    @JoinColumn(name = "product_supplier_id",referencedColumnName = "supplier_id")
    private Supplier supplier;
    @ManyToOne()
    @JoinColumn(name = "product_category_id",referencedColumnName = "category_id")
    private Category category;

    public Product() {
    }

    public Product(int id, String name, double prc, int stock, Supplier supplier, Category category) {
        this.id = id;
        this.name = name;
        this.prc = prc;
        this.stock = stock;
        this.supplier = supplier;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrc() {
        return prc;
    }

    public void setPrc(double prc) {
        this.prc = prc;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
