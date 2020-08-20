package com.web.SimpleWebApp.repositories;

import com.web.SimpleWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author,Long> {

}
