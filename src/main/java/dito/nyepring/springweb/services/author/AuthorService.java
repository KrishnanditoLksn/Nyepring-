package dito.nyepring.springweb.services.author;

import dito.nyepring.springweb.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
interface AuthorService  {

    Iterable<Author>findAllAuthor();
}
