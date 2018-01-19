package mglowinski.library.services;

import java.util.List;

import mglowinski.library.model.User;

public interface UserService {

	List<User> findAll();
	
	User create(User user);

	User getUserByEmail(String email);
}
