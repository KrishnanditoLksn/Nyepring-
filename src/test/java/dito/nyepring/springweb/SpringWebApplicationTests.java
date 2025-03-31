package dito.nyepring.springweb;

import dito.nyepring.springweb.controllers.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringWebApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testGetBookControllerFromCtx() {
        BookController bookController = applicationContext.getBean(BookController.class);
        bookController.sayHello();
    }

    @Test
    void contextLoads() {

    }

}
