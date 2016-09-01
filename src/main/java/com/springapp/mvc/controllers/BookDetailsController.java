package com.springapp.mvc.controllers;

import com.springapp.mvc.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookDetailsController {

    private final BookRepository bookRepository;

    @Autowired
    public BookDetailsController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value="/{bookId}", method=RequestMethod.GET)
    public String displayBookDetailsX(@PathVariable("bookId") String bookId,
                                      ModelMap modelMap) {
        modelMap.addAttribute("book", bookRepository.find(bookId));
        return "bookDetails";
    }

}
