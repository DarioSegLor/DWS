package com._presentacion.darioselor.persistence.repository;

import java.util.List;

import com._presentacion.darioselor.domain.model.Author;

public interface AuthorRepository {
    List<Author> getByIsbnBook(String isbn);
}
