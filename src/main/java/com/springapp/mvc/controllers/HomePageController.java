package com.springapp.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//index is the default name not in your domain
//more descriptive name
@Controller
public class HomePageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String displayIndex() {
        return "index";
    }
}

