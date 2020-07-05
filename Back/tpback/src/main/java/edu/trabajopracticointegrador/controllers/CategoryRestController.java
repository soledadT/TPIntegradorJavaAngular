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

import edu.trabajopracticointegrador.entities.Category;
import edu.trabajopracticointegrador.modelo.Answer;
import edu.trabajopracticointegrador.repositories.CategoryRepository;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class CategoryRestController {
	
	@Autowired
	private Answer<Category> answer;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@GetMapping(value="getCategory/{id}")
	public ResponseEntity<Answer<Category>> getCategory(@PathVariable("id") int id){
		
		Category category = categoryRepository.findById(id).orElse(new Category());
		answer.setCode(200);
		answer.setObjectAnswer(category);
		answer.setMessange("El usuario fue encontrado");
		
		return ResponseEntity.ok(answer);
	}
	
	@PostMapping(value="insertCategory")
	public ResponseEntity<Answer<Category>> insertCategory(@RequestBody Category category){
	  try {
		categoryRepository.save(category);
		answer.setMessange("El usuario se guardo correctamente");
		answer.setCode(200);
		answer.setObjectAnswer(category);
	   }catch(Exception e) {
		answer.setCode(500);
		answer.setMessange(e.getMessage());
		answer.setObjectAnswer(null);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(answer);
	   }

           return ResponseEntity.ok(answer);
	}
	
	@GetMapping(value="getAll")
	public ResponseEntity<Answer<Category>> getAll(){
		answer.setCode(200);
		answer.setMessange("Lista de categorias");
		answer.setListobjectAnswer(categoryRepository.findAll());
		return ResponseEntity.ok(answer);
		
	}
	

}
