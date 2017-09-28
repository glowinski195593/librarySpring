package mglowinski.library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mglowinski.library.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
