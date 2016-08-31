package com.springapp.mvc.controllers;

import com.springapp.mvc.services.BookService;
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
public class AvailableBooksControllerTest {

    private ModelMap modelMap;
    private BookService bookService;
    private AvailableBooksController availableBooksController;

    @Before
    public void setUp() throws Exception {
        modelMap = new ModelMap();
        bookService = mock(BookService.class);
        availableBooksController = new AvailableBooksController(bookService);
    }

    @Test
    public void shouldReturnInStockBooksWhenViewBooksRouteIsHit() {
        assertThat(availableBooksController.displayInStockBooks(modelMap), is("inStockBooks"));
    }

    @Test
    public void shouldHaveMapOfInStockBooksWhenViewBooksRouteIsHit() {
        availableBooksController.displayInStockBooks(modelMap);

        assertThat(modelMap, hasEntry("inStockBooks", bookService.getInStockBooks()));
    }

}