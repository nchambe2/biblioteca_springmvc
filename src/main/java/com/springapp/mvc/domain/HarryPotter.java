package com.springapp.mvc.domain;

import org.springframework.stereotype.Component;

@Component
public class HarryPotter implements Book {

    private String title;

    public HarryPotter(String title) {

        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
