package com.shubhajit.spring5webapp.repositories;

import com.shubhajit.spring5webapp.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
