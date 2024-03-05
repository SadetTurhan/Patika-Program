package dev.patika.LibraryManagementSystem.dto.request.BookBorrowing;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowingSaveRequest {

    @NotNull(message = "İsim boş olamaz.")
    private String name;
    @NotNull(message = "Tarih Boş olamaz.")
    private LocalDate borrowingDate;
    @NotNull(message = "Tarih Boş olamaz.")
    private LocalDate returnDate;

    private int book_id;
}