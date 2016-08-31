package com.springapp.mvc.controllers;

import com.springapp.mvc.repositories.BookRepository;
import com.springapp.mvc.services.BookService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ModelMap;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class BookControllerTest {

    private ModelMap modelMap;
    private BookRepository bookRepository;
    private BookController bookController;
    private BookService bookService;

    @Before
    public void setUp() throws Exception {
        modelMap = new ModelMap();
        bookRepository = mock(BookRepository.class);
        bookService = mock(BookService.class);
        bookController = new BookController(bookRepository, bookService);
    }

    @Test
    public void shouldReturnBookDetailsViewWhenCalled() {
        assertThat(bookController.displayBookDetails("1", modelMap), is("bookDetails"));
    }

    @Test
    public void shouldReturnBookDetailsWhenBookIdIsFound() {
        bookController.displayBookDetails("1", modelMap);

        assertThat(modelMap, hasEntry("book", bookRepository.find("1")));
    }

    @Test
    public void shouldCallBookServiceWhenCheckingOutABook() {
        bookController.checkout(anyString());

        verify(bookService).checkout(anyString());
    }


}