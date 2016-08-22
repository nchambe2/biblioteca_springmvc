package com.springapp.mvc.unit.controllers;

import com.springapp.mvc.IndexController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class IndexControllerTest {

    @Test
    public void shouldReturnIndexViewWhenRootRouteIsHit() {
        IndexController indexController = new IndexController();

        assertThat(indexController.displayIndex(), is("index"));
    }

}