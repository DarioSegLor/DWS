package com._presentacion.darioselor.persistence.repository;

import java.util.List;

import com._presentacion.darioselor.domain.model.Genre;

public interface GenreRepository {
    List<Genre> getByIsbnBook(String isbn);
}
