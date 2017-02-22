package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bingwang on 2/21/17.
 */
public class Library {
    private List<Book> bookList;
    private int bookNumber;

    public Library() {
        this.bookList = init();
        this.bookNumber = bookList.size();
    }

    private List<Book> init() {
        List books = new ArrayList();
        Book book = new Book("advanced mathematics", 1);
        book.setDescription("this is a book to teach you basic knowledge about math");
        Book book1 = new Book("Harry Porter", 1);
        book1.setDescription("this book tell a magic story");
        Book book2 = new Book("Peter Pan", 1);
        book2.setDescription("Peter Pan never grow up");
        books.add(book);
        books.add(book1);
        books.add(book2);

        return books;
    }

    public String welcome() {
        return "welcome to our library";
    }

    public int getBookList() {
        int i;
        for (i = 0; i < bookList.size(); i++) {
            System.out.print("option "+i+": "+bookList.get(i).bookName+"\n");
        }
        System.out.print("option "+i+": quit\n");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if(option>=0&&option<bookNumber){
            return 1;
        }
        if(option == bookNumber){
            return 0;
        }
        return 2;
    }

    public int lend(int bookId) {
        if (bookId>=0&&bookId <= bookNumber&&bookList.get(bookId).number > 0) {
            bookList.get(bookId).number--;
            System.out.print("Thank you! Enjoy the book\n");
            return 1;
        }
        System.out.print("That book is not available\n");
        return 0;
    }

    public int recover(int bookId) {
        if (bookId>=0&&bookId < bookNumber) {
            bookList.get(bookId).number++;
            System.out.print("Thank you for returning the book.");
            return 1;
        }
        System.out.print("That is not a valid book to return.");
        return 0;
    }

    public int getBookInformation(int bookId) {

        if (bookId>=0&&bookId < bookNumber) {
            System.out.print(bookList.get(bookId).description+"\n");
            System.out.print("option 1:checkout book\noption 2:return book\noption 3:quit\n");
            return 1;
        }
        System.out.print("we don't have this book");
        return 0;
    }


    public void mainMenu() {
        System.out.print("Main Menu:\noption 1:Book list\noption 2:quit\n");
    }
}
