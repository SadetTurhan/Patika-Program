package dev.patika;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        Customer customer = new Customer();

        customer.setName("Mustafa");
        customer.setMail("test@patika.dev");
        customer.setGender(Customer.Gender.MALE);
        customer.setOnDate(LocalDate.now());
        entityManager.persist(customer);
        transaction.commit();

    }
}