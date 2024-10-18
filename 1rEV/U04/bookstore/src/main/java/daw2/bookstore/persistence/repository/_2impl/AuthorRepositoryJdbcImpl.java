package daw2.bookstore.persistence.repository._2impl;

import daw2.bookstore.domain._1model.Author;
import daw2.bookstore.domain._1model.Book;
import daw2.bookstore.persistence.repository._1interface.AuthorRepository;
import daw2.bookstore.persistence.repository._1interface.BookRepository;
import daw2.bookstore.persistence.repository._3mapper.AuthorRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryJdbcImpl implements AuthorRepository {

    private final BookRepository bookRepository;

    @Override
    public List<Author> getAll(){
        String sql= """
                SELECT * FROM authors
                """;
        return jdbcTemplate.query(sql, new AuthorRowMapper());
    }

}
