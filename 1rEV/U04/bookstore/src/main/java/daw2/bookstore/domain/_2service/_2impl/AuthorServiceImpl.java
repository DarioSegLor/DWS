package daw2.bookstore.domain._2service._2impl;

import java.util.List;

import org.springframework.stereotype.Service;

import daw2.bookstore.domain._1model.Author;
import daw2.bookstore.domain._2service._1interface.AuthorService;
import daw2.bookstore.persistence.repository._1interface.AuthorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    AuthorRepository authorRepository = new AuthorRepository();

    @Override
    public List<Author> getAll() {
        return authorRepository.getAll();
    }

    @Override
    public Author findByID(String id) {
        return authorRepository.getByIsbnBook(id).orElseThrow(() -> new RuntimeException("Author not found"));
    }

}
