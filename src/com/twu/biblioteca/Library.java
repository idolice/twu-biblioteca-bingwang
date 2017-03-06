package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bingwang on 2/21/17.
 */
public class Library {
    private List<BookInfo> bookList;
    private List<CustomerInfo> customerList;
    private List<MovieInfo> movieInfoList;
    private LibraryPrinter libraryPrinter;

    public Library(LibraryPrinter libraryPrinter) {
        this.bookList = initBookInfo();
        this.customerList = initCustomers();
        this.movieInfoList = initMovie();
        this.libraryPrinter = libraryPrinter;

    }

    private List<CustomerInfo> initCustomers() {
        List<CustomerInfo> customers = new ArrayList<CustomerInfo>();
        customers.add(new CustomerInfo(Stage.LOGIN_PAGE, new Customer("idolice", "1@2.com", "123456", "123456", "1")));
        customers.add(new CustomerInfo(Stage.LOGIN_PAGE, new Customer("white", "1@2.com", "123456", "123456", "2")));
        customers.add(new CustomerInfo(Stage.LOGIN_PAGE, new Customer("faker", "1@2.com", "123456", "123456", "3")));
        return customers;
    }

    private List<BookInfo> initBookInfo() {
        List books = new ArrayList();
        Book book = new Book("advanced mathematics", "this is a book to teach you basic knowledge about math");
        Book book1 = new Book("Harry Porter", "this book tell a magic story");
        Book book2 = new Book("Peter Pan", "Peter Pan never grow up");
        books.add(new BookInfo(1, book));
        books.add(new BookInfo(1, book1));
        books.add(new BookInfo(1, book2));
        return books;
    }

    private List<MovieInfo> initMovie() {
        List<MovieInfo> movieInfos = new ArrayList<MovieInfo>();
        movieInfos.add(new MovieInfo(1, new Movie("Big Hero 6", 2014, "Don Holl", 9)));
        movieInfos.add(new MovieInfo(1, new Movie("Zootopia", 2017, "Byron Howard", 7)));
        movieInfos.add(new MovieInfo(1, new Movie("Despicable Me", 2010, "Pierre Coffin", 8)));
        return movieInfos;
    }

    public List<BookInfo> getBookList() {
        return bookList;
    }

    public Customer login(String name, String password) {
        for (int i = 0; i < customerList.size(); i++) {
            CustomerInfo temp = customerList.get(i);
            if (temp.getCustomer().getName().equals(name) && temp.getCustomer().getPassword().equals(password)) {
                return temp.getCustomer();
            }
        }
        return null;
    }

    public int lendBook(String bookName) {
        for (int i = 0; i < bookList.size(); i++) {
            BookInfo temp = bookList.get(i);
            if (temp.getBook().bookName.equals(bookName) && temp.getQuantity() > 0) {
                bookList.get(i).setQuantity(temp.getQuantity() - 1);
                return 1;
            }
        }
        return 0;
    }

    public int lendMovie(String movieName) {
        for (int i = 0; i < movieInfoList.size(); i++) {
            MovieInfo temp = movieInfoList.get(i);
            if (temp.getMovie().getName().equals(movieName) && temp.getQuantity() > 0) {
                movieInfoList.get(i).setQuantity(temp.getQuantity() - 1);
                return 1;
            }
        }
        return 0;
    }

}
