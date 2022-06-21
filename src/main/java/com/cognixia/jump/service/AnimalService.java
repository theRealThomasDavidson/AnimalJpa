package com.cognixia.jump.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognixia.jump.model.Animal;
import com.cognixia.jump.repository.AnimalRepository;

@Service
public class AnimalService {
	@Autowired
	AnimalRepository repo;
	public List<Animal> getStudents(){
		return repo.findAll();
	}
}
