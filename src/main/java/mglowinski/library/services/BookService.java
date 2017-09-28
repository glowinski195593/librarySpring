package mglowinski.library.services;

import java.util.List;

import mglowinski.library.model.Book;

public interface BookService {

	List<Book> findAll();
	
	Book create(Book book);
}
