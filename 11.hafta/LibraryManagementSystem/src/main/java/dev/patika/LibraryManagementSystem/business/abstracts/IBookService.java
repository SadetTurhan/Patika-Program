package dev.patika.LibraryManagementSystem.business.abstracts;

import dev.patika.LibraryManagementSystem.entities.Book;
import org.springframework.data.domain.Page;

public interface IBookService  {
    Book save(Book book);
    Book get(int id);

    Page<Book> cursor(int page, int pageSize); // hangi sayfa , bi sayfada kaç veri

    Book update(Book book);

    boolean delete(int id);
}