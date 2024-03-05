package dev.patika.LibraryManagementSystem.dto.request.BookBorrowing;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingUpdateRequest {

    @Positive(message = "ID Değeri Pozitif Sayı Olmak Zorundadır")
    private int id;
    @NotNull(message = "İsim boş olamaz.")
    private String name;
    @NotNull(message = " Tarih Boş olamaz.")
    private LocalDate borrowingDate;
    @NotNull(message = "Tarih Boş olamaz.")
    private LocalDate returnDate;

    private int book_id;
}