package mglowinski.library.mongoServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mglowinski.library.api.BookService;
import mglowinski.library.model.Book;
import mglowinski.library.repository.BookRepository;

@Service
public class MongoDBBookService implements BookService {

	private final BookRepository repository;
	 
    @Autowired
    MongoDBBookService(BookRepository repository) {
        this.repository = repository;
    }
    
	@Override
	public List<Book> findAll() {
		List<Book> listBooks = repository.findAll();
	    return listBooks;
	}

	@Override
	public Book create(Book book) {
		Book createdBook = repository.save(book);
		return createdBook;
	}
}

