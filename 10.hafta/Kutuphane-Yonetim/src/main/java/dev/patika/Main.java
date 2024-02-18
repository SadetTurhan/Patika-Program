package dev.patika;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("library");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Author author = new Author();
        author.setName("Tolkien");
        author.setCountry("United Kingdom");
        author.setBirthYear(LocalDate.of(1892,01,03));
        entityManager.persist(author);


        Category category = new Category();
        category.setName("fantasy");
        category.setDescription("A genre which generally has different magical elements like dragons and knights");
        entityManager.persist(category);

        Publisher publisher = new Publisher();
        publisher.setName("Allen and Unwin");
        publisher.setAddress("The shire,3rd house after the windmill");
        publisher.setEstablishmentYear(1911);
        entityManager.persist(publisher);


        Book book = new Book();
        book.setName("The Lord of The Rings");
        book.setStock(5);
        book.setPublicationYear(1954);
        book.setAuthor(author);
        book.setPublisher(publisher);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category);
        book.setCategoryList(categoryList);
        List<BookBorrowing> bookBorrowingList = new ArrayList<>();
        book.setBookBorrowing(bookBorrowingList);
        entityManager.persist(book);

        BookBorrowing bookBorrowing = new BookBorrowing();
        bookBorrowing.setBorrowerName("George Martin");
        bookBorrowing.setBook(book);
        bookBorrowing.setBorrowingDate(LocalDate.of(2024,02,10));
        bookBorrowing.setReturningDate(LocalDate.of(2024,02,17));
        entityManager.persist(bookBorrowing);

        transaction.commit();
    }
}