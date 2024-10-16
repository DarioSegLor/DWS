package daw2.bookstore.domain._2service._1interface;

import daw2.bookstore.domain._1model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();

    Book findByIsbn(String isbn);
}
