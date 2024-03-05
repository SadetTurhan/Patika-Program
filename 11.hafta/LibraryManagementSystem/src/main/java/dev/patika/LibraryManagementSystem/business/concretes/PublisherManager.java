package dev.patika.LibraryManagementSystem.business.concretes;

import dev.patika.LibraryManagementSystem.business.abstracts.IPublisherService;
import dev.patika.LibraryManagementSystem.dao.PublisherRepo;
import dev.patika.LibraryManagementSystem.entities.Publisher;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.awt.image.ImageProducer;

@Service
@RequiredArgsConstructor
public class PublisherManager implements IPublisherService {

    private final PublisherRepo publisherRepo;

    @Override
    public Publisher save(Publisher publisher) {
        return this.publisherRepo.save(publisher);
    }

    @Override
    public Publisher get(int id) {
        return this.publisherRepo.findById(id).orElseThrow();
    }

    @Override
    public Page<Publisher> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page,pageSize);
        return  this.publisherRepo.findAll(pageable);
    }

    @Override
    public Publisher update(Publisher publisher) {
        this.get(publisher.getId());
        return this.publisherRepo.save(publisher);
    }

    @Override
    public boolean delete(int id) {
        Publisher publisher = this.get(id);
        this.publisherRepo.delete(publisher);
        return true;
    }
}