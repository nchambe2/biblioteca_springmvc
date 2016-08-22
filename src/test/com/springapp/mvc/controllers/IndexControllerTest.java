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
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class IndexControllerTest {

    private ModelMap modelMap;
    private BookService bookService;
    private IndexController indexController;

    @Before
    public void setUp() throws Exception {
        modelMap = new ModelMap();
        bookService = mock(BookService.class);
        indexController = new IndexController(bookService);
    }

    @Test
    public void shouldReturnIndexViewWhenRootRouteIsHit() {
        assertThat(indexController.displayIndex(modelMap), is("index"));
    }

    @Test
    public void shouldReturnInStockBooksWhenRootRouteIsHit() {
        indexController.displayIndex(modelMap);

        assertThat(modelMap, hasEntry("inStockBooks", bookService.getInStockBooks()));
    }
}