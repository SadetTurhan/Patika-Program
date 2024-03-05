package dev.patika.LibraryManagementSystem.api;

import dev.patika.LibraryManagementSystem.business.abstracts.IAuthorService;
import dev.patika.LibraryManagementSystem.business.abstracts.IBookService;
import dev.patika.LibraryManagementSystem.business.abstracts.IPublisherService;
import dev.patika.LibraryManagementSystem.core.config.ModelMapper.IModelMapperService;
import dev.patika.LibraryManagementSystem.core.result.Result;
import dev.patika.LibraryManagementSystem.core.result.ResultData;
import dev.patika.LibraryManagementSystem.core.utilies.ResultHelper;
import dev.patika.LibraryManagementSystem.dto.CursorResponse;
import dev.patika.LibraryManagementSystem.dto.request.Book.BookSaveRequest;
import dev.patika.LibraryManagementSystem.dto.response.Book.BookResponse;
import dev.patika.LibraryManagementSystem.entities.Author;
import dev.patika.LibraryManagementSystem.entities.Book;
import dev.patika.LibraryManagementSystem.entities.Publisher;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    @Autowired
    private final IBookService bookService;
    private final IModelMapperService modelMapper;
    private final IAuthorService authorService;
    private final IPublisherService publisherService;

    public BookController(IBookService bookService, IModelMapperService modelMapper, IAuthorService authorService, IPublisherService publisherService) {
        this.bookService = bookService;
        this.modelMapper = modelMapper;
        this.authorService = authorService;
        this.publisherService = publisherService;
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<BookResponse> save(@Valid @RequestBody BookSaveRequest bookSaveRequest){
        Book saveBooks = this.modelMapper.forRequest().map(bookSaveRequest , Book.class);

        Author author = this.authorService.get(bookSaveRequest.getAuthorId());
        saveBooks.setAuthor(author);

        Publisher publisher = this.publisherService.get(bookSaveRequest.getPublisherId());
        saveBooks.setPublisher(publisher);

        this.bookService.save(saveBooks);
        return ResultHelper.created(this.modelMapper.forResponse().map(saveBooks , BookResponse.class));

    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookResponse> get(@PathVariable("id") int id){
        Book book = this.bookService.get(id);
        return ResultHelper.success(this.modelMapper.forResponse().map(book,BookResponse.class));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Result delete(@PathVariable("id") int id){
        this.bookService.delete(id);
        return ResultHelper.ok();
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<BookResponse> update(@Valid @RequestBody BookSaveRequest bookSaveRequest){
        Book updateBook = this.modelMapper.forRequest().map(bookSaveRequest,Book.class);
        this.bookService.update(updateBook);
        return ResultHelper.success(this.modelMapper.forResponse().map(updateBook,BookResponse.class));
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public ResultData<CursorResponse<BookResponse>> cursor (
            @RequestParam(name = "page" , required = false , defaultValue = "0")int page,
            @RequestParam(name = "pageSize" , required = false ,defaultValue = "2") int pageSize
    ){
        Page<Book> bookPage = this.bookService.cursor(page,pageSize);
        Page<BookResponse> bookResponsePage = bookPage.map(book ->
                this.modelMapper.forResponse().map(book, BookResponse.class));
        return ResultHelper.cursor(bookResponsePage);
    }

}