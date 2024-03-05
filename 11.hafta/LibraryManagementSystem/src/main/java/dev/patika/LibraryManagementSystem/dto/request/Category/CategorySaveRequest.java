package dev.patika.LibraryManagementSystem.dto.request.Category;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategorySaveRequest {

    @NotNull(message = "Kategori boş olamaz.")
    private String name ;
    @NotNull(message = "Tanım alanını doldurunuz.")
    private String description;

}