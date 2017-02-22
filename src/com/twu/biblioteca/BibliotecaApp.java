package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        System.out.print(library.welcome());
        int currentMode = 0;
        int exit = 0;
        while (exit == 0) {
            int bookIndex = 0;
            while (currentMode == 0) {
                library.mainMenu();
                int input = scanner.nextInt();
                if(input == 1){
                    currentMode = 1;
                    continue;
                }
                if(input == 2){
                    currentMode = -1;
                    exit = 1;
                }
            }
            while (currentMode == 1) {
                int result = library.getBookList();
                if(result == 1){
                    currentMode = 2;
                    bookIndex = result;
                    continue;
                }
                if(result == 0){
                    currentMode = 0;
                    continue;
                }
                if(result == 2){
                    System.out.print("invalid option!");
                }
            }
            while (currentMode == 2) {
                if(library.getBookInformation(bookIndex)==1){
                    if(scanner.nextInt()==1){
                        currentMode = 3;
                        continue;
                    }
                    if (scanner.nextInt() == 2){
                        currentMode = 4;
                        continue;
                    }
                    if (scanner.nextInt() == 3){
                        currentMode = 1;
                    }
                }

            }
            while (currentMode == 3){
                library.lend(bookIndex);
                currentMode = 0;
            }
            while (currentMode == 4){
                library.recover(bookIndex);
                currentMode = 0;
            }
        }
    }
}
