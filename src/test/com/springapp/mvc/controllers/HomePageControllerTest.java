package com.springapp.mvc.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class HomePageControllerTest {

    private HomePageController homePageController;

    @Before
    public void setUp() throws Exception {
        homePageController = new HomePageController();
    }

    @Test
    public void shouldReturnIndexViewWhenRootRouteIsHit() {
        assertThat(homePageController.displayIndex(), is("index"));
    }
}

//checkoutbooks - should show all in stock books and next to them show the removeBookFromInStockBooksList button
//if you are checking out a book that should happen in the book service
//find the book in the instock books based on the id
//re
//checkoutbooks