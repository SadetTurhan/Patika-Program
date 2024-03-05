package dev.patika.LibraryManagementSystem.dto.request.Author;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorUpdateRequest {

    @Positive(message = "ID Değeri Pozitif Sayı Olmak Zorundadır")
    private int id;

    @NotNull(message = "Author ismi boş olamaz.")
    private String name;

    @NotNull(message = "Doğum Tarihi Boş olamaz.")
    private LocalDate birthday;

    @NotNull(message = "Ülke Boş olamaz.")
    private String country;

}