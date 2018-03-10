package mglowinski.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mglowinski.library.api.IUser;
import mglowinski.library.model.User;

@RestController
@RequestMapping("/api")
public class UserController {
	
	  private final IUser service;
	  
	  @Autowired
	  UserController(IUser service) {
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
	  
	  @RequestMapping(method = RequestMethod.GET, value = "/user")
	  User getUserByEmail(@RequestParam String email) {
	      return service.getUserByEmail(email);
	  }
}
