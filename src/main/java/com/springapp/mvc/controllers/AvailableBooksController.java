package com.springapp.mvc.controllers;

import com.springapp.mvc.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AvailableBooksController {

    private BookService bookService;

    @Autowired
    public AvailableBooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value="/viewBooks", method= RequestMethod.GET)
    public String displayInStockBooks(ModelMap modelMap) {
        modelMap.addAttribute("inStockBooks", bookService.getInStockBooks());
        return  "inStockBooks";
    }
}
