package dito.nyepring.springweb.repositories;

import dito.nyepring.springweb.domain.Author;
import org.springframework.data.repository.CrudRepository;

//ID TYPE STANDS FOR ID TYPE IN ENTITY CLASS
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
