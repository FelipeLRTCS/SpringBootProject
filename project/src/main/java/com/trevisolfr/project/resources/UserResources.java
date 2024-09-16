package com.trevisolfr.project.resources;

import com.trevisolfr.project.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1, "Felipe Lara", "felipe@gmail.com", "(61) 996086461", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}
