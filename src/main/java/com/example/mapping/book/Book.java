package com.example.mapping.book;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.example.mapping.author.Author;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id;
	private String book_name;
	
	
	

	@ManyToMany
	@JoinTable(name="book_authors",joinColumns = @JoinColumn(name="book_id"),
	inverseJoinColumns = @JoinColumn(name="author_id"))
	private List<Author> authors = new ArrayList<>();
	

	/**
	 * @return the book_id
	 */
	public int getBook_id() {
		return book_id;
	}

	/**
	 * @param book_id the book_id to set
	 */
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	/**
	 * @return the book_name
	 */
	public String getBook_name() {
		return book_name;
	}

	/**
	 * @param book_name the book_name to set
	 */
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	/**
	 * @return the author
	 */
	public List<Author> getAuthor() {
		return authors;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(List<Author> author) {
		this.authors = authors;
	}

	
	
}
