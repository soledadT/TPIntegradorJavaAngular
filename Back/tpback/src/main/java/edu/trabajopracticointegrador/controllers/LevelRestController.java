package edu.trabajopracticointegrador.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.trabajopracticointegrador.entities.Level;
import edu.trabajopracticointegrador.modelo.Answer;
import edu.trabajopracticointegrador.repositories.LevelRepository;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class LevelRestController {
	
	@Autowired
	private Answer<Level> answer;
	
	@Autowired
	private LevelRepository levelRepository;
	
	@GetMapping(value="getLevel/{id}")
	public ResponseEntity<Answer<Level>> getLevel(@PathVariable int id){
		Level level = levelRepository.findById(id).orElse(new Level());
		answer.setCode(200);
		answer.setObjectAnswer(level);
		answer.setMessange("El nivel fue encontrado");
		
		return ResponseEntity.ok(answer);
	}
	
	@PostMapping("insertLevel")
	public ResponseEntity<Answer<Level>> insertLevel(@RequestBody Level level){
       try {
			
			levelRepository.save(level);
			answer.setMessange("El nivel se guardo correctamente");
			answer.setCode(200);
			answer.setObjectAnswer(level);
		}catch(Exception e) {
			answer.setCode(500);
			answer.setMessange(e.getMessage());
			answer.setObjectAnswer(null);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(answer);
		}
		return ResponseEntity.ok(answer);
	}
	
	@GetMapping(value="allLevel")
	public ResponseEntity<Answer<Level>> getAllLevel(){
		answer.setCode(200);
		answer.setListobjectAnswer(levelRepository.findAll());
		answer.setMessange("Lista de nivel");
		
		return ResponseEntity.ok(answer);
	}

}
