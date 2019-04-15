package com.backedtest.restapp;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,String> {

}
