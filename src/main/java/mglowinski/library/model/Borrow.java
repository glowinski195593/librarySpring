package mglowinski.library.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Borrow {
	
	@Id
	private String borrowId;
	
	private String userId;
	private Book book;
	private String dateBorrow;
	
	public Borrow() {}
	
	public Borrow(String userId, Book book, String dateBorrow) {
		this.userId = userId;
		this.book = book;
		this.dateBorrow = dateBorrow;
	}
}
