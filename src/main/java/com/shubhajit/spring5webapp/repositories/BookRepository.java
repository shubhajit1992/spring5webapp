package com.shubhajit.spring5webapp.repositories;

import com.shubhajit.spring5webapp.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
