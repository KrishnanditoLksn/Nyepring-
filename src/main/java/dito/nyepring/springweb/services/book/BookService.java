package dito.nyepring.springweb.services.book;

import dito.nyepring.springweb.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

    Iterable<Book> findById(Long id);
}
