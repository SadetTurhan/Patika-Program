package dev.patika;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "book_borrowing")
public class BookBorrowing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrowing_id",columnDefinition = "serial")
    private int id;
    @Column(name = "book_borrowing_borrower_name")
    private String borrowerName;
    @Column(name = "book_borrowing_borrow_date")
    private LocalDate borrowingDate;
    @Column(name = "book_borrowing_return_date")
    private LocalDate returningDate;
    @ManyToOne
    @JoinColumn(name = "book_id",referencedColumnName = "book_id")
    private Book book;
    public BookBorrowing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturningDate() {
        return returningDate;
    }

    public void setReturningDate(LocalDate returningDate) {
        this.returningDate = returningDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
