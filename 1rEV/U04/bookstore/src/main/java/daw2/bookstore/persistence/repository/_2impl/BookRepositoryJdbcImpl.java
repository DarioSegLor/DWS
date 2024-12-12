package daw2.bookstore.persistence.repository._2impl;

import java.util.List;
import java.util.Optional;

import daw2.bookstore.persistence.repository._1interface.AuthorRepository;
import daw2.bookstore.persistence.repository._1interface.BookRepository;
import daw2.bookstore.persistence.repository._1interface.GenreRepository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import daw2.bookstore.domain._1model.Book;
import daw2.bookstore.persistence.repository._3mapper.BookRowMapper;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookRepositoryJdbcImpl implements BookRepository {

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

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        String sql = """
                SELECT * FROM books
                LEFT JOIN categories ON books.category_id = categories.id
                LEFT JOIN publishers ON books.publisher_id = publishers.id
                WHERE books.isbn = ?
                """;
        try {
            Book book = jdbcTemplate.queryForObject(sql, new BookRowMapper(), isbn);
            return Optional.of(book);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

}
