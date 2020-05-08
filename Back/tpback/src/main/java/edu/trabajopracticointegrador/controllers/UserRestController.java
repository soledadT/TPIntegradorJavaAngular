package edu.trabajopracticointegrador.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import edu.trabajopracticointegrador.entities.User;
import edu.trabajopracticointegrador.repositories.UserRepository;

@RestController
public class UserRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="getUsers/{id}")
	public ResponseEntity<Optional<User>> getUser(@PathVariable("id") int id){
		
	Optional<User> user = userRepository.findById(id);
	
		return ResponseEntity.ok(user);
	}

}
