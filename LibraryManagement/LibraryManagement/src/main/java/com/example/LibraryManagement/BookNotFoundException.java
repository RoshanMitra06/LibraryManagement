package com.example.LibraryManagement;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(int id) {
        super("Book id not found : " + id);
    }
}
