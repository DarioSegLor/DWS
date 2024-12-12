package daw2.bookstore.persistence.repository._2impl;

import daw2.bookstore.domain._1model.Author;
import daw2.bookstore.persistence.repository._1interface.AuthorRepository;
import daw2.bookstore.persistence.repository._3mapper.AuthorRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryJdbcImpl implements AuthorRepository {

    @Override
    public List<Author> getAll() {
        String sql = """
                SELECT * FROM auhtors
                """;
        return jdbcTaemplate.query(sql, new AuthorRowMapper());
    }

    @Override
    public List<Author> getByIsbnBook(String isbn) {
        String sql = """
                SELECT auhtors.* FROM authors
                JOIN books_authors ON authors.id = books_authors.author_id
                JOIN books ON books_authors.book_id = books.id
                AND books.isbn = ?
                """;
        return jdbcTemplate.query(sql, new AuthorRowMapper(), isbn);
    }

}
