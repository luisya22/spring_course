package com.web.SimpleWebApp.repositories;

import com.web.SimpleWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
