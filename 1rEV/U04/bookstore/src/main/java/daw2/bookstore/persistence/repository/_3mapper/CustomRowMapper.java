package daw2.bookstore.persistence.repository._3mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

public interface CustomRowMapper<T> extends RowMapper<T> {

    default boolean existsColumn(ResultSet rs, String columnName) {
        try {
            rs.findColumn(columnName);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
}