package com.george.dev.spring5webapp.repository;

import com.george.dev.spring5webapp.model.Author;
import com.george.dev.spring5webapp.model.Book;
import javassist.NotFoundException;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by George 5/11/2018
 */

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {

    // default method that might be overridden at choice
     default String retrieveData(){
         return null;
     }

     // method for creating report from a provided book
     default void createReportFile(Book book) throws NotFoundException {
         throw new NotFoundException("The Book was not found");
     }

}
