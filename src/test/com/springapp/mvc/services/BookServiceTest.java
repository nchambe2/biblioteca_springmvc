package com.springapp.mvc.services;

import com.springapp.mvc.domain.Book;
import com.springapp.mvc.repositories.BookRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class BookServiceTest {
    @Test
    public void shouldReturnListOfInStockBooksWhenCalled() {
        BookRepository bookRepository = mock(BookRepository.class);
        List<Book> inStockBooks = new ArrayList();
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.getInStockBooks()).thenReturn(inStockBooks);

        assertThat(bookService.getInStockBooks(), is(inStockBooks));
    }
}