package daw2.bookstore.domain._2service._2impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import daw2.bookstore.domain._1model.Book;
import daw2.bookstore.domain._2service._1interface.BookService;
import daw2.bookstore.persistence.repository._1interface.BookRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    BookRepository bookRepository = new BookRepository();

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn)orElseThrow(() -> new RuntimeException("Book not found"));
    }

}
