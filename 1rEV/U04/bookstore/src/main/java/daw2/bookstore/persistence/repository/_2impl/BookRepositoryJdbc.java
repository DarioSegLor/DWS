package daw2.bookstore.persistence.repository._2impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.daw2.bookstore.persistence.repository.BookRepository;

import daw2.bookstore.domain._1model.Book;
import daw2.bookstore.persistence.repository._3mapper.BookRowMapper;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryJdbc implements BookRepository {

    private final JdbcTemplate jdbcTemplate;

    private final AuthorRepository authorRepository;
    private final GenreRepository genreRepository;

    @Override
    public List<Book> getAll() {

        String sql = """
                SELECT * FROM books
                """;
        return jdbcTemplate.query(sql, new BookRowMapper());
    }

}
