package dev.patika.ecommerce.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id", columnDefinition = "serial")
    private int id;

    @Column(name = "supplier_company")
    private String companyName;
    @Column(name = "supplier_contact")
    private String contactName;
    @Column(name = "supplier_address")
    private String address;
    @Column(name = "supplier_mail")
    private String contactMail;
    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
    public Supplier() {
    }

    public Supplier(int id, String companyName, String contactName, String address, String contactMail) {
        this.id = id;
        this.companyName = companyName;
        this.contactName = contactName;
        this.address = address;
        this.contactMail = contactMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactMail() {
        return contactMail;
    }

    public void setContactMail(String contactMail) {
        this.contactMail = contactMail;
    }
}