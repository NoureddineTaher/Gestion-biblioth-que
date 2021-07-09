package com.jee.livre.gestionbib.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jee.livre.gestionbib.entity.Book;
import com.jee.livre.gestionbib.service.BookService;

@RestController
public class BookController {

	
	@Autowired
	BookService bookservice;
	
	//get ALL
	@GetMapping( "/books")
	public  List<Book> getAllBooks() {
		return bookservice.getAllPharmacies();
	}
	
	//get book
	@RequestMapping("/books/{id}")
	public Book getBook(@PathVariable int id) {
		return bookservice.getBook(id);
	}
	
	//ADD 
	@RequestMapping(method = RequestMethod.POST, path="/book")
	public void addBook(@RequestBody Book p) {
		bookservice.addBook(p);
	}
	
	//update 
	@RequestMapping(method = RequestMethod.PUT,value="/book")
	public void updateBook(@RequestBody Book p) {
		bookservice.updateBook(p);	
	}
	
	//delete 
	@RequestMapping(method = RequestMethod.DELETE,value="/book/{id}")
	public void deletePharmacie(@PathVariable int id) {
		bookservice.deletePharmacie(id);
	}
}
