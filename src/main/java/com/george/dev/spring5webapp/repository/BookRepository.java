package com.george.dev.spring5webapp.repository;

import com.george.dev.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by George 5/11/2018
 */

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findAllBooks();

}
