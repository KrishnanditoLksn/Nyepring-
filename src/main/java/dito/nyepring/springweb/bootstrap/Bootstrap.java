package dito.nyepring.springweb.bootstrap;

import dito.nyepring.springweb.domain.Author;
import dito.nyepring.springweb.domain.Book;
import dito.nyepring.springweb.domain.Publisher;
import dito.nyepring.springweb.repositories.AuthorRepository;
import dito.nyepring.springweb.repositories.BookRepository;
import dito.nyepring.springweb.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public Bootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) {
        Author dito = new Author();
        dito.setFirstName("Emmanuel");
        dito.setLastName("Laksana");

        Book book = new Book();
        book.setTitle("Cara jadi ganteng ");
        book.setIsbn("123345");


        Author ditoSaved = authorRepository.save(dito);
        Book bookSaved = bookRepository.save(book);


        Author messi = new Author();
        messi.setFirstName("Lionel");
        messi.setLastName("Messi");


        Publisher publisher = new Publisher();
        publisher.setAddress("Jalan Kaliurang");
        publisher.setCity("Sragen");
        publisher.setPublisherName("PT.Erlangga");
        publisher.setZip("3531");
        publisher.setState("Central Java");

        Book book2 = new Book();
        book2.setTitle("Cara jadi kutu buku");
        book2.setIsbn("123345");

        Publisher savedPublisher = publisherRepository.save(publisher);

        Author messiSaved = authorRepository.save(messi);
        Book book2Saved = bookRepository.save(book2);

        ditoSaved.getBooks().add(bookSaved);
        messiSaved.getBooks().add(book2Saved);

        bookSaved.getAuthors().add(ditoSaved);
        book2Saved.getAuthors().add(messiSaved);

        book2Saved.setPublisher(savedPublisher);
        bookSaved.setPublisher(savedPublisher);

        System.out.println("In Bootstrap dude ");
        System.out.println("Author Count " + authorRepository.count());
        System.out.println("Book Count " + bookRepository.count());

        bookRepository.save(book2Saved);
        bookRepository.save(bookSaved);

        System.out.println("Publisher Count:" + savedPublisher);
    }
}
