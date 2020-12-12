package pl.coderslab.oop.homework;

import java.util.Arrays;

public class User {
    private Book[] borrowedBooks = new Book[0];

    public void addBook(Book b){
        this.borrowedBooks = Arrays.copyOf(this.borrowedBooks, this.borrowedBooks.length+1);
        this.borrowedBooks[this.borrowedBooks.length-1] = b;
        // add to borrowedBooks;
    }
}
