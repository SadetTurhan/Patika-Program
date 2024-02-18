package dev.patika;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private int id;
    @Column(name = "publisher_name",length = 100,nullable = false)
    private String name;
    @Column(name = "publisher_establishment_year",nullable = false)
    private int establishmentYear;
    @Column(name = "publisher_address")
    private String address;
    @OneToMany(mappedBy = "publisher")
    private List<Book> book;
    public Publisher() {
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

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
