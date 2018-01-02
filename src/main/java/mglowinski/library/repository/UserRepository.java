package mglowinski.library.repository;

import mglowinski.library.model.*;

import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface UserRepository extends MongoRepository<User, String> {
  
	User findByuserEmail(String userEmail);
}
