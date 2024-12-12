package daw2.bookstore.persistence.repository._2impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import daw2.bookstore.domain._1model.Genre;
import daw2.bookstore.persistence.repository._1interface.GenreRepository;
import daw2.bookstore.persistence.repository._3mapper.GenreRowMapper;

public class GenreRepositoryJdbcImpl implements GenreRepository {

    @Override
    public List<Genre> getByIsbnBook(String isbn) {
        
        private final JdbcTemplate jdbcTemplate;

        @Override
        public List<Genre> getByIsbnBook(String isbn) {
            String sql = """
                    SELECT genres.* FROM genres
                    JOIN books_genres ON genres.id = books_genres.genre_id
                    JOIN books ON books_genres.book_id = books.id
                    AND books.isbn = ?
                    """;
            return jdbcTemplate.query(sql, new GenreRowMapper(), isbn);
        }

    }

}
