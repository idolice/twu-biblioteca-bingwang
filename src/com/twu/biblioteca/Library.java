package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingwang on 2/21/17.
 */
public class Library {
    private List<Book> bookList;
    private int bookNumber;
    public Library() {
        List books = new ArrayList();
        Book book = new Book("advanced mathematics",1);
        Book book1 = new Book("Harry Porter",1);
        Book book2 = new Book("Peter Pan",1);
        books.add(book);
        books.add(book1);
        books.add(book2);
        this.bookList = books;
        this.bookNumber = bookList.size();
    }

    public String welcome() {
        return "welcome to our library";
    }
    public int getQuatity(){
        return bookNumber;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public int lend(int bookId) {
        if(bookList.get(bookId).number>0&&bookId<= bookNumber){
            bookList.get(bookId).number--;
            return 1;
        }
        return 0;
    }

    public int recover(int bookId) {
        if(bookId<= bookNumber){
            bookList.get(bookId).number++;
            return 1;
        }
        return 0;
    }
}
