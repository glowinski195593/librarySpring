package mglowinski.library.api;

import java.util.List;

import mglowinski.library.model.User;

public interface IUser {

	List<User> findAll();
	
	User create(User user);

	User getUserByEmail(String email);
}
