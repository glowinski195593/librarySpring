package mglowinski.library.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import mglowinski.library.model.Borrow;

public interface BorrowRepository extends MongoRepository<Borrow, String>{

}
