package dev.patika.LibraryManagementSystem.dto.response.Publisher;

import dev.patika.LibraryManagementSystem.entities.Book;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PublisherResponse {

    private int id;

    private String name;

    private String establishmentYear;

    private String address;

}