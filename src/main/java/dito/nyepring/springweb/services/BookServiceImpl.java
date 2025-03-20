package dito.nyepring.springweb.services;

import dito.nyepring.springweb.domain.Book;
import dito.nyepring.springweb.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Iterable<Book> findById(Long id) {
        return bookRepository.findAllById(Collections.singleton(id));
    }
}
