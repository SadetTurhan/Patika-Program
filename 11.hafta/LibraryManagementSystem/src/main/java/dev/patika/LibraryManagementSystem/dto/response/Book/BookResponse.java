package dev.patika.LibraryManagementSystem.dto.response.Book;

import dev.patika.LibraryManagementSystem.entities.Author;
import dev.patika.LibraryManagementSystem.entities.Category;
import dev.patika.LibraryManagementSystem.entities.Publisher;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookResponse {

    private int id;

    private String name;

    private String publicationYear;

    private int stock;

    private Author author;

    private List<Category> categoryList;

    private Publisher publisher;
}
