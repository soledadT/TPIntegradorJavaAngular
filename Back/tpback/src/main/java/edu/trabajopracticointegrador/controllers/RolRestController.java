package edu.trabajopracticointegrador.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.trabajopracticointegrador.entities.Rol;
import edu.trabajopracticointegrador.entities.User;
import edu.trabajopracticointegrador.modelo.Answer;
import edu.trabajopracticointegrador.repositories.RolRepository;
import edu.trabajopracticointegrador.repositories.UserRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class RolRestController {
	@Autowired
	private Answer<Rol> answer;
	
	@Autowired
	private RolRepository rolRepository;
	
	@PostMapping(value="insertRol")
	public ResponseEntity<Answer<Rol>>insertRol(@RequestBody Rol rol){
		try {
			
			rolRepository.save(rol);
			answer.setMessange("El rol se guardo correctamente");
			answer.setCode(200);
			answer.setObjectAnswer(rol);
		}catch(Exception e) {
			answer.setCode(500);
			answer.setMessange(e.getMessage());
			answer.setObjectAnswer(null);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(answer);
		}
		
		
		return ResponseEntity.ok(answer);
	}
	
	@GetMapping(value="allRoles")
	public ResponseEntity<Answer<Rol>> getAllRoles(){
		answer.setCode(200);
		answer.setMessange("Lista de roles");
		answer.setListobjectAnswer(rolRepository.findAll());
		return ResponseEntity.ok(answer);
		
	}

}
