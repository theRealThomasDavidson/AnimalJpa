package com.cognixia.jump.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.jump.model.Animal;
import com.cognixia.jump.repository.AnimalRepository;

@RestController
@RequestMapping("/api")
public class AnimalController {
	
	@Autowired
	AnimalRepository repo;

	@GetMapping("/")
	public ResponseEntity<?> index(){
		return ResponseEntity.status(200)
				.body("Welcome to the api");
	}
	
	@GetMapping("/animals")
	public List<Animal> getStudents() {
		return repo.findAll();
	}
	
	@GetMapping("/animal/{id}")
	public ResponseEntity<?> getAnimal(@PathVariable int id) {
		Optional<Animal> found = repo.findById(id);
		if (found.isEmpty()) {
			return ResponseEntity.status(404)
						.body("Animal with id = " + id + " not found.");
		}
		return ResponseEntity.status(200)
				.body(found.get());
	}
	@DeleteMapping("/animal/{id}")
	public ResponseEntity<?> deleteAnimal(@PathVariable int id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return ResponseEntity.status(200).body("Animal Deleted.");
		}
		return ResponseEntity.status(404).body("Animal Not Found.");
	}
}
//vd
