package dev.patika.LibraryManagementSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id" , columnDefinition = "serial")
    private int id;

    @Column(name = "publisher_name", nullable = false)
    private String name;

    @Column(name = "publisher_establishmentYear" , nullable = false)
    private String establishmentYear;

    @Column(name = "publisher_address", nullable = false)
    private String address;

    @OneToMany(mappedBy = "publisher" , cascade = CascadeType.ALL)
    private List<Book> bookList;
}