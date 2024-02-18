package dev.patika;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private int id;
    @Column(name = "author_name")
    private String name;
    @Column(name = "author_birth_year")
    private LocalDate birthYear;
    @Column(name = "author_country")
    private String country;
    @OneToMany(mappedBy = "author")
    private List<Book> bookList;
    public Author() {
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

    public LocalDate getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDate birthYear) {
        this.birthYear = birthYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
