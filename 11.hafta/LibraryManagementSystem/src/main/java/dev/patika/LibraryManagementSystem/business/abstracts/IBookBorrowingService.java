package dev.patika.LibraryManagementSystem.business.abstracts;

import dev.patika.LibraryManagementSystem.entities.Book;
import dev.patika.LibraryManagementSystem.entities.BookBorrowing;
import org.springframework.data.domain.Page;

public interface IBookBorrowingService {
    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing get(int id);

    Page<BookBorrowing> cursor(int page, int pageSize); // hangi sayfa , bi sayfada kaç veri

    BookBorrowing update(BookBorrowing bookBorrowing);

    boolean delete(int id);
}