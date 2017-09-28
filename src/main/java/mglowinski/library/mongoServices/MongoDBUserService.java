package mglowinski.library.mongoServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mglowinski.library.model.User;
import mglowinski.library.repository.UserRepository;
import mglowinski.library.services.UserService;

@Service
public class MongoDBUserService implements UserService {

	private final UserRepository repository;
	 
    @Autowired
    MongoDBUserService(UserRepository repository) {
        this.repository = repository;
    }
 
	@Override
	public List<User> findAll() {
		List<User> listUsers = repository.findAll();
	    return listUsers;
	}

	@Override
	public User create(User user) {
		User createdUser = repository.save(user);
		return createdUser;
	}
}
