package com.springapp.mvc.domain;

//Data Transfer Object
//moving information
//ok that's it's just getter and setters
//doesn't need to be here
//right now you're domain layer is acting like your presentation layer
//as soon as book has behavior that doesn't accessor
//and that does
public interface Book {

    public String getId();

    public String getTitle();

    public String getAuthor();

    public String getYearPublished();
}
