package mglowinski.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mglowinski.library.api.IBook;
import mglowinski.library.model.Book;

@RestController
@RequestMapping("/api")
public class BookController {

	private final IBook service;
	  
	@Autowired
	BookController(IBook service) {
	    this.service = service;
	}
	  
	@RequestMapping(method = RequestMethod.GET, value = "/books")
	public List<Book> findAllBooks() {
	    return service.findAll();
	}
	  
	@RequestMapping(method = RequestMethod.POST, value="/books/createBook")
	public Book saveBook(@RequestBody Book book) {
	    return service.create(book);
	}
}
