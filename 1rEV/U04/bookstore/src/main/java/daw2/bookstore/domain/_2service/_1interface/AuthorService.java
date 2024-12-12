package daw2.bookstore.domain._2service._1interface;

import java.util.List;

import daw2.bookstore.domain._1model.Author;

public interface AuthorService {
    List<Author> getAll();

    Author findByID(String isbn);
}
