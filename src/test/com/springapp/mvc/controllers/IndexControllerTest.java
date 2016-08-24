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
public class IndexControllerTest {

    private IndexController indexController;

    @Before
    public void setUp() throws Exception {
        indexController = new IndexController();
    }

    @Test
    public void shouldReturnIndexViewWhenRootRouteIsHit() {
        assertThat(indexController.displayIndex(), is("index"));
    }
}