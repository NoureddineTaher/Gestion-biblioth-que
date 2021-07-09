package com.jee.livre.gestionbib.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public int id;	
	public Book(int id, String title, String auther, String prix) {
		super();
		this.id = id;
		this.title = title;
		this.auther = auther;
		this.prix = prix;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
	public String title;
	public String auther;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String prix;


	
	
	
}
