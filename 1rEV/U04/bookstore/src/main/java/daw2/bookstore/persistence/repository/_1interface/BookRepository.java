package daw2.bookstore.persistence.repository._1interface;

import java.util.List;
import java.util.Optional;

import daw2.bookstore.domain._1model.Book;

public interface BookRepository {

    List<Book> getAll();

    Optional<Book> findByIsbn(String isbn);
}
