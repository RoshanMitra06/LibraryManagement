package com.example.LibraryManagement;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(int id) {
        super("User id not found : " + id);
    }

}
