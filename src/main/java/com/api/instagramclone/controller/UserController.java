package com.api.instagramclone.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.instagramclone.model.User;
import com.api.instagramclone.repository.UserRepository;

@RestController
public class UserController {
	
	private final UserRepository repository;

	UserController(UserRepository repository) {
	    this.repository = repository;
	  }
	
	@PostMapping("/users/add")
	User newUser(@RequestBody User newUser) {
	    return repository.save(newUser);
	  }

}
