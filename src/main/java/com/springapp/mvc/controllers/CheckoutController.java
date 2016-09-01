package com.springapp.mvc.controllers;

import com.springapp.mvc.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



//not just about books doesn't seem specific to a book
//split controller into a couple of different things

//route naming
//controller is for set of resouces Books
@Controller
public class CheckoutController {
    private BookService bookService;

    @Autowired
    public CheckoutController(BookService bookService) {

        this.bookService = bookService;
    }

    @ResponseBody
    @RequestMapping(value="/checkout", method= RequestMethod.POST)
    public ResponseEntity<String> removeBookFromCollection(String bookId) {
        bookService.checkout(bookId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
