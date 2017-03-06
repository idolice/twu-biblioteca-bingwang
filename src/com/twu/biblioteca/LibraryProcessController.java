package com.twu.biblioteca;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by bingwang on 3/6/17.
 */
public class LibraryProcessController {

    private LibraryPrinter libraryPrinter;
    private Library library;
    private CustomerInfo currentCustomer;

    public LibraryProcessController(LibraryPrinter libraryPrinter, Library library) {
        this.libraryPrinter = libraryPrinter;
        this.library = library;
        this.currentCustomer = new CustomerInfo(Stage.LOGIN_PAGE,null);
    }

    public void process() {
        Scanner scanner = new Scanner(System.in);
        while (currentCustomer.getStage()==Stage.LOGIN_PAGE) {
            List<String> cridential = libraryPrinter.printInputUser(scanner);
            currentCustomer = new CustomerInfo(Stage.HOME_PAGE, library.login(cridential.get(0), cridential.get(1)));
        }
        while (currentCustomer.getStage()>Stage.LOGIN_PAGE) {
            if(currentCustomer.getStage()==Stage.HOME_PAGE) {
                libraryPrinter.printMainList();

            }
        }

    }
}

