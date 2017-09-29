package mglowinski.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mglowinski.library.model.User;
import mglowinski.library.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	  private final UserService service;
	  
	  @Autowired
	  UserController(UserService service) {
	      this.service = service;
	  }
	  
	  @RequestMapping(method = RequestMethod.GET, value = "/users")
	  List<User> findAllUsers() {
	      return service.findAll();
	  }
	  
	  @RequestMapping(method = RequestMethod.POST, value="/users/createUser")
	  public User saveUser(@RequestBody User user) {
	      return service.create(user);
	  }
	  
}
