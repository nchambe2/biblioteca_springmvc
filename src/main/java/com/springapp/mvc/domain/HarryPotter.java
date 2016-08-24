package com.springapp.mvc.domain;

import org.springframework.stereotype.Component;

@Component
public class HarryPotter implements Book {

    private String id;
    private String title;
    private final String author;
    private final String yearPublished;

    public HarryPotter(String id, String title, String author, String yearPublished) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getYearPublished() {
        return yearPublished;
    }

}
