package com.shubhajit.spring5webapp.repositories;

import com.shubhajit.spring5webapp.entities.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
