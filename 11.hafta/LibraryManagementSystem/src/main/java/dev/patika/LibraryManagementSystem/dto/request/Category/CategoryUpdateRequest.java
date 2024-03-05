package dev.patika.LibraryManagementSystem.dto.request.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryUpdateRequest {

    private int id;
    private String name ;
    private String description;

}