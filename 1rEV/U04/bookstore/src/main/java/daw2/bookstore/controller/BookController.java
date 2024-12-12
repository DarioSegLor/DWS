package daw2.bookstore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import daw2.bookstore.domain._1model.Book;
import daw2.bookstore.domain._2service._1interface.BookService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(BookController.URL)
@RequiredArgsConstructor
public class BookController {

    public static final String URL = "/books";

    private final BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{isbn}")
    public Book findByIsbn(@PathVariable String isbn) {
        return bookService.findByIsbn(isbn);
    }
}
