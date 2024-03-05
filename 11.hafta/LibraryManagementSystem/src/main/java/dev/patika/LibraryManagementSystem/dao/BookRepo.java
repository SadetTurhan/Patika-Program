package dev.patika.LibraryManagementSystem.dao;

import dev.patika.LibraryManagementSystem.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}