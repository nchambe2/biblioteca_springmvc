package com.springapp.mvc.services;

import com.springapp.mvc.domain.Book;
import com.springapp.mvc.repositories.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class BookServiceTest {

    private BookRepository bookRepository;
    private List<Book> inStockBooks;
    private BookService bookService;

    @Before
    public void setUp() throws Exception {
        bookRepository = mock(BookRepository.class);
        inStockBooks = new ArrayList();
        bookService = new BookService(bookRepository);
    }

    @Test
    public void shouldReturnListOfInStockBooksWhenCalled() {
        when(bookRepository.getInStockBooks()).thenReturn(inStockBooks);

        assertThat(bookService.getInStockBooks(), is(inStockBooks));
    }

    @Test
    public void shouldCallBookRepositoryWhenCheckingOutBook() {
        bookService.checkout(anyString());

        verify(bookRepository).removeBookFromInStockBooksList(anyString());
    }
}