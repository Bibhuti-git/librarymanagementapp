package com.greatlearning.Library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name= "title")
	private  String title;
	@Column(name="category")
	private String category;
	@Column(name="author")
	private String author;
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", category=" + category + ", author=" + author + "]";
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int id, String title, String category, String author) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.author = author;
	}
	public Book() {
	
		
	}
	
	
}