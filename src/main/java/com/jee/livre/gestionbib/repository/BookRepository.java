package com.jee.livre.gestionbib.repository;

import org.springframework.data.repository.CrudRepository;

import com.jee.livre.gestionbib.entity.Book;

public interface BookRepository  extends CrudRepository<Book, Integer>{

}

