package dev.patika.LibraryManagementSystem.business.abstracts;
import dev.patika.LibraryManagementSystem.entities.Author;
import org.springframework.data.domain.Page;
public interface IAuthorService {
    Author save(Author author);
    Author get(int id);

    Page<Author> cursor(int page, int pageSize);

    Author update(Author category);

    boolean delete(int id);
}
