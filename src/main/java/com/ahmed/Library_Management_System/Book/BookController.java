package com.ahmed.Library_Management_System.Book;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public Iterable<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/books/{id}")
    public Optional<Book> findById(@PathVariable Integer id) {
        return bookService.findById(id);
    }

    @PostMapping("/books")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }

//    @PutMapping("/api/books/{id}")
//    public Book update(@PathVariable Integer id, @RequestBody Book book) {
//        return bookService.update(id, book);
//    }

//    @DeleteMapping("/api/books/{id}")
//    public Book delete(@PathVariable Integer id) {
//        return bookService.delete((Book)bookService.findById(id));
//    }

}
