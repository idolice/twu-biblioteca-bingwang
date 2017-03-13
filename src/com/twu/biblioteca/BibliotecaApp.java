package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        LibraryPrinter libraryPrinter = new LibraryPrinter();
        Library library = new Library();
        LibraryProcessController libraryProcessController = new LibraryProcessController(libraryPrinter,library);
        libraryProcessController.process();
    }
}
