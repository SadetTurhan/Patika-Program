package dev.patika.LibraryManagementSystem.business.abstracts;

import dev.patika.LibraryManagementSystem.entities.Publisher;
import org.springframework.data.domain.Page;

public interface IPublisherService {
    Publisher save(Publisher publisher);
    Publisher get(int id);

    Page<Publisher> cursor(int page, int pageSize); // hangi sayfa , bi sayfada kaç veri

    Publisher update(Publisher publisher);

    boolean delete(int id);
}