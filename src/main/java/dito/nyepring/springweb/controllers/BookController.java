package dito.nyepring.springweb.controllers;

import dito.nyepring.springweb.services.book.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private final BookServiceImpl bookService;

    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/api/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookService.findAll());

        return "books";
    }

//    @PostMapping("/api/books/{id}")
//    public String getBooksById(Model model, @PathVariable Long id) {
//        model.addAttribute("books", bookService.findById(id));
//
//        if (id != null) {
//            return "Books I'd " + id;
//        }
//        return "Book is Missing !!";
//    }
}
