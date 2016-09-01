package com.springapp.mvc.controllers;

import com.springapp.mvc.services.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class CheckoutControllerTest {

    @Test
    public void shouldCallBookServiceWhenCheckingOutABook() {
        BookService bookService = mock(BookService.class);
        CheckoutController checkoutController = new CheckoutController(bookService);

        checkoutController.removeBookFromCollection("1");

        verify(bookService).checkout("1");
    }




}