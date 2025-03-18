package dito.nyepring.springweb.repositories;

import dito.nyepring.springweb.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
