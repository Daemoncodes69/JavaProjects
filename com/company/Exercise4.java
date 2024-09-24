package com.company;
import java.util.Arrays;

interface Library {
    String addBook(String name);

    String issueBook(String book);

    void returnBook();

    void showAvailableBooks();
}


class myLibrary implements Library {

    @Override
    public String addBook(String name) {
       // System.out.println("add the books in library");
        return name;
    }

    @Override
    public String issueBook(String book) {
        System.out.println("issued your added books");
        return book;
    }

    @Override
    public void returnBook() {
        System.out.println("return your books here");
    }


    public void showAvailableBooks() {
        System.out.println("these are your available books"  );

    }
}

public class Exercise4 {
    public static void main(String[] args) {

        myLibrary lib = new myLibrary();

        lib.addBook("Harry Potter");
        lib.addBook("Lord Of The Rings");
        String [] availableBooks = new String[100];
        String [] myIssuedBooks = new String[100];

        lib.issueBook("Harry Potter");
        lib.issueBook("Lord Of The Rings");

        availableBooks = new String[]{"harry potter" , "50 shades" , "Lord of the rings"};
        lib.showAvailableBooks();
        System.out.println(Arrays.toString(availableBooks));

        myIssuedBooks = new String[]{"harry potter" , "50 shades" , "Lord of the rings"};
        lib.issueBook("");
        System.out.println(Arrays.toString(myIssuedBooks));
        lib.returnBook();

       // System.out.println(lib.addBook("Harry Potter"));
        //System.out.println(lib.addBook("Lord Of The Rings"));
    }
}
