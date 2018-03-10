package mglowinski.library.mongoServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import mglowinski.library.api.IUser;
import mglowinski.library.model.User;
import mglowinski.library.repository.UserRepository;

@Service
public class MongoDBUserService implements IUser {

	private final UserRepository repository;
	private PasswordEncoder passwordEncoder;
	
    @Autowired
    MongoDBUserService(UserRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }
 
	@Override
	public List<User> findAll() {
		List<User> listUsers = repository.findAll();
	    return listUsers;
	}

	@Override
	public User create(User user) {
		String encodedPassword = passwordEncoder.encode(user.getUserPassword());  
		user.setUserPassword(encodedPassword);
		User createdUser = repository.save(user);
		return createdUser;
	}
	
	@Override
	public User getUserByEmail(String email) {
		User user = repository.findByuserEmail(email);
		return user;
	}
}
