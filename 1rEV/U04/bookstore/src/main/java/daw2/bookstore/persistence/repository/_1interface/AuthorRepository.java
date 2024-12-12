package daw2.bookstore.persistence.repository._1interface;

import java.util.List;

import daw2.bookstore.domain._1model.Author;

public interface AuthorRepository {

    List<Author> getAll();

    List<Author> getByIsbnBook(String isbn);
}
