package com.george.dev.spring5webapp.bootstrap;

import com.george.dev.spring5webapp.model.Author;
import com.george.dev.spring5webapp.model.Book;
import com.george.dev.spring5webapp.model.Publisher;
import com.george.dev.spring5webapp.repository.AuthorRepository;
import com.george.dev.spring5webapp.repository.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
        initData();
    }

    private void initData(){


        // George
        Author george = new Author("George","Muller");
        Book ddd = new Book("Domain Driven Design", "1234");
        Publisher publisherA = new Publisher("Manning","Broston lane, 43 Avenue");
        ddd.setPublisher(publisherA);
        publisherA.setBook(ddd);
        george.getBooks().add(ddd);
        ddd.getAuthors().add(george);

        authorRepository.save(george);
        bookRepository.save(ddd);

        // Steve
        Author steve = new Author("Steve","Cold");
        Book noEJB = new Book("J2EE Development without EJB", "23444");
        Publisher publisherB = new Publisher("Deitel","Off clifford road, Califonia");
        noEJB.setPublisher(publisherB);
        publisherB.setBook(noEJB);
        steve.getBooks().add(noEJB);


        authorRepository.save(steve);
        bookRepository.save(noEJB);
    }

}
