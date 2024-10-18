package daw2.bookstore.domain._2service._2impl;

import java.sql.SQLException;
import java.util.List;

import daw2.bookstore.domain._1model.Author;
import daw2.bookstore.domain._2service._1interface.AuthorService;
import daw2.bookstore.persistence.repository._1interface.AuthorRepository;

public class AuthorServiceImpl implements AuthorService {

    AuthorRepository authorRepository = new AuthorRepository();

    public List<Author> getAll() {
        return authorRepository.getAll();
    }

    public Author findByID(Integer id) {
        return authorRepository.findByID(id).orElseThrow(() -> new RuntimeException("Author not found"));
    }

}
