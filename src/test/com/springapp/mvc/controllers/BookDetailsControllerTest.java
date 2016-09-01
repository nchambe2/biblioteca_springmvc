package com.springapp.mvc.controllers;

import com.springapp.mvc.repositories.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ModelMap;

import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class BookDetailsControllerTest {

    private ModelMap modelMap;
    private BookDetailsController bookDetailsController;
    private BookRepository bookRepository;

    @Before
    public void setUp() throws Exception {
        modelMap = new ModelMap();
        bookRepository = mock(BookRepository.class);
        bookDetailsController = new BookDetailsController(bookRepository);
    }

    @Test
    public void shouldReturnBookDetailsViewWhenCalled() {
        assertThat(bookDetailsController.displayBookDetails("1", modelMap), is("bookDetails"));
    }

    @Test
    public void shouldReturnBookDetailsWhenBookIdIsFound() {
        bookDetailsController.displayBookDetails("1", modelMap);

        assertThat(modelMap, hasEntry("book", bookRepository.find("1")));
    }

}