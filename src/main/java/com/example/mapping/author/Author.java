package com.example.mapping.author;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.example.mapping.book.Book;

@Entity
public class Author {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int author_id;
	private String author_name;
	
	@ManyToMany(mappedBy = "authors")
	private List<Book> books = new ArrayList<>();
	

	/**
	 * @return the author_id
	 */
	public int getAuthor_id() {
		return author_id;
	}

	/**
	 * @param author_id the author_id to set
	 */
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	/**
	 * @return the author_name
	 */
	public String getAuthor_name() {
		return author_name;
	}

	/**
	 * @param author_name the author_name to set
	 */
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	/**
	 * @return the book
	 */
	public List<Book> getBook() {
		return books;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(List<Book> book) {
		this.books = books;
	}

	
	

}
