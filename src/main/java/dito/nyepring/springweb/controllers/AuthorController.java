package dito.nyepring.springweb.controllers;

import dito.nyepring.springweb.services.author.AuthorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorServiceImpl authorServiceImpl;


    public AuthorController(AuthorServiceImpl authorService) {
        this.authorServiceImpl = authorService;
    }


    @RequestMapping("/api/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorServiceImpl.findAllAuthor());
        return "authors";
    }
}
