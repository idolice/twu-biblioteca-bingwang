package com.twu.biblioteca;


import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

/**
 * Created by bingwang on 2/21/17.
 */
public class LibraryTest {
    Library library = new Library();
    @Test
    public void should_return_welcome_message(){
        String welcomeMessage = library.welcome();
        assertEquals(welcomeMessage,"welcome to our library");
    }
    @Test
    public void should_return_the_booklist(){
        List<Book> books = library.getBookList();
        assertThat(books.get(0).bookName,is("advanced mathematics"));
    }
}
