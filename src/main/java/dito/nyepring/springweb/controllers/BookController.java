package dito.nyepring.springweb.controllers;

import dito.nyepring.springweb.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/api/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.findAll());

        return "books";
    }

    @RequestMapping("/api/books/{id}")
    public String getBooksById(Model model, @PathVariable Long id) {
        model.addAttribute("books", bookService.findById(id));

        if (id != null) {
            return "Books Id " + id;
        }
        return "Book is Missing !!";
    }
}
