package dito.nyepring.springweb.controllers;

import dito.nyepring.springweb.services.author.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    @Autowired
    public ConstructorInjectedController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    private final AuthorServiceImpl authorService;


    public String sayHello() {
        return authorService.sayHello();
    }
}
