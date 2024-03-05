package dev.patika.LibraryManagementSystem.dao;

import dev.patika.LibraryManagementSystem.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
