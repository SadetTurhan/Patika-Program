package dev.patika.LibraryManagementSystem.dto.request.Author;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorSaveRequest {

    @NotNull(message = "Author ismi boş olamaz.")
    private String name;
    @NotNull(message = "Doğum Tarihi Boş olamaz.")
    private LocalDate birthday;
    @NotNull(message = "Ülke Boş olamaz.")
    private String country;

}
