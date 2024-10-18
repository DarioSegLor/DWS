package daw2.bookstore.domain._2service._1interface;

import daw2.bookstore.domain._1model.Author;

import java.util.List;


public interface AuthorService {
    List<Author> getAll();

    Author findByID(Integer id);
}
