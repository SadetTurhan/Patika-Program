package dev.patika.LibraryManagementSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "categories")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id" , columnDefinition = "serial")
    private int id;

    @Column(name = "category_name")
    private String name ;

    @Column(name = "category_description")
    private String description;

    @ManyToMany(mappedBy = "categoryList",cascade = CascadeType.REMOVE)
    @JsonIgnore
    private List<Book> bookList;
}