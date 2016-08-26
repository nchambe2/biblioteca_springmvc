package com.springapp.mvc.controllers;

import com.springapp.mvc.repositories.BookRepository;
import com.springapp.mvc.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private BookRepository bookRepository;
    private BookService bookService;

    @Autowired
    public BookController(BookRepository bookRepository, BookService bookService) {
        this.bookRepository = bookRepository;
        this.bookService = bookService;
    }

    @RequestMapping(value="/viewBooks", method=RequestMethod.GET)
    public String displayInStockBooks(ModelMap modelMap) {
        modelMap.addAttribute("inStockBooks", bookService.getInStockBooks());
        return "inStockBooks";
    }

    @RequestMapping(value="/{bookId}", method=RequestMethod.GET)
    public String displayBookDetails(@PathVariable("bookId") String bookId,
                                     ModelMap modelMap) {

        modelMap.addAttribute("book", bookRepository.find(bookId));
        return "bookDetails";
    }

    @RequestMapping(value="/checkout", method=RequestMethod.POST)
    public ResponseEntity<String> checkout(@RequestBody String bookId) {
        bookService.checkout(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
