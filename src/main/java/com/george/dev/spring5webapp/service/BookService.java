package com.george.dev.spring5webapp.service;

import com.george.dev.spring5webapp.model.Book;
import com.george.dev.spring5webapp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by George 6/11/2018
 */

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // fetching all books in the db
    public List<Book> fetchAllBooks(){
        return bookRepository.findAllBooks();
    }

    // saving a book service into the database



    // updating a book in the DB


}
