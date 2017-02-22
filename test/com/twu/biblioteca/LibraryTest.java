package com.twu.biblioteca;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by bingwang on 2/21/17.
 */
public class LibraryTest {
    Library library = new Library();
    int result;
    @Test
    public void should_return_1_when_lend_book_is_avialable(){
        result = library.lend(1);
        assertThat(result,is(1));
    }
    @Test
    public void should_return_0_when_borrow_invalid_book(){
        result = library.lend(10);
        assertThat(result,is(0));
    }
    @Test
    public void should_return_1_when_return_book_successfully(){
        result = library.recover(0);
        assertThat(result,is(1));
    }
    @Test
    public void should_return_0_when_return_invalid_book(){
        result = library.recover(10);
        assertThat(result,is(0));
    }
    @Test
    public void should_return_1_when_get_valid_book_detail(){
        result = library.getBookInformation(1);
        assertThat(result,is(1));
    }
    @Test
    public void should_return_0_when_get_invalid_book_detail(){
        result = library.getBookInformation(10);
        assertThat(result,is(0));
    }
}
