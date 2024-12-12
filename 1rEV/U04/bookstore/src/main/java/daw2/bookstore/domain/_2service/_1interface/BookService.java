package daw2.bookstore.domain._2service._1interface;

import java.util.List;

import daw2.bookstore.domain._1model.Book;

public interface BookService {
    List<Book> getAll();

    Book findByIsbn(String isbn);
}
