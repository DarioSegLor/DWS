package daw2.bookstore.persistence.repository._3mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import daw2.bookstore.domain._1model.Author;

public class AuthorRowMapper implements RowMapper<Author> {

    @Override
    public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setId(rs.getInt("id"));
        author.setName(rs.getString("name"));
        author.setNationality(rs.getString("nationality_es"));
        author.setBiography(rs.getString("biography_es"));
        author.setBirthYear(rs.getInt("birth_year"));
        author.setDeathYear(rs.getInt("death_year"));
        return author;
    }
}
