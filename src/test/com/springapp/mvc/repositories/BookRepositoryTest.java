package com.springapp.mvc.repositories;

import com.springapp.mvc.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class BookRepositoryTest {

    @Test
    public void shouldReturnInStockBooksWhenCalled() {
        List<Book> inStockBooks = new ArrayList<>();
        BookRepository bookRepository = new BookRepository(inStockBooks);

        assertThat(bookRepository.getInStockBooks(), is(inStockBooks));
    }


}