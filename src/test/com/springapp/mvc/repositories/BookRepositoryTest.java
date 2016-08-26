package com.springapp.mvc.repositories;

import com.springapp.mvc.domain.Book;
import org.junit.Before;
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
public class BookRepositoryTest {

    private List<Book> inStockBooks;
    private BookRepository bookRepository;
    private Book book;

    @Before
    public void setUp() throws Exception {
        inStockBooks = new ArrayList<>();
        bookRepository = new BookRepository(inStockBooks);
        book = mock(Book.class);
        inStockBooks.add(book);
    }

    @Test
    public void shouldReturnInStockBooksWhenCalled() {
        assertThat(bookRepository.getInStockBooks(), is(inStockBooks));
    }

    @Test
    public void shouldReturnBookDetailsWhenIdIsFound() {
        when(book.getId()).thenReturn("1");

        assertThat(bookRepository.find("1"), is(book));
    }

    @Test
    public void shouldRemoveBookFromInStockBooksListWhenCheckingOut() {
        when(book.getId()).thenReturn("1");

        bookRepository.removeBookFromInStockBooksList("1");

        assertThat(inStockBooks.size(), is(0));
    }


}