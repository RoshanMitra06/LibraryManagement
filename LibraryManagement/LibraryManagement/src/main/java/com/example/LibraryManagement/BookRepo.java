package com.example.LibraryManagement;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

//repository means we are storing some values
//Book is the class here. Id is int
public interface BookRepo extends JpaRepository<Book,Integer> {
    //some queries are not predefined in jpa . Hence we use jpql for further more custom queried .
    //JPQL
//    @Query("Select b from Book b where b.author=1")
//    Collection<Book>findBooksByAuthor(String author);
}
