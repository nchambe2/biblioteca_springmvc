package com.springapp.mvc.domain;

import org.springframework.stereotype.Component;

@Component
public class GameOfThrones implements Book {

    private String title;

    public GameOfThrones(String title) {

        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
