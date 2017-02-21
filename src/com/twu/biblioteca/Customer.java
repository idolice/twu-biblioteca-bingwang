package com.twu.biblioteca;

/**
 * Created by bingwang on 2/21/17.
 */
public class Customer {
    Library library = new Library();
    public int borrow(int bookId) {
        return library.lend(bookId);
    }

    public int returnBook(int bookId) {
        return library.recover(bookId);
    }
}
