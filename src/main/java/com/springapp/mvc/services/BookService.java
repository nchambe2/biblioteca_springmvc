package com.springapp.mvc.services;

import com.springapp.mvc.domain.Book;
import com.springapp.mvc.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getInStockBooks() {
        return bookRepository.getInStockBooks();
    }
}
