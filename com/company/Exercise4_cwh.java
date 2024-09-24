package com.company;

class Library1 {
    String [] books;
    int noOfBooks;
    Library1(){
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBook(String bookname){
        this.books[noOfBooks] = bookname;
        noOfBooks++;
        System.out.println(bookname + " has been added");
    }

    void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String bookname : this.books) {
            if (bookname == null){
                continue;
            }
            System.out.println("* " + bookname);
        }
    }

       void issuemyBook(String book){
            for (int i =0;i<this.books.length;i++) {
                System.out.println("book has been issued");
                this.books[i] = null;
                return;
            }
           System.out.println("this book does not exist");
       }

        void returnBooks(String bookname){
        addBook(bookname);
        }

}
public class Exercise4_cwh {
    public static void main(String[] args) {
        Library1 lib = new Library1();

        lib.addBook("Warbreaker");
        lib.addBook("Harry Potter");
        lib.addBook("Mistborn");

        lib.showAvailableBooks();

        lib.issuemyBook("Warbreaker");
        lib.showAvailableBooks();

        lib.returnBooks("Warbreaker");
        lib.showAvailableBooks();
    }
}
