package edu.trabajopracticointegrador.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.trabajopracticointegrador.entities.User;
import edu.trabajopracticointegrador.modelo.Answer;
import edu.trabajopracticointegrador.repositories.UserRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class UserRestController {
	
	@Autowired
	private Answer<User> answer;
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="getUsers/{id}")
	public ResponseEntity<Answer<User>> getUser(@PathVariable("id") int id){
		
	User user = userRepository.findById(id).orElse(new User());
	
	answer.setCode(200);
	answer.setObjectAnswer(user);
	answer.setMessange("El usuario fue encontrado");
		return ResponseEntity.ok(answer);
	}
	
	@PostMapping(value="insertUser")
	public ResponseEntity<Answer<User>>insertUser(@RequestBody User user){
		try {
			
			userRepository.save(user);
			answer.setMessange("El usuario se guardo correctamente");
			answer.setCode(200);
			answer.setObjectAnswer(user);
		}catch(Exception e) {
			answer.setCode(500);
			answer.setMessange(e.getMessage());
			answer.setObjectAnswer(null);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(answer);
		}
		
		
		return ResponseEntity.ok(answer);
	}
	
	@GetMapping(value="deleteUser/{id}")
	public ResponseEntity<Answer<User>> deleteUser(@PathVariable int id){
		userRepository.deleteById(id);
		answer.setCode(200);
		answer.setMessange("El usuario =" +id + "a sido borrado");
		return ResponseEntity.ok(answer);
	}
	
	@GetMapping(value="allUsers")
	public ResponseEntity<Answer<User>> getAllUsers(){
		answer.setCode(200);
		answer.setMessange("Lista de usuarios");
		answer.setListobjectAnswer(userRepository.findAll());
		return ResponseEntity.ok(answer);
		
	}
	
	@PostMapping(value="modifyUser")
	public ResponseEntity<Answer<User>> modifyUser(@RequestBody User user){
		userRepository.save(user);
		answer.setCode(200);
		answer.setMessange("El usuario :" + user.getId() + "se ha modificado correctamente");
		answer.setObjectAnswer(user);
		return ResponseEntity.ok(answer);
	}
	
	

}
