package daw2.bookstore.persistence.repository._1interface;

import daw2.bookstore.domain._1model.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {
    List<Author> getAll();
    Optional<Author> findByID(Integer id);
}
