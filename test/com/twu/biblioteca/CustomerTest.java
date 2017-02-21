package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by bingwang on 2/21/17.
 */
public class CustomerTest {
    Customer customer = new Customer();
    @Test
    public void should_get_book_when_book_is_avialable(){
        int result = customer.borrow(0);
        assertThat(result,is(1));
    }
    @Test
    public void should_retrun_1_when_retrun_a_book(){
        int result = customer.returnBook(0);
        assertThat(result,is(1));
    }
}
