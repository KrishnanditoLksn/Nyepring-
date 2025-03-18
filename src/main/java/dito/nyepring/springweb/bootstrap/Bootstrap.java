package dito.nyepring.springweb.bootstrap;

import dito.nyepring.springweb.domain.Author;
import dito.nyepring.springweb.domain.Book;
import dito.nyepring.springweb.repositories.AuthorRepository;
import dito.nyepring.springweb.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;


    public Bootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
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

        Book book2 = new Book();
        book2.setTitle("Cara jadi kutu buku");
        book2.setIsbn("123345");


        Author messiSaved = authorRepository.save(messi);
        Book book2Saved = bookRepository.save(book2);

//        authorRepository.save(ditoSaved);
//        authorRepository.save(messiSaved);

        ditoSaved.getBooks().add(bookSaved);
        messiSaved.getBooks().add(book2Saved);
        System.out.println("In Bootstrap dude ");
        System.out.println("Author Count " + authorRepository.count());
        System.out.println("Book Count " + bookRepository.count());
    }
}
