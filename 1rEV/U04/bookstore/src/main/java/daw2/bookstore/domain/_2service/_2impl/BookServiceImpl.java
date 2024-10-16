package daw2.bookstore.domain._2service._2impl;

import java.util.List;

import org.springframework.aot.hint.annotation.Reflective;
import org.springframework.stereotype.Service;

import com.daw2.bookstore.persistence.repository.BookRepository;

import daw2.bookstore.domain._2service._1interface.BookService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepository.findByIsbn(isbn)orElseThrow(() -> new RuntimeException("Book not found"));
    }

}
