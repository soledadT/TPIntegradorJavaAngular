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

import edu.trabajopracticointegrador.entities.Cost;
import edu.trabajopracticointegrador.modelo.Answer;
import edu.trabajopracticointegrador.repositories.CostRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class CostRestController {
	
	@Autowired
	private Answer<Cost> answer;
	
	@Autowired
	private CostRepository costRepository;
	
	@GetMapping(value="getCost/{id}")
	public ResponseEntity<Answer<Cost>> getCost(@PathVariable int id){
		Cost cost = costRepository.findById(id).orElse(new Cost());
		answer.setCode(200);
		answer.setMessange("La categoria fue encontrada");
		answer.setObjectAnswer(cost);
		return ResponseEntity.ok(answer);
	}
	
	@PostMapping(value="insertCost")
	public ResponseEntity<Answer<Cost>> insertCost(@RequestBody Cost cost){
	try {
			costRepository.save(cost);
			answer.setMessange("El usuario se guardo correctamente");
			answer.setCode(200);
			answer.setObjectAnswer(cost);
		}catch(Exception e) {
			answer.setCode(500);
			answer.setMessange(e.getMessage());
			answer.setObjectAnswer(null);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(answer);
		}
	 return ResponseEntity.ok(answer);
	
	}
	
	@GetMapping(value="getAll") 
	public ResponseEntity<Answer<Cost>> getAll(){
		answer.setCode(200);
		answer.setListobjectAnswer(costRepository.findAll());
		answer.setMessange("Lista de costos");
	  return ResponseEntity.ok(answer);
	}
	  
	

}
