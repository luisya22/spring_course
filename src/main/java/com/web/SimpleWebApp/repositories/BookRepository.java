package com.web.SimpleWebApp.repositories;

import com.web.SimpleWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
