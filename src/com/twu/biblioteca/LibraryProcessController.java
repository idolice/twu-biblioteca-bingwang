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
        tempMap.put(1,Stage.BOOK_LIST_PAGE);
        tempMap.put(2,Stage.MOVIE_LIST_PAGE);
        tempMap.put(3,Stage.USER_INFO_PAGE);
        tempMap.put(4,Stage.EXIT_STAGE);
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
                int temp = scanner.nextInt();
                if(mainPageChoiceMap.get(temp)!=null)
                currentCustomer.setStage(mainPageChoiceMap.get(temp));
            }
            if(currentCustomer.getStage()==Stage.BOOK_LIST_PAGE) {
                libraryPrinter.printBookList(library.getBookList());
                libraryPrinter.printDivideLine();
                libraryPrinter.printUserInputIndex();
                BookInfo bookInfo = library.getBookList().get(scanner.nextInt());
                if(bookInfo==null){
                    libraryPrinter.printErrorMessage();
                    continue;
                }
                currentCustomer.setStage(Stage.BOOK_DETAIL_PAGE);
                libraryPrinter.printBookDetail(bookInfo);
            }
            if(currentCustomer.getStage()==Stage.BOOK_DETAIL_PAGE){

            }
        }

    }
}

