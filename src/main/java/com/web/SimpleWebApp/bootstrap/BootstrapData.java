package com.web.SimpleWebApp.bootstrap;

import com.web.SimpleWebApp.domain.Author;
import com.web.SimpleWebApp.domain.Book;
import com.web.SimpleWebApp.domain.Publisher;
import com.web.SimpleWebApp.repositories.AuthorRepository;
import com.web.SimpleWebApp.repositories.BookRepository;
import com.web.SimpleWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Drive Design","123123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);



        Author rod = new Author("Rod","Johnson");
        Book noEJB = new Book("J2EE Development without EJB","23423423423");

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        authorRepository.save(rod);
        bookRepository.save(noEJB);



        Publisher publisher = new Publisher("Penguin Random House", "Calle Valencia", "San Juan","Puerto Rico",00772);

        publisherRepository.save(publisher);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);


        authorRepository.save(eric);
        bookRepository.save(ddd);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        publisherRepository.save(publisher);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books:" + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
}
