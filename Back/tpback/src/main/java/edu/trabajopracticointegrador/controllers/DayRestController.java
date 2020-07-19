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

import edu.trabajopracticointegrador.entities.Day;
import edu.trabajopracticointegrador.modelo.Answer;
import edu.trabajopracticointegrador.repositories.DayRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class DayRestController {
	
	@Autowired
	private Answer<Day> answer;
	
	@Autowired
	private DayRepository dayRepository;
	
	@GetMapping(value="getDay/{id}")
	public ResponseEntity<Answer<Day>> getDay(@PathVariable int id){
		Day day = dayRepository.findById(id).orElse(new Day());
		answer.setCode(200);
		answer.setObjectAnswer(day);
		answer.setMessange("Se ha encontrado el dia");
		
		return ResponseEntity.ok(answer);
	}
	
	@PostMapping(value="insertDay")
	public ResponseEntity<Answer<Day>> insertDay(@RequestBody Day day){
       try {
			dayRepository.save(day);
			answer.setMessange("El dia se guardo correctamente");
			answer.setCode(200);
			answer.setObjectAnswer(day);
		}catch(Exception e) {
			answer.setCode(500);
			answer.setMessange(e.getMessage());
			answer.setObjectAnswer(null);

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(answer);
		}
       
		return ResponseEntity.ok(answer);
		
	}
	
	@GetMapping(value="allDay")
	public ResponseEntity<Answer<Day>> getAllDay(){
		answer.setCode(200);
		answer.setListobjectAnswer(dayRepository.findAll());
		answer.setMessange("Lista de dias");

		return ResponseEntity.ok(answer);
	}
	

}
