package com.twu.biblioteca;

import java.util.HashMap;
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
    private Map<Integer,Integer> mainPageChoiceMap;

    public LibraryProcessController(LibraryPrinter libraryPrinter, Library library) {
        this.libraryPrinter = libraryPrinter;
        this.library = library;
        this.currentCustomer = new CustomerInfo(Stage.LOGIN_PAGE,null);
        this.mainPageChoiceMap = initMainPageChoiceMap();
    }

    private Map<Integer, Integer> initMainPageChoiceMap() {
        Map<Integer,Integer> tempMap = new HashMap<Integer, Integer>();
        tempMap.put(Stage.BOOK_LIST_PAGE,1);
        tempMap.put(Stage.MOVIE_LIST_PAGE,2);
        tempMap.put(Stage.USER_INFO_PAGE,3);
        tempMap.put(Stage.EXIT_STAGE,0);
        return tempMap;
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

