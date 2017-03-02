package com.twu.biblioteca;

/**
 * Created by bingwang on 3/2/17.
 */
public class BookInfo {

    private int quantity;
    private Book book;

    public BookInfo(int quantity,Book book) {
        this.quantity = quantity;
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
