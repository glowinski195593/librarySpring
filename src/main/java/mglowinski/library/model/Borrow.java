package mglowinski.library.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="borrows")
public class Borrow {
	
	@Id
	private String borrowId;
	
	private String userId;
	private Book book;
	private String dateBorrow;
	
	public Borrow() {}
	
	public Borrow(String borrowId, String userId, Book book, String dateBorrow) {
		this.setBorrowId(borrowId);
		this.setUserId(userId);
		this.setBook(book);
		this.setDateBorrow(dateBorrow);
	}

	public String getBorrowId() {
		return borrowId;
	}

	public void setBorrowId(String borrowId) {
		this.borrowId = borrowId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getDateBorrow() {
		return dateBorrow;
	}

	public void setDateBorrow(String dateBorrow) {
		this.dateBorrow = dateBorrow;
	}
}
