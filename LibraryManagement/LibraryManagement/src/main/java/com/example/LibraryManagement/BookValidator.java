package com.example.LibraryManagement;

public class BookValidator {
    public boolean isValid(Book book){

        if(book.getTitle()=="" || book.getTitle().equals(null))
            return false;
        return true;
    }
}
