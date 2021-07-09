package com.jee.livre.gestionbib.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.livre.gestionbib.entity.Book;
import com.jee.livre.gestionbib.repository.BookRepository;

@Service
public class BookService {

	
	
	@Autowired
	BookRepository bookrepository;
	
	
	
	public List<Book> getAllPharmacies(){		
		List<Book> pharmacies = new ArrayList<Book>();
		bookrepository.findAll().forEach(pharmacies::add);
		return pharmacies;
	}
	
	public void addBook(Book p) {
		bookrepository.save(p);
	}
	
	
	public Book getBook(int id){
		return bookrepository.findById(id).get();
	}
	
	
	public void updateBook(Book p) {
		if(bookrepository.existsById(p.getId())) {
			
			bookrepository.save(p);
		}
		
	}
	
	public void deletePharmacie(int id) {
		bookrepository.deleteById(id);
		
	}
	
	
	
	
	
	
	
}
