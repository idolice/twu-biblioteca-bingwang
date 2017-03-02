package com.twu.biblioteca;

import java.util.List;

/**
 * Created by bingwang on 3/2/17.
 */
public class LibraryPrinter {
    public static String WELCOME_MESSAGE = "Welcome to our Library\n";
    public static String LOGIN_USER = "Please input your name\n";
    public static String LOGIN_PASSWORD = "Please input your password\n";
    public static String LOGIN_SUCCESS = "Login successful!\n";
    public static String LOGIN_FAILED = "invalid user name or password\n";
    public static String CHOICE_MESSAGE = "choose the number:\n";
    public static String CHECKOUT_SUCCESS = "check out successfully!\n";
    public static String CHECKOUT_FAILED = "check out failed\n";
    public static String RETURN_SUCCESS = "return successfully!\n";
    public static String RETURN_FAILED = "return failed\n";

    public void printBookList(List<BookInfo> bookInfoList){
        if(bookInfoList.size()==0){
            return;
        }
        System.out.print("Book List:\n");
        for (int i = 0;i<bookInfoList.size();i++){
            System.out.print(i+": "+bookInfoList.get(i).getBook().bookName+"\n");
        }
    }

    public void printMovieList(List<MovieInfo> movieInfoList){
        if(movieInfoList.size()==0){
            return;
        }
        for (int i=0;i<movieInfoList.size();i++){
            System.out.print(i+": "+movieInfoList.get(i).getMovie().getName()+"\n");
        }
    }

    public void printUserInfo(CustomerInfo customer){
        System.out.print("name: "+customer.getCustomer().getName()+"\n");
        System.out.print("library number: "+customer.getCustomer().getLibraryNumber()+"\n");
        System.out.print("email: "+customer.getCustomer().getEmail()+"\n");
        System.out.print("phone: "+customer.getCustomer().getPhoneNumber()+"\n");
    }

    public void printMainList(){
        System.out.print("1:Book list\n2:Movie list\n3:User information\n4:exit\n");
    }

    public void printExit(int number){
        System.out.print(number+": exit\n");
    }

    public void printChoice(){
        System.out.print("1: checkout\n2: return\n3: exit");
    }

    public void printBookDetail(BookInfo bookInfo){
        System.out.print("book name:"+bookInfo.getBook().bookName+"\nbook content:"+bookInfo.getBook().description+"\nbook quantity:"+bookInfo.getQuantity()+"\n");
    }

    public void printMovieDetail(MovieInfo movieInfo){
        System.out.print("movie name:"+movieInfo.getMovie().getName()+"\nmovie year:"+movieInfo.getMovie().getYear()+"\nmovie director:"+movieInfo.getMovie().getDirector()+"\nmovie rating:"+movieInfo.getMovie().getRating()+"\n");
    }
}
