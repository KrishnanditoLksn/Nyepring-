package dito.nyepring.springweb.services.author;

import dito.nyepring.springweb.domain.Author;
import dito.nyepring.springweb.repositories.AuthorRepository;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAllAuthor() {
        return authorRepository.findAll();
    }
}
