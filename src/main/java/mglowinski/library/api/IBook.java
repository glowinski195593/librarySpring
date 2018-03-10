package mglowinski.library.api;

import java.util.List;

import mglowinski.library.model.Book;

public interface IBook {

	List<Book> findAll();
	
	Book create(Book book);
}
