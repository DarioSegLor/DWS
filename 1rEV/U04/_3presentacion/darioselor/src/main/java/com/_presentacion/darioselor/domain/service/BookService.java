package com._presentacion.darioselor.domain.service;

import java.util.List;

import com._presentacion.darioselor.domain.model.Book;

public interface BookService {
    List<Book> getAll();

    Book findByIsbn(String isbn);

}
