package dev.patika.LibraryManagementSystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id" , columnDefinition = "serial")
    private int id;

    @Column(name = "book_name" , nullable = false)
    private String name;

    @Column(name = "book_publicationYear" , nullable = false)
    private String publicationYear;

    @Column(name = "book_stock" , nullable = false)
    private int stock;

    @ManyToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "book_author_id" , referencedColumnName = "author_id")
    private Author author;

    @ManyToMany(fetch = FetchType.LAZY , cascade = CascadeType.MERGE)
    @JoinTable(
            name = "book2category",
            joinColumns = {
                    @JoinColumn(name = "book2category_book_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "book2category_category_id")
            }
    )
    private List<Category> categoryList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_publisher_id" , referencedColumnName = "publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
    private List<BookBorrowing> borrowingList;

}