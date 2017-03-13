package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by bingwang on 2/21/17.
 */
public class LibraryTest {
    Library library = new Library();
    List<Book> books = new ArrayList();
    List<Movie> movies = new ArrayList();
    List<Customer> customers = new ArrayList();

    @Before
    public void init() {
        books.add(new Book("advanced mathematics", "this is a book to teach you basic knowledge about math"));
        books.add(new Book("Harry Porter", "this book tell a magic story"));
        books.add(new Book("Peter Pan", "Peter Pan never grow up"));
        movies.add(new Movie("Big Hero 6", 2014, "Don Holl", 9));
        movies.add(new Movie("Zootopia", 2017, "Byron Howard", 7));
        movies.add(new Movie("Despicable Me", 2010, "Pierre Coffin", 8));
        customers.add(new Customer("idolice", "1@2.com", "123456", "123456", "1"));
        customers.add(new Customer("white", "1@2.com", "123456", "123456", "2"));
        customers.add(new Customer("faker", "1@2.com", "123456", "123456", "3"));
    }

    @Test
    public void should_return_booklist_and_it_quantity() {
        List<BookInfo> bookInfoList = library.getBookList();
        assertThat(bookInfoList.get(0).getBook().bookName, is(books.get(0).bookName));
        assertThat(bookInfoList.get(1).getBook().description, is(books.get(1).description));
    }



    @Test
    public void should_return_1_when_book_borrowed_successfully() {
        Book book = books.get(0);
        int result = library.lendBook(book.bookName);
        assertThat(result, is(1));
    }

    @Test
    public void should_return_0_when_book_is_not_avialable_when_borrow() {
        String bookName = "Red and Black";
        int result = library.lendBook(bookName);
        assertThat(result, is(0));
    }

    @Test
    public void should_return_1_when_movie_borrowed_successfully() {
        String movieName = "Big Hero 6";
        int result = library.lendMovie(movieName);
        assertThat(result, is(1));
    }

    @Test
    public void should_return_0_when_movie_is_not_avialable_when_borrow() {
        String movieName = "Snow Princess";
        int result = library.lendMovie(movieName);
        assertThat(result, is(0));
    }




}
