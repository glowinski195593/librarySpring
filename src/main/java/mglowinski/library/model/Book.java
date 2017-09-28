package mglowinski.library.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Book {

	@Id
	private String bookId;
	
	private String bookTitle;
	private String bookAuthor;
	private String bookIsbn;
	private String bookDescription;
	private String bookCategory;
	
	public Book() {}
	
	public Book(String bookTitle, String bookAuthor, String bookIsbn, String bookDescription, String bookCategory) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookIsbn = bookIsbn;
		this.bookDescription = bookDescription;
		this.bookCategory = bookCategory;
	}
}
