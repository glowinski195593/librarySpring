package mglowinski.library.mongoServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import mglowinski.library.model.SecUserDetails;
import mglowinski.library.model.User;
import mglowinski.library.repository.UserRepository;


@Component
public class SecUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userEmail) {
        User user = userRepository.findByuserEmail(userEmail);
        if(user == null){
            throw new UsernameNotFoundException(userEmail);
        } 
        else {
        	UserDetails details = new SecUserDetails(user);
        	return details;
        }
    }
}
