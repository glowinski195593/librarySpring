package mglowinski.library.model;


import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="books")
public class Book {

	@Id
	private String bookId;

	private String bookTitle;
	private String bookAuthor;
	private String bookIsbn;
	private String bookDescription;
	private List<Category> bookCategory;
	
	public Book() {}
	
	public Book(String bookId, String bookTitle, String bookAuthor, String bookIsbn, String bookDescription, List<Category> bookCategory) {
		this.setBookId(bookId);
		this.setBookTitle(bookTitle);
		this.setBookAuthor(bookAuthor);
		this.setBookIsbn(bookIsbn);
		this.setBookDescription(bookDescription);
		this.setBookCategory(bookCategory);
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookIsbn() {
		return bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public List<Category> getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(List<Category> bookCategory) {
		this.bookCategory = bookCategory;
	}
}
