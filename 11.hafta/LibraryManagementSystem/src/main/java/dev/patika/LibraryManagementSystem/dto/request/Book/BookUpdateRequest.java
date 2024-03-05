package dev.patika.LibraryManagementSystem.dto.request.Book;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.LibraryManagementSystem.entities.Category;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookUpdateRequest {

    @Positive(message = "id boş olamaz")
    private int id;
    @NotNull(message = "isim boş olamaz")
    private String name;
    @NotNull(message = "yıl boş olamaz")
    private String publicationYear;
    @NotNull(message = "stok boş bırakılamaz")
    private int stock;

    private int authorId;

    private List<Category> categoryList;

    private int publisherId;

}