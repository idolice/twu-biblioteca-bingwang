package com.twu.biblioteca;

/**
 * Created by bingwang on 2/21/17.
 */
public class Book {
    public String bookName;
    public int number;
    public String description;

    public Book(String bookName, int number) {
        this.bookName = bookName;
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
