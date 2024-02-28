package dev.patika.ecommerce.dto.response.product;

import dev.patika.ecommerce.entities.Category;
import dev.patika.ecommerce.entities.Supplier;
import jakarta.persistence.*;

public class ProductResponse {
    private int id;
    private String name;
    private double prc;
    private int stock;
    private int supplierId;
    private int categoryId;

    public ProductResponse() {
    }

    public ProductResponse(int id, String name, double prc, int stock, int supplierId, int categoryId) {
        this.id = id;
        this.name = name;
        this.prc = prc;
        this.stock = stock;
        this.supplierId = supplierId;
        this.categoryId = categoryId;
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

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
