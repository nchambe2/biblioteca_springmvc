package com.springapp.mvc.repositories;


import com.springapp.mvc.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {

    private List<Book> inStockBooks;

    @Autowired
    public BookRepository(List<Book> inStockBooks) {
        this.inStockBooks = inStockBooks;
    }

    public List<Book> getInStockBooks() {
        return inStockBooks;
    }
}
