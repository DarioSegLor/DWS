package daw2.bookstore.persistence.repository._1interface;

import java.util.List;

import daw2.bookstore.domain._1model.Genre;

public interface GenreRepository {

    List<Genre> getByIsbnBook(String isbn);
}
